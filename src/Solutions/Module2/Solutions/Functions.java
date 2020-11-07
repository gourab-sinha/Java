package Solutions.Module2.Solutions;

public class Functions {
    public static void display(int[] ids, String[] names, double[] salaries){
        int employeeCount = ids.length;
        System.out.println("ID          Name           Salary");
        for(int i=0;i<employeeCount;++i){
            System.out.println(ids[i]+"          "+names[i]+"           "+String.format("%.0f", salaries[i]));
        }
    }

    public static void display(int[] ids, String[] names){
        int employeeCount= ids.length;
        System.out.println("ID        Name");
        for(int i=0;i<employeeCount;i++){
            System.out.println(ids[i]+"         "+names[i]);
        }
    }

    public static void display(String named, int[] ids, String[] names, double[] salaries){
        int employeeCount= ids.length;
        System.out.println("ID       Name       Salary");
        for(int i=0;i<employeeCount;i++){
            if(named.equals(names[i])){
                System.out.println(ids[i]+"       "+names[i]+"       "+String.format("%.0f", salaries[i]));
            }
        }
    }

}
