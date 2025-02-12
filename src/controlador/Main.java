package controlador;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

import modelo.POJOak.Bidaia;
import vista.AgentziaBerria;
import vista.BidaiaketaEkitaldiak;
import vista.Login;
import vista.OngiEtorri;

public class Main {
	
	static OngiEtorri ongiEtorri = new OngiEtorri();

	//Programa hasieratzen du eta lehengo JFrame erakusten du
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
    }
}
