/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Jan 1, 2009, 12:42:47 AM
 */

package loginform;

import javax.swing.JOptionPane;

/**
 *
 * @author DFCAITTI
 */
public class LOADING_ACC_SET extends javax.swing.JFrame implements Runnable  {
int s=0;
    Thread th;
    public LOADING_ACC_SET() {
        initComponents();
        setLocationRelativeTo(null); th=new Thread ((Runnable)this);
    }
public void setUploading(){
    setVisible(false);
    th.start();
}
public void run(){
    try{
        for(int i=2;i<200;i++){
            s=s+2;
                    int m=jProgressBar1.getMaximum();
                    int v=jProgressBar1.getValue();
                    if(v<m){
                        jProgressBar1.setValue(jProgressBar1.getValue()+1);
                    }else{
                        i=201;
                        setVisible(false);
                      new Changepass().setVisible(true);
                    }Thread.sleep(50);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(516, 478));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/LOWER.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 360, 430, 600);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(120, 490, 146, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/Carrie.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-150, -200, 860, 950);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOADING_ACC_SET().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    public void takbo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
