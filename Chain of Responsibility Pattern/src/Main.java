import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SendMessage simpleError = new SimpleErrorMessage();
        SendMessage hardError = new HardErrorMessage();
        SendMessage criticalError = new CriticalErrorMessage();

        simpleError.setSendNextMessage(hardError);
        hardError.setSendNextMessage(criticalError);

        simpleError.messageSenderManager(Priority.CRITICAL);
    }
}