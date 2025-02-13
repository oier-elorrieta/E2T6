package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OngiEtorri extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Sortzen du ongietorri frame
	 */
	public OngiEtorri() {
		setTitle("Ongi Etorri");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Botoiarekin pasatzen da Login atalera
		JButton btnOngiEtorri = new JButton("Ongi Etorri");
		btnOngiEtorri.addActionListener(new ActionListener() {
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
		btnOngiEtorri.setFont(new Font("Arial", Font.PLAIN, 23));
		btnOngiEtorri.setBounds(0, 0, 501, 279);
		contentPane.add(btnOngiEtorri);
	}

}
