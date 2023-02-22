import java.util.Scanner;

public class Menu { //here is the main meu that appers after adding the budget for the user to see his choices
  public static int displayMenu() {
    
  Scanner input = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    System.out.println("-------------BUDGET TRACKER-------------");
    System.out.println("");
    System.out.println("1. Add expense");
    System.out.println("2. Add income");
    System.out.println("3. View transactions");
    System.out.println("4. View budget");
    System.out.println("5. Exit");
    System.out.println("");
    System.out.println("---------------------------------");
    System.out.println("");
    System.out.print("Enter your choice: ");

    int choice = input.nextInt();

    input.nextLine();

    return choice;
  }
}
