package encapsulation;

public class Test6 {
    public static void main(String[] args) {

        Subscription basic =
                new Subscription("Ali", 3, true);

        PremiumSubscription premium =
                new PremiumSubscription("Dana", 6, false, true);

        StudentSubscription student =
                new StudentSubscription("Arman", 16, true, 60);

        TrialSubscription trial =
                new TrialSubscription("Aruzhan", 0, false, 14);

        basic.printInfo();
        System.out.println();

        premium.printInfo();
        System.out.println();

        student.printInfo();
        System.out.println();

        trial.printInfo();
    }
}
