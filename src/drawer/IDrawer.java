package drawer;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.List;
import java.util.Observable;

public interface IDrawer {
    void drawHLineBorder(int countCol);

    void drawMatrixLine(List<Integer> elements, boolean isBorder);

    void clear();

    ObservableList<Node> drawAll();
}
