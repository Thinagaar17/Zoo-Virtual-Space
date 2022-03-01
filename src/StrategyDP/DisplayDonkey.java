/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DisplayDonkey implements EquusDisplayStrategy{
    URL urlDonkey = getClass().getResource("/Image/Donkey.png");
    ImageIcon donkeyIcon = new ImageIcon(urlDonkey);
    private javax.swing.JLabel donkey;
    
    public DisplayDonkey(JLabel donkey) {
        this.donkey = donkey;
    }

    @Override
    public void display() {
    	donkey.setIcon(donkeyIcon);
    	donkey.setVisible(true);
    	donkey.revalidate();
    }
}
