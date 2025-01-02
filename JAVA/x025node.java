import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a node on the graph.
 *
 * NOTE: There is no need to change this file and is treated as read only by the Exercism test runners.
 */
public final class x025node {

    private final String name;

    private final Map<String, String> attributes;

    public x025node(String name) {
        this.name = name;
        this.attributes = Collections.emptyMap();
    }

    public x025node(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = Map.copyOf(attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attributes);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof x025node other) {
            return Objects.equals(other.name, name) && Objects.equals(other.attributes, attributes);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Node [name=" + name + ", attributes=" + attributes + "]";
    }
}
