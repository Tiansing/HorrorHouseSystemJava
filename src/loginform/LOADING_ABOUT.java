/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LOADING_ABOUT.java
 *
 * Created on Jan 1, 2009, 1:16:54 AM
 */

package loginform;

import javax.swing.JOptionPane;

/**
 *
 * @author DFCAITTI
 */
public class LOADING_ABOUT extends javax.swing.JFrame implements Runnable {

 int s=0;
    Thread th;

    public LOADING_ABOUT() {
       super("loadng"); initComponents();
    setLocationRelativeTo(null);
      th=new Thread ((Runnable)this);
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
                      new About().setVisible(true);
                    }Thread.sleep(50);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(521, 478));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/LOWER.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 360, 430, 600);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 490, 146, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/1653ac76f1ee424bcd924fc6147472f9f6afdc79_hq.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, -50, 700, 560);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -70, 780, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOADING_ABOUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    public void takbo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
