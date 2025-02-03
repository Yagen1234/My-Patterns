public class RoundedEdgesShapeDecorator extends ShapeDecorator{

    public RoundedEdgesShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRoundedEdges(decoratedShape);
    }

    private void setRoundedEdges(Shape decoratedShape) {
        System.out.println("But with rounded edges");
    }
}