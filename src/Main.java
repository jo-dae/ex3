import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            double t = temperature();
            if (t<-460){
                break;
            }
            double c = formula(t);


        }
    }
        static double temperature(){
            System.out.println("please enter the temp");
            double temp = input.nextDouble();
            return temp;

        }

        static double formula (double temp){
            double celsius = (( 5*(temp -32))/9);
            System.out.println(temp + "in farenheit is equal to " + celsius + " in celsius");
            return celsius;
        }

        static void display(double c){
            System.out.println(c);
        }

}