import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class KeyboardPanel extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;	
	private List<Key> keys;
	
	public KeyboardPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		
		this.keys = new ArrayList<Key>();
		
		this.keys.add(new Key(10, 10, 'a'));
		this.keys.add(new Key(120, 10, 'w'));
		this.keys.add(new Key(230, 10, 's'));
		this.keys.add(new Key(340, 10, 'd'));
		this.keys.add(new Key(10, 120, 'z'));
		this.keys.add(new Key(120, 120, 'x'));
		this.keys.add(new Key(230, 120, 'c'));
		this.keys.add(new Key(340, 120, 'v'));
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// render all keys
		for (Key key : keys) {
			key.render(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();
		
		for (Key k : keys) {
			if(k.isSymbolMatch(key)) {
				k.setPressed();
				repaint();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char key = e.getKeyChar();
		
		for (Key k : keys) {
			if(k.isSymbolMatch(key)) {
				k.setReleased();
				repaint();
			}
		}
	}
	
	
}
