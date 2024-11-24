public class NeighbourHelper implements iNeighbourHelper {
    private Vector<Job> jobs;
    private Vector<User> users;
    private static final int STARTING_CAPACITY = 10;

    public NeighbourHelper() {
        jobs = new Vector<Job>(STARTING_CAPACITY);
        users = new Vector<User>(STARTING_CAPACITY);
    }

    private boolean isValidInput(String str) {
        return str != null;
    }

    @Override
    public int addUser(String name, String email, String street) {
        if (!isValidInput(name) || !isValidInput(email) || !isValidInput(street)) {
            System.out.println("Wrong");
        }
        int userId = users.getCurrentSize() + 1;
        User user = new User(userId, name, email, street);
        users.addItem(user);
        return userId;
    }

    @Override
    public int addJob(String category, String description, String title, boolean isPaid, float price) {
        if (!isValidInput(title) || !isValidInput(description) || !isValidInput(category)) {
            System.out.println("Wrong");
        }

        int jobId = jobs.getCurrentSize() + 1;
        Job job;

        if (isPaid) {
            job = new PaidJob(jobId, category, description, title, price);
        } else {
            job = new UnpaidJob(jobId, category, description, title);
        }

        jobs.addItem(job);
        return jobId;
    }


    @Override
    public void printAllUsers() {
        if (users.getCurrentSize() == 0) {
            System.out.println("No users");
            return;
        }
        for (int i = 0; i < users.getCurrentSize(); i++) {
            System.out.println(users.getItem(i));
        }
    }

    @Override
    public void printAllJobs() {
        if (jobs.getCurrentSize() == 0) {
            System.out.println("No jobs");
            return;
        }
        for (int i = 0; i < jobs.getCurrentSize(); i++) {
            System.out.println(jobs.getItem(i));
        }
    }

    @Override
    public User findUser(int userID) {

        for (int i = 0; i < users.getCurrentSize(); i++) {

            User user = users.getItem(i);
            if (user.getId() == userID) {
                return user;
            }
        }
        System.out.println("User not found.");
        return null;
    }

    @Override
    public Job findJob(int jobID) {
        for (int i = 0; i < jobs.getCurrentSize(); i++) {
            Job job = jobs.getItem(i);
            if (job.getId() == jobID) {
                return job;
            }
        }
        System.out.println("Job not found.");
        return null;
    }
}

