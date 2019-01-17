package strings_and_dialogs;
import javax.swing.JOptionPane;
public class EverythingisAwesome {
 public static void main(String[] args) {
		String Data = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, Data + " is Awesome!");
		System.out.println(Data);
 }
}
