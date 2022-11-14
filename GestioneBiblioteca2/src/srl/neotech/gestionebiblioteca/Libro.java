package srl.neotech.gestionebiblioteca;

public class Libro {
	
	private Integer idLibro;
	private String titolo;
	private String autore;
	private Sezione sezione;
	private Integer scaffale;
	
	
	
	
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titolo=" + titolo + ", autore=" + autore + ", sezione=" + sezione
				+ ", scaffale=" + scaffale + "]";
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
	public Sezione getSezione() {
		return sezione;
	}
	public void setSezione(Sezione sezione) {
		this.sezione = sezione;
	}
	public Integer getScaffale() {
		return scaffale;
	}
	public void setScaffale(Integer scaffale) {
		this.scaffale = scaffale;
	}
	
	
	

}
