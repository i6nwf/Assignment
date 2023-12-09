public class first {
//    2.4 Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility.
//    Why is the following implementation of the PredatoryCreditCard.charge method flawed?
//    public boolean charge(double price) {
//        boolean isSuccess = super.charge(price);
//        if (!isSuccess)
//            charge(5); // the penalty
//        return isSuccess;
//    }
//
//
//    The PredatoryCreditCard.charge method is flawed because it can potentially result in an infinite loop.
//    The method first attempts to charge the specified price using the superclass's charge method.
//    If this attempt fails, the method recursively calls itself, passing a penalty amount of 5.
//    This means that if the initial charge fails, the method will continuously call itself,
//    adding a penalty of 5 to the amount being charged each time.
//    This could eventually lead to a situation where the attempted charge exceeds the credit limit of the account,
//    but the method will continue to recurse indefinitely


}
