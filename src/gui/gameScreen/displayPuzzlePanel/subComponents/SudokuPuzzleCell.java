package gui.gameScreen.displayPuzzlePanel.subComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import gui.gameScreen.displayBottomPanel.subComponents.DisplayNumberOfUserMovesMadeLabel;
import gui.gameScreen.displayPuzzlePanel.DisplayPuzzlePanel;

public class SudokuPuzzleCell extends JTextField
{
	private char symbolAtCurrentPuzzleSpot;
	
	
	public SudokuPuzzleCell(char symbolAtCurrentPuzzleSpot)
	{
		this.symbolAtCurrentPuzzleSpot = symbolAtCurrentPuzzleSpot;
		designThisCellForTheCurrentSudokuPuzzleSpot();
	}
	
	
	private void designThisCellForTheCurrentSudokuPuzzleSpot()
	{
		setAndAlignText();
		if (symbolAtCurrentPuzzleSpot == 0)	// Check if the current spot is the NULL char (empty).
		{
			this.getDocument().addDocumentListener(new TextFieldListener());
			styleThisCellForAnEmptySpot();
		}
		else
		{
			styleTextFieldForAPreFilledSpot();
		}
	}
	
	
	private void setAndAlignText()
	{
		this.setText("" + symbolAtCurrentPuzzleSpot);
		this.setHorizontalAlignment(JTextField.CENTER);
	}
	
	
	private void styleThisCellForAnEmptySpot()
	{
		setTextFont(Font.BOLD);
		this.setForeground(Color.BLUE);
	}
	
	
	private void styleTextFieldForAPreFilledSpot()
	{
		setTextFont(Font.PLAIN);
		this.setEnabled(false);
		this.setDisabledTextColor(Color.BLACK);
	}
	
	
	private void setTextFont(int fontStyle)
	{
		Font textFont = new Font(Font.DIALOG, fontStyle, 24);
		this.setFont(textFont);
	}
	
	
	private class TextFieldListener implements DocumentListener
	{
		@Override
		public void insertUpdate(DocumentEvent event)
		{
			DisplayNumberOfUserMovesMadeLabel.incrementNumberOfMovesMadeDisplay();
			DisplayPuzzlePanel.repaintPuzzleDividerLines();
		}

		
		@Override
		public void removeUpdate(DocumentEvent event)
		{
			DisplayNumberOfUserMovesMadeLabel.incrementNumberOfMovesMadeDisplay();
			DisplayPuzzlePanel.repaintPuzzleDividerLines();
		}

		
		@Override
		public void changedUpdate(DocumentEvent event)
		{
			// Left unimplemented as this is never used.
		}
		
	} // End of nested class.
	
} // End of class.
