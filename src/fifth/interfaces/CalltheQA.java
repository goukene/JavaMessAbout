package fifth.interfaces;

public class CalltheQA {

    static void testThatCode(QA qa) {
        qa.testCode();
    }

    static void personGreets(Person person) {
        System.out.println(person.sayHello());
    }

    public static void main(String[] args) {
        Rob rob = new Rob();
        Lee lee = new Lee();


        testThatCode(rob);
        testThatCode(lee);


        Male male = new Male();
        personGreets(male);
        Female female = new Female();
        personGreets(female);

        FrenchMan frenchMan = new FrenchMan();
        personGreets(frenchMan);
    }
}
