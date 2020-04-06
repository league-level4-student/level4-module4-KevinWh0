package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import sun.java2d.Disposer.PollDisposable;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	public static int mouseX;
	public static  int mouseY;
	
	
	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> pMorphs = new ArrayList<Polymorph>();

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movePoly;
	Polymorph MouseMorph;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		addMouseMotionListener(this);   
//   	 bluePoly = new BluePolymorph(50, 50);
//   	 redPoly = new RedMorph(50, 50);
//   	movePoly = new MovingMorph(50,50);
		//pMorphs.add(new BluePolymorph(50, 50));
		//pMorphs.add(new RedMorph(50, 50));
		//pMorphs.add(new MovingMorph(50, 50));
		pMorphs.add(new MouseMorph(50,50));
		pMorphs.add(new ImgPoly(50, 50));
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
//   	 bluePoly.draw(g);
//   	 redPoly.draw(g);
//
//   	 movePoly.draw(g);
		for (int i = 0; i < pMorphs.size(); i++) {
			pMorphs.get(i).draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
//   	 bluePoly.update();
//   	 redPoly.update();
//   	 
//   	 movePoly.update();
		for (int i = 0; i < pMorphs.size(); i++) {
			pMorphs.get(i).update();
		}

	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
	}
}
