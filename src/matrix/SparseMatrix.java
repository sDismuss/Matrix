package matrix;

import vector.IVector;
import vector.SparseVector;

public class SparseMatrix extends AMatrix {

    public SparseMatrix(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    @Override
    protected IVector createVector(int columnCount) {
        return new SparseVector(columnCount);
    }

}
