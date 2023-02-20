package br.com.barbearia.projeto_barbearia.teste;

import java.util.ArrayList;

import br.com.barbearia.projeto_barbearia.modelo.AuxiliarDeLimpeza;
import br.com.barbearia.projeto_barbearia.modelo.Barbeiro;
import br.com.barbearia.projeto_barbearia.modelo.Caixa;
import br.com.barbearia.projeto_barbearia.modelo.Gerente;
import br.com.barbearia.projeto_barbearia.modelo.SistemaInterno;
import br.com.barbearia.projeto_barbearia.modelo.Venda;
/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 */
public class Teste {
 public static void main(String[] args) {
	 Barbeiro joao = new Barbeiro();
	Gerente felipe = new Gerente();
	AuxiliarDeLimpeza lucas = new AuxiliarDeLimpeza();
	Caixa arthur = new Caixa();
	
	joao.setNome("Joao Neto");
	joao.setCpf("953.496.889-12");
	joao.setEmail("joao@gmail.com");
	joao.setIdade(38);
	
	lucas.setNome("Lucas da Silva");
	lucas.setCpf("123.456.789-12");
	lucas.setEmail("arthur@gmail.com");
	lucas.setIdade(28);
	
	arthur.setNome("Arthur Costa");
	arthur.setCpf("123.456.789-12");
	arthur.setEmail("arthur@gmail.com");
	arthur.setIdade(40);
	
	felipe.setNome("Felipe Costa");
	felipe.setCpf("123.456.789-12");
	felipe.setEmail("felipe@gmail.com");
	felipe.setIdade(21);
	
	lucas.setSalario(1200.0, 50.0, 0, 0);
	
	arthur.setSalario(800.0, 70.0, 50.0, 0);
	
	Venda v1 = new Venda();
	Venda v2 = new Venda();
	Venda v3 = new Venda();
	Venda v4 = new Venda();
	Venda v5 = new Venda();
	Venda v6 = new Venda();
	Venda v7 = new Venda();
	Venda v8 = new Venda();
	Venda v9 = new Venda();
	Venda v10 = new Venda();
	Venda v11 = new Venda();
	Venda v12 = new Venda();
	Venda v13 = new Venda();
	Venda v14 = new Venda();
	Venda v15 = new Venda();
	Venda v16 = new Venda();
	Venda v17 = new Venda();
	Venda v18 = new Venda();
	Venda v19 = new Venda();
	Venda v20 = new Venda();
	Venda v21 = new Venda();
	Venda v22 = new Venda();
	Venda v23 = new Venda();
	Venda v24 = new Venda();
	Venda v25 = new Venda();
	Venda v26 = new Venda();
	Venda v27 = new Venda();
	Venda v28 = new Venda();
	Venda v29 = new Venda();
	Venda v30 = new Venda();
	Venda v31 = new Venda();
	Venda v32 = new Venda();
	Venda v33 = new Venda();
	Venda v34 = new Venda();
	Venda v35 = new Venda();
	Venda v36 = new Venda();
	Venda v37 = new Venda();
	Venda v38 = new Venda();
	Venda v39 = new Venda();
	Venda v40 = new Venda();
	Venda v41 = new Venda();
	Venda v42 = new Venda();
	Venda v43 = new Venda();
	
	
	
	felipe.setSenha(12345);
	joao.setSenha(1234);
	
	SistemaInterno login = new SistemaInterno();
	
	login.validacao(felipe);
	login.validacao(joao);
	
	
	System.out.println("A barbearia arrecadou R$: " + Venda.somaVendas() );
	System.out.println(joao.getNome() + ", a sua comissao foi de R$: " + joao.salarioDiario());
	System.out.println(felipe.getNome() + ", a sua comissao foi de R$: " + felipe.salarioDiario());
	}
}
