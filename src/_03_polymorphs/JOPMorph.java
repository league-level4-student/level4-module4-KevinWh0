package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class JOPMorph extends Polymorph {
	private int width = 50;
	private int height = 50;

	JOPMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(this.getX(), this.getY(), width, height);

		if (PolymorphWindow.mouseX > this.getX() && PolymorphWindow.mouseX < this.getX() + width) {
			if (PolymorphWindow.mouseY > this.getY() && PolymorphWindow.mouseY < this.getY() + height) {
				if (PolymorphWindow.pressed != false) {
					PolymorphWindow.pressed = false;
					JOptionPane.showMessageDialog(null, "Hello");
				}
			}
		}
		PolymorphWindow.pressed = false;
	}

}
