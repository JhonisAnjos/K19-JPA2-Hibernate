package br.com.k19.testes;

import javax.persistence.Persistence;

public class GerarTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("K21_livraria_pu");
	}
}
