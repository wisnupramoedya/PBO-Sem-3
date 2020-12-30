import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class BallPanel extends JPanel implements MouseListener {
	private static final long serialVersionUID = 2L;
	private static final int REFRESH_RATE = 30;
	private List<Ball> balls = new ArrayList<Ball>();
	private BallArea ballArea;
	private int areaWidth;
	private int areaHeight;
	private String text;
	
	public BallPanel(int width, int height) {
		this.areaWidth = width;
		this.areaHeight = height;
		this.setPreferredSize(new Dimension(areaWidth, areaHeight));
		this.text = "Terdapat " + balls.size() + " bola";
		
		ballArea = new BallArea(0, 0, width, height, Color.DARK_GRAY, Color.BLACK);
		
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
		
		this.addMouseListener(this);
		this.setFocusable(true);
		
		startThread();
	}
	
	public Ball createBall(int X, int Y) {
		Random random = new Random();
		int radius = 50;
		int speed = 5 + random.nextInt(10);
		int angleInDegree = random.nextInt(360);
		
		return new Ball(X, Y, radius, speed, angleInDegree, Color.WHITE);
	}
	
	public void startThread() {
		Thread gameThread = new Thread() {
			public void run() {
				while(true) {
					for (Ball ball : balls) {
						ball.collide(ballArea);
					}
					
					for (Ball ball : balls) {
						for (Ball otherBall : balls) {
							if(ball != otherBall)
								ball.collide(otherBall);
						}
					}
					
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
		for (Ball ball : balls) {
			ball.draw(g);
		}
		g.drawString(text, 0, 10);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		balls.add(createBall(e.getX(), e.getY()));
		this.text = "Terdapat " + balls.size() + " bola";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
