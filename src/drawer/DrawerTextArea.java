package drawer;

public class DrawerTextArea extends ADrawer {
    @Override
    public String drawHLineBorder(int countCol) {
        StringBuilder border = new StringBuilder();
        border.append(" ");
        for (int i = 0; i < countCol; i++) {
            if (i != countCol - 1)
                border.append("-----");
            else border.append("----\n");
        }
        return border.toString();
    }

}
