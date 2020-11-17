package Solutions.Module4.ThreadsOperations;

public class TableOfFive extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("5x" + i + " = " + i*5);
            try{
                sleep(500);
            }
            catch (Exception e){

            }
        }
    }
}
