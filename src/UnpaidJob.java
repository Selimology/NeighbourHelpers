public class UnpaidJob extends Job {
    public UnpaidJob(int id, String category, String description, String title) {
        super(id, category, description, title);
    }

    @Override
    public boolean isPaid() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
