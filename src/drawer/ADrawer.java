package drawer;

import java.util.List;

public abstract class ADrawer implements IDrawer {

    @Override
    public String drawMatrixLine(List<Integer> elements, boolean isBorder) {
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
        return line.toString();
    }
}
