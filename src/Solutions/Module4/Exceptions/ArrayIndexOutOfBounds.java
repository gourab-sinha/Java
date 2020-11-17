package Solutions.Module4.Exceptions;

public class ArrayIndexOutOfBounds {
    private int size;
    private int[] array;
    private int head;

    public ArrayIndexOutOfBounds(int size){
        this.size=size;
        this.array=new int[size];
        this.head=0;
    }

    public void insert(int value){
        try{
            array[head++]=value;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Value cannot be inserted as it reached max limit");
        }
    }

    public void printElements(){
        for(int i=0;i<Math.min(head,size); ++i){
            System.out.println(array[i]);
        }
    }
}
