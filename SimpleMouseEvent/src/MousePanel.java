import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MousePanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	private int areaWidth;
	private int areaHeight;
	private String text;
	private String textPosition;
	
	public MousePanel(int width, int height) {
		this.areaWidth = width;
		this.areaHeight = height;
		
		this.setPreferredSize(new Dimension(areaWidth, areaHeight));
		this.text = "Lakukan sesuatu dengan mouse!";
		this.textPosition = "Position X=Uknown Y=Uknown Uknown";
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(this.text, 0, this.areaHeight / 2);
		g.drawString(this.textPosition, 0, 10);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.text = "Tombol mouse diklik pada posisi X: " + e.getX() + " Y: " + e.getY();
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		this.text = "Tombol mouse ditekan pada posisi X: " + e.getX() + " Y: " + e.getY();
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.text = "Tombol mouse dilepas pada posisi X: " + e.getX() + " Y: " + e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.text = "Mouse memasuki area MousePanel";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.text = "Mouse meninggalkan area MousePanel";
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.textPosition = "Position X=" + e.getX() + " Y=" + e.getY() + " Dragged";
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.textPosition = "Position X=" + e.getX() + " Y=" + e.getY() + " Moved";
		repaint();
	}
}
