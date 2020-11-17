package drawer;

import java.util.List;

public interface IDrawer {
    String drawHLineBorder(int countCol);
    String drawMatrixLine(List<Integer> elements, boolean isBorder);
}
