
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

public class BidaiBerria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEizena;
	private JTextField textEgunak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BidaiBerria frame = new BidaiBerria();
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
	public BidaiBerria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bidaiaren Izena:");
		lblNewLabel.setBounds(27, 39, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEvento = new JLabel("Bidaia Mota:");
		lblEvento.setBounds(27, 66, 110, 14);
		contentPane.add(lblEvento);
		
		JLabel lblBidaiHasiera = new JLabel("Bidai Hasiera:");
		lblBidaiHasiera.setBounds(27, 91, 110, 14);
		contentPane.add(lblBidaiHasiera);
		
		JLabel lblBiadiAmaiera = new JLabel("Biadi Amaiera:");
		lblBiadiAmaiera.setBounds(27, 116, 135, 14);
		contentPane.add(lblBiadiAmaiera);
		
		JLabel lblEgunak = new JLabel("Egunak:");
		lblEgunak.setBounds(27, 141, 135, 14);
		contentPane.add(lblEgunak);
		
		textEizena = new JTextField();
		textEizena.setBounds(189, 39, 150, 20);
		contentPane.add(textEizena);
		textEizena.setColumns(10);
		
		textEgunak = new JTextField();
		textEgunak.setColumns(10);
		textEgunak.setBounds(189, 141, 89, 20);
		contentPane.add(textEgunak);
		
		JComboBox<String> comboBoxEmota = new JComboBox<>();
		comboBoxEmota.setBounds(189, 66, 150, 20);
		contentPane.add(comboBoxEmota);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(189, 172, 200, 63);
		contentPane.add(textArea);
		
		JLabel lblDescribapena = new JLabel("Describapena:");
		lblDescribapena.setBounds(27, 192, 147, 14);
		contentPane.add(lblDescribapena);
		
		JLabel lblNewLabel_1 = new JLabel("Sartu Gabeko Zerbitzuak");
		lblNewLabel_1.setBounds(27, 269, 150, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textSartuGabekoZerbitzuak = new JTextArea();
		textSartuGabekoZerbitzuak.setEditable(false);
		textSartuGabekoZerbitzuak.setBounds(189, 246, 200, 63);
		contentPane.add(textSartuGabekoZerbitzuak);
		
		JDateChooser BidaiaHasiera = new JDateChooser();
		BidaiaHasiera.setBounds(189,91,174,20);
		contentPane.add(BidaiaHasiera);
		
		JDateChooser BidaiaAmaiera = new JDateChooser();
		BidaiaAmaiera.setBounds(189, 116, 174, 20);
		contentPane.add(BidaiaAmaiera);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.setBounds(27, 345, 89, 23);
		contentPane.add(btnGorde);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.setBounds(206, 345, 89, 23);
		contentPane.add(btnItzuli);
	}
}