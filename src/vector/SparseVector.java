package vector;

import drawer.IDrawer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseVector implements IVector {
    private Map<Integer, Integer> elements;
    private int dimension;

    public SparseVector(int dimension) {
        this.dimension = dimension;
        this.elements = new HashMap<>();
    }

    @Override
    public int getEl(int pos) {
        if (this.elements.get(pos) == null) {
            return -1;
        } else return this.elements.get(pos);
    }

    @Override
    public void addEl(int pos, int num) {
        this.elements.put(pos, num);
    }

    @Override
    public void setEl(int pos, int num) {
        elements.replace(pos, num);
    }

    @Override
    public int zeroCount() {
        return this.dimension - elements.size();
    }

    @Override
    public List<Integer> getAll() {
        List<Integer> nElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : this.elements.entrySet()) {
            Integer value = entry.getValue();
            nElements.add(value);
        }
        return nElements;
    }

    @Override
    public int getDimension() {
        return dimension;
    }

    @Override
    public String demonstrate(IDrawer drawer, boolean isBorder) {
        StringBuilder vectStr = new StringBuilder();
        List<Integer> elList = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            if (elements.get(i) != null) {
                elList.add(elements.get(i));
            } else elList.add(null);
        }
        vectStr.append(drawer.drawMatrixLine(elList, isBorder));
        return vectStr.toString();
    }

    @Override
    public String toString() {
        return "SparseVector{" +
                "elements=" + elements.toString() +
                ", dimension=" + dimension +
                '}';
    }
}
