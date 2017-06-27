/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author FHLC
*/
public class TestaAluno {

public static Aluno osp1 = new Aluno();
public static Aluno osp2 = new Aluno();
public static Aluno ocp1 = new Aluno(3, “FHLC_ocp1_nome”, “FHLC_ocp1_curso”, 1, “FHLC_ocp1_endereco”);
public static Aluno ocp2 = new Aluno(7, “FHLC_ocp2_nome”, “FHLC_ocp2_curso”, 2, “FHLC_ocp1_endereco”);

public static void main(String[] args) {
osp1.setMatricula(12);
osp1.setNome(“FHLC_osp1_nome”);
osp1.setEmail(“FHLC_osp1_email”);
osp1.setCurso(“FHLC_osp1_curso”);
osp1.setTelefone(“FHLC_osp1_telefone”);
osp1.setMensalidade(4);
osp1.setEndereco(“FHLC_osp1_endereço”);
osp2.setMatricula(25);
osp2.setNome(“FHLC_osp2_nome”);
osp2.setEmail(“FHLC_osp2_e-mail”);
osp2.setCurso(“FHLC_osp2_curso”);
osp2.setTelefone(“FHLC_osp2_telefone”);
osp2.setMensalidade(5);
osp2.setEndereco(“FHLC_osp2_endereço”);
ocp1.setEmail(“FHLC_ocp1_e-mail”);
ocp1.setTelefone(“FHLC_ocp1_telefone”);
ocp2.setEmail(“FHLC_ocp2_e-mail”);
ocp2.setTelefone(“FHLC_ocp2_telefone”);
System.out.printf(“Matricula: %d\nNome: %s\nE-mail: %s\nCurso: %s\nTelefone: %s\nMensalidade: %s\nEndereço: %s\n\nMatricula: %d\nNome: %s\nE-mail: %s\nCurso: %s\nTelefone: %s\nMensalidade: %s\nEndereço: %s\n\nMatricula: %d\nNome: %s\nE-mail: %s\nCurso: %s\nTelefone: %s\nMensalidade: %s\nEndereço: %s\n\nMatricula: %d\nNome: %s\nE-mail: %s\nCurso: %s\nTelefone: %s\nMensalidade: %s\nEndereço: %s\n”, osp1.getMatricula(), osp1.getNome(), osp1.getEmail(), osp1.getCurso(), osp1.getTelefone(), osp1.getMensalidade(), osp1.getEndereco(), osp2.getMatricula(), osp2.getNome(), osp2.getEmail(), osp2.getCurso(), osp2.getTelefone(), osp2.getMensalidade(), osp2.getEndereco(), ocp1.getMatricula(), ocp1.getNome(), ocp1.getEmail(), ocp1.getCurso(), ocp1.getTelefone(), ocp1.getMensalidade(), ocp1.getEndereco(), ocp2.getMatricula(), ocp2.getNome(), ocp2.getEmail(), ocp2.getCurso(), ocp2.getTelefone(), ocp2.getMensalidade(), ocp2.getEndereco());
}
}