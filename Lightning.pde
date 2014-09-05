int startX = 0;
int startY = 200;
int endX = 0;
int endY = 200;
void setup()
{
  size(800,400);
  background(0);
}
void draw()
{
    background(#FFCDE0);
    
    while(endX < 800){
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




