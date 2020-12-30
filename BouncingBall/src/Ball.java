import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	// atribut bola
	float X, Y;
	float speedX, speedY;
	float radius;
	private Color color;
	
	public Ball(float X, float Y, float radius, float speed, float angleInDegree, Color color) {
		this.X = X;
		this.Y = Y;
		this.speedX = (float) (speed * Math.cos(Math.toRadians(angleInDegree)));
		this.speedY = (float) (speed * Math.sin(Math.toRadians(angleInDegree)));
		
		this.radius = radius;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int) (X - radius), (int) (Y - radius), (int) (2*radius) , (int) (2*radius));
	}
	
	public void collide(BallArea area) {
		float ballMinX = area.minX + radius;
		float ballMinY = area.minY + radius;
		float ballMaxX = area.maxX - radius;
		float ballMaxY = area.maxY - radius;
		
		X += speedX;
		Y += speedY;
		
		if(X < ballMinX) {
			speedX = -speedX;
			X = ballMinX;
		}
		else if(X > ballMaxX) {
			speedX = -speedX;
			X = ballMaxX;
		}
		
		if(Y < ballMinY) {
			speedY = -speedY;
			Y = ballMinY;
		}
		else if(Y > ballMaxY) {
			speedY = -speedY;
			Y = ballMaxY;
		}
	}
	
}
