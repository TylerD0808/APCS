//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable {
	Ball ball;

	public BallTestTwo() {
		setBackground(Color.BLACK);

		ball = new Ball(500, 500);
		setVisible(true);

		// test the Ball thoroughly

		// test all constructors

		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		ball.moveAndDraw(window);

		if (!(ball.getX() >= 10 && ball.getX() <= 790)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (!(ball.getY() >= 10 && ball.getY() <= 450)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(19);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}