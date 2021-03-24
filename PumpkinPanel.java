package inClass;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class PumpkinPanel extends JPanel {
private static final long serialVersionUID = 1L;
public PumpkinPanel() {
super();
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
pen.fillOval(160, 6-60, 50, 25);
pen.setColor(Color. BLACK);
pen.drawOval(160, 60, 50, 25);
pen.setColor(Color. GREEN);
pen.fillRect(170, 30, 30, 40);
pen.setColor(Color.BLACK);
pen.drawLine(170, 30, 200, 30);
pen.drawLine(170, 30, 170, 63);
pen.drawLine(200, 30, 200, 63);

}// Ending bracket of method paintComponent

}// Ending bracket of class PumpkinPanel