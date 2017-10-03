package list_view;

import javax.swing.JOptionPane;
/**
 * Simple Gui class using JOptionPane.
 * @author rsha7868
 *@version 1.0 03.10.2017
 */
public class Display
{
	/**
	 * Display a popup showing the supplied string to the user.
	 * @param textDisplay The text o be displayed.
	 */
	
	public void dsiplayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	/**
	 * Uses a popup to display a question to the user and returns their response as a String.
	 * @param fromQuestion The question being asked.
	 * @return The users response to the question
	 */
	public String gettResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += javax.swing.JOptionPane.showInputDialog(null, fromQuestion);
		return answer;
	}
}
