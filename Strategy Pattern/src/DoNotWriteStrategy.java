public class DoNotWriteStrategy implements WriteStrategy{
    @Override
    public void write() {
        System.out.println("You don't need to write on this");
    }
}
