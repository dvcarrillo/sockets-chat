package chat;

import GUI.CaptureView;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dvcarrillo
 */

public class Client {
    // Properties
    private String clientName;
    private Color clientColor;
    // Socket
    private Socket clientSocket ;
    // Streams
    private InputStream inputStream;
    private OutputStream outputStream;
    private DataInputStream inData;
    private DataOutputStream outData;
    
    private boolean option = true;
    
    public void SetConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            Thread th1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (option) {
                        ListenData();
                    }
                }
            });
            th1.start();
        } catch (IOException ex) {
           System.err.println("ERROR: connection error");
        }
    }
    
    public void SendMessage(String msg) {
        try {
            outputStream = clientSocket.getOutputStream();
            outData = new DataOutputStream(outputStream);
            outData.writeUTF(msg);
            outData.flush();
        } catch (IOException ex) {
            System.err.println("ERROR: error sending data");
        }
    }
    
    public void ListenData() {
        try {
            inputStream = clientSocket.getInputStream();
            inData = new DataInputStream(inputStream);
            ChatView.addRemoteMessage(inData.readUTF());
        } catch (IOException ex) {
            System.err.println("ERROR: error listening data");
        }
    }
    
    public void CloseConnection() {
        try {
            outData.close();
            inData.close();
            clientSocket.close();
        } catch (IOException ex) {
            System.err.println("ERROR: error closing connection");
        }
    }
    
    public void SetClientProperties(String name, Color color) {
        clientName = name;
        clientColor = color;
    }
    
    public static void main(String [] args) {
        ChatView chatView = new ChatView();
        CaptureView captureView = new CaptureView(chatView, true);
        String name = captureView.getName();
        Color color = captureView.GetColor();
        setClientProperties(name, color);
        String ipMachine = captureView.GetIP();
        int portMachine = captureView.GetPort();
        setConnection(ipMachine, portMachine);
    }
}
