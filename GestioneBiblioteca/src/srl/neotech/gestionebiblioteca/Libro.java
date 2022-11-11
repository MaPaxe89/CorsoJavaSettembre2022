package srl.neotech.gestionebiblioteca;

public class Libro {
	
	private Integer idLibro;
	private String titolo;
	private String autore;
	private String sezione;
	private String scaffale;
	
	
	
	
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titolo=" + titolo + ", autore=" + autore + ", sezione=" + sezione + "]";
	}


	// costruttore  libro	
	public Libro(Integer idLibro) {
		super();
		this.idLibro = idLibro;
	}
	
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	
	
	
	

}
