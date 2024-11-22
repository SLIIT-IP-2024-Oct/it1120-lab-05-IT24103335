import java.util.Scanner;

public class IT24103335Lab5Q2 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of new members introduced: ");
        int newMember = scan.nextInt();

        if (newMember < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {  
            String price;

            switch (newMember) {
                case 0:
                    price = "No prize";
                    break;
                case 1:
                    price = "Pen";
                    break;
                case 2:
                    price = "Umbrella";
                    break;
                case 3:
                    price = "Bag";
                    break;
                case 4:
                    price = "Traveling Chair"; 
                    break;
                default:
                    price = "Headphone";
            }

            System.out.println("Prize is a: " + price);
        }
    }
}