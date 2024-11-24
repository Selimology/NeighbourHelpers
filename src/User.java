public class User {
    private int id;
    private String name;
    private String email;
    private String street;

    public User(int id, String name, String email, String street) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + email + ", " + street;
    }
}