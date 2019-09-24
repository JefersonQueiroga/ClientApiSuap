package br.edu.ifrn.jeferson.dto;

import java.util.ArrayList;

public class MeusDados {
	 private float id;
	 private String matricula;
	 private String nome_usual;
	 private String cpf;
	 private String rg;
	 ArrayList < Object > filiacao = new ArrayList < Object > ();
	 private String data_nascimento;
	 private String naturalidade;
	 private String tipo_sanguineo;
	 private String email;
	 private String url_foto_75x100;
	 private String url_foto_150x200;
	 private String tipo_vinculo;
	 Vinculo VinculoObject;


	 // Getter Methods 

	 public float getId() {
	  return id;
	 }

	 public String getMatricula() {
	  return matricula;
	 }

	 public String getNome_usual() {
	  return nome_usual;
	 }

	 public String getCpf() {
	  return cpf;
	 }

	 public String getRg() {
	  return rg;
	 }

	 public String getData_nascimento() {
	  return data_nascimento;
	 }

	 public String getNaturalidade() {
	  return naturalidade;
	 }

	 public String getTipo_sanguineo() {
	  return tipo_sanguineo;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public String getUrl_foto_75x100() {
	  return url_foto_75x100;
	 }

	 public String getUrl_foto_150x200() {
	  return url_foto_150x200;
	 }

	 public String getTipo_vinculo() {
	  return tipo_vinculo;
	 }

	 public Vinculo getVinculo() {
	  return VinculoObject;
	 }

	 // Setter Methods 

	 public void setId(float id) {
	  this.id = id;
	 }

	 public void setMatricula(String matricula) {
	  this.matricula = matricula;
	 }

	 public void setNome_usual(String nome_usual) {
	  this.nome_usual = nome_usual;
	 }

	 public void setCpf(String cpf) {
	  this.cpf = cpf;
	 }

	 public void setRg(String rg) {
	  this.rg = rg;
	 }

	 public void setData_nascimento(String data_nascimento) {
	  this.data_nascimento = data_nascimento;
	 }

	 public void setNaturalidade(String naturalidade) {
	  this.naturalidade = naturalidade;
	 }

	 public void setTipo_sanguineo(String tipo_sanguineo) {
	  this.tipo_sanguineo = tipo_sanguineo;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public void setUrl_foto_75x100(String url_foto_75x100) {
	  this.url_foto_75x100 = url_foto_75x100;
	 }

	 public void setUrl_foto_150x200(String url_foto_150x200) {
	  this.url_foto_150x200 = url_foto_150x200;
	 }

	 public void setTipo_vinculo(String tipo_vinculo) {
	  this.tipo_vinculo = tipo_vinculo;
	 }

	 public void setVinculo(Vinculo vinculoObject) {
	  this.VinculoObject = vinculoObject;
	 }
	}
