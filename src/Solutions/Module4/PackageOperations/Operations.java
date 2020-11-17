package Solutions.Module4.PackageOperations;

public class Operations {
    public double subtract(double first, double second){
        return first-second;
    }

    public double multiply(double first, double second){
        return first*second;
    }

    public double divide(double first, double second){
        return first/second;
    }

    public long factorial(long num){
        long fact = 1;
        while(num>=1){
            fact*=num;
            num--;
        }
        return fact;
    }

    public long reverseNumber(int num){
        long value = 0;
        while(num > 0){
            value= value*10 + num%10;
            num/=10;
        }
        return value;
    }
}
