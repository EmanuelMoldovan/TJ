package entities;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="angajati")
public class Angajat {
	
	@Id @GeneratedValue
	private int id;
	
	private String nume;
	
	private String firma;
	
	private String functie;
	
	@Temporal(TemporalType.DATE)
	private Calendar data_angajarii;
	
	@OneToMany(mappedBy="ang")
	@Cascade(CascadeType.ALL)
	private Set<Curs> cursuri;

	public Angajat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Angajat(int id, String nume, String firma, String functie, Calendar data_angajarii, Set<Curs> cursuri) {
		super();
		this.id = id;
		this.nume = nume;
		this.firma = firma;
		this.functie = functie;
		this.data_angajarii = data_angajarii;
		this.cursuri = cursuri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public Calendar getData_angajarii() {
		return data_angajarii;
	}

	public void setData_angajarii(Calendar data_angajarii) {
		this.data_angajarii = data_angajarii;
	}

	public Set<Curs> getCursuri() {
		return cursuri;
	}

	public void setCursuri(Set<Curs> cursuri) {
		this.cursuri = cursuri;
	}
	
	
}
