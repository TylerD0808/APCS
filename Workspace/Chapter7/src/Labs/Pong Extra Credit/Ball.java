//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed = 3;
	private int ySpeed = 1;

	public Ball() {
		super(200, 200);
	}

	public Ball(int x, int y) {
		super(x, y);
	}

	public Ball(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public Ball(int x, int y, int wid, int ht, Color clr) {
		super(x, y, wid, ht, clr);
	}

	public Ball(int x, int y, int wid, int ht, Color clr, int xSpeed, int ySpeed) {
		super(x, y, wid, ht, clr);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// add the set methods

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location

		setX(getX() + xSpeed);
		// setY

		// draw the ball at its new location
	}

	public boolean equals(Object obj) {

		Ball ball = (Ball) obj;

		if (super.equals(ball) && xSpeed == ball.getXSpeed() && ySpeed == ball.getYSpeed()) {
			return true;
		} else {
			return false;
		}
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public String toString() {
		return super.toString() + ", " + xSpeed + ", " + ySpeed;
	}
}