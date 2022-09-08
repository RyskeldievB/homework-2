public class Maserati extends Car implements Printable{
    private int year;

    public Maserati(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Maserati year: " + year);
    }
}
