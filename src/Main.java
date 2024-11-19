public class Main {
    public static void main(String[] args) {

        User firstUser = new User(1, "Kamil Ertekin", "kamil.ertekin@vub.be", "etterbek");

        System.out.println(firstUser.toString());

        Job firstPaidJob = new Job(1, "Waiter", "Need experienced waiter", "garden work", true, 13.5f);
        Job firstUnpaidJob = new Job (2, "Student Assistant", "Need masters diploma to teach students", "education", false,0);

        System.out.println(firstPaidJob.toString());
        System.out.println(firstUnpaidJob.toString());
    }
}