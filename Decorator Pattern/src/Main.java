public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape roundEdgesTriangle = new RoundedEdgesShapeDecorator(new Triangle());
        roundEdgesTriangle.draw();
        Shape blueTriangle = new BlueEdgeShapeDecorator(new Triangle());
        blueTriangle.draw();
    }
}
