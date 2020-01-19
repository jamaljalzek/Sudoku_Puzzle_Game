package gui.mainMenu.subComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.ProgramWindow;
import gui.gameScreen.GameScreen;

public class BottomButtonsPanel extends JPanel
{
	private JButton startPuzzleButton, quitProgramButton;
	
	
	public BottomButtonsPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(Box.createHorizontalGlue());
		addStartButton();
		this.add(Box.createHorizontalGlue());
		addQuitButton();
		this.add(Box.createHorizontalGlue());
	}
	
	
	private void addStartButton()
	{
		startPuzzleButton = new JButton("Start!");
		startPuzzleButton.addActionListener(new ButtonListener());
		this.add(startPuzzleButton);
	}
	
	
	private void addQuitButton()
	{
		quitProgramButton = new JButton("Quit");
		quitProgramButton.addActionListener(new ButtonListener());
		this.add(quitProgramButton);
	}
	
	
	private class ButtonListener implements ActionListener
	{
		private JButton buttonClicked;
		
		
		@Override
		public void actionPerformed(ActionEvent event)
		{
			buttonClicked = (JButton) event.getSource();
			executeButtonClicked();
		}
		
		
		private void executeButtonClicked()
		{
			if (buttonClicked == startPuzzleButton)
			{
				ProgramWindow.loadNewScreen(new GameScreen());
			}
			else // buttonClicked == quitProgramButton
			{
				System.exit(0);
			}
		}
		
	} // End of nested class.
	
} // End of class.
