import java.awt.Color;
import java.awt.Graphics;

public class BallArea {
	int minX, minY;
	int maxX, maxY;
	private Color colorFilled;
	private Color colorBorder;
	
	public BallArea(int X, int Y, int width, int height, Color colorFilled, Color colorBorder) {
		this.minX = X;
		this.minY = Y;
		this.maxX = X + width - 1;
		this.maxY = Y + height - 1;
		
		this.colorFilled = colorFilled;
		this.colorBorder = colorBorder;
	}
	
	public void set(int X, int Y, int width, int height) {
		this.minX = X;
		this.minY = Y;
		this.maxX = X + width - 1;
		this.maxY = Y + height - 1;
	}
	
	public void draw(Graphics g) {
		g.setColor(colorFilled);
		g.fillRect(minX, minY, maxX - minX - 1, maxY - minY - 1);
		
		g.setColor(colorBorder);
		g.drawRect(minX, minY, maxX - minX - 1, maxY - minY - 1);
	}
	
}
