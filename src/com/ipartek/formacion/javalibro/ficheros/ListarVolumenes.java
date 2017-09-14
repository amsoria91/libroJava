package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;
//io es input output

public class ListarVolumenes {

	public static void main(String[] args) {

		System.out.println("Volumenes o Unidades de nuestro PC");
		System.out.println("----------------------------------");
		File f = new File("");
		File[] volumenes = f.listRoots();

		for (File volumen : volumenes) {

			System.out.println(volumen);
		}
	}

}
