package drawer;

import javafx.collections.ObservableList;
import javafx.scene.Node;

import java.util.List;

public class DrawerConsole extends ADrawer {
    @Override
    public void drawMatrixLine(List<Integer> elements, boolean isBorder) {
        StringBuilder line = new StringBuilder();
        if (isBorder) {
            line.append('|');
            for (Integer el : elements) {
                if (el == null) {
                    line.append(String.format("%5s", ' '));
                } else line.append(String.format("%5s", el));
                line.append("|");
            }
        } else {
            for (Integer el : elements) {
                if (el == null) {
                    line.append(String.format("%5s", ' '));
                } else line.append(String.format("%5s", el));
            }
        }
        line.append('\n');
        System.out.println(line.toString());
    }

    @Override
    public void clear() {

    }

    @Override
    public ObservableList<Node> drawAll() {
        return null;
    }

    @Override
    public void drawHLineBorder(int countCol, boolean isBorder) {
        if (isBorder) {
            StringBuilder border = new StringBuilder();
            border.append(" ");
            for (int i = 0; i < countCol; i++) {
                if (i != countCol - 1)
                    border.append("------");
                else border.append("-----\n");
            }
            System.out.println(border.toString());
        }
    }
}
