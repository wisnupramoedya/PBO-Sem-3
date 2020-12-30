import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new JFrame("Simple Mouse Event");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new MousePanel(640, 480));
				frame.pack();
				frame.setVisible(true);
			}
		});
	}

}
