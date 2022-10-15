import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private String nome;
	private String sede;
	private List<LutadorUFC> lutadores = new ArrayList<LutadorUFC>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public List<LutadorUFC> getLutadores() {
		return lutadores;
	}
	public void setLutadores(List<LutadorUFC> lutadores) {
		this.lutadores = lutadores;
	}
}
