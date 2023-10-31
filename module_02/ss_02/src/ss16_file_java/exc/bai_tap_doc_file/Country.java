package ss16_file_java.exc.bai_tap_doc_file;

public class Country {
    private int id;
    private String acronymName;

    private String fullName;

    public Country(int id, String acronymName, String fullName) {
        this.id = id;
        this.acronymName = acronymName;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronymName() {
        return acronymName;
    }

    public void setAcronymName(String acronymName) {
        this.acronymName = acronymName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
