package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Trabalhador;

public class Programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Trabalhador r1 = new Trabalhador();
		Scanner sc = new Scanner(System.in);
		List<Trabalhador> list = new ArrayList<>();
		
		
		System.out.println("Quantos funcionários serão registrados? ");
		int numero = sc.nextInt();
		
		for(int i = 1; i<=numero; i++) {
			System.out.println("\nTrabalhador #"+i);
			System.out.println("\nID: ");			
			int id = sc.nextInt();
			while(IdExistente(list, id)) {
				System.out.println("ID JA EXISTE!");
				System.out.println("\nID: ");
				id = sc.nextInt();
			}
			r1.setId(id);	
			
			System.out.println("\nNome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.println("\nSalario: ");
			double salario = sc.nextDouble();
		    list.add(new Trabalhador(id, nome, salario));
			
		}
			
			
		System.out.println("\nDigite o Id para receber o aumento: ");
		
		int id = sc.nextInt();
		Trabalhador trabalhador = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (trabalhador == null) {
			System.out.println("ID NÃO EXISTE!");
		}
		
		else {
			
		
		System.out.println("\nDigite a porcentagem");
		trabalhador.aumento(sc.nextDouble());
		}
		System.out.println("\nLista dos Trabalhadores:\n\n");
		for(Trabalhador obj: list) {
			System.out.print(obj);
			
		}
		
		
		sc.close();
		
		
		}
	public static boolean IdExistente(List<Trabalhador> list, int id) {
		Trabalhador trabalhador = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return trabalhador != null;
	}
	}

