package exemploolamundo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Programa {
	public static int varGlobal = 5;
	private static int varLocalClasse = 6;

	public static void main(String[] args) {
	int varLocalRotina = 10;

	if (varGlobal == 0) {
	int varLocalComando = varLocalRotina;
	System.out.println(varLocalComando);
}
System.out.println(varLocalRotina);
// System.out.println(varLocalComando);
System.out.println(varGlobal);
System.out.println(varLocalClasse);
}

public static void rotina2() {
// System.out.println(varLocalRotina);
// System.out.println(varLocalComando);
System.out.println(varGlobal);
System.out.println(varLocalClasse);
}
}