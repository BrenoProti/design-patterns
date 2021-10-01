package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}

}
