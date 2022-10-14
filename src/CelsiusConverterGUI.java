import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CelsiusConverterGUI extends  JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTexfield;
    private JButton ConverterButton;
    private JLabel FahrenheitLabel;
    private JButton CelsiusButton;

    public CelsiusConverterGUI(String title)   {
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        ConverterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // olvasd be az értéket
                //alakítsd át tizedesre
                // váltsd át
                int tempFahr = (int)(Double.parseDouble(celsiusTexfield.getText())
                        * 1.8 + 32);
                FahrenheitLabel.setText("Átváltás után a hőfok : "+tempFahr +"  Fahremheit  ");
            }
        });

        CelsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //olvasd be Fahrenheitben
                // alakítsd át tizedes számmá
                //váltsd át
                int tempcelsius=(int) (Double.parseDouble(celsiusTexfield.getText())
                      -32  / 1.8000 );
        FahrenheitLabel.setText("Átváltás után a hőfok: "+ tempcelsius+" Celsius fok");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius konverter");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
