
//Conceito de sobrecarga de métodos

public class Movimento {
	
	private int eixoX;
	private int eixoY;
	private String nome;

	public Movimento(String nome, int x, int y) {
		
		this.nome = nome;
		this.eixoX = x;
		this.eixoY = y;
	
	}
	
	public Movimento(String nome) {
		
		this(nome,0,0);
		
	}
	
	public Movimento() {
		
		this("Nomeless",0,0);
		
	}
	
	public void setMovimento() {
		
	}
	
	public void getMovimento() {
		
		System.out.print(nome);
		System.out.print(eixoX);
		System.out.print(eixoY);
		
	}
	
}
