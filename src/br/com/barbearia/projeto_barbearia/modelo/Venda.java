package br.com.barbearia.projeto_barbearia.modelo;
/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */

public class Venda {
  private static int qtdVendas;
	
  public Venda() {
	  qtdVendas += 30;
  }
  
	
	  public static int somaVendas(){
		  return qtdVendas;
		  }
	 
  
  
}
