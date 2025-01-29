package controlador;

import javax.swing.SwingUtilities;

import vista.AgentziaBerria;
import vista.BidaiaketaEkitaldiak;
import vista.Login;
import vista.OngiEtorri;

public class Main {
	
	static OngiEtorri ongiEtorri = new OngiEtorri();
	static Login login = new Login();
	static AgentziaBerria agentziaBerria = new AgentziaBerria();
	static BidaiaketaEkitaldiak bidaiaketaEkitaldiak = new BidaiaketaEkitaldiak();

	public static void main(String[] args) {
			 try {
					ongiEtorri.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public static void loginIreki() {
		
		try {
			ongiEtorri.setVisible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			login.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	
	public static void agentziaBerriaIreki() {
			
			try {
				login.setVisible(false);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				agentziaBerria.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
	
	public static void agentziaBerriaUtzi() {
		
		try {
			agentziaBerria.setVisible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			login.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	
	public static void BidaiakIreki() {
		try {
			agentziaBerria.setVisible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bidaiaketaEkitaldiak.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
