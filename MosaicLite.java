import javax.swing.JFrame;

class MosaicLiteFrame extends JFrame {
    public MosaicLiteFrame() {
        setBounds(200,200,1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class MosaicLite {
    public static void main(String [] args) {
        System.out.println("Starting MosaicLite...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();
        myMosaicLiteFrame.setVisible(true);
    }
}