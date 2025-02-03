public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker.WorkerBuilder("Alex","AGH").setHasCar(false).setAge(27).build();
    }
}