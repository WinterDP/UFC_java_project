
public class NoChao implements EstadoLuta {

	public void alterarEstadoLuta(LutadorUFC l) {
		if(l.getEstamina() >2) {
			l.setEstamina(2);
			l.setEstadoLuta(new EmPe());
			l.getAdversario().setEstamina(2);
			l.getAdversario().setEstadoLuta(new EmPe());
			System.out.println(l.getNome() + " se levanta, a luta volta a ficar em pe");			
		}
	}

}
