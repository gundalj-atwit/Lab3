package JavaFXDemo;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyRectangle extends MyShape {

    public MyRectangle(String name, double x, double y) {
        super(name, x, y);
    }

    @Override
    public void draw(Pane pane) {
        Rectangle r = new Rectangle(x, y, 60, 40);
        r.setFill(Color.FORESTGREEN);
        pane.getChildren().add(r);
    }

    @Override
    public void highlight(Pane pane) {
        Rectangle b = new Rectangle(x - 3, y - 3, 66, 46);
        b.setFill(null);
        b.setStroke(Color.GOLD);
        b.setStrokeWidth(3);
        pane.getChildren().add(b);
    }
}
