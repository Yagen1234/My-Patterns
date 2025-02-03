public class Worker {
    private String name;
    private String company;
    private boolean hasCar;
    private int age;
    private Worker(WorkerBuilder workerBuilder) {
        name = workerBuilder.name;
        company = workerBuilder.company;
        hasCar = workerBuilder.hasCar;
        age = workerBuilder.age;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public boolean isHasCar() {
        return hasCar;
    }
    public int getAge() {
        return age;
    }
    public static class WorkerBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private int age;
        public WorkerBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }
        public WorkerBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }
        public WorkerBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public Worker build() {
            return new Worker(this);
        }
    }
}
