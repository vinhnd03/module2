package ss16_read_write_file.bai_tap.doc_file_csv;

public class Country {
    private int id;
    private String cap;
    private String name;

    public Country(int id, String cap, String name) {
        this.id = id;
        this.cap = cap;
        this.name = name;
    }

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", cap='" + cap + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getInfoForCSV(){
        return this.id + "," + this.cap + "," + this.name;
    }
}
