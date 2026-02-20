import java.util.Scanner;
/**
 * Write a description of class TemperatureConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureConverter
{

    public TemperatureConverter()
    {
        Scanner scan = new Scanner(System.in);
        String option;
        double temp;
        double f = 0;
        double c = 0;
        do
        {
            displayMenu();
            option = scan.nextLine();
            if(option.equals("1"))
            {
                System.out.println("Temperature: ");
                temp = scan.nextDouble(); 
                scan.nextLine();
                f = convertToFahrenheit(temp);
                System.out.println("Converting c to f equals ");
                printResult(temp, f);
            }
            else if(option.equals("2"))
            {
                System.out.println("Temperature: ");
                temp = scan.nextDouble();
                scan.nextLine();
                c = convertToCelsius(temp);
                System.out.println("Converting f to c equals ");
                printResult(temp, c);
            }
        }while(option.equals("3"));
    }

    public double convertToFahrenheit(double temp)
    {
        double f;

        f = temp * 9/5 + 32;

        return f;
    }

    public double convertToCelsius(double temp)
    {
        double c;

        c = (temp - 32) * 5/9;

        return c;
    }   

    public void displayMenu()
    {
        System.out.print("\f");
        System.out.println("Choose options \n1: Convert c to f \n2: Convert f to c \n3: Exit "); 
    }

    public void printResult(double original, double converted)
    {
        System.out.println(original +" is converted to " + converted);
    }

    public static void main(String [] args)
    {
        new TemperatureConverter();
    }
}

