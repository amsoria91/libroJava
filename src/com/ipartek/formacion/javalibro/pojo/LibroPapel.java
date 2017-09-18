package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class LibroPapel extends Libro implements Vendible{

	private boolean tapaBlanda;
	public static float TAPA_DURA=1.5f;

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
	
	@Override
	public float getPrecio() {
		
		float resul=super.getPrecio();
		
		if(isTapaBlanda()==true) {
			
			resul=(float) (resul+TAPA_DURA);
		}else {
			
			resul=super.getPrecio();
			
		}
		
		if(resul<Vendible.PRECIO_MINIMO) {
			
			resul=Vendible.PRECIO_MINIMO;
		}
		
		return resul;
	}
}
