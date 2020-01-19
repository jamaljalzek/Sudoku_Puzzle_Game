package gui.gameScreen.displayBottomPanel.subComponents;

import javax.swing.JLabel;

public class DisplayNumberOfUserMovesMadeLabel extends JLabel
{
	private static DisplayNumberOfUserMovesMadeLabel displayNumberOfUserMovesMadeLabel;
	private static int numberOfUserMovesMade;
	
	
	public DisplayNumberOfUserMovesMadeLabel()
	{
		DisplayNumberOfUserMovesMadeLabel.displayNumberOfUserMovesMadeLabel = this;
		numberOfUserMovesMade = 0;
		this.setText("Number of moves made: 0");
	}
	
	
	public static void incrementNumberOfMovesMadeDisplay()
	{
		++numberOfUserMovesMade;
		displayNumberOfUserMovesMadeLabel.setText("Number of moves made: " + numberOfUserMovesMade);
		displayNumberOfUserMovesMadeLabel.repaint();
	}

} // End of class.
