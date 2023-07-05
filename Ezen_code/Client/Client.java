package Ezen_code.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class Client extends JFrame {
private JTextArea chatArea;
private JTextField messageField;
private JButton sendButton;


private Socket socket;
private DataInputStream inputStream;
private DataOutputStream outputStream;

public Client() {
    setTitle("Chat Client");
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
            sendMessage();
        }
    });
    bottomPanel.add(sendButton, BorderLayout.EAST);

    add(bottomPanel, BorderLayout.SOUTH);

    setVisible(true);

    String serverIP = JOptionPane.showInputDialog("Enter server IP:");
    if (serverIP == null || serverIP.isEmpty()) {
        displayMessage("Invalid server IP");
        return;
    }

    String serverPortString = JOptionPane.showInputDialog("Enter server port number:");
    if (serverPortString == null || serverPortString.isEmpty()) {
        displayMessage("Invalid server port number");
        return;
    }

    int serverPort = Integer.parseInt(serverPortString);

    try {
        socket = new Socket(serverIP, serverPort);
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new DataOutputStream(socket.getOutputStream());

        new Thread(new ReceiveThread()).start();
    } catch (IOException ex) {
        displayMessage("Failed to connect to the server: " + ex.getMessage());
    }
}

private void sendMessage() {
    String message = messageField.getText();
    if (!message.isEmpty()) {
        try {
            outputStream.writeUTF(message);
            outputStream.flush();
            messageField.setText("");
        } catch (IOException ex) {
            displayMessage("Failed to send message: " + ex.getMessage());
        }
    }
}

private void displayMessage(String message) {
    chatArea.append(message + "\n");
}

private class ReceiveThread implements Runnable {
    public void run() {
        try {
            while (true) {
                String message = inputStream.readUTF();
                displayMessage(message);
            }
        } catch (IOException ex) {
            displayMessage("Disconnected from the server.");
            try {
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public static void main(String[] args) {
    new Client();
}
}