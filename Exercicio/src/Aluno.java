/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author FHLC
*/
public class Aluno {

private int matricula;
private String nome, email, curso, telefone, endereco;
private double mensalidade;

Aluno() {
}

Aluno(int matricula, String nome, String curso, double mensalidade, String endereco) {
this.matricula = matricula;
this.nome = nome;
this.curso = curso;
this.mensalidade = mensalidade;
this.endereco = endereco;
}

public int getMatricula() {
return matricula;
}

public void setMatricula(int matricula) {
this.matricula = matricula;
}

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getCurso() {
return curso;
}

public void setCurso(String curso) {
this.curso = curso;
}

public String getTelefone() {
return telefone;
}

public void setTelefone(String telefone) {
this.telefone = telefone;
}

public String getEndereco() {
return endereco;
}

public void setEndereco(String endereco) {
this.endereco = endereco;
}

public double getMensalidade() {
return mensalidade;
}

public void setMensalidade(double mensalidade) {
this.mensalidade = mensalidade;
}
}

