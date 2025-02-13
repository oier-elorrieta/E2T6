package modelo.Gestores;

import java.util.ArrayList;

import modelo.POJOak.Bidaia;

public class Bidaiak {
	
	private ArrayList<modelo.POJOak.Bidaia> Bidaiak;

	public Bidaiak(ArrayList<Bidaia> bidaiak) {
		Bidaiak = bidaiak;
	}

	public ArrayList<modelo.POJOak.Bidaia> getBidaiak() {
		return Bidaiak;
	}

	public void setBidaiak(ArrayList<modelo.POJOak.Bidaia> bidaiak) {
		Bidaiak = bidaiak;
	}	
}
