public class PaidJob extends Job {
    private float price;

    public PaidJob(int id, String category, String description, String title, float price) {
        super(id, category, description, title);
        this.price = price;
    }

    @Override
    public boolean isPaid() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.price;
    }
}
