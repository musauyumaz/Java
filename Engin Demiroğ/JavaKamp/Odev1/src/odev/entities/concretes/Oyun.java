package odev.entities.concretes;

public class Oyun {
	private int id;
	private String isim;
	private double �cret;
	
	public Oyun(int id, String isim, double �cret) {
		super();
		this.id = id;
		this.isim = isim;
		this.�cret = �cret;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double get�cret() {
		return �cret;
	}

	public void set�cret(double �cret) {
		this.�cret = �cret;
	}
}
