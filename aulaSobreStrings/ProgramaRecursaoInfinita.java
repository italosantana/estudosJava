public class ProgramaRecursaoInfinita { 
	public static void main(String[] args) { 
		System.out.println(funcaoX()); 
	}

	public static int funcaoX() { 
		return funcaoX(); 
	} 
}