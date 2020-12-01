package matrix;

import drawer.IDrawer;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import vector.IVector;

import java.util.ArrayList;
import java.util.List;

public abstract class AMatrix implements IMatrix {
    private List<IVector> vectors;
    private int row;
    private int column;

    public AMatrix(int rowCount, int columnCount) {
        List<IVector> vectors = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            IVector sVector = createVector(columnCount);
            vectors.add(sVector);
        }
        addAll(vectors);
    }

    public List<IVector> getAll() {
        return new ArrayList<>(vectors);
    }

    public void addAll(List<IVector> vectors) {
        this.vectors = new ArrayList<>();
        this.setRow(vectors.size());
        this.setColumn(vectors.get(0).getDimension());
        this.vectors.addAll(vectors);
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRowCount() {
        return row;
    }

    public int getColumnCount() {
        return column;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "vectors=" + this.getAll() +
                '}';
    }

    @Override
    public ObservableList<Node> demonstrate(IDrawer drawer, boolean isBorder) {
        drawer.clear();
        drawer.drawHLineBorder(this.getColumnCount(), isBorder);
        for (IVector vect : vectors) {
            vect.demonstrate(drawer, isBorder);
            drawer.drawHLineBorder(this.getColumnCount(), isBorder);
        }
        return drawer.drawAll();
    }

    protected abstract IVector createVector(int columnCount);
}
