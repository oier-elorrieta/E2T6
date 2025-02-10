
package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Color;

public class BidaiBerria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBidaiarenIzena;
	private JTextField textEgunak;
	private JDateChooser BidaiaHasiera;
	private JDateChooser BidaiaAmaiera;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public BidaiBerria(String erabiltzaile, ArrayList<modelo.POJOak.Bidaia> bidaiak) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bidaiaren Izena:");
		lblNewLabel.setBounds(27, 40, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEvento = new JLabel("Bidaia Mota:");
		lblEvento.setBounds(27, 65, 110, 14);
		contentPane.add(lblEvento);
		
		JLabel lblBidaiHasiera = new JLabel("Bidai Hasiera:");
		lblBidaiHasiera.setBounds(27, 90, 110, 14);
		contentPane.add(lblBidaiHasiera);
		
		JLabel lblBiadiAmaiera = new JLabel("Biadi Amaiera:");
		lblBiadiAmaiera.setBounds(27, 115, 135, 14);
		contentPane.add(lblBiadiAmaiera);
		
		JLabel lblEgunak = new JLabel("Egunak:");
		lblEgunak.setBounds(27, 140, 135, 14);
		contentPane.add(lblEgunak);
		
		textBidaiarenIzena = new JTextField();
		textBidaiarenIzena.setBounds(189, 40, 150, 20);
		contentPane.add(textBidaiarenIzena);
		textBidaiarenIzena.setColumns(10);
		
		JComboBox<String> comboBoxBidaiarenMota = new JComboBox<>();
		comboBoxBidaiarenMota.setBounds(189, 65, 150, 20);
		contentPane.add(comboBoxBidaiarenMota);
		
		JTextArea textAreaDeskribapena = new JTextArea();
		textAreaDeskribapena.setBounds(189, 196, 200, 63);
		contentPane.add(textAreaDeskribapena);
		
		JLabel lblDescribapena = new JLabel("Describapena:");
		lblDescribapena.setBounds(27, 216, 147, 14);
		contentPane.add(lblDescribapena);
		
		BidaiaHasiera = new JDateChooser();
		BidaiaHasiera.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
				if (BidaiaHasiera.getDate()!=null&&BidaiaAmaiera.getDate()!=null) {
					if (BidaiaAmaiera.getDate().after(BidaiaHasiera.getDate())) {
						long egunak = BidaiaAmaiera.getDate().getTime()-BidaiaHasiera.getDate().getTime();
						egunak = egunak/86400000;
						textEgunak.setText(egunak+"");
					}
				}
			}
		});
		BidaiaHasiera.setBounds(189,90,174,20);
		contentPane.add(BidaiaHasiera);
		
		BidaiaAmaiera = new JDateChooser();
		BidaiaAmaiera.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
				if (BidaiaHasiera.getDate()!=null&&BidaiaAmaiera.getDate()!=null) {
					if (BidaiaAmaiera.getDate().after(BidaiaHasiera.getDate())) {
						long egunak = BidaiaAmaiera.getDate().getTime()-BidaiaHasiera.getDate().getTime();
						egunak = egunak/86400000;
						textEgunak.setText(egunak+"");
					}
				}
			}
		});
		
		BidaiaAmaiera.setBounds(189, 115, 174, 20);
		contentPane.add(BidaiaAmaiera);
		
		textEgunak = new JTextField();
		textEgunak.setEditable(false);
		textEgunak.setColumns(10);
		textEgunak.setBounds(189, 140, 89, 20);
		contentPane.add(textEgunak);
		
		JLabel lblHerrialde = new JLabel("Herrialde:");
		lblHerrialde.setBounds(27, 165, 135, 14);
		contentPane.add(lblHerrialde);
		
		JComboBox<String> comboBoxHerrialde = new JComboBox<String>();
		comboBoxHerrialde.setBounds(189, 165, 150, 20);
		contentPane.add(comboBoxHerrialde);
		
		JLabel lblDatuakBete = new JLabel("Datu guztiak bete");
		lblDatuakBete.setForeground(new Color(255, 0, 0));
		lblDatuakBete.setBounds(314, 274, 99, 14);
		contentPane.add(lblDatuakBete);
		lblDatuakBete.setVisible(false);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textBidaiarenIzena.getText().equals("")&&!textAreaDeskribapena.getText().equals("")&&comboBoxHerrialde.getSelectedItem()!=null&&comboBoxBidaiarenMota!=null) {
					if (BidaiaHasiera.getDate()!=null&&BidaiaAmaiera.getDate()!=null) {
						if (BidaiaAmaiera.getDate().after(BidaiaHasiera.getDate())) {
							int idBidaia;
							if (bidaiak.size()==0) {
								idBidaia=1;
							} else {
								idBidaia=bidaiak.get(bidaiak.size()-1).getId()+1;
							}
							ArrayList<modelo.POJOak.Zerbitzua> Zerbitzuak = null;
							modelo.POJOak.Bidaia bidaiaBerria = new modelo.POJOak.Bidaia(idBidaia,textBidaiarenIzena.getText(),
									textAreaDeskribapena.toString(),BidaiaHasiera.getDate(),BidaiaAmaiera.getDate(),comboBoxHerrialde.getSelectedItem().toString(),
									comboBoxBidaiarenMota.getSelectedItem().toString(),Zerbitzuak);
							bidaiak.add(bidaiaBerria);
						}
					} else {
						lblDatuakBete.setVisible(true);
					}
				} else {
					lblDatuakBete.setVisible(true);
				}
			}
		});
		btnGorde.setBounds(27, 270, 89, 23);
		contentPane.add(btnGorde);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			}
		});
		btnItzuli.setBounds(189, 270, 89, 23);
		contentPane.add(btnItzuli);
		
		
	}
}