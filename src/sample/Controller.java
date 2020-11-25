package sample;

import drawer.DrawerConsole;
import drawer.DrawerPane;
import initialization.InitializeMatrix;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import matrix.IMatrix;
import matrix.NormalMatrix;
import matrix.SparseMatrix;

public class Controller {

    @FXML
    private TextArea console;

    @FXML
    private Button bNormMatrix;

    @FXML
    private Button bSparMatrix;

    @FXML
    private CheckBox isBorder;

    @FXML
    private Pane scene;

    @FXML
    private void bNMClicked() {
        IMatrix nMatrix = new NormalMatrix(6, 6);
        InitializeMatrix.Initialize(nMatrix, 12, 100);
        boolean bIsBorder = isBorder.isSelected();

        DrawerConsole drawerConsole = new DrawerConsole();
        DrawerPane drawerPane = new DrawerPane(scene);

        nMatrix.demonstrate(drawerConsole, bIsBorder);
        nMatrix.demonstrate(drawerPane, bIsBorder);
    }

    @FXML
    private void bSMClicked() {
        IMatrix sMatrix = new SparseMatrix(6, 6);
        InitializeMatrix.Initialize(sMatrix, 12, 100);
        boolean bIsBorder = isBorder.isSelected();

        DrawerConsole drawerConsole = new DrawerConsole();
        DrawerPane drawerPane = new DrawerPane(scene);

        sMatrix.demonstrate(drawerConsole, bIsBorder);
        sMatrix.demonstrate(drawerPane, bIsBorder);
    }
}
