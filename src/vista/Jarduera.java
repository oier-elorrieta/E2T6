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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jarduera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEkitaldiIzena;
	private JTextField textPrezioa;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Jarduera(String erabiltzaile) {
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
		
		JComboBox<String> comboBoxEkitaldiMota = new JComboBox<>();
		comboBoxEkitaldiMota.setBounds(164, 61, 150, 22);
		contentPane.add(comboBoxEkitaldiMota);
		
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
				if(textEkitaldiIzena.getText().equals("")&&comboBoxEkitaldiMota.getSelectedItem()!=null&&textAreaDeskripzioa.getText().equals("")&&textPrezioa.getText().equals("")&&data.getDate()!=null) {
					
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
		btnItzuli.setBounds(164, 275, 89, 23);
		contentPane.add(btnItzuli);
	}
}