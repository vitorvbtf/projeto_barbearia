package br.com.barbearia.projeto_barbearia.modelo;
/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */
public class AuxiliarDeLimpeza extends Funcionario {
	private double salario;

    public void setSalario(double salario, double inss,  double feriasRemunerado, double decimoTerceiro ) {
		this.salario = salario +  feriasRemunerado + decimoTerceiro;
	}
    
    public double getSalario() {
		return this.salario;
	}
}
