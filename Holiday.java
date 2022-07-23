import java.io.Serializable;

public class Holiday implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Holiday(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                '}';
    }
}
