package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.io.Serializable;

/*Una interfaz puede extender de varias interfaces*/

public interface Vendible extends Serializable, Cloneable {

	/*
	 * Al ser una interfaz se sobreentiende que son static y final static porque
	 * solo puede haber 1 en memoria final porque no se puede modificar
	 */

	/* static final */float PRECIO_MINIMO = 0;

	/**
	 * Retorna el precio del objeto, el cual debe ser superior al PRECIO_MINIMO
	 * 
	 * @return
	 */

	/* A esta clase de metodos tambien se les denomina PROTOTIPOS */

	float getPrecio();

}
