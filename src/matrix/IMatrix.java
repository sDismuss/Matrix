package matrix;

import drawer.IDrawer;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import vector.IVector;

import java.util.List;

public interface IMatrix {
    List<IVector> getAll();
    void addAll(List<IVector> vectors);
    int getRowCount();
    int getColumnCount();
    ObservableList<Node> demonstrate(IDrawer drawer, boolean isBorder);
}
