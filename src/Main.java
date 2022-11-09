public class Main {
    public static void main(String[] args) {
        createObject("iPhone").print();

        System.out.println("---------------------");

        createObject("Samsung").print();

        System.out.println("-------------------------");

        createObject("Xiomi").print();

    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "iPhone":
                iPhone iPhone = new iPhone("iPhone",
                        4,"iPhone 14");
                return iPhone;

            case "Samsung":
                Samsung samsung = new Samsung("Samsung",
                        15.8,"Blue");
                return samsung;
            case "Xiomi":
                Xiomi xiomi = new Xiomi("Xiomi",
                    "Miui 13","Black");
            return xiomi;
        }
        return printable;
    }
}