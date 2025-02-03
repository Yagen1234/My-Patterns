public class HardErrorMessage extends SendMessage {
    public HardErrorMessage() {
        super(Priority.HARD);
    }

    @Override
    public void write() {
        System.out.println("Dig through dozens of articles");
    }
}
