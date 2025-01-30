package controlador;

import java.awt.EventQueue;

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
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	OngiEtorri frame = new OngiEtorri();
                	frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        modelo.POJOak.Agentzia agentzia = new modelo.POJOak.Agentzia();
        agentzia = modelo.DAOak.Agentzia.cargatuAgentziak();
        System.out.println(agentzia.toString());
        
    }
}
