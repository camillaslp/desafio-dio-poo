package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHoraria(4);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("curso BD");
		curso3.setDescricao("descri��o curso js");
		curso3.setCargaHoraria(16);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("descri��o mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("mentoria de java");
		mentoria2.setDescricao("descri��o mentoria java");
		mentoria2.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria2);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		
		Dev devCamilla = new Dev();
		devCamilla.setNome("Camilla");
		devCamilla.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Camila:" + devCamilla.getConteudosInscritos());
		devCamilla.progredir();
		devCamilla.progredir();
		devCamilla.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Camila:" + devCamilla.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Camila:" + devCamilla.getConteudosConcluidos());
		System.out.println("XP:" + devCamilla.calcularTotalXp());
		
		System.out.println("-------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
		System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

	}
}
