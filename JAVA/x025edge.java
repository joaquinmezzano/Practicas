import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Represents an edge on the graph.
 *
 * NOTE: There is no need to change this file and is treated as read only by the Exercism test runners.
 */
public final class x025edge {
    private final String start;

    private final String end;

    private final Map<String, String> attributes;

    public x025edge(String start, String end) {
        this.start = start;
        this.end = end;
        this.attributes = Collections.emptyMap();
    }

    public x025edge(String start, String end, Map<String, String> attributes) {
        this.start = start;
        this.end = end;
        this.attributes = Map.copyOf(attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, attributes);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof x025edge other) {
            return Objects.equals(other.start, start)
                && Objects.equals(other.end, end)
                && Objects.equals(other.attributes, attributes);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Edge [start=" + start + ", end=" + end + ", attributes=" + attributes + "]";
    }
}