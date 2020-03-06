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

	public void setXSpeed(int x) {
		xSpeed = x;
	}

	public void setYSpeed(int y) {
		ySpeed = y;
	}

	public void moveAndDraw(Graphics window) {
		window.setColor(getColor());
		window.fillOval(getX(), getY(), getWidth(), getHeight());

		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		window.fillOval(getX(), getY(), getWidth(), getHeight());
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