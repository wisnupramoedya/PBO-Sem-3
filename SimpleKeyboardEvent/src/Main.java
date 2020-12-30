import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new JFrame("Simple Keyboard Event");
				frame.setContentPane(new KeyboardPanel(640, 480));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);				
			}
		});
	}

}
