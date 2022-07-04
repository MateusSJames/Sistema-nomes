import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			//Iniciando servidor na porta 7000
			ServerSocket server = new ServerSocket(7000);
			System.out.println("Servidor iniciado...");
			
			while(true) {
				//Aguardando cliente
				Socket cliente = server.accept();
				
				System.out.println("Cliente conectado: " + cliente.getInetAddress());
				//Recebendo dados requisitados do cliente ao servidor
				InputStreamReader fluxoDados = new InputStreamReader(cliente.getInputStream());
				BufferedReader dado = new BufferedReader(fluxoDados);
				
				System.out.println(dado.readLine());
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro");
		}
	}
}
