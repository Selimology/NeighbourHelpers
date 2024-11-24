public abstract class Job {
    private int id;
    private String category;
    private String description;
    private String title;

    public Job(int id, String category, String description, String title) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    // I am adding this method to seperate paid and unpaid jobs.
    public abstract boolean isPaid();

    @Override
    public String toString() {
        return this.id + ", " + this.title + ", " + this.description + ", " + this.category;
    }
}