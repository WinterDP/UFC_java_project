import java.util.Date;

public abstract class LutadorUFC extends Lutador {
	private LutadorUFC adversario;
	private String apelido;
	private EnumStatus Status;
	private Date estreia;
	private boolean nocauteado;
	private boolean imobilizado;
	private int estamina;
	private int pontos;
	private EstadoLuta estadoLuta;
	private Equipe equipe;
	private CategoriaPeso categoria;
	
	public abstract int precisaoGolpe();
	
	public abstract int precisaoQueda();
	
	public void golpe() {
		chamarGolpe();
	}
	
	public void agarre() {
		chamarAgarre();
	}
	
	public void alterarPostura() {
		estadoLuta.alterarEstadoLuta(this);
	}
	
	public void Dieta(float alteracaoPeso) {
		setPeso(this.getPeso()+alteracaoPeso);
		if(alteracaoPeso>0) {
			System.out.println(this.getNome() + " ganhou " + Math.abs(alteracaoPeso) +" kilos");
		}else if(alteracaoPeso<0) {
			System.out.println(this.getNome() + " perdeu " + Math.abs(alteracaoPeso) +" kilos");
		}
		categoria.alterarCategoria(this);
	}

	public LutadorUFC getAdversario() {
		return adversario;
	}

	public void setAdversario(LutadorUFC adversario) {
		this.adversario = adversario;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public EnumStatus getStatus() {
		return Status;
	}

	public void setStatus(EnumStatus status) {
		Status = status;
	}

	public Date getEstreia() {
		return estreia;
	}

	public void setEstreia(Date estreia) {
		this.estreia = estreia;
	}

	public boolean isNocauteado() {
		return nocauteado;
	}

	public void setNocauteado(boolean nocauteado) {
		this.nocauteado = nocauteado;
	}

	public boolean isImobilizado() {
		return imobilizado;
	}

	public void setImobilizado(boolean imobilizado) {
		this.imobilizado = imobilizado;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public EstadoLuta getEstadoLuta() {
		return estadoLuta;
	}

	public void setEstadoLuta(EstadoLuta estadoLuta) {
		this.estadoLuta = estadoLuta;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public CategoriaPeso getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaPeso categoria) {
		this.categoria = categoria;
	}
	
	
}
