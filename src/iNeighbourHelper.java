
public interface iNeighbourHelper {

    /**
     * ************************ PART 1 **************************
     */
    /*
* Add a new user with given parameters: name, email address, and street
address.
*
* @param name
*
* @param email
*
* @param street address
*
* @return ID of the user
     */
    public int addUser(String name, String email, String street);

    /*
    * Add a job with given parameters: title, description, category, isPaid,
    price.
    *
    * @param title
    *
    * @param description
    *
    * @param category, e.g. repair, general house work, yard work, ironing,
    window washing, etc.
    *
    * @param isPaid - indication whether it is a paid job or not
    *
    * @param price
    *
    * @return ID of the job
     */
    public int addJob(String title, String description, String category, boolean isPaid, float price);

    /*
     * Print all users in the following format:
     * "user ID, name, email, street address"
     */
    public void printAllUsers();

    /*
     * Print all jobs in the following format:
     * "job ID, title, description, category, price (in case of a paid job)"
     */
    public void printAllJobs();

    /*
     * Return user based on userID or null if the user does not exist.
     *
     * @param userID
     *
     * @return User object
     */
    public User findUser(int userID);

    /*
     * Return job based on jobID or null if the job does not exist.
     *
     * @param jobID
     *
     * @return Job object
     */
    public Job findJob(int jobID);

    /**
     * ************************ end of PART 1 **************************
     */
}

    
