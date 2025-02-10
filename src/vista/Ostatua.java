
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ostatua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEIzena;
	private JTextField textHerria;
	private JTextField textPrezioa;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ostatua(String erabiltzaile) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 290);
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
		
		textEIzena = new JTextField();
		textEIzena.setBounds(172, 36, 150, 20);
		contentPane.add(textEIzena);
		textEIzena.setColumns(10);
		
		textHerria = new JTextField();
		textHerria.setColumns(10);
		textHerria.setBounds(172, 122, 120, 20);
		contentPane.add(textHerria);
		
		JComboBox<String> comboBoxEMota = new JComboBox<>();
		comboBoxEMota.setBounds(172, 63, 150, 20);
		contentPane.add(comboBoxEMota);
		
		JComboBox<String> comboBoxLogelaMota = new JComboBox<>();
		comboBoxLogelaMota.setBounds(172, 91, 165, 20);
		contentPane.add(comboBoxLogelaMota);
		
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
		
		JLabel lblDatuakBete = new JLabel("Datu guztiak bete");
		lblDatuakBete.setForeground(new Color(255, 0, 0));
		lblDatuakBete.setBounds(378, 216, 99, 14);
		contentPane.add(lblDatuakBete);
		lblDatuakBete.setVisible(false);
		
		JDateChooser JoatekoData = new JDateChooser();
		JoatekoData.setBounds(172,181,150,20);
		contentPane.add(JoatekoData);
		
		JDateChooser ItzultzekoData = new JDateChooser();
		ItzultzekoData.setBounds(498, 181, 150, 20);
		contentPane.add(ItzultzekoData);
		
		JButton btnBidaiaBilatu = new JButton("Bidaia Bilatu");
		btnBidaiaBilatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBidaiaBilatu.setBounds(340, 136, 150, 23);
		contentPane.add(btnBidaiaBilatu);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.addActionListener(new ActionListener() {
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
		btnItzuli.setBounds(172, 212, 89, 23);
		contentPane.add(btnItzuli);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textEIzena.getText().equals("")&&comboBoxEMota.getSelectedItem()!=null&&comboBoxLogelaMota.getSelectedItem()!=null&&textHerria.getText().equals("")&&textPrezioa.getText().equals("")&&JoatekoData.getDate()!=null&&ItzultzekoData.getDate()!=null) {
					
				} else {
					lblDatuakBete.setVisible(true);
				}
			}
		});
		btnGorde.setBounds(27, 212, 89, 23);
		contentPane.add(btnGorde);
	}
}
