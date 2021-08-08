import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
import javax.swing.*;
import javax.swing.border.BevelBorder;
 
public class EncipherWindow {
    final static boolean windowfill = true;
    final static boolean fillweightx = true;
    final static boolean rightToLeft = false;
 
    public static void createComponents(Container menuWindow) {
        JButton functions;
        String[] buttonNames = { "Set Increase Encipher", "Set Decrease Encipher", "Randomized Assigned Letters",
                "Complete Random", "Morse Inverse", "Morse Reverse", "Morse Swap", "Integer Encipher" };
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        if (rightToLeft) {
            menuWindow.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
        menuWindow.setLayout(new GridBagLayout());
        GridBagConstraints cell = new GridBagConstraints();
        if (windowfill) {
            cell.fill = GridBagConstraints.HORIZONTAL;
        }
        cell.weighty = 1;
 
        JTextField inputMessage = new JTextField("Input Message Here", 60);
        cell.ipady = 20;
        cell.weighty = 1.0;
        cell.anchor = GridBagConstraints.PAGE_END;
        cell.gridx = 1;
        cell.gridy = 4;
        cell.gridwidth = 2;
 
        menuWindow.add(inputMessage, cell);
 
        for (int i = 0; i < 8; i++) {
 
            if (i % 2 == 0) {
                functions = new JButton(buttonNames[i]);
                cell.fill = GridBagConstraints.FIRST_LINE_START;
                cell.weightx = 0.5;
                cell.gridx = 0;
                cell.gridy = i / 2;
                functions.setPreferredSize(new Dimension(300, 50));
                functions.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        checkButtonPressed(e);
                    }
 
                    private void checkButtonPressed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton btnName = (JButton) e.getSource();
                        String name = btnName.getText();
                        JFrame outputWindow = new JFrame("Result");
                        outputWindow.setSize(1000, 800);
                        outputWindow.setResizable(false);
                        outputWindow.setLocationRelativeTo(null);
                       
                        Font outputFont = new Font("Sans", Font.ROMAN_BASELINE, 30);
 
                        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        outputWindow.setVisible(true);
 
                        JPanel outputPanel = new JPanel();
                        outputWindow.add(outputPanel);
                        outputPanel.setLayout(new BorderLayout());
                        outputPanel.setBounds(0, 0, 600, 200);
                        outputPanel.setBackground(Color.gray);
                       
                        if (name.equals(buttonNames[0])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            cypherIterator setEncipher = new cypherIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(setEncipher.setIncrease());
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50, 20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                        }
                        else if (name.equals(buttonNames[2])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            cypherIterator RandTab = new cypherIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(RandTab.convertWithRandomTable());
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50,20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                           
                        }
                       
                       
                        else if (name.equals(buttonNames[4])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            MorseCodeIterator morse1 = new MorseCodeIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(morse1.encrypt1(), JLabel.CENTER);
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50,20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                           
 
                        }
                        else if (name.equals(buttonNames[6])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            MorseCodeIterator morse3 = new MorseCodeIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(morse3.encrypt3(), JLabel.CENTER);
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50,20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                           
                        }
                    }
                });
                menuWindow.add(functions, cell);
                buttons.add(functions);
            } else if (i % 2 == 1) {
                functions = new JButton(buttonNames[i]);
                cell.fill = GridBagConstraints.FIRST_LINE_START;
                cell.weightx = 0.5;
                cell.gridx = 2;
                cell.gridy = i/2;
                functions.setPreferredSize(new Dimension(300, 50));
                functions.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        checkButtonPressed(e);
                    }
 
                    private void checkButtonPressed(ActionEvent e) {
                        JButton btnName = (JButton) e.getSource();
                        String name = btnName.getText();
                        JFrame outputWindow = new JFrame("Result");
                        outputWindow.setSize(1000, 800);
                        outputWindow.setResizable(false);
                        outputWindow.setLocationRelativeTo(null);
                       
                        Font outputFont = new Font("Sans", Font.ROMAN_BASELINE, 30);
 
                        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        outputWindow.setVisible(true);
 
                        JPanel outputPanel = new JPanel();
                        outputWindow.add(outputPanel);
                        outputPanel.setLayout(new BorderLayout());
                        outputPanel.setBounds(0, 0, 600, 200);
                        outputPanel.setBackground(Color.gray);
                        Font integerOutput = new Font("Sans", Font.ROMAN_BASELINE, 16);
                       
                         if(name.equals(buttonNames[1])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            cypherIterator decreaseEncipher = new cypherIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(decreaseEncipher.setDecrease());
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50, 20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                        }
                         else if (name.equals(buttonNames[3])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            cypherIterator randomEncipher = new cypherIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(randomEncipher.completeRand());
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50, 20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                         }
                       
                         else if (name.equals(buttonNames[5])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            MorseCodeIterator morse2 = new MorseCodeIterator(messageToBeEnciphered);
                            JLabel output = new JLabel(morse2.encrypt2(), JLabel.CENTER);
                            output.setSize(output.getPreferredSize());
                            output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            output.setLocation(50,20);
                            outputPanel.add(output);
                            output.validate();
                            output.setFont(outputFont);
                        }
 
                        else if (name.equals(buttonNames[7])) {
                            String messageToBeEnciphered = inputMessage.getText();
                            Iterator numEncipher = new Iterator(messageToBeEnciphered);
                            JLabel output = new JLabel(numEncipher.encrypt());
                            JLabel key = new JLabel(numEncipher.key());
                            output.setSize(1000,20); key.setSize(key.getPreferredSize());
                            output.setLocation(50,20); key.setLocation(50, 100);
                            outputPanel.add(output); outputPanel.add(key);
                            output.validate(); output.setFont(integerOutput); key.validate(); key.setFont(integerOutput);
                        }
                    }
                });
                menuWindow.add(functions, cell);
                buttons.add(functions);
            }
        }
 
 
    }
 
    private static void displayComponents() {
        JFrame wholeWindow = new JFrame("Message Mystifier");
        wholeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wholeWindow.setSize(600, 800);
        wholeWindow.setResizable(false);
        createComponents(wholeWindow.getContentPane());
        wholeWindow.pack();
        wholeWindow.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayComponents();
            }
        });
    }
}