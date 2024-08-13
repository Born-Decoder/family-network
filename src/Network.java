import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class Network {

    private Map<String, Node> nodeMap = new HashMap<>();

    public String addNode(String name, String location, String dob, String gender, String profession) {
        String id = UUID.randomUUID().toString();
        
        ArrayList<String> children = new ArrayList<>();
        ArrayList<String> spouses = new ArrayList<>();
        ArrayList<String> parents = new ArrayList<>();
        
        Node node = new Node(id, name, location, dob, gender, profession, parents, children, spouses);
        nodeMap.put(id, node);
        
        System.out.println("Node added with ID: " + id);
        return id;
    }

    public Node getNodeById(String id) {

        Node node = nodeMap.get(id);
        
        if (node != null) {
            System.out.println("Node ID: " + node.getId());
            System.out.println("Name: " + node.getName());
            System.out.println("Location: " + node.getLocation());
            System.out.println("Date of Birth: " + node.getDOB());
            System.out.println("Gender: " + node.getGender());
            System.out.println("Profession: " + node.getProfession());
            System.out.println("Parents: " + node.getParents());
            System.out.println("Children: " + node.getChildren());
            System.out.println("Spouses: " + node.getSpouses());
        } else {
            System.out.println("Node with ID " + id + " not found.");
        }
        return node;
    }

    public void modifyNode(String id, String attr, String val) {

        Node node = nodeMap.get(id);
        
        if (node != null) {
            System.out.println("Modifying " + node.getId() + " node's " + attr);
            if (attr.equals("name")) node.setName(val);
            if (attr.equals("location")) node.setLocation(val);
            if (attr.equals("dob")) node.setDOB(val);
            if (attr.equals("gender")) node.setGender(val);
            if (attr.equals("profession")) node.setProfession(val);
        } else {
            System.out.println("Node with ID " + id + " not found.");
        }
    }

    public void addChild(String p1id, String p2id, String childid) {

        Node p1node = nodeMap.get(p1id);
        Node p2node = nodeMap.get(p2id);
        Node cnode = nodeMap.get(childid);

        if (p1node != null && p2node != null && cnode != null) {
            p1node.addChild(childid);
            p2node.addChild(childid);
            cnode.addParent(p1id);
            cnode.addParent(p2id);

            System.out.println("Child added for " + p1id + " and" + p2id);
        }
        
    }

    public void removeChild(String p1id, String p2id, String childid) {

        Node p1node = nodeMap.get(p1id);
        Node p2node = nodeMap.get(p2id);
        Node cnode = nodeMap.get(childid);

        if (cnode == null) {
            System.out.println("Incorrect Child id");
        }

        else if (p1node != null && p2node != null && cnode != null) {
            p1node.removeChild(childid);
            p2node.removeChild(childid);
            cnode.removeParent(p1id);
            cnode.removeParent(p2id);

            System.out.println("Child removed for " + p1id + " and" + p2id);
        }

        else {
            try {
                p1node.removeChild(childid);
                cnode.removeParent(p1id);
            }
            catch (Exception e){
                System.out.println("No partner found - " + p1id);
            }
            try {
                p2node.removeChild(childid);
                cnode.removeParent(p2id);
            }
            catch (Exception e){
                System.out.println("No partner found - " + p2id);
            }
        }
        
    }

    public void addSpouse(String p1id, String p2id) {

        Node p1node = nodeMap.get(p1id);
        Node p2node = nodeMap.get(p2id);

        if (p1node != null && p2node != null) {
            p1node.addSpouse(p2id);
            p2node.addSpouse(p1id);

            System.out.println("Spouse added for " + p1id + " and" + p2id);
        }
        
    }

    public void removeSpouse(String p1id, String p2id) {

        Node p1node = nodeMap.get(p1id);
        Node p2node = nodeMap.get(p2id);

        if (p1node != null) {
            p1node.removeSpouse(p2id);
            System.out.println("Spouse removed for " + p1id);
        }

        if (p2node != null) {
            p2node.removeSpouse(p1id);
            System.out.println("Spouse removed for " + p2id);
        }
    }

    public Map<String, Node> getAllNodes() {
        return nodeMap;
    }

    public ArrayList<String> listAllNodes() {
        if (nodeMap.isEmpty()) {
            System.out.println("The network is empty.");
            return new ArrayList<>();
        }

        ArrayList<String> nodeList = new ArrayList<>();
        for (Node node : nodeMap.values()) {
            nodeList.add(node.getId());
        }

        return nodeList;
    }

    // TO DO - DEGREE BASED RETRIEVALS

    public void printGraph() {
        if (nodeMap.isEmpty()) {
            System.out.println("The network is empty.");
            return;
        }

        for (Node node : nodeMap.values()) {
            System.out.println("-------------------------------------------------");
            System.out.println("Node ID: " + node.getId());
            System.out.println("Name: " + node.getName());
            System.out.println("Location: " + node.getLocation());
            System.out.println("Date of Birth: " + node.getDOB());
            System.out.println("Gender: " + node.getGender());
            System.out.println("Profession: " + node.getProfession());
            System.out.println("Parents: " + (node.getParents().isEmpty() ? "None" : String.join(", ", node.getParents())));
            System.out.println("Children: " + (node.getChildren().isEmpty() ? "None" : String.join(", ", node.getChildren())));
            System.out.println("Spouses: " + (node.getSpouses().isEmpty() ? "None" : String.join(", ", node.getSpouses())));
            System.out.println("-------------------------------------------------");
        }
    }
}

