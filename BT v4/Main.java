import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  

    System.out.println(""); // here is the welcome screen 
    System.out.println("---------------------------welcome-----------------------------");
    System.out.println("");
    System.out.print("Enter your budget: "); // asking the user for his budget to do changes on it later 
    double budget = input.nextDouble();

    BudgetTracker tracker = new BudgetTracker(budget);
    ArrayList<Transaction> transactions = new ArrayList<>();//here is an arraylist for the transactins so the user can view them later


    while (true) { // access to the menu class so the user can view the optins
      int choice = Menu.displayMenu();

      if (choice == 1) { // the expenses choice  
        System.out.print("Enter expense amount: "); 
        // saving the expense or income
        // and the note with it in an arrayList so i can show it to the user later in history
        double expense = input.nextDouble();
        System.out.print("Enter a note for that expense: ");
        String note = input.next();

        transactions.add(new Transaction("expense", expense, note));
        tracker.addExpense(expense);
        System.out.println("-----------------");
        System.out.println("Your remaining budget: SAR " + tracker.getBudget());
      } 
      
      
      else if (choice == 2) { // doing what i did in the previus step
        System.out.print("Enter income amount: ");
        double income = input.nextDouble();
        System.out.print("Enter a note for that income: ");
        String note = input.next();

        transactions.add(new Transaction("income", income, note));
        tracker.addIncome(income);
        System.out.println("-----------------");
        System.out.println("Your remaining budget: SAR " + tracker.getBudget());
      }
      
      
      else if (choice == 3) { // showing the user his transaction by printing the arrayList
        System.out.println("Your transactions: ");
        for (int i = 0; i < transactions.size(); i++) {
          System.out.println(transactions.get(i).toString());
        }
      } 
      


      else if (choice == 4) { //if the user just want to see his budget now
        System.out.println("Your budget: SAR " + tracker.getBudget());



      } else if (choice == 5) {
        break;
      } 
      
      else {//if the user enterd a wrong number out of range ex.6 this will show up
        
        System.out.println("-----------------");
        System.out.println("the number you have entered is not correct");
        System.out.println("please check the number and try again");
      }

    }
  
    input.close();
  
  }
}
