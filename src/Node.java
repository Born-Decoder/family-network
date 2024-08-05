public class Node {

    private String id = null;
    private String name = null;
    private String location = null;
    private String dob = null;
    private String gender = null;
    private String profession = null;

    public Node () {}

    public Node (
        String id,
        String name,
        String location,
        String dob,
        String gender,
        String profession
    ) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.dob = dob;
        this.gender = gender;
        this.profession = profession;
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
}