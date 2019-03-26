package br.senai.rn.agenda.model;

public class TestaContato {

	public static void main(String[] args) {
		
		Contato jose = new Contato();
		jose.setNome("José");
		jose.setFone("1111-2222");
		jose.setEmail("jose@bol.com.br");
		
		Contato maria = new Contato("Maria", "3333-4444", "maria@ferra.com.br");
		
		
		System.out.println(jose);
		System.out.println(maria);
		
	}

}
