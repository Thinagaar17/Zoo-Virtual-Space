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
public class Donkey extends Equus {

    public Donkey(JLabel donkey) {
        equusDisplayStrategy = new DisplayDonkey(donkey);
        equusHideStrategy = new HideDonkey(donkey);
    }

}
