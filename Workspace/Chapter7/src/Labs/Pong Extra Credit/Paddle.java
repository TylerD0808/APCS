//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
   // instance variables
   private int speed = 5;

   public Paddle() {
      super(10, 10);
   }

   public Paddle(int x, int y) {
      super(x, y);
   }

   public Paddle(int x, int y, int wid, int ht) {
      super(x, y, wid, ht);
   }

   public Paddle(int x, int y, int wid, int ht, int spd) {
      super(x, y, wid, ht);
      speed = spd;
   }

   public Paddle(int x, int y, int wid, int ht, Color clr) {
      super(x, y, wid, ht, clr);
   }

   public Paddle(int x, int y, int wid, int ht, Color clr, int spd) {
      super(x, y, wid, ht, clr);
      speed = spd;
   }

   public void moveUpAndDraw(Graphics window) {

   }

   public void moveDownAndDraw(Graphics window) {

   }

   public boolean equals(Object obj) {
      Paddle paddle = (Paddle) obj;

      if (super.equals(paddle) && speed == paddle.getSpeed()) {
         return true;
      } else {
         return false;
      }
   }

   public int getSpeed() {
      return speed;
   }

   public String toString() {
      return super.toString() + ", " + speed;
   }
}