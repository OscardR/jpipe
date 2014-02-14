package jpipe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	static final int ADD = 0x02;
	static final int SUB = 0x04;
	static final int MULT = 0x08;
	static final int TRAP = 0x0C;
	static final int NOP = 0x00;

	public static void main(String[] args) {
		// TODO Leer archivo
		try {
			Scanner in = new Scanner(new FileReader(args[1]));
			while (in.hasNext()) {
				String linea = in.nextLine();
				// TODO Meter instrucciones en MemoriaInstrucciones

				String pattern = ",| +";
				linea = linea.replaceAll(pattern, " ");

				String[] tokens = linea.split(" ");
				String operacion = tokens[0];

				int codOp = getCodigoOp(operacion);
				int rc = getRegistro(tokens[1]);
				int ra = getRegistro(tokens[2]);
				int rb = getRegistro(tokens[3]);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado: " + e.getMessage());
		}
		// TODO Inicializar CPU y darle candela
	}

	static int getCodigoOp(String op) {
		int codOp = NOP;
		switch (op.toLowerCase()) {
		case "add":
			codOp = ADD;
			break;
		case "sub":
			codOp = SUB;
			break;
		case "mult":
			codOp = MULT;
			break;
		case "trap":
			codOp = TRAP;
			break;
		default:
			break;
		}
		return codOp;
	}

	static int getRegistro(String reg) {
		// TODO parsear entero en reg
		return 0;
	}
}
