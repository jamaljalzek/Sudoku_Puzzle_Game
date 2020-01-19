package gui.gameScreen.displayBottomPanel.subComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import programLogic.CheckUserCompletedPuzzle;
import programLogic.ExtractUserCompletedPuzzle;

public class DisplayButtonsPanel extends JPanel
{
	private JButton submitPuzzleButton, quitPuzzleButton;
	
	
	public DisplayButtonsPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		addSubmitButtonToThisPanel();
		addQuitButtonToThisPanel();
	}
	
	
	private void addSubmitButtonToThisPanel()
	{
		submitPuzzleButton = new JButton();
		submitPuzzleButton.setText("Submit");
		submitPuzzleButton.addActionListener(new ButtonListener());
		this.add(submitPuzzleButton);
		submitPuzzleButton.setAlignmentX(CENTER_ALIGNMENT); // Move the button to the center of the screen.
	}
	
	
	private void addQuitButtonToThisPanel()
	{
		quitPuzzleButton = new JButton();
		quitPuzzleButton.setText("Quit");
		quitPuzzleButton.addActionListener(new ButtonListener());
		this.add(quitPuzzleButton);
		quitPuzzleButton.setAlignmentX(CENTER_ALIGNMENT); // Move the button to the center of the screen.
	}
	
	
	private class ButtonListener implements ActionListener
	{
		private JButton buttonClicked;
		
		
		@Override
		public void actionPerformed(ActionEvent actionEvent)
		{
			buttonClicked = (JButton) actionEvent.getSource();
			executeOperationOfButtonClicked();
		}


		private void executeOperationOfButtonClicked()
		{
			if (buttonClicked == submitPuzzleButton)
			{
				char [] [] userCompletedPuzzle = ExtractUserCompletedPuzzle.returnUserCompletedPuzzle();
				boolean isUserCompletedPuzzleCorrect = CheckUserCompletedPuzzle.checkIfUserCompletedPuzzleMatchesSolutionPuzzle(userCompletedPuzzle);
				DisplayGameMessageLabel.displayNewGameMessage(isUserCompletedPuzzleCorrect);
			}
			else // buttonClicked == quitPuzzleButton
			{
				System.exit(0);
			}
		}
		
	} // End of nested class.
	
} // End of class.
