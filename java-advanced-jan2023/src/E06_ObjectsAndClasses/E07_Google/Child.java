package E06_ObjectsAndClasses.E07_Google;

public class Child {

    private String childName;
    private String childBirthday;

    //Constructor
    public Child(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n", getChildName(), getChildBirthday());

    }

    // Getter & Setters
    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }
}
