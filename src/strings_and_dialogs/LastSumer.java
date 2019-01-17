package strings_and_dialogs;
import javax.swing.JOptionPane;
public class LastSumer {
	public static void main(String[] args) {
		String Data = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you played Fortnite last summer, "
				+ Data + ". Muhahaha!");
	}
}
