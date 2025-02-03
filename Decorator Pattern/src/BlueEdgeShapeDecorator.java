import java.awt.*;

public class BlueEdgeShapeDecorator extends ShapeDecorator {

    public BlueEdgeShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColorToEdge(decoratedShape);
    }

    public void setColorToEdge(Shape decoratedShape) {
        System.out.println("But with blue colored edge");
    }
}
