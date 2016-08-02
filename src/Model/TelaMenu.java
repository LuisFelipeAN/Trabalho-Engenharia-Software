/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Main;
import static javafx.application.Platform.exit;

/**
 *
 * @author Wallyce
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CadastroProfessor = new javax.swing.JButton();
        incluirDisciplina = new javax.swing.JButton();
        incluirAluno = new javax.swing.JButton();
        incluirDepartamento = new javax.swing.JButton();
        incluirCurso = new javax.swing.JButton();
        incluirGrade = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        incluirTurma = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Menu Principal");

        CadastroProfessor.setText("Incluir Professor");
        CadastroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroProfessorActionPerformed(evt);
            }
        });

        incluirDisciplina.setText("Incluir Disciplina");
        incluirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirDisciplinaActionPerformed(evt);
            }
        });

        incluirAluno.setText("Incluir Aluno");
        incluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirAlunoActionPerformed(evt);
            }
        });

        incluirDepartamento.setText("Incluir Departamento");
        incluirDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirDepartamentoActionPerformed(evt);
            }
        });

        incluirCurso.setText("Incluir Curso");
        incluirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirCursoActionPerformed(evt);
            }
        });

        incluirGrade.setText("Incluir Grade");
        incluirGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirGradeActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        incluirTurma.setText("Incluir Turma");
        incluirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(incluirTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incluirDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(incluirCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incluirGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incluirDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(incluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incluirDepartamento)
                    .addComponent(CadastroProfessor)
                    .addComponent(incluirDisciplina))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incluirCurso)
                    .addComponent(incluirGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incluirAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(incluirTurma)
                .addGap(11, 11, 11)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroProfessorActionPerformed
        Main.telaMenu.setVisible(false);
        Main.telaCadastroProfessor.setVisible(true);
        
        
    }//GEN-LAST:event_CadastroProfessorActionPerformed

    private void incluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirAlunoActionPerformed
        Main.telaMenu.setVisible(false);
        Main.telaCadastroAluno.setVisible(true);
    }//GEN-LAST:event_incluirAlunoActionPerformed

    private void incluirDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirDepartamentoActionPerformed
         Main.telaMenu.setVisible(false);
        Main.telaCadastroDepartamento.setVisible(true);
    }//GEN-LAST:event_incluirDepartamentoActionPerformed

    private void incluirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirDisciplinaActionPerformed
        Main.telaMenu.setVisible(false);   
        Main.telaCadastrDisciplina.setVisible(true);
    }//GEN-LAST:event_incluirDisciplinaActionPerformed

    private void incluirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirCursoActionPerformed
        Main.telaCadastroCurso.CarregarComboBoxes();        
        Main.telaMenu.setVisible(false);   
        Main.telaCadastroCurso.setVisible(true);
    }//GEN-LAST:event_incluirCursoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void incluirGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirGradeActionPerformed
        Main.telaCadastroGrade.CarregarCampos();
        Main.telaMenu.setVisible(false);   
        Main.telaCadastroGrade.setVisible(true);
    }//GEN-LAST:event_incluirGradeActionPerformed

    private void incluirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirTurmaActionPerformed
        Main.telaMenu.setVisible(false);
        Main.telaCadastroTurma.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_incluirTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroProfessor;
    private javax.swing.JButton incluirAluno;
    private javax.swing.JButton incluirCurso;
    private javax.swing.JButton incluirDepartamento;
    private javax.swing.JButton incluirDisciplina;
    private javax.swing.JButton incluirGrade;
    private javax.swing.JToggleButton incluirTurma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
