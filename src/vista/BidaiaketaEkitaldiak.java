package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

public class BidaiaketaEkitaldiak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableBidaiak;
	private JTable tableEkitaldiak;
	private JButton btnAtera;
	private JButton btnEskaintzaAtera;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public BidaiaketaEkitaldiak(String erabiltzaile) {
		
		modelo.POJOak.Agentzia agentzia = new modelo.POJOak.Agentzia();
		agentzia = modelo.DAOak.Agentzia.cargatuAgentziak(erabiltzaile);
		ArrayList<modelo.POJOak.Bidaia> bidaiak = new ArrayList<modelo.POJOak.Bidaia>();
		bidaiak = modelo.DAOak.Bidaia.cargatuBidaiak(agentzia.getId());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columnNames = {"Bidaiak", "Mota", "Egunak", "Hasiera_Data", "Amaiera_Data", "Herrialdea"};
        DefaultTableModel modelBidaiak = new DefaultTableModel(columnNames, 0);
        
        String[] columnNames1 = {"Ekitaldia", "Mota", "Data", "Prezioa"};
        DefaultTableModel modelEkitaldiak = new DefaultTableModel(columnNames1, 0);
		
		tableBidaiak = new JTable(modelBidaiak);
		tableBidaiak.setBounds(45, 66, 534, 99);
		contentPane.add(tableBidaiak);
		
		//for(recorrer la array de viajes)
		//tableEkitaldiak.add(cargar cada objeto viaje en la tabla)
		
		tableEkitaldiak = new JTable(modelEkitaldiak);
		tableEkitaldiak.setBounds(45, 220, 534, 99);
		contentPane.add(tableEkitaldiak);
		
		//for(recorrer la array de servicios de X viaje)
		//tableEkitaldiak.add(cargar cada objeto servicio en la tabla)
		
		
		JButton btnBidaiBerria = new JButton("Bidai Berria");
		btnBidaiBerria.setFont(new Font("Arial", Font.PLAIN, 17));
		btnBidaiBerria.setBounds(666, 66, 147, 23);
		contentPane.add(btnBidaiBerria);
		
		JButton btnEkitaldiBerria = new JButton("Ekitaldi Berria");
		btnEkitaldiBerria.setFont(new Font("Arial", Font.PLAIN, 17));
		btnEkitaldiBerria.setBounds(666, 220, 147, 23);
		contentPane.add(btnEkitaldiBerria);
		
		btnAtera = new JButton("Atera");
		btnAtera.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAtera.setBounds(666, 372, 147, 23);
		contentPane.add(btnAtera);
		
		btnEskaintzaAtera = new JButton("Eskaintza sortu");
		btnEskaintzaAtera.setFont(new Font("Arial", Font.PLAIN, 17));
		btnEskaintzaAtera.setBounds(67, 408, 512, 23);
		contentPane.add(btnEskaintzaAtera);
	}
}
