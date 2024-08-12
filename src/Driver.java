public class Driver {

    public static void main(String[] args) {
        // Create a Network instance
        Network network = new Network();

        // Add some nodes to the network
        String alice_id = network.addNode("Alice", "New York", "1990-01-01", "Female", "Engineer");
        String bob_id = network.addNode("Bob", "Los Angeles", "1988-05-12", "Male", "Doctor");
        String charlie_id = network.addNode("Charlie", "Chicago", "2015-07-22", "Male", "Student");
        String diana_id = network.addNode("Diana", "Miami", "2017-09-10", "Female", "Student");

        // Add a spouse relationship
        network.addSpouse(alice_id, bob_id);

        // Add a child to Alice and Bob
        network.addChild(alice_id, bob_id, charlie_id);
        network.printGraph();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        // Remove a child
        network.removeChild(alice_id, bob_id, charlie_id);
        network.addChild(alice_id, bob_id, diana_id);
        network.printGraph();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        // Remove a spouse relationship
        network.removeSpouse(alice_id, bob_id);
        network.printGraph();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        // Modify node details
        network.modifyNode(alice_id, "location", "San Francisco");

        // Display nodes after modifications
        network.printGraph();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }
}
