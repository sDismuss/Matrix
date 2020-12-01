package matrix;

import vector.IVector;
import vector.NormalVector;

public class NormalMatrix extends AMatrix {

    public NormalMatrix(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    @Override
    protected IVector createVector(int columnCount) {
        return new NormalVector(columnCount);
    }
}
