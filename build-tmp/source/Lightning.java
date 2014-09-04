import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 200;
int endX = 0;
int endY = 200;
public void setup()
{
  size(400,400);
  background(0);
}
public void draw()
{
    background(0xffDDBAFF);
    
    while(endX < 400){
     line(startX, startY, endX, endY);
      endX = startX + (int)(Math.random()*10);
      endY = startY + (int)(Math.random()* 19) + -9;
      strokeWeight(3);
      stroke(255);
      line(startX, startY, endX, endY);
      startX = endX;
      startY = endY;
  }
  startX = 0;
  startY = 200;
  endX = 0;
  endY = 200;
}




  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
