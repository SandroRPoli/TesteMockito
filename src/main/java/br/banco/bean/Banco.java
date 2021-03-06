package br.banco.bean;

import java.util.List;

import br.banco.dao.ContaDao;
import br.banco.dao.ContaDaoFalso;
import br.banco.dao.Dao;

public class Banco {
	
	private Dao dao;
	private List<Conta> contas;

	public Banco(Dao dao){
		this.dao = dao;
		this.contas = dao.getContas();
	}
	/*
	public void atualizaJuros(double indice){
		for (Conta c : this.contas) {
			double dividendo = c.getSaldo() + (indice * c.getSaldo() / 100); 
			c.deposito(dividendo);
			this.dao.atualizaConta(c);
		}
	}
	*/
	public void atualizaJuros(double indice){
		for (Conta c : this.contas) {
			try {
				double dividendo = c.getSaldo() + (indice * c.getSaldo() / 100); 
				c.deposito(dividendo);
				this.dao.atualizaConta(c);
				
			} catch (RuntimeException e) {
				System.out.println("lancou uma excecao");
			}
		}
	}
	public double totalSaldo(){
		double saldoTotal = 0.0;
		
		for (Conta c : this.contas) {
			saldoTotal += c.getSaldo();
		}
		
		return saldoTotal;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
}