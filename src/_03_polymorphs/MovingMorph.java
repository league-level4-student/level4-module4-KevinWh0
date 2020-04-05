package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	private int width = 50;
	private int height = 50;
	Random rand = new Random();
	MovingMorph(int x, int y) {
		super(x, y);
	}
	@Override
	public void draw(Graphics g) {
		
		this.setX(rand.nextInt(PolymorphWindow.WIDTH));
		this.setY(rand.nextInt(PolymorphWindow.HEIGHT));
		
		g.setColor(Color.blue);
		g.fillRect(this.getX(), this.getY(), width, height);
	}
	
	
}
