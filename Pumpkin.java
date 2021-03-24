package inClass;


import java.awt.*;	//  graphics
	//  I/O


public class Pumpkin
{

int shape;
int height, width, closeness;
Color color;
int vrejHeight, vrejWidth;
Color vrejColor;

//********************
//
//  constructors
//
//********************

public Pumpkin()
{

shape=0;
height=60;
width=60;
closeness=20;
color=Color.orange;

vrejHeight=15;
vrejWidth=4;
vrejColor=Color.green;

}// end default constructor



public Pumpkin(int s, int h, int w, int c, Color clr)
{
	shape=s;
	height=h;
	width=w;
	closeness=c;
	color=clr;
}// end constructor

//********************
//
//  set fields
//
//********************

public void setShape(int s)
{
	shape = s;
} // end setShape

public void setHeight(int h)
{
	height = h;
} // end setHeight

public void setWidth(int w)
{
	width = w;
} // end setWidth

public void setCloseness(int c)
{
	closeness = c;
} // end setCloseness

public void setColor(Color clr)
{
	color = clr;
} // end setColor


//********************
//
//  get fields
//
//********************

public int getShape()
{
	return shape;
} // end getShape

public int getHeight()
{
	return height;
} // end getHeight

public int getWidth()
{
	return width;
} // end getWidth

public int getCloseness()
{
	return closeness;
} // end getCloseness

public Color getColor()
{
	return color;
} // end getColor

//********************
//
//  modify fields
//
//********************

public void increaseHeight()
{
	height++;
} // end increaseHeight

public void increaseWidth()
{
	width++;
} // end increaseWidth

public void increaseCloseness()
{
	closeness++;
} // end increaseCloseness



//********************
//
//  Print method
//
//********************

public void Print()
{

System.out.println
("Pumpkin= (shape= " + shape +
", height= " + height +
", width= " + width +
" ,closeness= " + closeness +
", color= " + color + " )");

}//end Print


//********************
//
//  Draw method
//
//
//********************

public void Draw(Graphics g, Point pos)
{
int ex, ey;

ex=(int)pos.getX()-width/2;
ey=(int)pos.getY()-height/2;

g.setColor(color);
g.fillOval(ex,ey,width, height);
g.fillOval(ex+closeness,ey, width, height);


ex=(int)pos.getX()+ vrejWidth;
ey=(int)pos.getY()-height/2-vrejHeight;
g.setColor(vrejColor);
g.fillRect(ex,ey,vrejWidth, vrejHeight);

}// end Draw

this.setPreferredSize(new Dimension(375, 300));
this. setBackground(Color. BLUE) ;
}// Ending bracket of constructor
public void paintComponent(Graphics pen) {
super. paintComponent (pen);
pen. setColor(Color. ORANGE) ;
pen. fillOval(85, 50, 125, 200);
pen.setColor(Color.BLACK);
pen.drawOval(85, 50, 125, 200);
pen. setColor(Color. ORANGE) ;
pen. fillOval(160, 50, 125, 200);
pen.setColor(Color. BLACK) ;
pen.drawOval(160, 50, 125, 200);
pen.setColor(Color. ORANGE) ;
pen. fillOval(35, 70, 150, 200);
pen.setColor(Color.BLACK) ;
pen.drawOval(35, 70, 150, 200);
pen.setColor(Color. ORANGE) ;
pen. fillOval(185, 70, 150, 200);
pen. setColor(Color.BLACK);
pen.drawOval(185, 70, 150, 200);
pen.setColor (Color. ORANGE) ;
pen. fillOval(85, 70, 125, 200);
pen.setColor(Color. BLACK) ;
pen.drawOval(85, 70, 125, 200);
pen.setColor(Color. ORANGE) ;
pen. fillOval(160, 70, 125, 200);
pen.setColor(Color.BLACK) ;
pen.drawOval(160, 70, 125, 200);
pen. setColor(Color. ORANGE) ;
pen.fillOval(135, 70, 100, 200);
pen.setColor(Color.BLACK) ;
pen.drawOval(135, 70, 100, 200);

pen.setColor(Color. GREEN);
pen.fillOval(160, 60, 50, 25);
pen.setColor(Color. BLACK);
pen.drawOval(160, 60, 50, 25);
pen.setColor(Color. GREEN);
pen.fillRect(170, 30, 30, 40);
pen.setColor(Color.BLACK);
pen.drawLine(170, 30, 200, 30);
pen.drawLine(170, 30, 170, 63);
pen.drawLine(200, 30, 200, 63);

}// end class Pumpkin

