package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgPoly extends Polymorph{
	private int width = 50;
	private int height = 50;
	BufferedImage img;
	ImgPoly(int x, int y) {
		super(x, y);
		try {
			img = ImageIO.read(new FileInputStream("src/Player.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(this.getX(), this.getY(), width, height);
		g.drawImage(img, this.getX(), this.getY(), width, height, null);

	}
	
}
