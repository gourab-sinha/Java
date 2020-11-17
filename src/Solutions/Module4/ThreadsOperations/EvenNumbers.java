package Solutions.Module4.ThreadsOperations;

public class EvenNumbers extends Thread{
    @Override
    public void run() {
        for(int i=2;i<=40;i+=2){
            System.out.println(i);
            try{
                sleep(500);
            }
            catch (Exception e){

            }
        }
    }
}
