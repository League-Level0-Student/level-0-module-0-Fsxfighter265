package strings_and_dialogs;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Whats your name?");
		System.out.println(name);
	}
}
