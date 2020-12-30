import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Random;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
	private static final long serialVersionUID = 2L;
	private static final int REFRESH_RATE = 30;
	private Ball ball;
	private BallArea ballArea;
	private int areaWidth;
	private int areaHeight;
	
	public BallPanel(int width, int height) {
		this.areaWidth = width;
		this.areaHeight = height;
		this.setPreferredSize(new Dimension(areaWidth, areaHeight));
		
		Random random = new Random();
		int radius = 50;
		int X = random.nextInt(width - 2*radius - 20) + radius + 10;
		int Y = random.nextInt(height - 2*radius - 20) + radius + 10;
		int speed = 5;
		int angleInDegree = random.nextInt(360);
		
		ball = new Ball(X, Y, radius, speed, angleInDegree, Color.BLACK);
		ballArea = new BallArea(0, 0, width, height, Color.WHITE, Color.BLACK);
		
		// untuk mendapatkan area latar belakang
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Component c = (Component) e.getSource();
				Dimension dimension = c.getSize();
				
				areaWidth = dimension.width;
				areaHeight = dimension.height;
				ballArea.set(0, 0, width, height);
			}
		});
		
		startThread();
	}
	
	public void startThread() {
		Thread gameThread = new Thread() {
			public void run() {
				while(true) {
					ball.collide(ballArea);
					repaint();
					
					try {
						Thread.sleep(1000 / REFRESH_RATE);
					} catch (InterruptedException e) { }
				}
			}
		};
		
		gameThread.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ballArea.draw(g);
		ball.draw(g);
	}
}
