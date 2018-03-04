
/**
 * The {@code Child02} class represents a grandchild of child 02.
 *
 * @author Iuliana Cosmina on 2/8/18
 */
public class Child02 {

    private String name;

    /**
     * Initializes a newly created {@code Child02} object so that it represents
     * a grandchild of child 02.
     *
     * @param name The name of the grandson
     */
    public Child02(String name) {
        this.name = name.substring(0, 3);

    }

    public String getName() {
        return name;
    }
}
