package Solutions.Module6.Students;

import Solutions.Module6.DBConnections.DBConnection;

import java.sql.*;

public class Registry {
    private static Connection connection = null;
    private PreparedStatement registerStudent = null;
    private PreparedStatement fetchStudent = null;
    private PreparedStatement updateStudent = null;
    private PreparedStatement deleteStudent = null;
    private boolean isTableCreated = false;
    public Registry() throws SQLException {
        if(connection == null){
            connection = DBConnection.getInstance().getConnection();
            registerStudent = connection.prepareStatement("insert into students values(?,?,?,?)");
            fetchStudent = connection.prepareStatement("select * from students where studentId=?");
            updateStudent = connection.prepareStatement("update students set " +
                    "name=?,className=?,marks=? where studentId=?");
            deleteStudent = connection.prepareStatement("delete from students where studentId=?");
        }
    }

    public void addStudent(Student student) throws SQLException{
        System.out.println("Add student " + student);
        registerStudent.setLong(1,student.getStudentId());
        registerStudent.setString(2,student.getName());
        registerStudent.setString(3,student.getClassName());
        registerStudent.setInt(4,student.getMarks());

        int row = registerStudent.executeUpdate();
        if(row > 0){
            System.out.println("Successfully added");
            return;
        }
    }

    public Student getStudent(long studentId) throws SQLException {
        System.out.println("Get student");
        fetchStudent.setLong(1,studentId);
        ResultSet row = fetchStudent.executeQuery();
        Student student = new Student();
        while(row.next()){
            student.setStudentId(row.getInt("studentId"));
            student.setName(row.getString("name"));
            student.setClassName(row.getString("className"));
            student.setMarks(row.getInt("marks"));
        }
        return student;
    }

    public void updateStudentInformation(Student student) throws SQLException {
        System.out.println("Update student information");
        updateStudent.setString(1,student.getName());
        updateStudent.setString(2,student.getClassName());
        updateStudent.setInt(3,student.getMarks());
        updateStudent.setLong(4,student.getStudentId());

        int row = updateStudent.executeUpdate();
        if(row > 0){
            System.out.println("Successfully updated information");
        }
    }

    public void deleteStudent(long studentId) throws SQLException {
        System.out.println("Delete student");
        deleteStudent.setLong(1,studentId);
        int row = deleteStudent.executeUpdate();
        if(row > 0){
            System.out.println("Successfully deleted");
        }
    }

    public void addStudentInBatch() throws SQLException {
        System.out.println("Add students in batch");
        connection.setAutoCommit(false);
        try{
            for (int i=2;i<=5;i++){
                registerStudent.setInt(1,i);
                registerStudent.setString(2,"Gourab "+i);
                registerStudent.setString(3,"Java "+i);
                registerStudent.setInt(4,90 + i);
                registerStudent.addBatch();
            }
            System.out.println("Successfully added all the students");
            int[] row = registerStudent.executeBatch();
            connection.commit();
        }
        catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }
    }

    public void clearEntries() throws SQLException {
        System.out.println("Clear all entries.");
        Statement statement = connection.createStatement();
        statement.executeUpdate("truncate students");
    }

    public void createTable() throws SQLException {
        System.out.println("Create table in Database");
        if(isTableCreated == false){
            Statement statement =connection.createStatement();
            int row = statement.executeUpdate("drop table students");
            row = statement.executeUpdate("create table students(studentId int primary key," +
                    "name nvarchar(30), className nvarchar(30), marks int)");
            isTableCreated = true;
            return;
        }
        System.out.println("Already created");
    }
}
