package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Calendar;

public class SquarePolly extends Polymorph{
	private int width = 50;
	private int height = 50;
	
	int step = 0;
	
	int lastMin = 0;
	SquarePolly(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(this.getX(), this.getY(), width, height);
		   Calendar calendar = Calendar.getInstance();  

		if(calendar.get(Calendar.SECOND) != lastMin)
		{
			lastMin = calendar.get(Calendar.SECOND);
			step ++;
			if(step > 3)
				step = 0;
		}
		
		if(step == 0)
		this.setX(this.getX() + 1);
		if(step == 1)
		this.setY(this.getY() + 1);
		if(step == 2)
		this.setX(this.getX() - 1);
		if(step == 3)
		this.setY(this.getY() - 1);
	}
	
}
