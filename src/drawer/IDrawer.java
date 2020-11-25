package drawer;

import java.util.List;

public interface IDrawer {
    void drawHLineBorder(int countCol);
    void drawMatrixLine(List<Integer> elements, boolean isBorder);
    void clear();
}
