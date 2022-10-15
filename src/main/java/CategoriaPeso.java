
public abstract class CategoriaPeso {
	private int lutasNaCategoria;
	
	public abstract void alterarCategoria(LutadorUFC l);

	public int getLutasNaCategoria() {
		return lutasNaCategoria;
	}

	public void setLutasNaCategoria(int lutasNaCategoria) {
		this.lutasNaCategoria = lutasNaCategoria;
	} 
}
