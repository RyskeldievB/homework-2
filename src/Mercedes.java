public class Mercedes extends Car implements Printable{
    private int volume;
    public Mercedes(int volume) {
        this.volume = volume;
    }
    @Override
    public void print() {
        System.out.println("Mercedes volume: " + volume);
    }
}
