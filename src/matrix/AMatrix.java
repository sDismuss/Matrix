package matrix;

import drawer.IDrawer;
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
        List<IVector> iVectors = new ArrayList<>();
        for (IVector vector : vectors) {
            iVectors.add(vector);
        }
        return iVectors;
    }

    public void addAll(List<IVector> vectors) {
        this.vectors = new ArrayList<>();
        this.setRow(vectors.size());
        this.setColumn(vectors.get(0).getDimension());
        for (IVector vector : vectors) {
            this.vectors.add(vector);
        }
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
                "vectors=" + vectors +
                '}';
    }

    @Override
    public String demonstrate(IDrawer drawer, boolean isBorder) {     //boolean isBorder) {
        StringBuilder matrStr = new StringBuilder();
        if (isBorder) {
            String bordStr = drawer.drawHLineBorder(column);
            matrStr.append(bordStr);
            for (IVector vect : vectors) {
                matrStr.append(vect.demonstrate(drawer, isBorder));
                matrStr.append(bordStr);
            }
        } else {
            for (IVector vect : vectors) {
                matrStr.append(vect.demonstrate(drawer, isBorder));
            }
        }
        return matrStr.toString();
    }

    protected abstract IVector createVector(int columnCount);
}
