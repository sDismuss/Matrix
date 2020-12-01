package vector;

import drawer.IDrawer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseVector extends AVector {
    private Map<Integer, Integer> elements;

    public SparseVector(int dimension) {
        super(dimension);
        this.elements = new HashMap<>();
    }

    @Override
    public int getEl(int pos) {
        int el = -1;
        if (this.elements.get(pos) != null) {
            el = this.elements.get(pos);
        }
        return el;
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
        return super.getDimension() - elements.size();
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
    public void demonstrate(IDrawer drawer, boolean isBorder) {
        List<Integer> elList = new ArrayList<>();
        for (int i = 0; i < super.getDimension(); i++) {
            if (elements.get(i) != null) {
                elList.add(elements.get(i));
            } else elList.add(null);
        }
        drawer.drawMatrixLine(elList, isBorder);
    }

    @Override
    public String toString() {
        return "SparseVector{" +
                "elements=" + this.getAll().toString() +
                ", dimension=" + super.getDimension() +
                '}';
    }
}
