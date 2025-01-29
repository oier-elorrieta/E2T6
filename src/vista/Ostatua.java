
package vista;

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
import java.awt.event.ActionEvent;

public class Ostatua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEizena;
	private JTextField textHerria;
	private JTextField textPrezioa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ostatua frame = new Ostatua();
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
	public Ostatua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 260);
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
		
		JLabel lblLogelaMota = new JLabel("Logela Mota:");
		lblLogelaMota.setBounds(27, 97, 110, 14);
		contentPane.add(lblLogelaMota);
		
		JLabel lblJoatekoData = new JLabel("Joateko Data:");
		lblJoatekoData.setBounds(27, 181, 110, 14);
		contentPane.add(lblJoatekoData);
		
		JLabel lblHerria = new JLabel("Herria:");
		lblHerria.setBounds(27, 125, 110, 14);
		contentPane.add(lblHerria);
		
		textEizena = new JTextField();
		textEizena.setBounds(172, 36, 150, 20);
		contentPane.add(textEizena);
		textEizena.setColumns(10);
		
		textHerria = new JTextField();
		textHerria.setColumns(10);
		textHerria.setBounds(172, 122, 120, 20);
		contentPane.add(textHerria);
		
		JComboBox<String> comboBoxEmota = new JComboBox<>();
		comboBoxEmota.setBounds(172, 63, 150, 20);
		contentPane.add(comboBoxEmota);
		
		JComboBox<String> comboBoxIbilbidea = new JComboBox<>();
		
		comboBoxIbilbidea.setModel(new DefaultComboBoxModel<>(new String[] {"Joan", "Joan eta Etorri"}));
		comboBoxIbilbidea.setBounds(172, 91, 165, 20);
		contentPane.add(comboBoxIbilbidea);
		
		textPrezioa = new JTextField();
		textPrezioa.setColumns(10);
		textPrezioa.setBounds(172, 150, 120, 20);
		contentPane.add(textPrezioa);
		
		JLabel lblItzultzekoData = new JLabel("Itzultzeko Data:");
		lblItzultzekoData.setBounds(378, 181, 110, 14);
		contentPane.add(lblItzultzekoData);
		
		JLabel lblPrezioa = new JLabel("Prezioa:");
		lblPrezioa.setBounds(27, 153, 110, 14);
		contentPane.add(lblPrezioa);
		
		JButton btnBidaiaBilatu = new JButton("Bidaia Bilatu");
		btnBidaiaBilatu.setBounds(340, 136, 150, 23);
		contentPane.add(btnBidaiaBilatu);
		
		JDateChooser JoatekoData = new JDateChooser();
		JoatekoData.setBounds(172,181,150,20);
		contentPane.add(JoatekoData);
		
		JDateChooser ItzultzekoData = new JDateChooser();
		ItzultzekoData.setBounds(498, 181, 150, 20);
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
				}
			}
		});
		lblItzultzekoData.setVisible(false);
	}
}
