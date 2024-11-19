public class Job {
    private int id;
    private String title;
    private String description;
    private String category;
    private boolean isPaid;
    private float price;

    public Job(int id, String title, String description, String category, boolean isPaid, float price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.isPaid = isPaid;
        this.price = price;
    }

    @Override
    public String toString() {
        if (isPaid) {
            return id + ", " + title + ", " + description + ", " + category + ", " + price;
        }
        return id + ", " + title + ", " + description + ", " + category;
    }
}