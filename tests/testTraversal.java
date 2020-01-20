import graph.GraphError;
import graph.TraversalList;
import org.junit.jupiter.api.Test;

public class testTraversal<T> {

    /**
     * Tests the depth-first traversal with 6 nodes.
     *
     * @throws GraphError a error occurs within the graph.
     */
    @Test
    void TestBinTree6() throws GraphError {
        TraversalList<T> newGraph = new TraversalList<>();
        newGraph.add((T) "A");
        newGraph.add((T) "B");
        newGraph.add((T) "C");
        newGraph.add((T) "D");
        newGraph.add((T) "E");
        newGraph.add((T) "F");
        newGraph.add((T) "A",(T) "B");
        newGraph.add((T) "A",(T) "C");
        newGraph.add((T) "A",(T) "F");
        newGraph.add((T) "B",(T) "F");
        newGraph.add((T) "C",(T) "E");
        newGraph.add((T) "D",(T) "E");
        System.out.println(newGraph.traverse());
}

    /**
     * Tests the depth-first traversal with 8 nodes.
     *
     * @throws GraphError a error occurs within the graph.
     */
    @Test
    void TestBinTree8() throws GraphError {
        TraversalList<T> newGraph = new TraversalList<>();
        newGraph.add((T) "1");
        newGraph.add((T) "2");
        newGraph.add((T) "3");
        newGraph.add((T) "4");
        newGraph.add((T) "5");
        newGraph.add((T) "6");
        newGraph.add((T) "7");
        newGraph.add((T) "8");
        newGraph.add((T) "2",(T) "1");
        newGraph.add((T) "1",(T) "4");
        newGraph.add((T) "4",(T) "3");
        newGraph.add((T) "3",(T) "5");
        newGraph.add((T) "8",(T) "6");
        newGraph.add((T) "3",(T) "6");
        newGraph.add((T) "4",(T) "6");
        newGraph.add((T) "5",(T) "7");
        newGraph.add((T) "7",(T) "8");
        System.out.println(newGraph.traverse());
    }
}
