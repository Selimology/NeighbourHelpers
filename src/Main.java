public class Main {
    public static void main(String[] args) {
        NeighbourHelper neighbourHelper = new NeighbourHelper();

        //Add users
        int firstUser = neighbourHelper.addUser("Kamil Ertekin", "kamil.ertekin@vub.be", "Etterbek");
        int secondUser = neighbourHelper.addUser("James Bond", "james.bond@vub.be", "Not Etterbek");

        //Add jobs
        int firstJob = neighbourHelper.addJob("Takeaway Work", "Drive around and drop food of", "FastFood Work", true, 14.0f);
        int job2 = neighbourHelper.addJob("Programming Tutoring", "Help with programming in data structures", "Education", false, 0.0f);

        neighbourHelper.printAllUsers();

        neighbourHelper.printAllJobs();

        //Find the first user
        User userFound = neighbourHelper.findUser(1);
        if (userFound != null) {
            System.out.println(" The user exists and here are the information:" + userFound);
        }

        //Find the first job
        Job jobFound = neighbourHelper.findJob(1);
        if (jobFound != null) {
            System.out.println(" The job exists and here are the information:" + jobFound);
        }
    }
}