package drawer;

import javafx.collections.ObservableList;
import javafx.scene.Node;

import java.util.List;

public interface IDrawer {
    void drawHLineBorder(int countCol, boolean isBorder);

    void drawMatrixLine(List<Integer> elements, boolean isBorder);

    void clear();

    ObservableList<Node> drawAll();
}
