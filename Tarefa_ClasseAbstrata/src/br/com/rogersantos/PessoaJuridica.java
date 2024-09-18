package br.com.rogersantos;

public class PessoaJuridica extends Pessoa {
	private String CNPJ;
	private String DataCriacao;
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getDataCriacao() {
		return DataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		DataCriacao = dataCriacao;
	}
	
	@Override
    public String toString() {
        return "Nome da pessoa Juridica: " + this.getNome() + "\nData de Criação: " + this.getDataCriacao() +
        		"\nCNPJ: " + this.getCNPJ();
    } 
}
