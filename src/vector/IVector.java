package vector;

import drawer.IDrawer;

import java.util.List;

public interface IVector {
    int getEl(int pos);

    void addEl(int num, int pos);

    void setEl(int num, int pos);

    int zeroCount();

    List<Integer> getAll();

    int getDimension();

    String demonstrate(IDrawer drawer, boolean isBorder);
}
