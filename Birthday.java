import java.io.Serializable;

public class Birthday implements Serializable {
    String name;
    private static final long serialVersionUID = 1L;
    int age;

    public Birthday(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
