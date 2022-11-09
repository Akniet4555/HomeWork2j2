import java.util.Objects;

public class Xiomi extends Phone implements Printable{
    private String version;
    private String caseColor;

    public Xiomi(String name, String version, String caseColor) {
        super(name);
        this.version = version;
        this.caseColor = caseColor;
    }

    @Override
    public void print() {
        System.out.println("Version: " + getVersion());
        System.out.println("caseColor: " + getCaseColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Xiomi xiomi = (Xiomi) o;
        return version == xiomi.version && Objects.equals(caseColor, xiomi.caseColor);
    }

    @Override
    public String toString() {
        return "Xiomi{" +
                "Version:" + version +
                ", caseColor:'" + caseColor + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, caseColor);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public Xiomi(String name) {
        super(name);
    }


}
