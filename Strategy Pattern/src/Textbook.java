public class Textbook extends StuddingStuff {
    public Textbook() {
        super(new DoNotWriteStrategy());
    }

    public void read() {
        System.out.println("You're reading the textbook...");
    }
}
