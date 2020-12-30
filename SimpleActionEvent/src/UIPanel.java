import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UIPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	public UIPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		
		// buat button
		JButton button = new JButton("Click Me");
		this.add(button);
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Anda telah mengaktifkan action event");
	}
	
	
}
