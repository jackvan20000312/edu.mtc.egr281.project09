package inClass;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class HalloweenDemo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private Container contentPane;
	private JLabel buttonLabel;
	private JButton clearButton;
	private JButton pumpkinButton;
	private JButton ghostButton;
	private GhostPanel ghost;
	private PumpkinPanel pumpkin;
	public HalloweenDemo() {
		super();

		this.setTitle("Halloween Button Demo");
		this.setSize(400, 425);
		this. setDefaultCloseOperation( JFrame. EXIT_ON_CLOSE) ;
		
		this.contentPane = this.getContentPane();
		this.contentPane.setLayout(new FlowLayout());
		this.contentPane.setBackground(Color.YELLOW);
		
		this.buttonLabel = new JLabel("Click a button:");
		this.contentPane.add(this.buttonLabel);
		
		this.pumpkinButton = new JButton("Pumpkin");
		this.pumpkinButton.addActionListener(this);
		this.contentPane.add(this.pumpkinButton);
		
		this.ghostButton = new JButton("Blinky");
		this.ghostButton.addActionListener(this);
		this.contentPane.add(this.ghostButton);
		
		this.clearButton = new JButton("Clear");
		this.clearButton.addActionListener(this);
		this.contentPane.add(this.clearButton);
		
		this.ghost = new GhostPanel();
		this.contentPane.add(this.ghost);
		this.ghost.setVisible(false) ;
		
		this.pumpkin = new PumpkinPanel();
		this.contentPane.add(this.pumpkin);
		this.pumpkin.setVisible(false) ;
	}//ending bracket of constructor
	
	public void actionPerformed(ActionEvent ae) {
		String actionCommand=ae.getActionCommand();
		
		if("Clear".equalsIgnoreCase(actionCommand)) {
			this.pumpkin.setVisible(false);
			this.ghost.setVisible(false);
			this.pumpkinButton.setVisible(true);
			this.ghostButton.setVisible(true);
		}else if("Blinky".equalsIgnoreCase(actionCommand)) {
			this.pumpkin.setVisible(false);
			this.ghost.setVisible(true);
			this.pumpkinButton.setVisible(true);
			this.ghostButton.setVisible(false);

		}else if("Pumpkin".equalsIgnoreCase(actionCommand)) {
			this.pumpkin.setVisible(true);
			this.ghost.setVisible(false);
			this.pumpkinButton.setVisible(false);
			this.ghostButton.setVisible(true);
		}// ending bracket of if
	}
	
}//ending bracket of class Halloween Demo
