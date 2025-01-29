package vista;

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jarduera frame = new Jarduera();
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
	public Jarduera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 530);
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
		lblDeskripzioa.setBounds(46, 146, 147, 14);
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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(164, 96, 150, 63);
		contentPane.add(textArea);
		
		JComboBox<String> comboBoxEkitaldiMota = new JComboBox<>();
		comboBoxEkitaldiMota.setBounds(164, 61, 150, 22);
		contentPane.add(comboBoxEkitaldiMota);
		
		JDateChooser data = new JDateChooser();
		data.setBounds(164, 227, 150, 20);
		contentPane.add(data);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(data.getDate());
			}
		});
		btnNewButton.setBounds(10, 457, 89, 23);
		contentPane.add(btnNewButton);
	}
}