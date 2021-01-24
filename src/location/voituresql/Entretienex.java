package location.voituresql;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Entretienex extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Entretienex frame = new Entretienex();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection conn=null;
	Statement ps = null;
    ResultSet rs = null;
	public Entretienex() {
	
	conn=testbd.conexion();
	getComponents();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 60, 342, 176);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
		  
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table);
	}
	public void Affichage() {
		try {
			String requete = "select * from voiture";
			ps = conn.prepareStatement(requete);
			rs=ps.executeQuery("voiture");
			table.setModel((TableModel) rs);
			
		}catch(Exception e){
			
		}
		}
		
		
		
		}
		
