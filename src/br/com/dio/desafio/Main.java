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
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("curso BD");
		curso3.setDescricao("descrição curso js");
		curso3.setCargaHoraria(16);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("mentoria de java");
		mentoria2.setDescricao("descrição mentoria java");
		mentoria2.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria2);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		
		Dev devCamilla = new Dev();
		devCamilla.setNome("Camilla");
		devCamilla.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila:" + devCamilla.getConteudosInscritos());
		devCamilla.progredir();
		devCamilla.progredir();
		devCamilla.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila:" + devCamilla.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Camila:" + devCamilla.getConteudosConcluidos());
		System.out.println("XP:" + devCamilla.calcularTotalXp());
		
		System.out.println("-------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

	}
}
