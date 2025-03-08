package conversor.de.moedas;

import javax.swing.*;

public class layoutMoedas extends javax.swing.JFrame {

    public layoutMoedas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelValor = new javax.swing.JLabel();
        textFieldValor = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        comboBoxMoedas = new javax.swing.JComboBox<>();
        labelTítulo = new javax.swing.JLabel();
        comboBoxMoedas2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelValor.setText("Valor:");

        textFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValorActionPerformed(evt);
            }
        });

        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        comboBoxMoedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - Dólar", "EUR - Euro", "BRL - Real", "GBP - Libra" }));
        comboBoxMoedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMoedasActionPerformed(evt);
            }
        });

        labelTítulo.setText("Conversor de moedas");

        comboBoxMoedas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - Dólar", "EUR - Euro", "BRL - Real", "GBP - Libra" }));
        comboBoxMoedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMoedas2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Moeda para selecionar:");

        jLabel2.setText("Moeda para converter:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(comboBoxMoedas2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(labelTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(comboBoxMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxMoedas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxMoedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMoedasActionPerformed
        
    }//GEN-LAST:event_comboBoxMoedasActionPerformed

    private void textFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValorActionPerformed
        
    }//GEN-LAST:event_textFieldValorActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        try {
            
        String valorTexto = textFieldValor.getText(); // Pega o valor digitado no campo de texto
        if (valorTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um valor.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double valor = Double.parseDouble(valorTexto); 

        
        String moedaSelecionada = (String) comboBoxMoedas2.getSelectedItem(); // Pega a moeda selecionada
        String[] moedasSplit = moedaSelecionada.split(" - "); // Divide "USD - Dólar" em "USD" e "Dólar. Algumas APIs só recebem a sigla."
        String moedaOrigem = moedasSplit[0]; // Exemplo: 0 = "USD"
        String moedaConversao = (String) comboBoxMoedas.getSelectedItem(); // Pega a moeda de conversão
        String[] moedasSplit2 = moedaConversao.split(" - ");
        String moedaDestino = moedasSplit2[0];

        // Busca a taxa de câmbio
        double taxa = ApiRequest.getExchangeRate(moedaOrigem, moedaDestino);
        if (taxa == -1) {
            JOptionPane.showMessageDialog(this, "Selecione moedas diferentes.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calcula o valor convertido
        double convertido = valor * taxa;

        // Exibe o resultado
        JOptionPane.showMessageDialog(this, "Valor convertido: R$ " + String.format("%.2f", convertido), "Conversão Concluída", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void comboBoxMoedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMoedas2ActionPerformed
        
    }//GEN-LAST:event_comboBoxMoedas2ActionPerformed

  
    public static void main(String args[]) {
        
        //serve para o estilo visual do programa, no caso, o nimbus.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(layoutMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layoutMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layoutMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layoutMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layoutMoedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JComboBox<String> comboBoxMoedas;
    private javax.swing.JComboBox<String> comboBoxMoedas2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelTítulo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField textFieldValor;
    // End of variables declaration//GEN-END:variables
}
