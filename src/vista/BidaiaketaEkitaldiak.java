package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BidaiaketaEkitaldiak frame = new BidaiaketaEkitaldiak();
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
	public BidaiaketaEkitaldiak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableBidaiak = new JTable();
		tableBidaiak.setBounds(45, 66, 534, 99);
		contentPane.add(tableBidaiak);
		
		tableEkitaldiak = new JTable();
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
