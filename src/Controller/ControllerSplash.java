/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.menuutama;
import View.splashh;
/**
 *
 * @author Thepooh
 */
public class ControllerSplash {
    splashh ss = new splashh();
    
    public ControllerSplash(){
         ss.setVisible(true);
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ss.setVisible(true);
                ss.setLocationRelativeTo(null);
            }
        });
        
        try {
            for (int i = 0; i <= 100; i++){
//                ss.getJoomlabel();//.setText(i+"%");
//                ss.getMplabel();//.setText(i+"%");
                ss.getjProgressBar1().setValue(i);
                Thread.sleep(50);
            }
            menuutama first = new menuutama();
            ss.dispose();
        } catch (Exception ex){
            new splashh().setVisible(false);
        }
    }
}
