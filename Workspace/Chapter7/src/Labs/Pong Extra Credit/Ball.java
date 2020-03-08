//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private double xSpeed = 0.002;
	private double ySpeed = 0.002;

	public Ball() {
		super(200, 200);
		determineSpeed();
	}

	public Ball(int x, int y) {
		super(x, y);
		determineSpeed();
	}

	public Ball(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		determineSpeed();
	}

	public Ball(int x, int y, int wid, int ht, Color clr) {
		super(x, y, wid, ht, clr);
		determineSpeed();
	}

	public Ball(int x, int y, int wid, int ht, Color clr, int xSpeed, int ySpeed) {
		super(x, y, wid, ht, clr);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		determineSpeed();
	}

	public void determineSpeed() {
		if ((int)(Math.random()) == 0) {
			setXSpeed(getXSpeed() * -1);
		}

		if ((int)(Math.random() == 0)) {
			setYSpeed(getYSpeed() * -1);
		}
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

		setX(getX() + getXSpeed());
		setY(getY() + getYSpeed());
	}

	public boolean equals(Object obj) {

		Ball ball = (Ball) obj;

		if (super.equals(ball) && xSpeed == ball.getXSpeed() && ySpeed == ball.getYSpeed()) {
			return true;
		} else {
			return false;
		}
	}

	public double getXSpeed() {
		return xSpeed;
	}

	public double getYSpeed() {
		return ySpeed;
	}

	public String toString() {
		return super.toString() + ", " + xSpeed + ", " + ySpeed;
	}
}