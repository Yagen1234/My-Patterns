public abstract class SendMessage {
    private Priority priority;
    private SendMessage sendNextMessage;
    public SendMessage(Priority priority) {
        this.priority = priority;
    }
    public void setSendNextMessage(SendMessage sendNextMessage) {
        this.sendNextMessage = sendNextMessage;
    }
    public void messageSenderManager(Priority level){
        if(level.ordinal() >= priority.ordinal()){
            write();
        }
        if(sendNextMessage != null){
            sendNextMessage.messageSenderManager(level);
        }
    }
    public abstract void write();
}
