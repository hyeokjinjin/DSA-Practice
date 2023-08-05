package AdjacencyList;

public class AdjacencyList {
    
    public static void main(String[] args) {
     
        //Adjacency List = Array/arraylist of linked lists
        //                 Each linked list has a unique node at the head
        //                 All adjacent neighbors to that node are added to that node's linked list
        //Runtime complexity to check an Edge: O(v)
        //Space complexity: O(v + e)

        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
    
        graph.print();
    }
}
