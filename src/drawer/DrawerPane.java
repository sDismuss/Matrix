package drawer;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import java.util.List;

public class DrawerPane extends ADrawer {
    private Pane pane;

    private static final int WIDTHTA = 53;
    private static final int HEIGHTTA = 38;
    private double X;
    private double Y;

    public DrawerPane() {
        this.pane = new Pane();
        X = this.pane.getLayoutX();
        Y = this.pane.getLayoutY();
    }

    @Override
    public void clear() {
        this.pane.getChildren().clear();
        X = this.pane.getLayoutX();
        Y = this.pane.getLayoutY();
    }

    @Override
    public ObservableList<Node> drawAll() {
        return pane.getChildren();
    }

    @Override
    public void drawMatrixLine(List<Integer> elements, boolean isBorder) {
        if (isBorder) {
            Line leftLine = new Line(X, Y, X, Y + HEIGHTTA);
            pane.getChildren().add(leftLine);
        }
        double x = X;
        for (Integer el : elements) {
            TextArea textArea = new TextArea();
            textArea.setPrefRowCount(1);
            textArea.setPrefColumnCount(2);
            textArea.setLayoutX(x + 0.5);
            textArea.setLayoutY(Y + 0.5);
            if (el != null) {
                textArea.setText(el.toString());
            }
            x = x + WIDTHTA;
            if (isBorder) {
                Line rightLine = new Line(x, Y, x, Y + HEIGHTTA);
                pane.getChildren().addAll(rightLine, textArea);
            } else pane.getChildren().add(textArea);
        }
        this.Y = this.Y + HEIGHTTA;
    }

    @Override
    public void drawHLineBorder(int countCol, boolean isBorder) {
        if (isBorder) {
            int length = WIDTHTA * countCol;
            Line line = new Line(X, Y, X + length, Y);
            pane.getChildren().addAll(line);
        }
    }
}
