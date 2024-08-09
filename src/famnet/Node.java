package famnet;

import java.util.ArrayList;

public class Node {

    private String id = null;
    private String name = null;
    private String location = null;
    private String dob = null;
    private String gender = null;
    private String profession = null;
    private ArrayList<String> children = new ArrayList<String>();
    private ArrayList<String> spouses = new ArrayList<String>();

    public Node () {}

    public Node (
        String id,
        String name,
        String location,
        String dob,
        String gender,
        String profession,
        ArrayList<String> children,
        ArrayList<String> spouses
    ) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.dob = dob;
        this.gender = gender;
        this.profession = profession;
        this.children = children;
        this.spouses = spouses;
    }

    public void setId (String id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setLocation (String location) {
        this.location = location;
    }

    public void setDOB (String dob) {
        this.dob = dob;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public void setProfession (String profession) {
        this.profession = profession;
    }

    public void setChildren (ArrayList<String> children) {
        this.children = children;
    }

    public void setSpouses (ArrayList<String> spouses) {
        this.spouses = spouses;
    }

    public void addChild (String childId) {
        children.add(childId);
    }

    public void addSpouse (String spouseId) {
        spouses.add(spouseId);
    }

    public void removeChild (String childId) {
        children.remove(childId);
    }

    public void removeSpouse (String spouseId) {
        spouses.remove(spouseId);
    }

    public String getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public String getLocation () {
        return location;
    }

    public String getDOB () {
        return dob;
    }

    public String getGender () {
        return gender;
    }

    public String getProfession () {
        return profession;
    }

    public ArrayList<String> getChildren () {
        return children;
    }

    public ArrayList<String> getSpouses () {
        return spouses;
    }
}