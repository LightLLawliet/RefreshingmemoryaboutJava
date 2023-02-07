public class MyData {
    private final int id;
    private final String description;

    public MyData(int id, String description) {
        this.description = description;
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
