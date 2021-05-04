package org.meritamerica.squadb.examples;
import java.awt.*;
//import acm.graphics.*;
//import acm.program.*;
public class DrawRobot extends GraphicsProgram {

public void run(){
getWidth();
getHeight();

GRect rect1=new GRect (300,75,400,200);
rect1.setFilled(fill);
rect1.setFillColor(GRAY);
add(rect1);

private static void final int EYE_RADIUS=10;
GOval oval1= new GOval (10,10,EYE_RADIUS*2, EYE_RADIUS*2);
oval1.setFilled(true);
oval1.setFillColor(Color.YELLOW);
add(oval1);

GOval oval2= new GOval (100,100, EYE_RADIUS*2, EYE_RADIUS*2);
oval2.setFilled(true);
oval2.setFillColor(Color.YELLOW);
add(oval2);

GRect rect2 = new GRect(350,200,70,150);
rect2.setFilled(fill);
rect2.setFillColor(WHITE);
add(rect2);
}
}