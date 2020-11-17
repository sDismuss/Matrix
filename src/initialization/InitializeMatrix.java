package initialization;

import matrix.IMatrix;
import matrix.NormalMatrix;
import matrix.SparseMatrix;
import vector.IVector;
import vector.NormalVector;
import vector.SparseVector;

import java.util.ArrayList;
import java.util.List;

public class InitializeMatrix {
    public static void Initialize(IMatrix matrix, int countNotZero, int maxCount) {
        if (countNotZero > matrix.getColumnCount() * matrix.getRowCount()) {
            System.out.println("The count of 'Not Zero' elements more the matrix size");
        }
        if (matrix instanceof NormalMatrix) {
            createNormalMatrix(matrix, countNotZero, maxCount);
        } else if (matrix instanceof SparseMatrix) {
            createSparseMatrix(matrix, countNotZero, maxCount);
        } else System.out.println("There is a problem in Initialize Class");
    }

    private static void createNormalMatrix(IMatrix matrix, int notZeroCount, int maxCount) {
        int rowCount = matrix.getRowCount();
        int columnCount = matrix.getColumnCount();
        if (notZeroCount <= rowCount*columnCount && notZeroCount >= 0) {
            List<IVector> vectors = new ArrayList<>();
            for (int i = 0; i < rowCount; i++) {
                NormalVector nVector = new NormalVector(columnCount);
                vectors.add(nVector);
            }
            int count = 0;
            while (count < notZeroCount) {
                int x = randomInt(rowCount, true);
                int y = randomInt(columnCount, true);
                if (vectors.get(x).getEl(y) == 0) {
                    int num = randomInt(maxCount, false);
                    vectors.get(x).setEl(y, num);
                    count++;
                }
            }
            matrix.addAll(vectors);
        }
        else if (notZeroCount < 0) {
            throw new IllegalArgumentException("notZeroCount must be not negative" +
                    " || current value: " + notZeroCount);
        }
        else  {
            throw new IllegalArgumentException("notZeroCount must be less than total amount numbers of matrix " +
                    " || current value: " + notZeroCount +
                    "; total amount: " + rowCount*columnCount);
        }
    }


    private static void createSparseMatrix(IMatrix matrix, int notZeroCount, int maxCount) {
        int rowCount = matrix.getRowCount();
        int columnCount = matrix.getColumnCount();
        if (notZeroCount <= rowCount*columnCount && notZeroCount >= 0) {
            List<IVector> vectors = new ArrayList<>();
            for (int i = 0; i < rowCount; i++) {
                SparseVector sVector = new SparseVector(columnCount);
                vectors.add(sVector);
            }
            int count = 0;
            while (count < notZeroCount) {
                int x = randomInt(rowCount, true);
                int y = randomInt(columnCount, true);
                if (vectors.get(x).getEl(y) == -1) {
                    int num = randomInt(maxCount, false);
                    vectors.get(x).addEl(y, num);
                    count++;
                }
            }
            matrix.addAll(vectors);
        }
        else if (notZeroCount < 0) {
            throw new IllegalArgumentException("notZeroCount must be not negative" +
                    " || current value: " + notZeroCount);
        }
        else  {
            throw new IllegalArgumentException("notZeroCount must be less than total amount numbers of matrix " +
                    " || current value: " + notZeroCount +
                    "; total amount: " + rowCount*columnCount);
        }
    }


    private static int randomInt(int maxCount, boolean typeInt) {
        int num = 0;
        do {
            num = (int) (Math.random() * maxCount);
            if (typeInt) {
                return num;
            }
        } while (num == 0);
        return num;
    }
}

