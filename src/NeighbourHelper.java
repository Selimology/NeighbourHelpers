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
}

