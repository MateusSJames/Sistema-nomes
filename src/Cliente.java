import java.io.PrintStream;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		
		try {
			//Declarando o socket cliente
			Socket cliente = new Socket("127.0.0.1", 7000);
			
			System.out.println("Cliente iniciado");
			
			//Fluxo de dados para enviar ao servidor
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			
			ps.println("Teste de requisicao");
			
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a conexão");
		}
	}

}
