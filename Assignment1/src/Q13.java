public class Q13 {
        public static void main(String[] args) {
            Q12 wallet[] = new Q12[3];
            wallet[0] = new Q12("John Bowman", "California Savings", "5391 0375 9387 5309", 5000,22.22);
            wallet[1] = new Q12("John Bowman", "California Federal", "3485 0399 3395 1954", 3500,44.3);
            wallet[2] = new Q12("John Bowman", "California Finance", "5391 0375 9387 5309", 2500,87.3);

            for (int val = 1; val <= 16; val++) {
                wallet[0].charge(3 * val);
                wallet[1].charge(2 * val);
                wallet[2].charge(val);
                System.out.println("Attempted to charge: $" + val + ", $" + (2 * val) + ", $" + (3 * val));
            }

            for (Q12 card : wallet) {
                System.out.println("Customer = " + card.getCustomer() + ", Credit limit = " + card.getLimit() + ", Balance = " + card.getBalance());
            }
        }
    }

