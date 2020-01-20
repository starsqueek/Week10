package graph;

import java.util.*;

public class TraversalList<T> extends AdjacencyGraph<T> implements Traversal<T> {

    private Stack<T> traversallist = new Stack<T>();
    private List<T> visited = new ArrayList<T>();
    private Queue<T> unvisited = new ArrayDeque<T>();;

    /**
     * produces a depth-first traversal of a graph.
     *
     * @return list of visited nodes in depth-first traversal order.
     */
    public List<T> traverse() throws GraphError{
        T node = getUnvisitedNode();
        while (node != null) {
            unvisited.add(node);
            traverseList();
            node = getUnvisitedNode();
        }
        return visited;
    }

    /**
     * Checks to see if a node has been visited before.
     *
     * @return a boolean of whether the node has been visited.
     */
    private boolean visited(T node) {
        return
                visited.contains(node) || unvisited.contains(node);
    }

    /**
     * Get a node that has not been visited by the traversal yet.
     *
     * @return Graphs node.
     */
    private T getUnvisitedNode() {
        for (T node: getNodes()) {
            if (!visited(node)) {
                return node;
            }
        }
        return null;
    }

    /**
     * A method that loops while the size of the unvisited queue is greater than 0.
     *
     */
    private void traverseList() throws GraphError {
        while (unvisited.size() > 0) {
            T node = unvisited.remove();
            visitNode(node);
        }
    }

    /**
     * A method that visits the node and adds it to the visited list and removes from the unvisited list.
     *
     */
    private void visitNode(T node) throws GraphError {
        if (visited(node)) return;
        traversallist.add(node);
        visited.add(node);
        System.out.println(node + " " + getNeighbours(node));
        for (T neighbour: getNeighbours(node)) {
            if (!visited(neighbour)) {
                visitNode(neighbour);
            } else {
                traversallist.pop();
            }
        }
    }
}
