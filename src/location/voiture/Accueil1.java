package location.voiture;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Accueil1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private static JButton btnNewButton;
	    private static JButton btnNewButton_1;
	    private static JMenuBar menuBar;
	    private static JMenu mnNewMenu;
	    private static JMenuItem mntmNewMenuItem;
	    
	    public Accueil1() {
	    	
	    	
	    	
	    	super ("Accueil");
	    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\AjoutVoiture.png"));
	 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		this.setSize(600,400);
	 		this.setLocationRelativeTo(null);
	 		getContentPane().setLayout(null);
	 		
	 		btnNewButton = new JButton("New button");
	 		
	 		btnNewButton.setBounds(10, 11, 264, 350);
	 		getContentPane().add(btnNewButton);
	 		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\lesft.png"));
	 		/**btnNewButton.setIcon(null);
	 		btnNewButton.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent e) {   		   
	 			   
	 			}
	 		});**/
	 		
	 		
	 		btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(302, 11, 272, 350);
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\right.png"));
			getContentPane().add(btnNewButton_1);
			
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					if (e.getSource()==btnNewButton_1) {
			 			dispose();
			 			Entretien entretien = new Entretien();	
			 			entretien.setVisible(true);
			 				   
			 		   }	
					
				}
				
			});
			
			
				
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			mnNewMenu = new JMenu("menu");
			menuBar.add(mnNewMenu);
			
			mntmNewMenuItem = new JMenuItem("help");
			mnNewMenu.add(mntmNewMenuItem);
			
			
			
			
		}

	 		
	 		
	 		
	 		
	 		
	    }
	

