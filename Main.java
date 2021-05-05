import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
		int op = -1;
		while (op!=4){
			op = mainMenu.getSelection();
			System.out.println("Foi selecionada a opcao "+ op);
		}
		
		System.out.println("Fim");
	}

}
