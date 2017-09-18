package com.ipartek.formacion.javalibro.pojo;

public class LibroPapel extends Libro {

	private boolean tapaBlanda;

	public LibroPapel(String titulo) {
		super(titulo);
		this.tapaBlanda=false;
	}

	public boolean isTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	@Override
	public String toString() {
		return super.toString() + "LibroPapel [tapaBlanda=" + tapaBlanda + "]";
	}

}
