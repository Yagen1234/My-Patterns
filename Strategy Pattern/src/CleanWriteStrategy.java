public class CleanWriteStrategy implements WriteStrategy{
    @Override
    public void write() {
        System.out.println("Write accurate");
    }
}
