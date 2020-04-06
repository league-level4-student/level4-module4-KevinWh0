package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class MouseMorph extends Polymorph{
	private int width = 50;
	private int height = 50;
	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		if(PolymorphWindow.mouseX > getX()) 
			setX(getX() + 1); 
		else
			setX(getX() - 1); 
		if(PolymorphWindow.mouseY > getY()) 
			setY(getY() + 1); 
		else
			setY(getY() - 1); 
		g.setColor(Color.blue);
		g.fillRect(this.getX(), this.getY(), width, height);
	}
	
}
