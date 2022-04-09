package SingleResponsiblity.problem.example2;

// An Entity
public class Course {

private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createConnection() {
        // Created the connection (WRONG!)
    }
}
