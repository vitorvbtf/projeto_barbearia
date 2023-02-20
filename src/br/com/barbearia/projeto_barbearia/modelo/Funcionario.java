package br.com.barbearia.projeto_barbearia.modelo;

/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */

public abstract class Funcionario {
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String telefone;
    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    
}
