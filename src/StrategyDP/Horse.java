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
public class Horse extends Equus{
    
    public Horse(JLabel horse) {
        equusDisplayStrategy = new DisplayHorse(horse);
        equusHideStrategy = new HideHorse(horse);
    }
}
