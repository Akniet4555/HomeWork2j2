import java.util.Objects;

public class iPhone extends Phone implements Printable{
    private int  camera;
    private String model;

    public iPhone(String name, int camera, String model) {
        super(name);
        this.camera = camera;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel());
        System.out.println("Camera: " + getCamera());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        iPhone iPhone = (iPhone) o;
        return camera == iPhone.camera && Objects.equals(model, iPhone.model);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "Camera: " + camera +
                ", Model: '" + model + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(camera, model);
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public iPhone(String name) {
        super(name);
    }

}
