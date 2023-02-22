
public class BudgetTracker { //here is where the math is 

    private double budget;

    public BudgetTracker(double budget) {
        this.budget = budget;
    }

    public void addExpense(double expense) {
        budget -= expense;
    }

    public void addIncome(double income) {
        budget += income;
    }

    public double getBudget() {
        return budget;
    }
}
