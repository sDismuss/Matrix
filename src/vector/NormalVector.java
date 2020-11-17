package vector;

import drawer.IDrawer;

import java.util.ArrayList;
import java.util.List;

public class NormalVector implements IVector {
    private List<Integer> elements;
    private int dimension;

    public NormalVector(int dimension) {
        this.dimension = dimension;
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
        List<Integer> nElements = new ArrayList<>();
        for (Integer num : elements) {
            nElements.add(num);
        }
        return nElements;
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
    public int getDimension() {
        return dimension;
    }

    @Override
    public String demonstrate(IDrawer drawer, boolean isBorder) {
        StringBuilder vectStr = new StringBuilder();
        vectStr.append(drawer.drawMatrixLine(elements, isBorder));
        return vectStr.toString();
    }

    @Override
    public String toString() {
        return "NormalVector{" +
                "elements=" + elements.toString() +
                ", dimension=" + dimension +
                '}';
    }
}
