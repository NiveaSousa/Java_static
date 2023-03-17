package function;

import java.util.ArrayList;

import entities.Contact;

public class Agenda {

	private static ArrayList<Contact> agenda = new ArrayList<>();

	public static void addContact(Contact contato) {
		agenda.add(contato);
	}

	public static void getList() {
		for (Contact con : agenda) {
			System.out.println(con.toString());
		}
	}
	
	public static void removeContact(String name) {
		Contact cont = agenda.stream().filter(x -> x.getNome().equals(name)).findFirst().orElse(null); 
		if(cont!=null) {
			agenda.remove(cont);
		
		/*for (Contact contato : agenda) {
			if(contato.getNome().equals(name)) {
				agenda.remove(contato);
			}*/
	}
	}
	

}
