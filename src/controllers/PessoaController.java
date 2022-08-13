package controllers;

import java.util.Scanner;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {

	public void CadastrarPessoa() {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("\n ** CADASTRO DE PESSOA ** \n");
			
			Pessoa pessoa = new Pessoa();
			
			System.out.print("\nEntre com o Nome da pessoa.....:");
			pessoa.setNome(sc.nextLine());
			
			System.out.print("\nEntre com o CPF da pessoa......:");
			pessoa.setCpf(sc.nextLine());
			
			System.out.println("\nEntre com o EMAIL da pessoa..:");
			pessoa.setEmail(sc.nextLine());
			
			PessoaRepository pessoaRepository = new PessoaRepository();
			pessoaRepository.create(pessoa);
			
			System.out.println("\nPessoa cadastrada com sucesso.");
			
		}
		catch(Exception e) {
			
			System.out.println("\n Erro: " + e.getMessage());
		}
		
	}

}
