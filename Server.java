import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 5000; // Puerto del servidor

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor escuchando en el puerto " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Aceptar conexiones
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
                
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

