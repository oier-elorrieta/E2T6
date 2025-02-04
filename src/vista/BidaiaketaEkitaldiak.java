package vista;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import controlador.Metodoak;
import modelo.POJOak.Bidaia;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

public class BidaiaketaEkitaldiak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableBidaiak;
	private JTable tableEkitaldiak;
	private JButton btnAtera;
	private JButton btnEskaintzaAtera;
	private int posizioa = 0;
	private ArrayList<modelo.POJOak.Bidaia> bidaiak2 = new ArrayList<modelo.POJOak.Bidaia>();

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
		
		String[] columnNames = {"ID","Bidaiak", "Mota", "Egunak", "Hasiera_Data", "Amaiera_Data", "Herrialdea"};
        DefaultTableModel modelBidaiak = new DefaultTableModel(columnNames, 0);
        
        String[] columnNames1 = {"ID","Ekitaldia", "Mota", "Data", "Prezioa"};
        DefaultTableModel modelEkitaldiak = new DefaultTableModel(columnNames1, 0);
		
		tableBidaiak = new JTable(modelBidaiak);
		tableBidaiak.setBounds(45, 66, 534, 99);
		contentPane.add(tableBidaiak);
		
		for (Bidaia b : bidaiak) {
			Object[] row = {b.getId(), b.getIzena(), b.getMota(), (b.getBidaia_amaitu().getTime()-b.getBidaia_hasi().getTime()), b.getBidaia_hasi(), 
					b.getBidaia_amaitu(), b.getHerrialdea()};
			modelBidaiak.addRow(row);
		}
		
		//for(recorrer la array de viajes)
		//tableEkitaldiak.add(cargar cada objeto viaje en la tabla)
		
		bidaiak2=bidaiak;
		tableBidaiak.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					int erabakitakolerroa = tableBidaiak.getSelectedRow();
					if (erabakitakolerroa != -1) {
						modelEkitaldiak.setRowCount(0);
						int erabakitakoID = (int) modelBidaiak.getValueAt(erabakitakolerroa, 0);
						posizioa=Metodoak.bidaiarenZerbitzuak(bidaiak2, erabakitakoID, modelEkitaldiak);
						System.out.println(modelBidaiak.getValueAt(erabakitakolerroa, 0));
						for (modelo.POJOak.Zerbitzua b : bidaiak2.get(posizioa).getZerbitzuak()) {
							if (b.getId_hegaldia()!=-1) {
								Object[] row = {b.getId_hegaldia(), b.getHegaldiIzena(), "Hegaldia", b.getHegaldiData(), b.getHegaldiPrezioa()};
								modelEkitaldiak.addRow(row);
							} else if (b.getIdOstatua()!=-1) {
								Object[] row = {b.getIdOstatua(), b.getOstatuIzena(), "Ostatua", b.getOstatuSarrera(), b.getOstatuPrezioa()};
								modelEkitaldiak.addRow(row);
							} else if (b.getJardueraId()!=-1){
								Object[] row = {b.getJardueraId(), b.getJardueraIzena(), "Jarduera", b.getJardueraData(), b.getJardueraPrezioa()};
								modelEkitaldiak.addRow(row);
							}
						}
					}
				}
			}
		});
		
		
		
		//for(recorrer la array de servicios de X viaje)
		//tableEkitaldiak.add(cargar cada objeto servicio en la tabla)
		
		tableEkitaldiak = new JTable(modelEkitaldiak);
		tableEkitaldiak.setBounds(45, 220, 534, 99);
		contentPane.add(tableEkitaldiak);
		
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
