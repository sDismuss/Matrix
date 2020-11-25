package matrix;

import drawer.IDrawer;
import vector.IVector;

import java.util.List;

public interface IMatrix {
    List<IVector> getAll();
    void addAll(List<IVector> vectors);
    int getRowCount();
    int getColumnCount();
    void demonstrate(IDrawer drawer, boolean isBorder);
}
