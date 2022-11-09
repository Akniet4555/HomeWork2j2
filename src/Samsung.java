import java.util.Objects;

public class Samsung extends Phone implements Printable{
    private double processor;
    private String color;

    public Samsung(String name, double processor, String color) {
        super(name);
        this.processor = processor;
        this.color = color;
    }

    @Override
    public void print() { System.out.println("Processor: " + getProcessor());
        System.out.println("Color: " + getColor());}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samsung samsung = (Samsung) o;
        return processor == samsung.processor && Objects.equals(color, samsung.color);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "Processor: " + processor +
                ", color: " + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, color);
    }

    public double getProcessor() {
        return  processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Samsung(String name) {
        super(name);
    }
}
