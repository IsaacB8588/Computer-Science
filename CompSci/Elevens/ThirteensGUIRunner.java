
/**
 * Write a description of class ThirteensGUIRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirteensGUIRunner
{
    /**
	 * Plays the GUI version of Thirteens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
