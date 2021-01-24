package location.voiture;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;



public class Entretien extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Entretien() {
		
		super ("entretien");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ELITEBOOK\\eclipse-workspace\\location.voiture\\icon\\AjoutVoiture.png"));
 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		this.setSize(900,600);
 		this.setLocationRelativeTo(null);
 		getContentPane().setLayout(null);
 		
 		JScrollPane scrollPane = new JScrollPane();
 		scrollPane.setBounds(29, 33, 815, 486);
 		getContentPane().add(scrollPane);
 		
 		table = new JTable();
 		table.setModel(new DefaultTableModel(
 			new Object[][] {
 				{"", "", null, null, null},
 				{"", "", null, null, null},
 				{"", "", null, null, null},
 				{"", "", null, null, null},
 			},
 			new String[] {
 				"Voiture", "Matricule", "Kilometrage", "piece a rechangue", "suspendu"
 			}
 		) {
 			Class[] columnTypes = new Class[] {
 				String.class, String.class, Integer.class, String.class, Boolean.class
 			};
 			public Class getColumnClass(int columnIndex) {
 				return columnTypes[columnIndex];
 			}
 		});
 		table.getColumnModel().getColumn(3).setPreferredWidth(322);
 		scrollPane.setViewportView(table);
		
 	
	}

	
}
