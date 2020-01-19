package gui.gameScreen.displayBottomPanel.subComponents;

import java.awt.Color;

import javax.swing.JLabel;

public class DisplayGameMessageLabel extends JLabel
{
	private static DisplayGameMessageLabel displayGameMessageLabel;
	
	
	public DisplayGameMessageLabel()
	{
		DisplayGameMessageLabel.displayGameMessageLabel = this;
		this.setText("PUZZLE INCOMPLETE");
	}
	
	
	public static void displayNewGameMessage(boolean isUserCompletedPuzzleCorrect)
	{
		if (isUserCompletedPuzzleCorrect)
		{
			displayPuzzleCompletedMessage();
		}
		else // !isUserCompletedPuzzleCorrect
		{
			displayPuzzleIncorrectMessage();
		}
	}

	
	private static void displayPuzzleCompletedMessage()
	{
		DisplayGameMessageLabel.displayGameMessageLabel.setText("PUZZLE COMPLETED!");
		DisplayGameMessageLabel.displayGameMessageLabel.setForeground(Color.GREEN);
		DisplayGameMessageLabel.displayGameMessageLabel.repaint();
	}
	
	
	private static void displayPuzzleIncorrectMessage()
	{
		DisplayGameMessageLabel.displayGameMessageLabel.setText("PUZZLE INCORRECT!");
		DisplayGameMessageLabel.displayGameMessageLabel.setForeground(Color.RED);
		DisplayGameMessageLabel.displayGameMessageLabel.repaint();
	}
	
} // End of class.
