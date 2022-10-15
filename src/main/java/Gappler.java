import java.util.Random;

public class Gappler extends LutadorUFC {
	private int quedasAplicadas;
	private int tentativaQueda;
	
	
	@Override
	public int precisaoGolpe() {
		Random r = new Random();
		return r.nextInt(6)+1;
	}

	@Override
	public int precisaoQueda() {
		Random r = new Random();
		int a = r.nextInt(6)+1;
		int b = r.nextInt(6)+1;
		
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

	public int getQuedasAplicadas() {
		return quedasAplicadas;
	}

	public void setQuedasAplicadas(int quedasAplicadas) {
		this.quedasAplicadas = quedasAplicadas;
	}

	public int getTentativaQueda() {
		return tentativaQueda;
	}

	public void setTentativaQueda(int tentativaQueda) {
		this.tentativaQueda = tentativaQueda;
	}
	
	

}
