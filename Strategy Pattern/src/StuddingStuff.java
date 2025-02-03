public class StuddingStuff {
    private WriteStrategy writeStrategy;
    public StuddingStuff(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

    public void write() {
        writeStrategy.write();
    }
    public void call() {
        System.out.println("I'm a " + getClass().getName());
    }
}
