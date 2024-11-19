public class NeighbourHelper implements iNeighbourHelper {
    private int jobCount;
    private int userCount;
    private Job[] jobs;
    private User[] users;

    public NeighbourHelper(){
        jobCount = 0;
        userCount = 0;
        jobs = new Job[10];
        users = new User[10];
    }

    private boolean isValidInput (String str) {
        return str != null ;
    }

    @Override
    public int addUser(String name, String email, String street) {
        if(!isValidInput(name) || !isValidInput(email) || !isValidInput(street)){
            System.out.println("Wrong");
        }
        int userId = userCount + 1;
        users[userCount] = new User(userId, name, email, street);
        userCount++;
        return userId;
    }

    @Override
    public int addJob(String title, String description, String category, boolean isPaid, float price){
        if(!isValidInput(title) || !isValidInput(description) || !isValidInput(category)){
            System.out.println("Wrong");
        }
        int jobId = jobCount + 1;
        jobs[jobId] = new Job(jobId, title, description, category, isPaid, price);
        jobCount++;
        return jobId;
    }

    @Override
    public void printAllUsers(){
        for (int i = 0 ; i < userCount ; i++){
            System.out.println(users[i]);
        }
    }

    @Override
    public void printAllJobs(){
        for (int i = 0 ; i < jobCount ; i++){
            System.out.println(jobs[i]);
        }
    }





}

