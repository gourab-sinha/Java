package Module2.Array;

public class Array {
    public static void singleDArray(){
        System.out.println("Single Dimension Array");
        int array[] = new int[4]; // default value 0
        for(int x: array){
            System.out.println(x);
        }
    }

    public static void twoDArray(){
        System.out.println("Two Dimension Array");
        int array[][] = new int[5][4];
        for(int[] innerArray: array){
            for(int value: innerArray){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void singleDArrayInitialized(){
        System.out.println("Single Dimension Array with initialized");
        int[] array = new int[]{12,13,14};
        for(int value: array){
            System.out.println(value);
        }
    }

    public static void twoDArrayInitialized(){
        System.out.println("Two Dimension Array with initialized");
        int[][] array = new int[][]{{1,2,3},{4},{5,6}};
        for(int[] innerArray: array){
            for(int value: innerArray){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
