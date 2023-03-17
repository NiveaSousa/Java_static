package application;

import java.util.Scanner;
import entities.Contact;
import function.Agenda;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int loop = 0;
		
		while(loop != 3) {
		int op;
		System.out.println("Menu");
		System.out.println("1. Adicionar contato");
		System.out.println("2. Listar contatos");
		System.out.println("3. Deletar");
		System.out.println("3. Sair");
		op = sc.nextInt();
		
		switch(op) {
		case 1: //Add
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Numero: ");
			String num = sc.nextLine();
			Contact conta = new Contact(nome, num);
			Agenda.addContact(conta);
			break;
		case 2: //List
			Agenda.getList();
			break;
		case 3: //Del
			System.out.println("Digite o nome do contato: ");
			String n = sc.nextLine();
			Agenda.removeContact(n);
			break;
		default:
			System.out.println("Escolha opção válida");
		}
		
		sc.close();
		}
		
		}
	}


