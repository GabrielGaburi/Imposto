package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoa;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		List<Pessoa> lista = new ArrayList<>();

		System.out.print("Digíte o número de pagantes: \n");
		int num = leia.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println("Pagante nº " + i);
			System.out.print("É uma pessoa fisíca ou juridica (f / j)? \n");
			char opcao = leia.next().charAt(0);
			leia.nextLine();
			System.out.print("Digíte o nome: \n");
			String nome = leia.nextLine();
			System.out.println("Digíte a renda: ");
			Double renda = leia.nextDouble();

			if (opcao == 'f') {

				System.out.print("Está pessoa teve gastos com a saúde? (s/n) \n");
				char opcao2 = leia.next().charAt(0);
				leia.nextLine();
				if (opcao2 == 's') {
					System.out.print("Digíte o valor gasto: \n");
					Double gastosSaude = leia.nextDouble();
					lista.add(new PessoaFisica(nome, renda, gastosSaude));

				} else {
					Double gastosSaude = (double) 0;
					lista.add(new PessoaFisica(nome, renda, gastosSaude));
				}

			}

			else if (opcao == 'j') {

				System.out.print("Digíte o número de funcionarios \n");
				int num2 = leia.nextInt();
				lista.add((new PessoaJuridica(nome, renda, num2)));

			}

		}

		Double soma = (double) 0;
		System.out.println();
		for (Pessoa p : lista) {
			double taxa = p.taxa();
			System.out.println(p.getName() + " Taxas R$" + String.format("%.2f", taxa));
			soma += taxa;
		}
		
		System.out.println();
		System.out.println("Total de taxas : R$"  + String.format("%.2f", soma));

	}

}
