package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 10L);
		
		if(cliente != null) {
			System.out.println("Nome: "+ cliente.getNome());
			System.out.println("Nome: "+ cliente.getProfissao());
			System.out.println("Nome: "+ cliente.getSexo());
			System.out.println("Nome: "+ cliente.getIdade());
		}else {
			System.out.println("Cliente não existe!");
		}
		
	}

}
