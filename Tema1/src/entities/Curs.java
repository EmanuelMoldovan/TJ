package entities;

import javax.persistence.*;

@Entity
@Table(name="cursuri")
public class Curs {
	
	@Id @GeneratedValue	
	private int id;
	
	private String denumire;
	private int numar_ore;
	private int valoare;
	private String diploma;
	private int anul;
	
	@JoinColumn(name = "id_angajat")
	private Angajat ang;

	public Curs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curs(int id, String denumire, int numar_ore, int valoare, String diploma, int anul, Angajat ang) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.numar_ore = numar_ore;
		this.valoare = valoare;
		this.diploma = diploma;
		this.anul = anul;
		this.ang = ang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public int getNumar_ore() {
		return numar_ore;
	}

	public void setNumar_ore(int numar_ore) {
		this.numar_ore = numar_ore;
	}

	public int getValoare() {
		return valoare;
	}

	public void setValoare(int valoare) {
		this.valoare = valoare;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public int getAnul() {
		return anul;
	}

	public void setAnul(int anul) {
		this.anul = anul;
	}

	public Angajat getAng() {
		return ang;
	}

	public void setAng(Angajat ang) {
		this.ang = ang;
	} 
	
	
}
