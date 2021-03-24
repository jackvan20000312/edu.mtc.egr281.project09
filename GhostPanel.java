package inClass;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class GhostPanel extends JPanel {
private static final long serialVersionUID = 1L;
public GhostPanel() {
super();
this.setPreferredSize(new Dimension(375, 300));
this. setBackground(Color.BLACK) ;
}// Ending bracket of constructor
public void paintComponent(Graphics pen) {
super. paintComponent (pen);
pen.setColor(Color.RED);
pen.fillOval(50, 25, 275, 175);
pen.fillArc(1, 122, 100, 150, 270, 180);
pen.fillOval(90, 122, 100, 150);
pen.fillOval(180, 122, 100, 150);
pen.fillArc(275, 122, 100, 150, 90, 180);
pen.setColor(Color. WHITE);
pen.fillOval(115, 80, 50, 50);
pen.fillOval(205, 80, 50, 50); 
pen.setColor(Color. BLUE);
pen.fillOval(135, 100, 20, 20);
pen.fillOval(225, 100, 20, 20);
}// Ending bracket of method paintComponent
}// Ending bracket of class GhostPanel
