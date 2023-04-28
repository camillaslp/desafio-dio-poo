package br.com.dio.desafio.dominio;


public class Curso extends Conteudo{

	private int cargaHoraria;
	
	public Curso() {
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 10d;
	}
	
	public int getData() {
		return cargaHoraria;
	}
	
	public void setData(int data) {
		this.cargaHoraria = data;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", calcularXp()=" + calcularXp() + ", getData()=" + getData()
				+ ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
