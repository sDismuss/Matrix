package vector;

import drawer.IDrawer;

import java.util.ArrayList;
import java.util.List;

public class NormalVector extends AVector {
    private List<Integer> elements;

    public NormalVector(int dimension) {
        super(dimension);
        this.elements = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            elements.add(0);
        }
    }

    @Override
    public int getEl(int pos) {
        return this.elements.get(pos);
    }

    @Override
    public void addEl(int pos, int num) {
        this.elements.add(pos, num);
    }

    @Override
    public List<Integer> getAll() {
        return new ArrayList<>(elements);
    }

    @Override
    public void setEl(int x, int num) {
        this.elements.set(x, num);
    }

    @Override
    public int zeroCount() {
        int count = 0;
        for (Integer num : this.elements) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void demonstrate(IDrawer drawer, boolean isBorder) {
        List<Integer> vectEl = new ArrayList<>(elements);
        drawer.drawMatrixLine(vectEl, isBorder);
    }

    @Override
    public String toString() {
        return "NormalVector{" +
                "elements=" + this.getAll().toString() +
                ", dimension=" + super.getDimension() +
                '}';
    }
}
