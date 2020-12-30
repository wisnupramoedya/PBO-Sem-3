import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BouncingBallSimple extends JPanel {
	private static final long serialVersionUID = 1L;
	
	// atribut area
	private static final int AREA_WIDTH = 640;
	private static final int AREA_HEIGHT = 480;
	
	// atribut posisi awal
	private static final int BALL_X_INIT_POSITION = 30;
	private static final int BALL_Y_INIT_POSITION = 20;
	
	// atribut radius
	private double ballRadius = 50;
	
	// titik tengah bola
	private double ballX = ballRadius + BALL_X_INIT_POSITION;
	private double ballY = ballRadius + BALL_Y_INIT_POSITION;
	
	// kecepatan
	private float ballSpeedX = 10;
	private float ballSpeedY = 6;
	
	// framerate
	private static final int FRAME_RATE = 30;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// background
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
		
		// bola
		g.setColor(Color.YELLOW);
		g.fillOval((int) (ballX - ballRadius), (int) (ballY - ballRadius), (int) (2 * ballRadius), (int) (2 * ballRadius));
	}
	
	public BouncingBallSimple() {
		this.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));
		
		// thread untuk posisi bola dan deteksi tepi
		Thread gameThread = new Thread() {
			public void run() {
				while(true) {
					// update posisi bola
					ballX += ballSpeedX;
					ballY += ballSpeedY;
					
					// jika hit tepi X				
					if(ballX - ballRadius < 0) {
						ballSpeedX = -ballSpeedX;
						ballX = ballRadius;
					}
					else if(ballX + ballRadius > AREA_WIDTH) {
						ballSpeedX = -ballSpeedX;
						ballX = AREA_WIDTH - ballRadius;
					}
					
					// jika hit tepi Y
					if(ballY - ballRadius < 0) {
						ballSpeedY = -ballSpeedY;
						ballY = ballRadius;
					}
					else if(ballY + ballRadius > AREA_HEIGHT) {
						ballSpeedY = -ballSpeedY;
						ballY = AREA_HEIGHT - ballRadius;
					}
					
					// refresh layar
					repaint();
					
					// delay
					try {
						// bergerak dalam 30 frame per 1000 ms
						Thread.sleep(1000/FRAME_RATE);
					} catch (InterruptedException e) {}
				}
			}
		};
		gameThread.start();
	}
	

	public static void main(String[] args) {
		// menjalankan UI di Event Dispatcher Thread
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Simple Bouncing Ball");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new BouncingBallSimple());
				frame.pack();
				frame.setVisible(true);
			}
		});

	}

} 