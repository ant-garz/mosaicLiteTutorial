import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import java.util.ArrayList;
import java.util.Random;

class XAndOTile extends JPanel {
    private int red,green,blue;
    private String letter;

    XAndOTile() {
        super();
        SetRandomValue();
    }

    final public void SetRandomValue() {
        red = GetNumberBetween(0,255);
        green = GetNumberBetween(0,255);
        blue = GetNumberBetween(0,255);

        letter = "X";
        if(GetNumberBetween(0,1) ==1 ) {
            letter = "O";
        }
    }

    public void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        graphic.setColor(new Color(red,green,blue));
        graphic.fillRect(10, 10, panelWidth, panelHeight);

        graphic.setColor(new Color(GetContrastingColor(red), GetContrastingColor(green), GetContrastingColor(blue)));

        final int fontSize = 100;
        graphic.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        int stringX = (panelWidth/2) - 30;
        int stringY = (panelHeight/2) + 30;
        graphic.drawString(letter, stringX, stringY);
    }

    private static int GetContrastingColor(int colorIn) {
        return ((colorIn+128)%256);
    }
    
    private static int GetNumberBetween(int min, int max) {
        Random myRandom = new Random();
        return min + myRandom.nextInt(max-min+1);
    }
    
}

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

        for (int i = 1; i < 10; i++) {
            XAndOTile tile = new XAndOTile();
            xAndOGridPanel.add(tile);
        }
    }
}

public class MosaicLite {
    public static void main(String [] args) {
        System.out.println("Starting MosaicLite...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();
        myMosaicLiteFrame.setVisible(true);
    }
}