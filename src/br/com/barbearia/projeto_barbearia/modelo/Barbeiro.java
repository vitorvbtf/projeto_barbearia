package br.com.barbearia.projeto_barbearia.modelo;
/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */

public class Barbeiro extends Funcionario implements Autenticador, Comissao {
	private int senha;
	private int salarioFixo = 800;

	@Override
	public int setSenha(int senha) {
		return this.senha = senha;
	}
	
	@Override
	public boolean autenticador(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double salarioMensal() {
		return Venda.somaVendas() * 0.30 + salarioFixo;
	}
	
	@Override
	public double salarioDiario() {
		return Venda.somaVendas() * 0.30 ;
	}

}
