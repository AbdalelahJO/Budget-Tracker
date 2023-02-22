public class Transaction {
    private String type;
    private double amount;
    private String note;

    public Transaction(String type, double amount, String note) {
        this.type = type;
        this.amount = amount;
        this.note = note;
    }

    @Override
    public String toString() {
        return type + ": SAR " + amount + " - " + note;
    }
}

