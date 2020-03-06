//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
   private int xPos;
   private int yPos;
   private int width = 25;
   private int height = 25;

   private Color color = Color.WHITE;

   public Block() {

   }

   public Block(int x, int y) {
      xPos = x;
      yPos = y;
   }

   public Block(int x, int y, int wid, int ht) {
      xPos = x;
      yPos = y;
      width = wid;
      height = ht;
   }

   public Block(int x, int y, int wid, int ht, Color clr) {
      xPos = x;
      yPos = y;
      width = wid;
      height = ht;
      color = clr;
   }

   public void setPos(int x, int y) {
      xPos = x;
      yPos = y;
   }

   public void setX(int x) {
      xPos = x;
   }

   public void setY(int y) {
      yPos = y;
   }

   public int getX() {
      return xPos;
   }

   public int getY() {
      return yPos;
   }

   public void setBallSize(int w, int h) {
      width = w;
      height = h;
   }

   public void setHeight(int h) {
      height = h;
   }

   public void setWidth(int w) {
      width = w;
   }

   public int getHeight() {
      return height;
   }

   public int getWidth() {
      return width;
   }

   public void setColor(Color col) {
      color = col;
   }

   public Color getColor() {
      return color;
   }

   public void draw(Graphics window) {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col) {
      window.setColor(col);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public boolean equals(Object obj) {

      Block block = (Block) obj;

      if (xPos == block.getX() && yPos == block.getY() && width == block.getWidth() && height == block.getHeight()
            && color == block.getColor()) {
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color;
   }
}