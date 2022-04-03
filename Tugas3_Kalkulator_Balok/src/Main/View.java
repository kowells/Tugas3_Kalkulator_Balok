/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ruang.Balok;

/**
 *
 * @author ridwa
 */
public class View extends JFrame implements ActionListener{
    JLabel lTitle,lLength, lWidth, lHeight, lResult, 
            lSquareA, lSquareC, lCuboidV, lCuboidSA, 
            lHasil1, lHasil2, lHasil3, lHasil4;
    JButton tombolCount, tombolReset;
    final JTextField fLength, fWidth, fHeight;
    
    public View(){
            lTitle = new JLabel("Cuboid Calculator");
            lLength = new JLabel("Length");
            lWidth= new JLabel("Width");
            lHeight = new JLabel("Height");
            lResult = new JLabel("Result :");
            lSquareA = new JLabel(""); 
            lSquareC = new JLabel("");
            lCuboidV = new JLabel("");
            lCuboidSA = new JLabel("");
            lHasil1 = new JLabel("");
            lHasil2 = new JLabel("");
            lHasil3 = new JLabel("");
            lHasil4 = new JLabel("");
            tombolCount = new JButton("Count");
            tombolReset = new JButton("Reset");

            fLength = new JTextField();
            fWidth = new JTextField();
            fHeight = new JTextField();

            setLayout(null);
            add(lTitle);
            add(lLength);
            add(lWidth);
            add(lHeight);
            add(lResult);
            add(tombolCount);
            add(tombolReset);
            add(fLength);
            add(fWidth);
            add(fHeight);
            
            add(lSquareA);
            add(lSquareC);
            add(lCuboidV);
            add(lCuboidSA);

            add(lHasil1);
            add(lHasil2);
            add(lHasil3);
            add(lHasil4);

            lTitle.setBounds(180, 20, 140, 40);
            lLength.setBounds(50, 80, 40, 40);
            lWidth.setBounds(50, 120, 40, 40);
            lHeight.setBounds(50, 160, 40, 40);
            lResult.setBounds(150, 200, 50, 40);

            lSquareA.setBounds(50, 240, 150, 40);
            lSquareC.setBounds(50, 280, 150, 40);
            lCuboidV.setBounds(50,320, 150, 40);
            lCuboidSA.setBounds(50, 360, 150, 40);

            lHasil1.setBounds(200, 240, 50, 40);
            lHasil2.setBounds(200, 280, 50, 40);
            lHasil3.setBounds(200, 320, 50, 40);
            lHasil4.setBounds(200, 360, 50, 40);

            fLength.setBounds(160, 90, 200, 20);
            fWidth.setBounds(160, 130, 200, 20);
            fHeight.setBounds(160, 170, 200, 20);

            tombolCount.setBounds(170, 400, 70, 20);
            tombolReset.setBounds(260, 400, 70, 20);

            tombolCount.addActionListener(this);
            tombolReset.addActionListener(this);

            setSize(500,500);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == tombolCount){
                
                String l = fLength.getText();
                String w = fWidth.getText();
                String h = fHeight.getText();
                try{
                    double length = Double.parseDouble(l);
                    double width = Double.parseDouble(w);
                    double height = Double.parseDouble(h);
                    Balok balok = new Balok(height, length, width);
                    balok.menghitungLuas(); balok.menghitungKeliling(); 
                    balok.menghitungVolume(); balok.menghitungLuasPermukaan();
                    lSquareA.setText("Square Area");
                    lSquareC.setText("Square Circumference");
                    lCuboidV.setText("Cuboid Volume");
                    lCuboidSA.setText("Cuboid Surface Area");
                    
                    lHasil1.setText(": "+balok.getLuas());
                    lHasil2.setText(": "+balok.getKeliling());
                    lHasil3.setText(": "+balok.getVolume());
                    lHasil4.setText(": "+balok.getLuaspermukaan());

                }catch(Exception error){
                    JOptionPane.showMessageDialog(new JFrame(), error.getMessage()); 
                }

            }
            if(e.getSource() == tombolReset){
                fLength.setText("");
                fWidth.setText("");
                fHeight.setText("");
                lSquareA.setText("");
                lSquareC.setText("");
                lCuboidV.setText("");
                lCuboidSA.setText("");
                lHasil1.setText("");
                lHasil2.setText("");
                lHasil3.setText("");
                lHasil4.setText("");
            }
        }
}
