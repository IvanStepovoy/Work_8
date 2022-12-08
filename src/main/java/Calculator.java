import java.security.InvalidParameterException;

public class Calculator {

    private long result;

    public long add(long a, long b){

        return a + b;

    }

    public long sub(long a, long b){

        return a - b;

    }

    public long mul(long a, long b){

        return a * b;

    }

    public long div(long a, long b){

        if(b==0){
            throw new InvalidParameterException("b=0");
        }

        return a / b;

    }
}
