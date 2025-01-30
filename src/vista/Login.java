package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Main;
import modelo.DAOak.Agentzia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAgentzia;
	private JTextField textPasahitza;


	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgentzia = new JLabel("Agentzia");
		lblAgentzia.setFont(new Font("Arial", Font.PLAIN, 17));
		lblAgentzia.setBounds(108, 51, 88, 27);
		contentPane.add(lblAgentzia);
		
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setFont(new Font("Arial", Font.PLAIN, 17));
		lblPasahitza.setBounds(108, 108, 88, 27);
		contentPane.add(lblPasahitza);
		
		textAgentzia = new JTextField();
		textAgentzia.setBounds(204, 56, 220, 20);
		contentPane.add(textAgentzia);
		textAgentzia.setColumns(10);
		
		textPasahitza = new JTextField();
		textPasahitza.setColumns(10);
		textPasahitza.setBounds(206, 113, 220, 20);
		contentPane.add(textPasahitza);
		
		JButton btnSaioaHazi = new JButton("Saioa hazi");
		btnSaioaHazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textAgentzia.getText().equals("admin") && textAgentzia.getText().equals("admin")) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								BidaiaketaEkitaldiak frame = new BidaiaketaEkitaldiak();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
	                    }
					});
					dispose();
					
				}
			}
		});
		btnSaioaHazi.setFont(new Font("Arial", Font.PLAIN, 17));
		btnSaioaHazi.setBounds(75, 161, 158, 23);
		contentPane.add(btnSaioaHazi);
		
		JButton btnAgentziaBerria = new JButton("Agentzia berria");
		btnAgentziaBerria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				dispose();
			}
		});
		btnAgentziaBerria.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAgentziaBerria.setBounds(268, 161, 158, 23);
		contentPane.add(btnAgentziaBerria);
	}

}
