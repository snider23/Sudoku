package sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuTable {
    public static final int SUDOKU_SIZE=9;
    public static final int EMPTY_VALUE=0;
    private static final Set<Integer> ALL_POSSIBLE_VALUES = Set.of(1,2,3,4,5,6,7,8,9);



    private int[][] data = new int[SUDOKU_SIZE][SUDOKU_SIZE];

    public Set<Integer> getPossibleValues(int row,int column){
       Set<Integer> possibleValues= getPossibleInRow(row);
       possibleValues.retainAll(getPossibleValuesInColumn(column));
        possibleValues.retainAll(getPossibleValuesInZone());
       return possibleValues;
    }

    private Set<Integer> getPossibleInRow(int row){
        Set<Integer> result = new HashSet<>(ALL_POSSIBLE_VALUES);
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            result.remove(data[row][i]);
        }
        return result;
    }

    private Set<Integer> getPossibleValuesInColumn(int column){
        Set<Integer> result = new HashSet<>(ALL_POSSIBLE_VALUES);
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            result.remove(data[i][column]);
        }
        
        
        return result;
    }

    private Set<Integer> getPossibleValuesInZone(int zone){
        Set<Integer> result = new HashSet<>(ALL_POSSIBLE_VALUES);

        int column= (zone%3)*3;
        int row=(zone%3)*3;

        for (int i = 0; i < SUDOKU_SIZE; i++) {
            for (int j = 0; j < SUDOKU_SIZE; j++) {
                result.remove(data[i][column]);
            }
        }



        return result;
    }

    private int convertRowAndColumnToZone(int row,int column){
    
    }
}
