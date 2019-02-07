import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
//import java.awt.FlowLayout;

class MosaicLiteFrame extends JFrame {
    public MosaicLiteFrame() {
        setBounds(100,100,1100,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JButton randomizeButton = new JButton("Randomize");
        buttonPanel.add(randomizeButton);

        JPanel xAndOGridPanel = new JPanel();
        contentPane.add(xAndOGridPanel, BorderLayout.CENTER);
        xAndOGridPanel.setLayout(new GridLayout(3,3));

        //left off at 35:45 ... start at 35:40
        
    }
}

public class MosaicLite {
    public static void main(String [] args) {
        System.out.println("Starting MosaicLite...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();
        myMosaicLiteFrame.setVisible(true);
    }
}