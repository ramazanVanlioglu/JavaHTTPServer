import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {
    
    /**
     * Java program to create a simple HTTP Server to demonstrate
     * how to use ServerSocket and Socket class.
     * 
     */

    public static void main(String[] args) throws IOException {

        //Get the clients desktop informations.
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ...");
        while(true){
            Socket clientSocket = server.accept();
            InputStreamReader isr =  new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();
            while(!line.isEmpty()){
                System.out.println(line);
                line=reader.readLine();
            }
        }
        



        /* //Prints date on the website
        ServerSocket server =  new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ...");
        while(true){
            try(Socket socket = server.accept()){
                Date today =new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+ today";
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));

            }
        }
        */
        

    }



}
