package entidades;

public class Trabalhador {
	private int id;
	private String nome;
	private double salario;
	
	public Trabalhador() {
		
	}

	public Trabalhador(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumento(double valor) {
		salario += salario*valor/100;
	}

	@Override
	public String toString() {
		return "" + id + ", " + nome + ", " + salario + "\n";
	}
	
	
	

}
