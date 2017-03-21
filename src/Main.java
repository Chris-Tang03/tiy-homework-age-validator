import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validator validate = new Validator();
        System.out.println("Enter Your Age: ");
        String input = scanner.nextLine();
        try{
            Integer.parseInt(input);
            if(validate.validateAge(input)){
                System.out.println("This is a valid age.");
            }

        }
        catch (NumberFormatException e){
            System.out.println("This has to be a number");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
