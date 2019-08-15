public class Site implements Comparable<Site> {

    private String id;
    private  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Site T){
        return (this.name.compareTo(T.getName()));
    }
}