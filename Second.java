public class Second {
//   2.5 Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility.
//    Why is the following implementation of the PredatoryCreditCard.charge method flawed? public boolean charge(double price) {
//        boolean isSuccess = super.charge(price);
//        if (!isSuccess)
//            super.charge(5); // the penalty
//        return isSuccess;
//    }
//
//    In either case, you can't be charged a fee if you are close enough to the balance that the fee (of value 5)
//    would exceed your limit.
}
