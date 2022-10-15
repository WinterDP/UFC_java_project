import java.util.Random;

public class Striker extends LutadorUFC {
	private int golpesContectados;
	private int golpesDesferidos;

	@Override
	public int precisaoGolpe() {
		Random r = new Random();
		int a = r.nextInt(6)+1;
		int b = r.nextInt(6)+1;
		
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

	@Override
	public int precisaoQueda() {
		Random r = new Random();
		return r.nextInt(6)+1;
	}

	public int getGolpesContectados() {
		return golpesContectados;
	}

	public void setGolpesContectados(int golpesContectados) {
		this.golpesContectados = golpesContectados;
	}

	public int getGolpesDesferidos() {
		return golpesDesferidos;
	}

	public void setGolpesDesferidos(int golpesDesferidos) {
		this.golpesDesferidos = golpesDesferidos;
	}

	
}
