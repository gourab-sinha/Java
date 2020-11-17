package Solutions.Module4.Interfaces;

public class Queue implements IQueue{
    private int size;
    private int front;
    private int end;
    private int[] elements;
    public Queue(int size){
        this.size=size;
        this.front=-1;
        this.end=-1;
        this.elements = new int[this.size];
    }

    @Override
    public void insert(int value) {
        if(isFull()){
            System.out.println("Full");
            return;
        }
        if(isEmpty()){
            this.front=0;
        }

        this.end = (this.end+1)%this.size;
        this.elements[this.end]=value;
    }

    // Delete returns the front value if Queue is not empty.
    @Override
    public int delete() {
        if(isEmpty()){
            return -1;
        }
        int value = this.elements[this.front];
        if(this.front==this.end){
            this.front=-1;
            this.end=-1;
            return value;
        }
        this.front=(this.front+1)%this.size;
        return value;
    }
    private boolean isEmpty(){
        return this.front == -1;
    }

    private boolean isFull(){
        return (this.end+1)%this.size == this.front;
    }
}
