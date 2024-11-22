import java.util.Scanner;
public class IT24103335Lab5Q1{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third integer: ");
        int num3 = scan.nextInt();

        int smallest,largest;

        if(num1 < num2 && num1 < num3) {
           smallest = num1;
        } else if(num2 < num1 && num2 < num3) {
            smallest = num2;
        }else {
            smallest = num3;
        }

        if(num1 > num2 && num1 > num3) {
            largest = num1;
        } else if(num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("User enterd numbers are: "+num1+" "+num2+" "+num3);
        System.out.println("The smallest number is: "+smallest);
        System.out.println("The largest number is: "+largest);
    }
}