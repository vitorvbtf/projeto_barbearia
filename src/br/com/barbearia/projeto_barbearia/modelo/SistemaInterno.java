package br.com.barbearia.projeto_barbearia.modelo;
/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */

public class SistemaInterno  {
private int senha = 1234;
	
	public boolean validacao(Autenticador x) {
		boolean verificador = x.autenticador(this.senha);
		if(verificador) {
			System.out.println("Seja bem vindo, voce foi autorizado a entrar no sistema interno");
			return true;
		} else {
			System.out.println("Senha incorreta, voce nao foi autorizado a entrar no sistema interno");
			return false;
		}
	}
	
	
}
