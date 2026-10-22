import java.util.Scanner; 

public class MadLibs {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a first name. ");
        String input1 = scanner.nextLine();

        System.out.print("Enter a different first name. ");
        String input2 = scanner.nextLine();

        System.out.print("Enter a last name. ");
        String input3 = scanner.nextLine();

        System.out.print("Enter an adjective. ");
        String input5 = scanner.nextLine();

        System.out.print("Enter a time in the format 00:00 ");
        String input6 = scanner.nextLine();

        System.out.print("Enter the name of a place. ");
        String input7 = scanner.nextLine();

        System.out.print("Enter a first name. ");
        String input8 = scanner.nextLine();

        System.out.print("Enter a location. ");
        String input9 = scanner.nextLine();

        System.out.print("Enter a food item. ");
        String input11 = scanner.nextLine();

        System.out.print("Enter an animal. ");
        String input12 = scanner.nextLine();

        System.out.print("Enter a mixed number (decimal). ");
        double input13 = scanner.nextDouble();

        System.out.print("Enter a number. ");
        int input10 = scanner.nextInt();

        scanner.close();

        System.out.println("*trumpets*");
        System.out.println("Hear ye, hear ye, for I have a public declaration from Lord " + input1 + "!");
        String crime = "We are searching for the most ";
        crime += input5 + " ";
        crime += input2 + " ";
        crime += input3 + " ";
        crime += "the IV for committing the abhorrent crime of stealing the last cookie from the cookie jar.";
        System.out.println(crime);
    }
}

