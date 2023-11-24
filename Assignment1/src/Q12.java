public class Q12 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    public Q12(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }
    public void updateCreditLimit(int newLimit) {
        limit = newLimit;
    }
    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid payment amount: " + amount + ". Ignoring the request.");
        }
    }
    public static void main(String[] args) {
        Q12 card = new Q12("John Doe", "Bank of ABC", "1234 5678 9101 1121", 1000, 300);

        System.out.println("Initial Balance: " + card.getBalance());
        card.makePayment(200);
        System.out.println("Balance after payment: " + card.getBalance());

        System.out.println("Attempting to make a negative payment:");
        card.makePayment(-50);
        System.out.println("Balance after attempted payment: " + card.getBalance());
    }
}

