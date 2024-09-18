package br.com.rogersantos;

public class PessoaFisica extends Pessoa {
	private String CPF;
	private String DataNascimento;
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getDataNascimento() {
		return DataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	@Override
    public String toString() {
        return "Nome da pessoa fisica: " + this.getNome() + "\nData de Nascimento: " + this.getDataNascimento() +
        		"\nCPF: " + this.getCPF();
    } 

}
