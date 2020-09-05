import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener{
    public static JButton button0, button1, button2, button3, button4, buttonC, buttonConvert;
    public static JButton button5, button6, button7, button8, button9, buttonPoint;
    public static JTextField textArea1, textArea2, userText;
    private static JTextArea inputArea, inputArea2;
    private static JLabel userLabel , userLabel1, userLabel2;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversion Calculator");
        JPanel iconPanel = new JPanel();
        JPanel grid = new JPanel(new FlowLayout());
        grid.setBackground(Color.gray);

        grid.setLayout(new GridLayout(5, 3));
        button1 = new JButton("1");         grid.add(button1);
        button2 = new JButton("2");         grid.add(button2);
        button3 = new JButton("3");         grid.add(button3);
        button4 = new JButton("4");         grid.add(button4);
        button5 = new JButton("5");         grid.add(button5);
        button6 = new JButton("6");         grid.add(button6);
        button7 = new JButton("7");         grid.add(button7);
        button8 = new JButton("8");         grid.add(button8);
        button9 = new JButton("9");         grid.add(button9);
        buttonC = new JButton("C");         grid.add(buttonC);
        button0 = new JButton("0");         grid.add(button0);
        buttonPoint = new JButton(".");     grid.add(buttonPoint);
        textArea1 = new JTextField("");
        grid.add(textArea1);         textArea1.setEditable(false);
        buttonConvert = new JButton("Convert");         grid.add(buttonConvert);
        textArea2 = new JTextField("");
        grid.add(textArea2);   textArea2.setEditable(false);

        frame.add(iconPanel);
        iconPanel.setLayout(new GridLayout(3, 2));

        userLabel1 = new JLabel("User Input ");
        iconPanel.add(userLabel1);

        inputArea = new JTextArea("");
        iconPanel.add(inputArea);

        userLabel2 = new JLabel("");
        iconPanel.add(userLabel2);
        inputArea2 = new JTextArea("");
        iconPanel.add(inputArea2);

        userLabel = new JLabel("Weight in Pounds ");
        iconPanel.add(userLabel);

        userText = new JTextField("                         ");
        iconPanel.add(userText);

        frame.setLayout(new GridLayout(1,2,3,3));
        frame.add(grid);
        frame.add(iconPanel);
        
        button1.addActionListener(new Main.ListenToOne());
        button2.addActionListener(new Main.ListenToTwo());
        button3.addActionListener(new Main.ListenToThree());
        button4.addActionListener(new Main.ListenToFour());
        button5.addActionListener(new Main.ListenToFive());
        button6.addActionListener(new Main.ListenToSix());
        button7.addActionListener(new Main.ListenToSeven());
        button8.addActionListener(new Main.ListenToEight());
        button9.addActionListener(new Main.ListenToNine());
        button0.addActionListener(new Main.ListenToZero());
        buttonC.addActionListener(new Main.ListentoClear());
        buttonPoint.addActionListener(new Main.ListenToPoint());
        buttonConvert.addActionListener(new Main.ListenToConvert());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    static class ListenToConvert implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String user = inputArea.getText();
            Double num1 = Double.parseDouble(user);
            double answer = num1 * 0.453592 ;
            String finalResult = String.valueOf(answer);
            userText.setText(finalResult);
            inputArea2.setText(inputArea.getText() + " pounds equal " + answer + "  kilograms. ");
            inputArea.setText("");
        }
    }

    static class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "1");
        }
    }

    static class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "2");
        }
    }

    static class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "3");
        }
    }

    static class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "4");
        }
    }

    static class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "5");
        }
    }

    static class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "6");
        }
    }

    static class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "7");
        }
    }

    static class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "8");
        }
    }

    static class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "9");
        }
    }

    static class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "0");
        }
    }

    static class ListentoClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText("");
        }
    }

    static class ListenToPoint implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + ".");
        }
    }
}