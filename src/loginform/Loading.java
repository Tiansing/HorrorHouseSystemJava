/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Loading.java
 *
 * Created on Nov 28, 2018, 10:02:56 PM
 */

package loginform;

import javax.swing.JOptionPane;

/**
 *
 * @author DFCAITTI
 */
public class Loading extends javax.swing.JFrame implements Runnable {
int s=0;
    Thread th;

    /** Creates new form Loading */
    public Loading() {
        super("loadng");
        initComponents();
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
                      new Home().setVisible(true);
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        jProgressBar1.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(478, 456));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/eternal.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 459);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-478)/2, (screenSize.height-456)/2, 478, 456);
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    public void takbo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}
