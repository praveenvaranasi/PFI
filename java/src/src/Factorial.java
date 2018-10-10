import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by praveen on 10/10/2018.
 */
public class Factorial {
    private int number;
    public void setNumber(int number){
        this.number = number;
    }
    public long getNumber()
    {
        long result = 1;
        System.out.println(number);
        for (int i=1; i<=number; i++)
        {
            result = result * i;
            System.out.println(i + "   " +result);
        }
        return result;
    }

    public static void main(String[] args)
    {
        try{
            Factorial factorial = new Factorial();
            System.out.println("Enter the number you would like to calculate a factorial for:");
            int factNum = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine()).intValue();
            System.out.println("factNum: "+factNum);
            factorial.setNumber(factNum);
            System.out.println(factorial.getNumber());
        }
        catch (IOException | NumberFormatException ioe)
        {
            System.out.println(ioe);
        }

    }
}
