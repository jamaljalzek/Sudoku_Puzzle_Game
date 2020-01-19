package programLogic.generateSudokuPuzzle;

import java.util.Random;

import programLogic.CheckUserCompletedPuzzle;

public class GenerateRandomizedCompletedPuzzle
{
	private static char [] [] completedPuzzle;
	private static Random randomGenerator = new Random();
	
	
	public static char [] [] generateAndReturnRandomizedPuzzle()
	{
		completedPuzzle = GenerateCompletedSeedPuzzle.generateAndReturnSeedPuzzle();
		randomlyReorderPuzzleRowsAndColumns();
		CheckUserCompletedPuzzle.passInAndMakeACopyOfCompletedPuzzleToRecordAsSolutionPuzzle(completedPuzzle);
		return completedPuzzle;
	}
	
	
	private static void randomlyReorderPuzzleRowsAndColumns()
	{
		randomlyReorderTheThreeRowsStartingWithRow(0);
		randomlyReorderTheThreeRowsStartingWithRow(3);
		randomlyReorderTheThreeRowsStartingWithRow(6);
		randomlyReorderTheThreeColumnsStartingWithColumn(0);
		randomlyReorderTheThreeColumnsStartingWithColumn(3);
		randomlyReorderTheThreeColumnsStartingWithColumn(6);
	}
	
	
	private static void randomlyReorderTheThreeRowsStartingWithRow(int startingRow)
	{
		int endingRow = startingRow + 3;
		for (int row = startingRow; row < endingRow; ++row)
		{
			int randomlyPickedRow = randomGenerator.nextInt(3) + startingRow;
			swapRows(row, randomlyPickedRow);
		}
	}

	
	private static void randomlyReorderTheThreeColumnsStartingWithColumn(int startingColumn)
	{
		int endingColumn = startingColumn + 3;
		for (int column = startingColumn; column < endingColumn; ++column)
		{
			int randomlyPickedColumn = randomGenerator.nextInt(3) + startingColumn;
			swapColumns(column, randomlyPickedColumn);
		}
	}
	
	
	private static void swapRows(int firstRowIndex, int secondRowIndex)
	{
		char [] firstRow = completedPuzzle [firstRowIndex];
		completedPuzzle [firstRowIndex] = completedPuzzle [secondRowIndex];
		completedPuzzle [secondRowIndex] = firstRow;
	}
	
	
	private static void swapColumns(int firstColumnIndex, int secondColumnIndex)
	{
		char [] copyOfFirstColumn = createACopyOfColumn(firstColumnIndex);
		char [] copyOfSecondColumn = createACopyOfColumn(secondColumnIndex);
		overwriteColumn(firstColumnIndex, copyOfSecondColumn);
		overwriteColumn(secondColumnIndex, copyOfFirstColumn);
	}
	
	
	private static char [] createACopyOfColumn(int columnIndex)
	{
		char [] copyOfColumn = new char [9];
		for (int row = 0; row < 9; ++row)
		{
			copyOfColumn [row] = completedPuzzle [row] [columnIndex];
		}
		return copyOfColumn;
	}
	
	
	private static void overwriteColumn(int columnToBeOverwrittenIndex, char [] columnToOverwriteWith)
	{
		for (int row = 0; row < columnToOverwriteWith.length; ++row)
		{
			completedPuzzle [row] [columnToBeOverwrittenIndex] = columnToOverwriteWith [row];
		}
	}

} // End of class.
