package view;

import controller.Faculdades;

public class Principal {

	public final static String os = System.getProperty("os.name");

	public static void main(String[] args) {

		if (os.contains("Windows")) {
			String dir = "C:\\TEMP";
			Faculdades.criaDirArq(dir);
			Faculdades.lerArquivo(dir);
		} else {
			if (os.contains("Linux")) {
				String dir = "/tmp";
				Faculdades.criaDirArq(dir);
				Faculdades.lerArquivo(dir);
			}
		}

	}

}
