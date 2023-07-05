package Ezen_code.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Server extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;

    private List<ClientHandler> clients;

    public Server() {
        setTitle("Chat Server");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        messageField = new JTextField();
        bottomPanel.add(messageField, BorderLayout.CENTER);

        sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                broadcastMessage("Server: " + messageField.getText());
                messageField.setText("");
            }
        });
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);

        int serverPort = 5000;
        clients = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            displayMessage("Server started on port " + serverPort);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                displayMessage("Client connected: " + clientSocket.getInetAddress());

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);

                new Thread(clientHandler).start();
            }
        } catch (IOException ex) {
            displayMessage("Server error: " + ex.getMessage());
        }
    }

    private void displayMessage(String message) {
        chatArea.append(message + "\n");
    }

    private void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;
        private DataInputStream inputStream;
        private DataOutputStream outputStream;

        public ClientHandler(Socket socket) {
            clientSocket = socket;
            try {
                inputStream = new DataInputStream(clientSocket.getInputStream());
                outputStream = new DataOutputStream(clientSocket.getOutputStream());
            } catch (IOException ex) {
                displayMessage("Error creating I/O streams for client: " + ex.getMessage());
            }
        }

        public void run() {
            try {
                while (true) {
                    String message = inputStream.readUTF();
                    displayMessage("Client: " + message);
                    broadcastMessage("Client: " + message);
                }
            } catch (IOException ex) {
                displayMessage("Client disconnected: " + clientSocket.getInetAddress());
                clients.remove(this);
                try {
                    if (inputStream != null)
                        inputStream.close();
                    if (outputStream != null)
                        outputStream.close();
                    if (clientSocket != null)
                        clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void sendMessage(String message) {
            try {
                outputStream.writeUTF(message);
                outputStream.flush();
            } catch (IOException ex) {
                displayMessage("Error sending message to client: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}

