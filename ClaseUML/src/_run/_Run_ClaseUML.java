package _run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicaci�n.
 *
 * Con Eclipse: Bot�n derecho del rat�n > Run As > Java Application
 */

public class _Run_ClaseUML {

	public static void main(String[] args) throws Exception {
		DBServer.start("ClaseUMLDB"); // Para usar tu propia base de datos comenta esta l�nea y configura web/META-INF/context.xml
		AppServer.run("ClaseUML"); // Usa AppServer.run("") para funcionar en el contexto ra�z
	}

}
