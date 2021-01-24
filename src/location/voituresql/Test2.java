package location.voituresql;


import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
	
	
	public class Test2 {

	    public static void main(String[] args) 
	  {
	    try 
	  {
	      String url = "jdbc:mysql://localhost:3306/location";
	      String user = "root";
	      String password = "";
	    
	      Connection con = DriverManager.getConnection(url, user, password);
	   
	    	
	      
	      String query = "SELECT * FROM contra";
	      
	      
	      Statement stm = con.createStatement();
	      ResultSet res = stm.executeQuery(query);
	    
	      String columns[] = { "nom","prenom","Cin","voiture", "matricule", "kilometrage","datentre","datsortie" };
	      String data[][] = new String[8][8];
	    
	      int i = 0;
	      while (res.next()) {
	    	 String nom = res.getString("nom");
		     String prenom = res.getString("prenom");
		     int  Cin = res.getInt("Cin");  
	        String marque = res.getString("voiture");
	        String matricule = res.getString("matricule");
	        int  kilometrage = res.getInt("kilometrage");
	        String datentre = res.getString("datentre");
	        String datsortie = res.getString("datsortie");
	        
	        data[i][0] = nom;
	        data[i][1] = prenom;
	        data[i][2] = Cin + "";
	        data[i][3] = marque;
	        data[i][4] = matricule;
	        data[i][5] = kilometrage + "";
	        data[i][6] = datentre;
	        data[i][7] = datsortie;
	        i++;
	      }

	      DefaultTableModel model = new DefaultTableModel(data, columns);
	     
	      JFrame f = new JFrame("contra de location");
	      f.getContentPane().setLayout(null);
	      JPanel panel = new JPanel();
	      panel.setBounds(0, 0, 0, 0);
	      f.getContentPane().add(panel);
	      f.setSize(900, 600);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	      f.setLocationRelativeTo(null);
	      JTable table = new JTable(model);
	      table.setShowGrid(true);
	      table.setShowVerticalLines(true);
	      JScrollPane pane = new JScrollPane(table);
	      pane.setBounds(10, 43, 864, 507);
	      f.getContentPane().add(pane);
	      
	      pane.setViewportView(table);
	      
	      JMenuBar menuBar = new JMenuBar();
	      f.setJMenuBar(menuBar);
	      
	      
	      JButton btnNewButton = new JButton("New button");
	      menuBar.add(btnNewButton);
	      
	    
	      JPanel panel_1 = new JPanel();
	      panel_1.setBounds(10, 11, 846, 109);
	      panel_1.setLayout(null);
	      
	  

	      
	   } catch(SQLException e) {
		      e.printStackTrace();
		    }
	    
	
	 
	  }
	}

	
	
	