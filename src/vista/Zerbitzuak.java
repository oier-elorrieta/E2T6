package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zerbitzuak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Zerbitzuak(String erabiltzaile) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHegaldia = new JButton("Hegaldia");
		btnHegaldia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Hegaldia frame = new Hegaldia(erabiltzaile);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnHegaldia.setBounds(10, 31, 118, 111);
		contentPane.add(btnHegaldia);
		
		JButton btnOstatua = new JButton("Ostatua");
		btnOstatua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Ostatua frame = new Ostatua(erabiltzaile);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnOstatua.setBounds(156, 31, 118, 111);
		contentPane.add(btnOstatua);
		
		JButton btnBesteBatzuk = new JButton("Beste Batzuk");
		btnBesteBatzuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Jarduera frame = new Jarduera(erabiltzaile);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnBesteBatzuk.setBounds(306, 31, 118, 111);
		contentPane.add(btnBesteBatzuk);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							BidaiaketaEkitaldiak frame = new BidaiaketaEkitaldiak(erabiltzaile);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
				});
				dispose();
			}
		});
		btnItzuli.setBounds(156, 184, 118, 32);
		contentPane.add(btnItzuli);
	}
}
