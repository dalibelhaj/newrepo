package location.voiture;


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;


public class Accueil extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5547757447109479370L;
    private static JButton btnNewButton;
    private static JButton btnNewButton_1;
    private static JMenuBar menuBar;
    private static JMenu mnNewMenu;
    private static JMenuItem mntmNewMenuItem;
    
    
	
	public Accueil() {
	    super ("Accueil");
	    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\AjoutVoiture.png"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\lesft.png"));
		
		
		btnNewButton.setBounds(10, 11, 272, 328);
		getContentPane().add(btnNewButton);
		
		//btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
		   if (e.getSource()==btnNewButton) {
			dispose();
			Contradelocation contradelocation = null;
			try {
				contradelocation = new Contradelocation();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			contradelocation.setVisible(true);
			 
			   
		   }
			   		   
			   
			}
		});
		
		
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\right.png"));
		btnNewButton_1.setBounds(302, 11, 272, 328);
		getContentPane().add(btnNewButton_1);
		
		//btnNewButton_1.setIcon(null);
		//btnNewButton_1.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//	}
		//});
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("menu");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("help");
		mnNewMenu.add(mntmNewMenuItem);
		
		
		
		
	}




public static void main (String[] args) { 
	
 Accueil accueil = new Accueil();
 accueil.setVisible(true);
 

	}



	}
