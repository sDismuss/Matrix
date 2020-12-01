package vector;

public abstract class AVector implements IVector{
    private int dimension;

    public AVector(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public int getDimension() {
        int cDimension = dimension;
        return cDimension;
    }
}
