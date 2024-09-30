/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hdiep.busmanagerment.CustomSwing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author diepm
 */
public class CustomLabel extends JLabel{
    public CustomLabel(String text){
        super(text);
        setFont(new Font("Arial", Font.BOLD, 14)); // Custom font
        setForeground(Color.BLACK); // custom text color
        setHorizontalAlignment(SwingConstants.CENTER); // create alignment
    }
    
}
