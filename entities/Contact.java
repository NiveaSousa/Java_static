package entities;

public class Contact {
	private String nome;
	private String num;
	
	
	public Contact(String nome, String num) {
		
		this.nome = nome;
		this.num = num;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}
	
	
	
	
}
