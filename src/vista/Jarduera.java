package vista;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Jarduera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEkitaldiIzena;
	private JTextField textPrezioa;
	private JTextField textEkitaldiMota;
	private SimpleDateFormat formatua = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Jarduera(String erabiltzaile, ArrayList<modelo.POJOak.Bidaia> bidaiak, int erabakitakoIDBidaia) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ekitaldiaren Izena:");
		lblNewLabel.setBounds(46, 36, 147, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEkitaldiMota = new JLabel("Ekitaldi Mota:");
		lblEkitaldiMota.setBounds(46, 71, 147, 14);
		contentPane.add(lblEkitaldiMota);
		
		JLabel lblDeskripzioa = new JLabel("Deskripzioa:");
		lblDeskripzioa.setBounds(46, 123, 147, 14);
		contentPane.add(lblDeskripzioa);
		
		JLabel lblPrezioa = new JLabel("Prezioa:");
		lblPrezioa.setBounds(46, 188, 147, 14);
		contentPane.add(lblPrezioa);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(46, 233, 147, 14);
		contentPane.add(lblData);
		
		textEkitaldiIzena = new JTextField();
		textEkitaldiIzena.setBounds(164, 33, 150, 20);
		contentPane.add(textEkitaldiIzena);
		textEkitaldiIzena.setColumns(10);
		
		textPrezioa = new JTextField();
		textPrezioa.setColumns(10);
		textPrezioa.setBounds(164, 185, 150, 20);
		contentPane.add(textPrezioa);
		
		JTextArea textAreaDeskripzioa = new JTextArea();
		textAreaDeskripzioa.setBounds(164, 96, 150, 63);
		contentPane.add(textAreaDeskripzioa);
		
		JDateChooser data = new JDateChooser();
		data.setBounds(164, 227, 150, 20);
		contentPane.add(data);
		
		JLabel lblDatuakBete = new JLabel("Datu guztiak bete");
		lblDatuakBete.setForeground(new Color(255, 0, 0));
		lblDatuakBete.setBounds(285, 279, 99, 14);
		contentPane.add(lblDatuakBete);
		lblDatuakBete.setVisible(false);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textEkitaldiIzena.getText().equals("")&&!textAreaDeskripzioa.getText().equals("")&&!textPrezioa.getText().equals("")&&data.getDate()!=null) {
					try {
						int prezioa = Integer.parseInt(textPrezioa.getText());
						modelo.DAOak.Zerbitzua.zerbitzuBerria(erabakitakoIDBidaia);
						modelo.DAOak.Zerbitzua.jardueraBerria(modelo.DAOak.Zerbitzua.zerbitzuBerriarenID(erabakitakoIDBidaia), textEkitaldiIzena.getText(),
								java.sql.Date.valueOf(formatua.format(data.getDate())), textAreaDeskripzioa.getText(), prezioa);
						for (int i = 0; i < bidaiak.size(); i++) {
							if (bidaiak.get(i).getId()==erabakitakoIDBidaia) {
								bidaiak.get(i).setZerbitzuak(modelo.DAOak.Zerbitzua.cargatuZerbitzuak(erabakitakoIDBidaia));
							}
						}
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									BidaiaketaEkitaldiak frame = new BidaiaketaEkitaldiak(erabiltzaile);
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
		                    }
						});
						dispose();
					} catch (Exception e2) {
						lblDatuakBete.setText("Prezioa zenbaki bat izan behar da");
						lblDatuakBete.setVisible(true);
					}
				} else {
					lblDatuakBete.setVisible(true);
				}
			}
		});
		btnGorde.setBounds(46, 275, 89, 23);
		contentPane.add(btnGorde);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Zerbitzuak frame = new Zerbitzuak(erabiltzaile, bidaiak, erabakitakoIDBidaia);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnItzuli.setBounds(164, 275, 89, 23);
		contentPane.add(btnItzuli);
		
		textEkitaldiMota = new JTextField();
		textEkitaldiMota.setText("Jarduera");
		textEkitaldiMota.setEditable(false);
		textEkitaldiMota.setColumns(10);
		textEkitaldiMota.setBounds(164, 68, 150, 20);
		contentPane.add(textEkitaldiMota);
	}
}