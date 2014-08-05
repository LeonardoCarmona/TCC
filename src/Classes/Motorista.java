package Classes;

import java.util.Date;

public class Motorista {

	private String nome, categoriaHabilitacao;

	private int RG, CPF, numeroRegistro;

	private Date dataNascimento, vencimentoHabilitacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoriaHabilitacao() {
		return categoriaHabilitacao;
	}

	public void setCategoriaHabilitacao(String categoriaHabilitacao) {
		this.categoriaHabilitacao = categoriaHabilitacao;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getVencimentoHabilitacao() {
		return vencimentoHabilitacao;
	}

	public void setVencimentoHabilitacao(Date vencimentoHabilitacao) {
		this.vencimentoHabilitacao = vencimentoHabilitacao;
	}

}