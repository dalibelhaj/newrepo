package location.voiture;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;

public class Contradelocation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6300402962395754610L;
	private JTable table;
	private JTextField toprenom;
	private JTextField tonom;
	private JTextField tocin;	
	private JTextField kilomtrague;
	private static JDateChooser dsorti;
    private static JButton btnNewButton;
    private static JComboBox<Object> voiture;
    private static JComboBox<Object> matricule;
    private static JDateChooser dentre;
    private JButton btnNewButton_1;
    
	/**
	 * Launch the application.
	 **/
    


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contradelocation frame = new Contradelocation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}  

	/**
	 * Create the frame.
	 * @return 
	 * @throws SQLException 
	 */
public Contradelocation() throws SQLException {
		
		super("contra de location");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\AjoutVoiture.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
	
		/**
		 * 
		 * 
		 * 
		 * 
		 *CONSTRUCTION DE TABLEAU 
		 *
		 * 
		 * 
		 * 
		 */
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 125, 824, 406);
		getContentPane().add(scrollPane);
		
		
	
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {null,null,null,null,null,null,null,null},
			new String[] {
				"nom", "prenom", "CIN", "voiture", "matricule", "kilometrage", "date sortie", "date entre"
			}
		) {
			

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, String.class, String.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		scrollPane.setViewportView(table);
		
		/**
		 * 
		 * 
		 * 
		 * 
		 *CONSTRUCTION DE TABLEAU 
		 *
		 * 
		 * 
		 * 
		 */

		toprenom = new JTextField();
		toprenom.setBounds(27, 33, 133, 20);
		getContentPane().add(toprenom);
		toprenom.setColumns(10);
		
		tonom = new JTextField();
		tonom.setBounds(166, 33, 133, 20);
		getContentPane().add(tonom);
		tonom.setColumns(10);
		
		tocin = new JTextField();
		tocin.setBounds(309, 33, 133, 20);
		getContentPane().add(tocin);
		tocin.setColumns(10);
		
		kilomtrague = new JTextField();
		kilomtrague.setBounds(724, 33, 127, 20);
		getContentPane().add(kilomtrague);
		kilomtrague.setColumns(10);
		

		
		dentre=new JDateChooser();
		dentre.setBounds(27, 89, 133, 20);
		getContentPane().add(dentre);
		dentre.setDateFormatString("yyyy-MM-dd");
		
		
		dsorti=new JDateChooser();
		dsorti.setBounds(166, 89, 133, 20);
		getContentPane().add(dsorti);
		dsorti.setDateFormatString("yyyy-MM-dd");
		
		
		
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\appliquer48.png"));
		btnNewButton.setBounds(734, 64, 96, 50);
		getContentPane().add(btnNewButton);
		

		
		
		voiture = new JComboBox<Object>();
		voiture.setModel(new DefaultComboBoxModel<Object>(new String[] {"renault", "audi", "bmw"}));
		voiture.setBounds(452, 32, 129, 22);
		getContentPane().add(voiture);
		
		try {
			Connection connect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/location","root","");
			 
			 Statement st = connect.createStatement(); 
			 ResultSet rs = st.executeQuery("SELECT * FROM voiture");
			 
				if (rs.next()) {
					voiture.addItem(rs.getString("marque"));	
					
				}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}	
	matricule = new JComboBox<Object>();	
		matricule.setBounds(591, 32, 123, 22);
		getContentPane().add(matricule);
		try {
			Connection connect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/location","root","");
			 
			 Statement stt = connect.createStatement(); 
			 ResultSet rss = stt.executeQuery("SELECT * FROM voiture");
			 
				if (rss.next()) {
					matricule.addItem(rss.getString("matricule"));	
					
				}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setBounds(71, 8, 89, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setBounds(202, 8, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CIN");
		lblNewLabel_2.setBounds(346, 8, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Voiture");
		lblNewLabel_3.setBounds(487, 7, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("matricule");
		lblNewLabel_4.setBounds(629, 8, 66, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("kilometrage");
		lblNewLabel_5.setBounds(742, 8, 74, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("date sortie");
		lblNewLabel_6.setBounds(59, 64, 66, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("date entre");
		lblNewLabel_7.setBounds(202, 64, 74, 14);
		getContentPane().add(lblNewLabel_7);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\AjoutReserv.png"));
		btnNewButton_1.setBounds(614, 64, 96, 50);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (e.getSource()==btnNewButton_1) {
		 			dispose();
		 			Affichague affichague = new Affichague();	
		 			affichague.setVisible(true);
		 				   
		 		   }	
				
			}
			
		});
		

		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object [] {toprenom.getText(),tonom.getText(),Integer.parseInt(tocin.getText()),voiture.getSelectedItem(),matricule.getSelectedItem(),Integer.parseInt(kilomtrague.getText()),dentre.getDate(),dsorti.getDate() } );
		
		}
	});
			
		
	}
	}


