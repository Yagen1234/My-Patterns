public class SimpleErrorMessage extends SendMessage {

    public SimpleErrorMessage() {
        super(Priority.SIMPLE);
    }

    @Override
    public void write() {
        System.out.println("Think a little bit");
    }
}
