package br.com.rogersantos;

public class Programa {
	public static void main(String args[]) {
		PessoaFisica roger = new PessoaFisica();
		roger.setNome("Roger Santos");
		roger.setDataNascimento("27/01/1987");
		roger.setCPF("111-111-111-11");
		
		PessoaJuridica google = new PessoaJuridica();
		google.setNome("Google");
		google.setDataCriacao("04/09/1998");
		google.setCNPJ("12.345.678/0001-00");
		
		System.out.println(roger);
		System.out.println(google);
	}
}
