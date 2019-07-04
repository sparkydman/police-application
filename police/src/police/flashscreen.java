/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

import javax.swing.JOptionPane;

/**
 *
 * @author Gozie
 */
public class flashscreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         flash hmp = new flash();
        hmp.setVisible(true);
         try{
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
             hmp.jLabel3.setText(Integer.toString(i)+"%");
             //hmp.jProgressBar.setValue(i);
             home home = new home();
             if(i==100){
                 hmp.dispose();
                 home.setVisible(true);
             }
            }
        }catch(Exception e){
          // JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
