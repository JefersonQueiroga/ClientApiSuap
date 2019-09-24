package br.edu.ifrn.jeferson.dto;

import java.util.ArrayList;

public class Vinculo {
	private String matricula;
	private String nome;
	private String cargo;
	private String setor_suap;
	private String setor_siape;
	private String jornada_trabalho;
	ArrayList<Object> funcao = new ArrayList<Object>();
	private String campus;
	private String email;
	ArrayList<Object> telefones_institucionais = new ArrayList<Object>();
	private String categoria;
	private String disciplina_ingresso;
	private String url_foto_75x100;
	private String curriculo_lattes;

	// Getter Methods

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public String getSetor_suap() {
		return setor_suap;
	}

	public String getSetor_siape() {
		return setor_siape;
	}

	public String getJornada_trabalho() {
		return jornada_trabalho;
	}

	public String getCampus() {
		return campus;
	}

	public String getEmail() {
		return email;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getDisciplina_ingresso() {
		return disciplina_ingresso;
	}

	public String getUrl_foto_75x100() {
		return url_foto_75x100;
	}

	public String getCurriculo_lattes() {
		return curriculo_lattes;
	}

	// Setter Methods

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSetor_suap(String setor_suap) {
		this.setor_suap = setor_suap;
	}

	public void setSetor_siape(String setor_siape) {
		this.setor_siape = setor_siape;
	}

	public void setJornada_trabalho(String jornada_trabalho) {
		this.jornada_trabalho = jornada_trabalho;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setDisciplina_ingresso(String disciplina_ingresso) {
		this.disciplina_ingresso = disciplina_ingresso;
	}

	public void setUrl_foto_75x100(String url_foto_75x100) {
		this.url_foto_75x100 = url_foto_75x100;
	}

	public void setCurriculo_lattes(String curriculo_lattes) {
		this.curriculo_lattes = curriculo_lattes;
	}
}