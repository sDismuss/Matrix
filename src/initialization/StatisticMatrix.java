package initialization;

import matrix.IMatrix;
import vector.IVector;

public class StatisticMatrix {
    private int sumEl;
    private int average;
    private int max;
    private int notZeroCount;

    public StatisticMatrix(IMatrix matrix) {
        int rowCount = matrix.getRowCount();
        int columnCount = matrix.getColumnCount();
        max = 0;
        sumEl = 0;
        notZeroCount = 0;
        for (IVector vector : matrix.getAll()) {
            for (Integer num : vector.getAll()) {
                sumEl = sumEl + num;
                if (num > max) {
                    max = num;
                }
            }
            notZeroCount = notZeroCount + columnCount - vector.zeroCount();
        }
        average = sumEl / (rowCount * columnCount);
    }

    public int getSumEl() {
        return sumEl;
    }

    public int getAverage() {
        return average;
    }

    public int getMax() {
        return max;
    }

    public int getNotZeroCount() {
        return notZeroCount;
    }

    @Override
    public String toString() {
        return "initialization.StatisticMatrix{" +
                "Sum = " + sumEl +
                ", Average = " + average +
                ", Max Number= " + max +
                ", Not Zero Count = " + notZeroCount +
                '}';
    }
}
