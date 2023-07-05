package Ezen_code.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class NetworkScanner extends JFrame {
    private JTextField ipTextField;
    private JTextArea resultTextArea;
    private JButton scanButton;

    public NetworkScanner() {
        setTitle("Network Scanner");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ipTextField = new JTextField();
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        scanButton = new JButton("Scan");
        scanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ipAddress = ipTextField.getText();
                scanNetwork(ipAddress);
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

    private void scanNetwork(String ipAddress) {
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);

            if (inetAddress.isReachable(5000)) {
                resultTextArea.append("IP Address: " + inetAddress.getHostAddress() + "\n");

                Runtime runtime = Runtime.getRuntime();
                String command = "nmap -sn " + ipAddress;
                Process process = runtime.exec(command);
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

                String line;
                while ((line = reader.readLine()) != null) {
                    resultTextArea.append(line + "\n");
                }

                reader.close();
            } else {
                resultTextArea.setText("Host is not reachable.");
            }
        } catch (IOException ex) {
            resultTextArea.setText("Failed to scan network: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new NetworkScanner();
    }
}
