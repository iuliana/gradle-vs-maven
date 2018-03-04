/**
 *
 * The {@code GrandChild0101} class represents a grandchild of child 01.
 *
 * @author Iuliana Cosmina on 2/8/18
 */
public class GrandChild0101 {

    /** The value is used for grandchild name. */
    private String name;

    /**
     * Initializes a newly created {@code GrandChild0101} object so that it represents
     * a grandchild of child 01.
     *
     * @param  name
     *      The name of the grandson
     */
    public GrandChild0101(String name) {
        this.name = name.toUpperCase();
    }

    public String getName() {
        return name;
    }
}
