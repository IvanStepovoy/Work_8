import java.security.InvalidParameterException;
import java.util.Scanner;

public class Calculator {



    private long result;


    public long setResult(long c) {
        this.result = c;
        return result;
    }

    public long getResult() {
        return result;
    }


    public long takeVar1 () {

        System.out.println("Please enter enter the first number:  ");
        long firstVar = new Scanner(System.in).nextInt();

       return firstVar;
    }

    public long takeVar2 () {

        System.out.println("Please enter enter the second number:  ");
        long secondVar = new Scanner(System.in).nextInt();

        return secondVar;
    }


    public long add(long a, long b){


        long c = a + b;

        return setResult(c);
    }

    public long sub(long a, long b){

        long c = a - b;

        return setResult(c);
    }

    public long mul(long a, long b){

        long c = a * b;

        return setResult(c);
    }

    public long div(long a, long b){

        long c = a / b;

        if( b==0 ){

            throw new InvalidParameterException("second number shouldn't be '0'");
        }

        return setResult(c);
    }



    //Overload Block
    public long add(long b){

        long c = result + b;

        System.out.println(c);

        return c;
    }

    public long sub(long b){

        long c = result - b;

        System.out.println(c);

        return c;
    }

    public long mul(long b) {

        long c = result * b;

        System.out.println(c);

        return c;
    }

    public long div(long b){

        long c = result / b;

        System.out.println(c);

        if( b==0 ){

            throw new InvalidParameterException("second number shouldn't be '0'");
        }

        return c;
    }


}

