package BaiTap;

public class DocFile {
     private int id;
     private int count;
     private String name;
     private String nation;

    public DocFile() {
    }

    public DocFile( String name, String nation) {
        this.id = count++;
        this.name = name;
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return  id + ","+"\"" + name + "\"" + "," + "\"" + nation + "\"";

    }
}
