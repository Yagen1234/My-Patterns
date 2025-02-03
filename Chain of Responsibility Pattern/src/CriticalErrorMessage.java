public class CriticalErrorMessage extends SendMessage {
    public CriticalErrorMessage() {
        super(Priority.CRITICAL);
    }

    @Override
    public void write() {
        System.out.println("Praise the Lord...");
    }
}
