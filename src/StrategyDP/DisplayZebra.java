package StrategyDP;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class DisplayZebra implements EquusDisplayStrategy{
    private javax.swing.JLabel zebra;
    URL urlZebra = getClass().getResource("/Image/Zebra.png");
    ImageIcon zebraIcon = new ImageIcon(urlZebra);
    
    public DisplayZebra(JLabel zebra2) {
        zebra = zebra2;
    }

    @Override
    public void display() {
    	zebra.setIcon(zebraIcon);
    	zebra.setVisible(true);
    	zebra.revalidate();
    }
}
