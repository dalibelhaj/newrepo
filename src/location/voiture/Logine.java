package location.voiture;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JDesktopPane;


public class Logine extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2585783143350871791L;
	private static JTextField username;
	private static JPasswordField password;
	private static JButton buttonlogin;
    private static JLabel lblNewLabel; 
    private static JLabel lblNewLabel_1; 
    private static JLabel success;
    private static ImageIcon icone1;
    private JPanel panel;
    private JLabel lblNewLabel_2;
	/**
	 * lancement d'appliction
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logine frame = new Logine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
       
    

	public Logine() throws SQLException {
		super ("login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\AjoutVoiture.png"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		
		
		JPanel contentPane = (JPanel) this.getContentPane();
		getContentPane().setLayout(null);
		
		buttonlogin = new JButton("");
		buttonlogin.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\btn1Conect48.png"));
		buttonlogin.setBounds(252, 199, 81, 50);
		contentPane.add(buttonlogin);

	
		
		username = new JTextField();
		username.setBounds(210, 112, 125, 20);
		getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(210, 168, 125, 20);
		getContentPane().add(password);
		
		lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(63, 115, 72, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(63, 171, 72, 14);
		getContentPane().add(lblNewLabel_1);
	    
		success = new JLabel("");
		
		success.setBounds(22, 200, 211, 50);
		getContentPane().add(success);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\login.png"));
		lblNewLabel_2.setBounds(22, 0, 137, 114);
		getContentPane().add(lblNewLabel_2);
		
		
		
	buttonlogin.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
						
			String user = username.getText() ;	
			String pasword = password.getText();
			
			try {
				
			Connection connect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/location",
                    "root","");
			 
					 Statement st = connect.createStatement(); 
			 ResultSet rs = st.executeQuery("SELECT loginsql,passwordsql FROM `personnel` WHERE matri=1 ");
			 
				if (rs.next()) {
			    
					if (user.equals(rs.getString("loginsql")) && pasword.equals(rs.getString("passwordsql")) ) {	
						
				success.setText("login successfull!!!");
				success.setForeground(Color.GREEN);
				success.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\validee.png"));
				
				 if (e.getSource()==buttonlogin) {
					 dispose();
					Accueil accueil = new Accueil();
					accueil.setVisible(true);
						
				 }
				
				}	
				 else {
						 
				success.setText("login unsuccessfull!!!");
				success.setForeground(Color.red);
				success.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\erreur.png"));
							 }
				}
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block

				e1.printStackTrace();
			}
			/* separation de code ....................................................................................
			 * 
			 * 
			 *  
			 * 
			 */	
			
			try {
				
			Connection connect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/location",
                    "root","");
			 
					 Statement st = connect.createStatement(); 
			 ResultSet rs = st.executeQuery("SELECT loginsql,passwordsql FROM `personnel` WHERE matri=2 ");
			 
				if (rs.next()) {
			    
					if (user.equals(rs.getString("loginsql")) && pasword.equals(rs.getString("passwordsql")) ) {	
					
					
				success.setText("login successfull!!!");
				success.setForeground(Color.GREEN);
				success.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\validee.png"));

				 if (e.getSource()==buttonlogin) {
					 dispose();
					Accueil1 accueil1 = new Accueil1();
					accueil1.setVisible(true);
						
				 }
				 else {
					 
				success.setText("login  unsuccessfull!!!");
				success.setForeground(Color.red);	
				success.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\erreur.png"));
				 }
				
					}	
					
				}
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
			
				e1.printStackTrace();
			}	
			
		
			}});
			
	}
}
				
			
	
	
	


	
	


	

