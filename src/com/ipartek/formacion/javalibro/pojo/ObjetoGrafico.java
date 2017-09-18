package com.ipartek.formacion.javalibro.pojo;

/**
 * Una clase abstract puede contener codigo implementado pero tiene algun metodo SIN implementar(abstract)
 * Es algo intermedio entre Class e Interface
 * No puede instanciar objetos(no se puede hacer un new), pero de una interfaz si se puede crear objetos.
 * Las clases hijas deben implementar los metodos abstractos o volver a declararlos abstractos.
 * @author Administrador
 *
 */
public abstract class ObjetoGrafico {
	
	int x;
	int y;
	
	void mover(int xPos,int yPos) {
		
		this.x=xPos;
		this.y=yPos;
		
	}
	
	abstract void dibujar();

}
