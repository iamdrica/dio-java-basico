
public class MinhaClasse {

	public static void main (String [] args) { //args = abreviação de argumentos ou parâmetros
	
	//System.out.println("Olá! Sejam bem-vindos ao meu primeiro projeto Java.");
		
	String primeiroNome = "Drica";
	String segundoNome = "Ferreira";
	
	String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
	
	System.out.println(nomeCompleto);
	
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
		
	}
}
