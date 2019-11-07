package entities;

public class Client {
	
	private String name;
	private String cpf;
	private String email;
	
	public Client() {
	}

	public Client(String name, String cpf, String email) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + " (CPF: " + cpf + ") - " + "Email: " + email;
	}
	
	
}
