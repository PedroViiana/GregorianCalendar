import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Viana
 */
public class cap2 extends javax.swing.JFrame {

    /**
     * Creates new form cap2
     */
    public cap2() {
        initComponents();
        
       GregorianCalendar hoje = new GregorianCalendar(); // Data de hoje do computador
        
       //Declarando variaveis do dia atual
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        
        //Atribuindo dia atual para label
        txtAtual.setText(diaAtual+"/"+(mesAtual+1)+"/"+anoAtual);
        
        //Atribuindo 15 dias a mais do dia atual
        hoje.add(Calendar.DAY_OF_MONTH,15);
        int dia15 = hoje.get(Calendar.DAY_OF_MONTH);
        txt15.setText(dia15+"/"+(mesAtual+2)+"/"+anoAtual);
        hoje.add(Calendar.DAY_OF_MONTH,-15);
        
        //Atribuindo 45 dias a mais do dia atual
        hoje.add(Calendar.DAY_OF_MONTH,45);
        int dia45 = hoje.get(Calendar.DAY_OF_MONTH);
        txt45.setText(dia45+"/"+(mesAtual+3)+"/"+anoAtual);
        hoje.add(Calendar.DAY_OF_MONTH,-45);
     
        //Atribuindo 90 dias a mais do dia atual
        hoje.add(Calendar.DAY_OF_MONTH,90);
        int dia90 = hoje.get(Calendar.DAY_OF_MONTH);
        txt90.setText(dia90+"/"+(mesAtual+4)+"/"+anoAtual);
        hoje.add(Calendar.DAY_OF_MONTH,-90);
        
        //Atribuindo dia da semana do meu aniversario
        hoje.add(Calendar.DAY_OF_MONTH,77);
        int diaDaSemanaNiver = hoje.get(Calendar.DAY_OF_WEEK);
        txtAniversario.setText(""+diaDaSemanaNiver+"º dia da semana, na quarta-feira");
        hoje.add(Calendar.DAY_OF_MONTH,-77);
        
        //Atribuindo dia da semana do natal
        hoje.add(Calendar.DAY_OF_MONTH,276);
        int diaNatal = hoje.get(Calendar.DAY_OF_WEEK);
        txtNatal.setText(""+diaNatal+"º dia da semana, no sábado");
        hoje.add(Calendar.DAY_OF_MONTH,-276);
        
        //Atribuindo dia da semana do ano novo
        hoje.add(Calendar.DAY_OF_MONTH,-82);
        int diaNovo = hoje.get(Calendar.DAY_OF_WEEK);
        txtAno.setText(""+diaNovo+"º dia da semana, na sexta");
        hoje.add(Calendar.DAY_OF_MONTH,82);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelAtual = new javax.swing.JLabel();
        txtAtual = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        txt15 = new javax.swing.JLabel();
        label45 = new javax.swing.JLabel();
        txt45 = new javax.swing.JLabel();
        label90 = new javax.swing.JLabel();
        txt90 = new javax.swing.JLabel();
        labelAniversario = new javax.swing.JLabel();
        txtAniversario = new javax.swing.JLabel();
        labelNatal = new javax.swing.JLabel();
        txtNatal = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        labelTitulo.setText("Datas - 2021");

        labelAtual.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelAtual.setText("Data atual:");

        txtAtual.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        label15.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label15.setText("Data daqui 15 dias:");

        txt15.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        label45.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label45.setText("Data daqui 45 dias:");

        txt45.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        label90.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label90.setText("Data daqui 90 dias:");

        txt90.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        labelAniversario.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelAniversario.setText("Dia da semana do meu aniversário:");

        txtAniversario.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        labelNatal.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelNatal.setText("Dia da semana do natal:");

        txtNatal.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        labelAno.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelAno.setText("Dia da semana do ano novo:");

        txtAno.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(labelTitulo))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAtual)
                .addGap(6, 6, 6)
                .addComponent(txtAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label15)
                .addGap(6, 6, 6)
                .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label45)
                .addGap(6, 6, 6)
                .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label90)
                .addGap(6, 6, 6)
                .addComponent(txt90, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAniversario)
                .addGap(6, 6, 6)
                .addComponent(txtAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelNatal)
                .addGap(6, 6, 6)
                .addComponent(txtNatal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAno)
                .addGap(6, 6, 6)
                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitulo)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAtual)
                    .addComponent(txtAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label15)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label45)
                    .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label90)
                    .addComponent(txt90))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAniversario)
                    .addComponent(txtAniversario))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNatal)
                    .addComponent(txtNatal))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAno)
                    .addComponent(txtAno)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cap2().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label45;
    private javax.swing.JLabel label90;
    private javax.swing.JLabel labelAniversario;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAtual;
    private javax.swing.JLabel labelNatal;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel txt15;
    private javax.swing.JLabel txt45;
    private javax.swing.JLabel txt90;
    private javax.swing.JLabel txtAniversario;
    private javax.swing.JLabel txtAno;
    private javax.swing.JLabel txtAtual;
    private javax.swing.JLabel txtNatal;
    // End of variables declaration//GEN-END:variables
}
//A data de hoje, a data daqui a 15, 45 e 90 dias a partir da data de hoje (formato: dd/mm/ano) 
//● O dia da semana do seu aniversário (formato: por extenso) 
//● O dia da semana do natal e do ano novo de 2021 (formato: por extenso)
