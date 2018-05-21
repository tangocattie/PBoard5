package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartPanel extends JPanel implements KeyListener, ActionListener{

	private Image background;
	private JButton play, instructions;
	private GameFrame frame;
	//Container contentPane;
	
	public StartPanel(GameFrame f) {
		 background = (new ImageIcon("startBackground.png")).getImage();
//		 f = new GameFrame();
		 this.frame = f;
		
		 //setLayout(new BorderLayout());
		 //JPanel p = new JPanel();
		
//		 setLayout(null);
			
			//setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
			
//			setLayout(new FlowLayout(FlowLayout.RIGHT));
		 setLayout(new GridLayout());
			//p.add(Box.createVerticalStrut(300));   // Move down by 300 pixels  
		 	Font font = new Font("Sans", Font.BOLD, 20);
		 
			play = new JButton("PLAY");
			//play.setSize(200, 150);
			//play.setLocation(50,400);
			play.setFont(font);
			//play.setBounds(50, 400, 200, 150);
			//play.setOpaque(false);
			
			play.addActionListener(this);
			add(play);
			
			instructions = new JButton("INSTRUCTIONS");
			
			//instructions.setSize(200, 150);
			//instructions.setLocation(600,400);
			instructions.setFont(font);
			
			instructions.addActionListener(this);
			add(instructions);
			
//			p.add(instructions);
//			add(p, BorderLayout.SOUTH);
			
			//instructions.setBounds(600, 400, 200, 150);

			
			//p.add(Box.createVerticalStrut(320));
			
			
			// add(p);
			
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

	    int width = getWidth();
	    int height = getHeight();
	    
	    double ratioX = (double)width/GamePanel.DRAWING_WIDTH;
	    double ratioY = (double)height/GamePanel.DRAWING_HEIGHT;
	    
	    Graphics2D g2 = (Graphics2D)g;
	    AffineTransform at = g2.getTransform();
	    g2.scale(ratioX,ratioY);
	    
	    g.drawImage(background, 0, 0, GamePanel.DRAWING_WIDTH, GamePanel.DRAWING_HEIGHT, this);
//	    g.drawRect(50, 400, 200, 150);
	   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if (str.equals("PLAY")) {
			frame.changePanel("3");
		}
		if (str.equals("INSTRUCTIONS")) {
			frame.changePanel("2");
		} else {
			frame.changePanel("1");
		}
		
//		if (play.isEnabled()) {
//			play.setEnabled(false);
//			frame.changePanel("3");
//			
//		}
//		if (instructions.isEnabled()) {
//			instructions.setEnabled(false);
//			frame.changePanel("2");
//		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
