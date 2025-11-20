package JavaFXDemo;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class MyTriangle extends MyShape {

    public MyTriangle(String name, double x, double y) {
        super(name, x, y);
    }

    @Override
    public void draw(Pane pane) {
        Polygon t = new Polygon();
        t.getPoints().addAll(
                x, y,
                x + 40, y + 60,
                x - 40, y + 60
        );
        t.setFill(Color.TOMATO);
        pane.getChildren().add(t);
    }

    @Override
    public void highlight(Pane pane) {
        Polygon b = new Polygon();
        b.getPoints().addAll(
                x, y - 5,
                x + 45, y + 65,
                x - 45, y + 65
        );
        b.setFill(null);
        b.setStroke(Color.GOLD);
        b.setStrokeWidth(3);
        pane.getChildren().add(b);
    }
}
