package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AgentziaBerria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIzena;
	private JTextField textMarkaKolorea;
	private JTextField textLogoa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentziaBerria frame = new AgentziaBerria();
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
	public AgentziaBerria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIzena = new JLabel("Agentziaren izena");
		lblIzena.setFont(new Font("Arial", Font.PLAIN, 17));
		lblIzena.setBounds(73, 50, 139, 21);
		contentPane.add(lblIzena);
		
		JLabel lblMarkaKolorea = new JLabel("Marka kolorea");
		lblMarkaKolorea.setFont(new Font("Arial", Font.PLAIN, 17));
		lblMarkaKolorea.setBounds(73, 93, 139, 21);
		contentPane.add(lblMarkaKolorea);
		
		JLabel lblLangileKopurua = new JLabel("Langile kopurua");
		lblLangileKopurua.setFont(new Font("Arial", Font.PLAIN, 17));
		lblLangileKopurua.setBounds(73, 139, 139, 21);
		contentPane.add(lblLangileKopurua);
		
		JLabel lblAgentziaMota = new JLabel("Agentzia mota");
		lblAgentziaMota.setFont(new Font("Arial", Font.PLAIN, 17));
		lblAgentziaMota.setBounds(73, 181, 139, 21);
		contentPane.add(lblAgentziaMota);
		
		JLabel lblLogoa = new JLabel("Logoa");
		lblLogoa.setFont(new Font("Arial", Font.PLAIN, 17));
		lblLogoa.setBounds(73, 228, 139, 21);
		contentPane.add(lblLogoa);
		
		textIzena = new JTextField();
		textIzena.setBounds(243, 52, 196, 20);
		contentPane.add(textIzena);
		textIzena.setColumns(10);
		
		textMarkaKolorea = new JTextField();
		textMarkaKolorea.setColumns(10);
		textMarkaKolorea.setBounds(243, 95, 196, 20);
		contentPane.add(textMarkaKolorea);
		
		textLogoa = new JTextField();
		textLogoa.setColumns(10);
		textLogoa.setBounds(243, 230, 196, 20);
		contentPane.add(textLogoa);
		
		JComboBox comboBoxLangileKopurua = new JComboBox();
		comboBoxLangileKopurua.setBounds(243, 140, 196, 22);
		contentPane.add(comboBoxLangileKopurua);
		
		JComboBox comboBoxAgentziaMota = new JComboBox();
		comboBoxAgentziaMota.setBounds(243, 182, 196, 22);
		contentPane.add(comboBoxAgentziaMota);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.setBounds(101, 291, 139, 28);
		contentPane.add(btnGorde);
		
		JButton btnUtzi = new JButton("Utzi");
		btnUtzi.setBounds(281, 291, 139, 28);
		contentPane.add(btnUtzi);
	}
}
