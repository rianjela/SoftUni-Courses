package L06_ObjectsAndClasses.l04_Songs;

public class Song {

    private String typeList;
    private String name;
    private String time;

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String time() {
        return time;
    }

    public void setSong(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

}
