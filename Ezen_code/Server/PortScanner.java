package Ezen_code.Server;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PortScanner extends JFrame {
    private JTextField ipTextField;
    private JTextArea resultTextArea;

    public PortScanner() {
        setTitle("Port Scanner");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ipTextField = new JTextField(20); // Increase the size of the JTextField
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        JButton scanButton = new JButton("Scan");
        scanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ipAddress = ipTextField.getText();
                scanPort(ipAddress);
            }
        });

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("IP Address:"));
        inputPanel.add(ipTextField);
        inputPanel.add(scanButton);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void scanPort(String ipAddress) {
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            resultTextArea.setText("");

            List<Integer> openPorts = new ArrayList<>();

            for (int port = 1; port <= 65535; port++) {
                try {
                    Socket socket = new Socket();
                    socket.connect(new java.net.InetSocketAddress(inetAddress, port), 1000);
                    socket.close();
                    openPorts.add(port);
                } catch (IOException ex) {
                    // Port is closed or filtered
                }
            }

            if (openPorts.isEmpty()) {
                resultTextArea.setText("No open ports found");
            } else {
                StringBuilder resultBuilder = new StringBuilder();
                resultBuilder.append("Open ports for IP: ").append(ipAddress).append("\n");
                for (Integer port : openPorts) {
                    resultBuilder.append("Port ").append(port).append(" is open\n");
                }
                resultTextArea.setText(resultBuilder.toString());
            }
        } catch (Exception ex) {
            resultTextArea.setText("Failed to scan port: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new PortScanner();
    }
}
