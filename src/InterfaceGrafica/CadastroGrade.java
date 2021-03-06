/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import Model.Curso;
import Model.Disciplina;
import Model.Grade;
import Model.Main;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class CadastroGrade extends javax.swing.JFrame {

    /**
     * Creates new form CadastroGrade
     */
    private Vector<String> disciplinasAdicionadas;
    private Vector<String> disciplinasDisponiveis;

    public CadastroGrade() {
        initComponents();
    }

    public void CarregarCampos() {
        disciplinasDisponiveis = new Vector<>();
        disciplinasAdicionadas = new Vector<>();

        for (int i = 0; i < Main.ListadeDisciplina.size(); i++) {
            disciplinasDisponiveis.add(Main.ListadeDisciplina.get(i).getNome());
        }
        discDispList.setListData(disciplinasDisponiveis);
        discAddList.setListData(disciplinasAdicionadas);

        cursoBox.removeAllItems();
        for (Curso c : Main.ListadeCursos) {
            cursoBox.addItem(c.getNome());
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cursoBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        ativaCheck = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        discAddList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        addDiscButton = new javax.swing.JButton();
        remDiscButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        discDispList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Curso");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Cadastro de Grade");

        jLabel4.setText("Curso:");

        jLabel5.setText("Ano:");

        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        ativaCheck.setText("Ativa");
        ativaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativaCheckActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(discAddList);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Disciplinas Obrigatórias");

        addDiscButton.setText("Adicionar");
        addDiscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiscButtonActionPerformed(evt);
            }
        });

        remDiscButton.setText("Remover");
        remDiscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remDiscButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(discDispList);

        jLabel6.setText("Lista de Disciplinas Disponíveis");

        jLabel8.setText("Listas Adicionadas à Grade");

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(ativaCheck))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(57, 57, 57)
                                    .addComponent(cursoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addDiscButton)
                                        .addComponent(remDiscButton))
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(voltarButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salvarButton))))
                        .addGap(0, 73, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cursoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(addDiscButton)
                            .addGap(18, 18, 18)
                            .addComponent(remDiscButton)
                            .addGap(30, 30, 30))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativaCheck)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(salvarButton))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    private void ativaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativaCheckActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
        if (ano.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Ano da Grade");
        } else if (disciplinasAdicionadas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É necessário que a Grade possua pelo menos UMA Disciplina");
        } else {
            try {
                Curso curso = null;
                ArrayList<Disciplina> disciplinas = new ArrayList<>();
                for (Curso c : Main.ListadeCursos) {
                    if (c.equals(cursoBox.getSelectedItem())) {
                        curso = c;
                    }
                }
                for (Disciplina d : Main.ListadeDisciplina) {
                    if (disciplinasAdicionadas.contains(d.getNome())) {
                        disciplinas.add(d);
                    }
                }

                Grade novaGrade = new Grade(Integer.parseInt(ano.getText()), curso, disciplinas, ativaCheck.isEnabled());
                Main.ListadeGrades.add(novaGrade);
                ano.setText("");
                disciplinasAdicionadas.clear();
                discAddList.setListData(disciplinasAdicionadas);

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Erro: ComboBox não selecionada ou vazia");
            }
        }

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
        Main.telaCadastroGrade.setVisible(false);
        Main.telaMenu.setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void addDiscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiscButtonActionPerformed
        if (!discDispList.isSelectionEmpty()) {
            String newItem = discDispList.getSelectedValue();
            int i = 0;

            if (disciplinasAdicionadas.contains(newItem)) {
                JOptionPane.showMessageDialog(null, "Esta Disciplina ja foi adicionada");
                return;
            }
            disciplinasAdicionadas.add(newItem);
            discAddList.setListData(disciplinasAdicionadas);
        }
    }//GEN-LAST:event_addDiscButtonActionPerformed

    private void remDiscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remDiscButtonActionPerformed
        if (!discAddList.isSelectionEmpty()) {
            String item = discDispList.getSelectedValue();
            disciplinasAdicionadas.remove(item);
            discAddList.setListData(disciplinasAdicionadas);
        }
    }//GEN-LAST:event_remDiscButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiscButton;
    private javax.swing.JTextField ano;
    private javax.swing.JCheckBox ativaCheck;
    private javax.swing.JComboBox<String> cursoBox;
    private javax.swing.JList<String> discAddList;
    private javax.swing.JList<String> discDispList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton remDiscButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
