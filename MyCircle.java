package JavaFXDemo;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle extends MyShape {

    public MyCircle(String name, double x, double y) {
        super(name, x, y);
    }

    @Override
    public void draw(Pane pane) {
        Circle circle = new Circle(x, y, 30, Color.DODGERBLUE);
        pane.getChildren().add(circle);
    }

    @Override
    public void highlight(Pane pane) {
        Circle c = new Circle(x, y, 35);
        c.setFill(null);
        c.setStroke(Color.GOLD);
        c.setStrokeWidth(3);
        pane.getChildren().add(c);
    }
}