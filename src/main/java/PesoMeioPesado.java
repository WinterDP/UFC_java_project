
public class PesoMeioPesado extends CategoriaPeso {

	@Override
	public void alterarCategoria(LutadorUFC l) {
		if(l.getPeso() > 93.0) {
			l.setCategoria(null);
		}else if(l.getPeso() < 88.0){
			System.out.println(l.getNome() + " desceu para a categoria peso medio");
			l.setCategoria(new PesoMedio());
			l.getCategoria().alterarCategoria(l);
		}
		
	}

}
