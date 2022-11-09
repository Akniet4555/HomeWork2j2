public class Phone implements Printable{

    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Printing Phone" + getName());
    }
}
