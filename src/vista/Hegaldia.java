
package vista;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Hegaldia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textHIzena;
	private JTextField textHegaldiKod;
	private JTextField textIrteeraOrdua;
	private JTextField textIraupena;
	private JTextField textIraupenaItzuli;
	private JTextField textItzuleraOrdua;
	private JTextField textPrezioTotala;
	private JTextField textAerolineaItzuli;
	private JTextField textHegaldiKodItzuli;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Hegaldia(String erabiltzaile) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ekitaldiaren Izena:");
		lblNewLabel.setBounds(27, 41, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEvento = new JLabel("Ekitaldi Mota:");
		lblEvento.setBounds(27, 69, 110, 14);
		contentPane.add(lblEvento);
		
		JLabel lblTrayekto = new JLabel("Ibilbidea:");
		lblTrayekto.setBounds(27, 97, 110, 14);
		contentPane.add(lblTrayekto);
		
		JLabel lblJatorrizkoAireportua = new JLabel("Jatorrizko Aireportua:");
		lblJatorrizkoAireportua.setBounds(27, 183, 135, 14);
		contentPane.add(lblJatorrizkoAireportua);
		
		JLabel lblHelmugakoAireportua = new JLabel("Helmugako Aireportua:");
		lblHelmugakoAireportua.setBounds(27, 211, 135, 14);
		contentPane.add(lblHelmugakoAireportua);
		
		JLabel lblJoatekoData = new JLabel("Joateko Data:");
		lblJoatekoData.setBounds(27, 241, 110, 14);
		contentPane.add(lblJoatekoData);
		
		JLabel lblHegaldikodeaJoan = new JLabel("Hegaldi-Kodea:");
		lblHegaldikodeaJoan.setBounds(27, 270, 110, 14);
		contentPane.add(lblHegaldikodeaJoan);
		
		JLabel lblAerolinea = new JLabel("Aerolinea:");
		lblAerolinea.setBounds(27, 298, 110, 14);
		contentPane.add(lblAerolinea);
		
		JLabel lblIrteeraOrdua = new JLabel("Irteera Ordua");
		lblIrteeraOrdua.setBounds(27, 326, 110, 14);
		contentPane.add(lblIrteeraOrdua);
		
		JLabel lblIraupena = new JLabel("Iraupena:");
		lblIraupena.setBounds(27, 354, 110, 14);
		contentPane.add(lblIraupena);
		
		textHIzena = new JTextField();
		textHIzena.setBounds(172, 36, 150, 20);
		contentPane.add(textHIzena);
		textHIzena.setColumns(10);
		
		textHegaldiKod = new JTextField();
		textHegaldiKod.setColumns(10);
		textHegaldiKod.setBounds(172, 267, 150, 20);
		contentPane.add(textHegaldiKod);
		
		textIrteeraOrdua = new JTextField();
		textIrteeraOrdua.setColumns(10);
		textIrteeraOrdua.setBounds(172, 323, 150, 20);
		contentPane.add(textIrteeraOrdua);
		
		textIraupena = new JTextField();
		textIraupena.setColumns(10);
		textIraupena.setBounds(172, 351, 150, 20);
		contentPane.add(textIraupena);
		
		JComboBox<String> comboBoxHMota = new JComboBox<>();
		comboBoxHMota.setBounds(172, 63, 150, 20);
		contentPane.add(comboBoxHMota);
		
		JComboBox<String> comboBoxIbilbidea = new JComboBox<>();
		
		comboBoxIbilbidea.setModel(new DefaultComboBoxModel<>(new String[] {"Joan", "Joan eta Etorri"}));
		comboBoxIbilbidea.setBounds(172, 91, 150, 20);
		contentPane.add(comboBoxIbilbidea);
		
		JComboBox<String> comboBoxHelmugakoAireportua = new JComboBox<>();
		ArrayList<String> aireportuak = modelo.DAOak.MasterData.cargatuAireportuak();
		comboBoxHelmugakoAireportua.setModel(new DefaultComboBoxModel<>());
		comboBoxHelmugakoAireportua.setBounds(172, 208, 150, 20);
		contentPane.add(comboBoxHelmugakoAireportua);
		
		JComboBox<String> comboBoxJatorrizkoaireportua = new JComboBox<>();
		comboBoxJatorrizkoaireportua.setModel(new DefaultComboBoxModel<>());
		comboBoxJatorrizkoaireportua.setBounds(172, 180, 150, 20);
		contentPane.add(comboBoxJatorrizkoaireportua);
		
		textIraupenaItzuli = new JTextField();
		textIraupenaItzuli.setColumns(10);
		textIraupenaItzuli.setBounds(493, 351, 150, 20);
		contentPane.add(textIraupenaItzuli);
		
		textItzuleraOrdua = new JTextField();
		textItzuleraOrdua.setColumns(10);
		textItzuleraOrdua.setBounds(493, 323, 150, 20);
		contentPane.add(textItzuleraOrdua);
		
		textPrezioTotala = new JTextField();
		textPrezioTotala.setColumns(10);
		textPrezioTotala.setBounds(172, 400, 150, 20);
		contentPane.add(textPrezioTotala);
		
		textAerolineaItzuli = new JTextField();
		textAerolineaItzuli.setColumns(10);
		textAerolineaItzuli.setBounds(493, 295, 150, 20);
		contentPane.add(textAerolineaItzuli);
		
		textHegaldiKodItzuli = new JTextField();
		textHegaldiKodItzuli.setColumns(10);
		textHegaldiKodItzuli.setBounds(493, 267, 150, 20);
		contentPane.add(textHegaldiKodItzuli);
		
		JComboBox<String> comboBoxHelmugakoAireportuaItzuli = new JComboBox<>();
		comboBoxHelmugakoAireportuaItzuli.setModel(new DefaultComboBoxModel<>());
		comboBoxHelmugakoAireportuaItzuli.setBounds(493, 208, 150, 20);
		contentPane.add(comboBoxHelmugakoAireportuaItzuli);
		
		JComboBox<String> comboBoxJatorrizkoaireportuaItzuli = new JComboBox<>();
		comboBoxJatorrizkoaireportuaItzuli.setModel(new DefaultComboBoxModel<>());
		comboBoxJatorrizkoaireportuaItzuli.setBounds(493, 180, 150, 20);
		contentPane.add(comboBoxJatorrizkoaireportuaItzuli);
		
		JLabel lblJatorrizkoAireportuaItzuli = new JLabel("Jatorrizko Aireportua:");
		lblJatorrizkoAireportuaItzuli.setBounds(343, 183, 140, 14);
		contentPane.add(lblJatorrizkoAireportuaItzuli);
		
		JLabel lblHelmugakoAireportuaItzuli = new JLabel("Helmugako Aireportua:");
		lblHelmugakoAireportuaItzuli.setBounds(343, 211, 140, 14);
		contentPane.add(lblHelmugakoAireportuaItzuli);
		
		JLabel lblItzultzekoData = new JLabel("Itzultzeko Data:");
		lblItzultzekoData.setBounds(343, 242, 110, 14);
		contentPane.add(lblItzultzekoData);
		
		JLabel lblHegaldikodeaItzuli = new JLabel("Hegaldi-Kodea:");
		lblHegaldikodeaItzuli.setBounds(343, 270, 110, 14);
		contentPane.add(lblHegaldikodeaItzuli);
		
		JLabel lblAerolineaItzuli = new JLabel("Aerolinea Itzuli:");
		lblAerolineaItzuli.setBounds(343, 298, 110, 14);
		contentPane.add(lblAerolineaItzuli);
		
		JLabel lblPrezioTotala = new JLabel("Prezio totala:");
		lblPrezioTotala.setBounds(27, 403, 110, 14);
		contentPane.add(lblPrezioTotala);
		
		JLabel lblItzuleraOrdua = new JLabel("Itzulera Ordua");
		lblItzuleraOrdua.setBounds(343, 326, 110, 14);
		contentPane.add(lblItzuleraOrdua);
		
		JLabel lblIraupenaItzuli = new JLabel("Iraupena Itzuli:");
		lblIraupenaItzuli.setBounds(343, 354, 110, 14);
		contentPane.add(lblIraupenaItzuli);
		
		JLabel lblJoan = new JLabel("JOAN:");
		lblJoan.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJoan.setBounds(27, 138, 46, 14);
		contentPane.add(lblJoan);
		
		JLabel lblEtorri = new JLabel("ETORRI:");
		lblEtorri.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEtorri.setBounds(343, 138, 46, 14);
		contentPane.add(lblEtorri);
		
		JButton btnBidaiaBilatu = new JButton("Bidaia Bilatu");
		btnBidaiaBilatu.setBounds(455, 90, 150, 23);
		contentPane.add(btnBidaiaBilatu);
		
		JLabel lblDatuakBete = new JLabel("Datu guztiak bete");
		lblDatuakBete.setForeground(new Color(255, 0, 0));
		lblDatuakBete.setBounds(539, 461, 99, 14);
		contentPane.add(lblDatuakBete);
		lblDatuakBete.setVisible(false);
		
		JDateChooser JoatekoData = new JDateChooser();
		JoatekoData.setBounds(172,239,150,20);
		contentPane.add(JoatekoData);
		
		JDateChooser ItzultzekoData = new JDateChooser();
		ItzultzekoData.setBounds(493, 235, 150, 20);
		contentPane.add(ItzultzekoData);
		
		comboBoxIbilbidea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxIbilbidea.getSelectedItem().equals("Joan eta Etorri")) {
					lblEtorri.setVisible(true);
					lblJatorrizkoAireportuaItzuli.setVisible(true);
					lblHelmugakoAireportuaItzuli.setVisible(true);
					lblItzultzekoData.setVisible(true);
					lblHegaldikodeaItzuli.setVisible(true);
					lblAerolineaItzuli.setVisible(true);
					lblItzuleraOrdua.setVisible(true);
					lblIraupenaItzuli.setVisible(true);
					comboBoxJatorrizkoaireportuaItzuli.setVisible(true);
					comboBoxHelmugakoAireportuaItzuli.setVisible(true);
					ItzultzekoData.setVisible(true);
					textHegaldiKodItzuli.setVisible(true);
					textAerolineaItzuli.setVisible(true);
					textItzuleraOrdua.setVisible(true);
					textIraupenaItzuli.setVisible(true);
					ItzultzekoData.setVisible(true);
				} else {
					lblEtorri.setVisible(false);
					lblJatorrizkoAireportuaItzuli.setVisible(false);
					lblHelmugakoAireportuaItzuli.setVisible(false);
					lblItzultzekoData.setVisible(false);
					lblHegaldikodeaItzuli.setVisible(false);
					lblAerolineaItzuli.setVisible(false);
					lblItzuleraOrdua.setVisible(false);
					lblIraupenaItzuli.setVisible(false);
					comboBoxJatorrizkoaireportuaItzuli.setVisible(false);
					comboBoxHelmugakoAireportuaItzuli.setVisible(false);
					ItzultzekoData.setVisible(false);
					textHegaldiKodItzuli.setVisible(false);
					textAerolineaItzuli.setVisible(false);
					textItzuleraOrdua.setVisible(false);
					textIraupenaItzuli.setVisible(false);
					ItzultzekoData.setVisible(false);
				}
			}
		});
		
		lblEtorri.setVisible(false);
		lblJatorrizkoAireportuaItzuli.setVisible(false);
		lblHelmugakoAireportuaItzuli.setVisible(false);
		lblItzultzekoData.setVisible(false);
		lblHegaldikodeaItzuli.setVisible(false);
		lblAerolineaItzuli.setVisible(false);
		lblItzuleraOrdua.setVisible(false);
		lblIraupenaItzuli.setVisible(false);
		comboBoxJatorrizkoaireportuaItzuli.setVisible(false);
		comboBoxHelmugakoAireportuaItzuli.setVisible(false);
		textHegaldiKodItzuli.setVisible(false);
		textAerolineaItzuli.setVisible(false);
		textItzuleraOrdua.setVisible(false);
		textIraupenaItzuli.setVisible(false);
		ItzultzekoData.setVisible(false);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBoxIbilbidea.getSelectedItem().equals("Joan")) {
					if (textHIzena.getText().equals("")&&comboBoxHMota.getSelectedItem()!=null&&comboBoxIbilbidea.getSelectedItem()!=null&&comboBoxJatorrizkoaireportua.getSelectedItem()!=null&&comboBoxHelmugakoAireportua.getSelectedItem()!=null&&JoatekoData.getDate()!=null&&textHegaldiKod.getText().equals("")&&textIrteeraOrdua.getText().equals("")&&textIraupena.getText().equals("")&&textPrezioTotala.getText().equals("")) {				
						try {
							@SuppressWarnings("unused")
							int prezioa = Integer.parseInt(textPrezioTotala.getText());
							
						} catch (Exception e2) {
							lblDatuakBete.setText("Prezioa zenbaki bat izan behar da");
							lblDatuakBete.setVisible(true);
						}
					} else {
						lblDatuakBete.setText("Datu guztiak bete");
						lblDatuakBete.setVisible(true);
					}
				} else {
					if (textHIzena.getText().equals("")&&comboBoxHMota.getSelectedItem()!=null&&comboBoxIbilbidea.getSelectedItem()!=null&&comboBoxJatorrizkoaireportua.getSelectedItem()!=null&&comboBoxHelmugakoAireportua.getSelectedItem()!=null&&JoatekoData.getDate()!=null&&textHegaldiKod.getText().equals("")&&textIrteeraOrdua.getText().equals("")&&textIraupena.getText().equals("")&&textPrezioTotala.getText().equals("")&&comboBoxJatorrizkoaireportuaItzuli.getSelectedItem()!=null&&comboBoxHelmugakoAireportuaItzuli.getSelectedItem()!=null&&ItzultzekoData.getDate()!=null&&textHegaldiKodItzuli.getText().equals("")&&textAerolineaItzuli.getText().equals("")&&textItzuleraOrdua.getText().equals("")&&textIraupenaItzuli.getText().equals("")) {						
						try {
							@SuppressWarnings("unused")
							int prezioa = Integer.parseInt(textPrezioTotala.getText());
							
						} catch (Exception e2) {
							lblDatuakBete.setText("Prezioa zenbaki bat izan behar da");
						}
					} else {
						lblDatuakBete.setText("Datu guztiak bete");
						lblDatuakBete.setVisible(true);
					}
				}
			}
		});
		btnGorde.setBounds(27, 457, 89, 23);
		contentPane.add(btnGorde);
		
		JButton btnUtzi = new JButton("Utzi");
		btnUtzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Zerbitzuak frame = new Zerbitzuak(erabiltzaile);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnUtzi.setBounds(147, 457, 89, 23);
		contentPane.add(btnUtzi);
	}
}
