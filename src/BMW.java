public class BMW extends Car implements Printable{
    private String model;

    public BMW(String model) {
        this.model = model;
    }
    @Override
    public void print() {
        System.out.println("Bmw model: " + model);
    }
}
