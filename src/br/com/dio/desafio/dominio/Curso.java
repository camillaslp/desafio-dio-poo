package br.com.dio.desafio.dominio;


public class Curso extends Conteudo{

	private int cargaHoraria;
	
	public Curso() {
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int data) {
		this.cargaHoraria = data;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", calcularXp()=" + calcularXp() + ", getCargaHoraria()=" + getCargaHoraria()
				+ ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
