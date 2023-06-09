package sudoku;

public class Main {
    public static void main(String[] args) {


        int[][] data = {
                {0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 6, 0, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 0},
                {4, 0, 0, 8, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 2, 0, 0, 0, 0},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 0, 0, 0, 7, 0},
        };


        SudokuTable sudokuTable = new SudokuTable();
        sudokuTable.generate();

        System.out.println("==========");
        System.out.println(sudokuTable);

    }
}
