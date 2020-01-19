package gui.mainMenu.subComponents;

import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopTextDisplayPanel extends JPanel
{
	public TopTextDisplayPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		addTitleDisplay();
		this.add(Box.createVerticalGlue());
		addInformationDisplay();
	}
	
	
	private void addTitleDisplay()
	{
		Font titleDisplayFont = new Font(Font.DIALOG, Font.ITALIC, 24);
		JLabel titleDisplay = new JLabel("Sudoku");
		titleDisplay.setFont(titleDisplayFont);
		this.add(titleDisplay);
		titleDisplay.setAlignmentX(CENTER_ALIGNMENT); // Move the label to the center of the screen.
	}
	
	
	private void addInformationDisplay()
	{
		JLabel informationDisplay = new JLabel("Program written by Jamal J. Alzek, January 2020");
		this.add(informationDisplay);
		informationDisplay.setAlignmentX(CENTER_ALIGNMENT); // Move the label to the center of the screen.
	}

} // End of class.
