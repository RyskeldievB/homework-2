public class Main {
    public static void main(String[] args) {
        Printable[] printable = {createObject("Mercedes"), createObject("Maserati"),
                createObject("Bmw")};
        for (Printable print:printable) {
            print.print();
        }
    }
    public static Printable createObject(String className){
        switch (className) {
            case "Mercedes":
                return  new  Mercedes(5);
            case "Maserati":
                return new Maserati(2020);
            case "Bmw":
                return new BMW("F90");
        }
        return null;
    }
}