package br.com.barbearia.projeto_barbearia.modelo;
/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */
public class ControleDeAutenticacao  {

	private int senha;

	public int setSenha(int senha) {
		return this.senha = senha;
	}

	public boolean autenticador(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
