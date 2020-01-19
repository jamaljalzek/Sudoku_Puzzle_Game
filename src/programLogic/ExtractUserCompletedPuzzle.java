package programLogic;

import javax.swing.JTextField;

import gui.gameScreen.displayPuzzlePanel.DisplayPuzzlePanel;

public class ExtractUserCompletedPuzzle
{
	private static JTextField [] [] visiblePuzzleBoard;
	private static char [] [] userCompletedPuzzle = new char [9] [9];
	
	
	public static char [] [] returnUserCompletedPuzzle()
	{
		visiblePuzzleBoard = DisplayPuzzlePanel.returnVisiblePuzzleBoard();
		for (int currentRow = 0; currentRow < 9; ++currentRow)
		{
			for (int currentColumn = 0; currentColumn < 9; ++currentColumn)
			{
				extractEnteredTextFromTheCurrentTextField(currentRow, currentColumn);
			}
		}
		return userCompletedPuzzle;
	}
	
	
	private static void extractEnteredTextFromTheCurrentTextField(int currentRow, int currentColumn)
	{
		String textInCurrentTextField = visiblePuzzleBoard [currentRow] [currentColumn].getText();
		textInCurrentTextField = textInCurrentTextField.trim();
		if (textInCurrentTextField.length() == 0)
		{
			textInCurrentTextField = "$";
		}
		userCompletedPuzzle [currentRow] [currentColumn] = textInCurrentTextField.charAt(0);
	}

} // End of class.
