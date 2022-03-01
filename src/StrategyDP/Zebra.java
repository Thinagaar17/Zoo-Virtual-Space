/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDP;

import javax.swing.JLabel;

//used for Strategy Pattern

import Main.Zoo;
/**
 *
 * @author Logan
 */
public class Zebra extends Equus{

    public Zebra(JLabel zebra) {
        equusDisplayStrategy = new DisplayZebra(zebra);
        equusHideStrategy = new HideZebra(zebra);
    }

}
