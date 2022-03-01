/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDP;

import javax.swing.JLabel;

import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class HideDonkey implements EquusHideStrategy {

    private javax.swing.JLabel donkey;
    
    public HideDonkey(JLabel donkey2) {
        this.donkey = donkey2;
    }

    @Override
    public void hide() {
    	donkey.setVisible(false);
    	donkey.revalidate();
    }
}
