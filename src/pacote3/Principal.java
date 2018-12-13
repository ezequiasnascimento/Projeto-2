package pacote3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import pacote1.Funcionario;
import pacote1.Pessoa;
import pacote2.Gerente;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		while(true) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			System.out.println("Opção: ");
			String opcao = teclado.nextLine();
			if(opcao.equals("1")) {
				System.out.println("1 - Pessoa");
				System.out.println("2 - Funcionario");
				System.out.println("3 - Gerente");
				System.out.println("4 - Supervisor");
				System.out.println("Opção: ");
				
				if(opcao.equals("1")) {
					System.out.println("Nome: ");
					String nome = teclado.nextLine();
					System.out.println("CPF: ");
					String cpf = teclado.nextLine();
					
					Pessoa p = new Pessoa();
					p.setNome(nome);
					p.setCpf(cpf);
					lista.add(p);
					
				}else if(opcao.equals("2")) {
					System.out.println("Nome: ");
					String nome = teclado.nextLine();
					System.out.println("CPF: ");
					String cpf = teclado.nextLine();
					System.out.println("Macritula: ");
					String matricula = teclado.nextLine();
					System.out.println("salario: ");
					double salario = teclado.nextDouble();
					teclado.nextLine();

					Funcionario f = new Funcionario();
					f.setNome(nome);
					f.setCpf(cpf);
					f.setMatricula(matricula);
					f.setSalario(salario);
					lista.add(f);
						
				}else if(opcao.equals("3")) {
					System.out.println("Nome: ");
					String nome = teclado.nextLine();
					System.out.println("CPF: ");
					String cpf = teclado.nextLine();
					System.out.println("Macritula: ");
					String matricula = teclado.nextLine();
					System.out.println("tipo: ");
					double tipo = teclado.nextDouble();
					teclado.nextLine();

					Gerente g = new Gerente();
					g.setNome(nome);
					g.setCpf(cpf);
					g.setMatricula(matricula);
					g.setTipo(tipo);
					lista.add(g);
				}else if(opcao.equals("4")) {
					System.out.println("Nome: ");
					String nome = teclado.nextLine();
					System.out.println("CPF: ");
					String cpf = teclado.nextLine();
					System.out.println("Macritula: ");
					String matricula = teclado.nextLine();
					System.out.println("Formação: ");
					double formacao = teclado.nextDouble();
					teclado.nextLine();

					Supervisor s = new Supervisor();
					s.setNome(nome);
					s.setCpf(cpf);
					s.setMatricula(matricula);
					s.setFormacao(formacao);
					lista.add(s);
					break;
				}else {
				System.out.println("opção inválida!!");
				}
						
			}	
			else if(opcao.equals("2")) {
				
			}else if(opcao.equals("3")) {
				break;

			}else {
				System.out.println("opção inválida!!");
				
				
			if (opcao.equals("1")) {
				System.out.println("listagem de pessoas selecionadas!");
				for (Pessoa pessoa: lista) {
					System.out.println(pessoa.getNome());
					System.out.println(pessoa.getCpf());
				}	
			
				
			if (opcao.equals("2")) {
				System.out.println("listagem de pessoas selecionadas!");
				for (Pessoa pessoa: lista) {
					if (pessoa instanceof Funcionario) {
						System.out.println(pessoa.getNome());
						System.out.println(pessoa.getCpf());
						Funcionario f = ((Funcionario) pessoa);
						System.out.println(f.getNome());
						System.out.println(f.getCpf());
					}	
				}		
			if (opcao.equals("3")) {
				System.out.println("listagem de funcionarios selecionadas!");
				for (Pessoa pessoa: lista) {
					if (pessoa instanceof Funcionario) {
						System.out.println(pessoa.getNome());
						System.out.println(pessoa.getCpf());
						Funcionario f = ((Funcionario) pessoa);
						System.out.println(f.getNome());
						System.out.println(f.getCpf());
					}		
				}
			}
		}
	}
}			
