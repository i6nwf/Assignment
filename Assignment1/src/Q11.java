public class Q11 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    public Q11(String cust, String bk, String acnt, int lim, double initialBal) {
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
        balance -= amount;
    }

    public static void main(String[] args) {
        Q11 card = new Q11("John Deep", "Bank of CS", "1111 6745 222 6574", 5000, 9000);

        System.out.println("Initial Credit Limit: " + card.getLimit());
        card.updateCreditLimit(2200);
        System.out.println("Updated Credit Limit: " + card.getLimit());
    }



}
