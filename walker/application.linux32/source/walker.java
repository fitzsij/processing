import processing.core.*; 
import processing.data.*; 
import processing.opengl.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class walker extends PApplet {

class Walker {
  int x;
  int y;
  
  Walker(){
    x = width/2;
    y = height/2;
  }
  
  public void display() {
    stroke(0);
    point(x,y);
  }
  
  public void step(){
    int stepX = PApplet.parseInt(random(3))-1;
    int stepY = PApplet.parseInt(random(3))-1;
    x += stepX;
    y += stepY;
  }
}

Walker w;

public void setup(){
  size(640,360);
  w= new Walker();
  background(255);
}

public void draw(){
  w.step();
  w.display();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "walker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
