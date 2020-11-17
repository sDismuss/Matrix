package sample;

import drawer.DrawerConsole;
import drawer.DrawerTextArea;
import initialization.InitializeMatrix;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
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
    private void bNMClicked() {
        IMatrix nMatrix = new NormalMatrix(5, 5);
        InitializeMatrix.Initialize(nMatrix, 9, 100);
        boolean bIsBorder = isBorder.isSelected();
        System.out.println(nMatrix.demonstrate(new DrawerConsole(), bIsBorder));
        console.setText(nMatrix.demonstrate(new DrawerTextArea(), bIsBorder));
    }

    @FXML
    private void bSMClicked() {
        IMatrix sMatrix = new SparseMatrix(5, 5);
        InitializeMatrix.Initialize(sMatrix, 9, 100);
        boolean bIsBorder = isBorder.isSelected();
        System.out.println(sMatrix.demonstrate(new DrawerConsole(), bIsBorder));
        console.setText(sMatrix.demonstrate(new DrawerTextArea(), bIsBorder));
    }
}
