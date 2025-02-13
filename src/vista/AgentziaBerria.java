package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AgentziaBerria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIzena;
	private JTextField textMarkaKolorea;
	private JTextField textLogoa;
	private JTextField textErabiltzailea;
	private JTextField textPasahitza;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AgentziaBerria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 483);
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
		
		JLabel lblDatuakBete = new JLabel("Datu guztiak bete");
		lblDatuakBete.setForeground(new Color(255, 0, 0));
		lblDatuakBete.setBounds(73, 349, 99, 14);
		contentPane.add(lblDatuakBete);
		lblDatuakBete.setVisible(false);
		
		ArrayList<String> LangileKopuru = modelo.DAOak.MasterData.cargatuLangileKopurua();
		String[] langileKopuruStrings = LangileKopuru.toArray(new String[LangileKopuru.size()]);
		ArrayList<String> LangileKopuruKod = modelo.DAOak.MasterData.cargatuLangileKopuruaKod();
		
		JComboBox<String> comboBoxLangileKopurua = new JComboBox<>();
		comboBoxLangileKopurua.setModel(new DefaultComboBoxModel<>(langileKopuruStrings));
		comboBoxLangileKopurua.setBounds(243, 140, 196, 22);
		contentPane.add(comboBoxLangileKopurua);
		
		ArrayList<String> AgentziaMota = modelo.DAOak.MasterData.cargatuAgentziaMota();
		String[] agentziaMotaStrings = AgentziaMota.toArray(new String[AgentziaMota.size()]);
		ArrayList<String> AgentziaMotaKod = modelo.DAOak.MasterData.cargatuAgentziaMotaKod();
		
		JComboBox<String> comboBoxAgentziaMota = new JComboBox<>();
		comboBoxAgentziaMota.setModel(new DefaultComboBoxModel<>(agentziaMotaStrings));
		comboBoxAgentziaMota.setBounds(243, 182, 196, 22);
		contentPane.add(comboBoxAgentziaMota);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textIzena.getText().equals("")&&!textMarkaKolorea.getText().equals("")&&comboBoxLangileKopurua.getSelectedItem()!=null&&comboBoxAgentziaMota.getSelectedItem()!=null&&!textLogoa.getText().equals("")&&!textErabiltzailea.getText().equals("")&&!textPasahitza.getText().equals("")) {		
					modelo.DAOak.Agentzia.agentziaBerria(textIzena.getText(), textLogoa.getText(), textMarkaKolorea.getText(), textErabiltzailea.getText(),textPasahitza.getText(), AgentziaMotaKod.get(comboBoxAgentziaMota.getSelectedIndex()), LangileKopuruKod.get(comboBoxLangileKopurua.getSelectedIndex()));
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Login frame = new Login();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
	                    }
					});
					dispose();
				} else {
					lblDatuakBete.setVisible(true);
				}
			}
		});
		btnGorde.setBounds(73, 374, 139, 28);
		contentPane.add(btnGorde);
		
		JButton btnUtzi = new JButton("Utzi");
		btnUtzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login frame = new Login();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnUtzi.setBounds(281, 374, 139, 28);
		contentPane.add(btnUtzi);
		
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setFont(new Font("Arial", Font.PLAIN, 17));
		lblPasahitza.setBounds(73, 316, 139, 21);
		contentPane.add(lblPasahitza);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea");
		lblErabiltzailea.setFont(new Font("Arial", Font.PLAIN, 17));
		lblErabiltzailea.setBounds(73, 273, 139, 21);
		contentPane.add(lblErabiltzailea);
		
		textErabiltzailea = new JTextField();
		textErabiltzailea.setColumns(10);
		textErabiltzailea.setBounds(243, 275, 196, 20);
		contentPane.add(textErabiltzailea);
		
		textPasahitza = new JTextField();
		textPasahitza.setColumns(10);
		textPasahitza.setBounds(243, 318, 196, 20);
		contentPane.add(textPasahitza);
	}
}
