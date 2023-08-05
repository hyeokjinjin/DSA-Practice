package AdjacencyMatrix;
public class AdjacencyMatrix {
    
    public static void main(String[] args) {
        
        //Adjacency Matrix = 2D array to store 1's/0's to represent edges
        //                   # of rows = # of unique nodes
        //                   # of columns = # of unique nodes
        //
        //Runtime Complexity to check an Edge: O(1)
        //Space Complexity: O(V^2)

        // Breadth FS = Traverse a graph level by level
		//			   Utilizes a Queue
		//			   Better if destination is on average close to start
		//			   Siblings are visited before children

		// Depth FS   = Traverse a graph branch by branch
		//			   Utilizes a Stack
		//			   Better if destination is on average far from the start
		//			   Children are visited before siblings
		//			   More popular for games/puzzles

        Graph graph = new Graph(5);
        
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
        System.out.println();

        System.out.println(graph.checkEdge(3, 2));
        System.out.println();

        graph.depthFirstSearch(4);
        System.out.println();
        
        graph.breadthFirstSearch(0);
    }
}
