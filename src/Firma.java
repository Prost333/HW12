import java.util.Objects;

public class Firma {
    private String name;
    private  String service;
    private  int id;
    private int debit;

    public Firma(String name, String service, int id, int debit) {
        this.name = name;
        this.service = service;
        this.id = id;
        this.debit=debit;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Firma firma = (Firma) o;
        return id == firma.id && Objects.equals(name, firma.name) && Objects.equals(service, firma.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, service, id);
    }

    @Override
    public String toString() {
        return "Firma{" +
                "Имя='" + name + '\'' +
                ", Вид деятельности='" + service + '\'' +
                ", id=" + id +
                '}';
    }
}
