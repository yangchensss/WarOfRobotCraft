/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * 
 */
public class SetGameModeView extends javax.swing.JFrame {

    /**
     * Creates new form SetGameModelView
     */
    public SetGameModeView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        twoPlayersRadioButton = new javax.swing.JRadioButton();
        threePlayersRadioButton = new javax.swing.JRadioButton();
        sixPlayersRadioButton = new javax.swing.JRadioButton();
        playerTypeComboBox1 = new javax.swing.JComboBox<String>();
        playerTypeComboBox2 = new javax.swing.JComboBox<String>();
        playerTypeComboBox3 = new javax.swing.JComboBox<String>();
        confirmButton = new javax.swing.JButton();
        playerTypeComboBox4 = new javax.swing.JComboBox();
        playerTypeComboBox5 = new javax.swing.JComboBox();
        playerTypeComboBox6 = new javax.swing.JComboBox();
        greenLabel = new javax.swing.JLabel();
        redLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1003, 748));
        setMaximumSize(new java.awt.Dimension(1003, 748));
        setMinimumSize(new java.awt.Dimension(1003, 748));
        setPreferredSize(new java.awt.Dimension(1003, 748));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        buttonGroup2.add(twoPlayersRadioButton);
        twoPlayersRadioButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        twoPlayersRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        twoPlayersRadioButton.setText("Two Players");
        twoPlayersRadioButton.setContentAreaFilled(false);
        twoPlayersRadioButton.setMaximumSize(new java.awt.Dimension(200, 50));
        twoPlayersRadioButton.setMinimumSize(new java.awt.Dimension(200, 50));
        twoPlayersRadioButton.setPreferredSize(new java.awt.Dimension(200, 50));
        twoPlayersRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayersRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(twoPlayersRadioButton);
        twoPlayersRadioButton.setBounds(660, 50, 200, 50);

        threePlayersRadioButton.setBackground(new java.awt.Color(212, 82, 80));
        buttonGroup2.add(threePlayersRadioButton);
        threePlayersRadioButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        threePlayersRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        threePlayersRadioButton.setText("Three Players");
        threePlayersRadioButton.setContentAreaFilled(false);
        threePlayersRadioButton.setMaximumSize(new java.awt.Dimension(200, 50));
        threePlayersRadioButton.setMinimumSize(new java.awt.Dimension(200, 50));
        threePlayersRadioButton.setPreferredSize(new java.awt.Dimension(200, 50));
        threePlayersRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threePlayersRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(threePlayersRadioButton);
        threePlayersRadioButton.setBounds(660, 100, 200, 50);

        buttonGroup2.add(sixPlayersRadioButton);
        sixPlayersRadioButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        sixPlayersRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        sixPlayersRadioButton.setText("Six players");
        sixPlayersRadioButton.setContentAreaFilled(false);
        sixPlayersRadioButton.setMaximumSize(new java.awt.Dimension(200, 50));
        sixPlayersRadioButton.setMinimumSize(new java.awt.Dimension(200, 50));
        sixPlayersRadioButton.setPreferredSize(new java.awt.Dimension(200, 50));
        sixPlayersRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixPlayersRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sixPlayersRadioButton);
        sixPlayersRadioButton.setBounds(660, 150, 200, 50);

        playerTypeComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playerTypeComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "AI" }));
        playerTypeComboBox1.setAlignmentX(0.0F);
        playerTypeComboBox1.setAlignmentY(0.0F);
        playerTypeComboBox1.setMaximumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox1.setMinimumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox1.setPreferredSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox1.setSize(new java.awt.Dimension(200, 50));
        getContentPane().add(playerTypeComboBox1);
        playerTypeComboBox1.setBounds(660, 230, 200, 50);

        playerTypeComboBox2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playerTypeComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "AI" }));
        playerTypeComboBox2.setAlignmentX(0.0F);
        playerTypeComboBox2.setAlignmentY(0.0F);
        playerTypeComboBox2.setMaximumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox2.setMinimumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox2.setPreferredSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox2.setSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTypeComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(playerTypeComboBox2);
        playerTypeComboBox2.setBounds(660, 280, 200, 50);

        playerTypeComboBox3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playerTypeComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "AI" }));
        playerTypeComboBox3.setAlignmentX(0.0F);
        playerTypeComboBox3.setAlignmentY(0.0F);
        playerTypeComboBox3.setMaximumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox3.setMinimumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox3.setPreferredSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox3.setSize(new java.awt.Dimension(200, 50));
        getContentPane().add(playerTypeComboBox3);
        playerTypeComboBox3.setBounds(660, 330, 200, 50);

        confirmButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setToolTipText("");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButton);
        confirmButton.setBounds(660, 568, 200, 50);

        playerTypeComboBox4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playerTypeComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "AI" }));
        playerTypeComboBox4.setAlignmentX(0.0F);
        playerTypeComboBox4.setAlignmentY(0.0F);
        playerTypeComboBox4.setMaximumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox4.setMinimumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox4.setPreferredSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox4.setSize(new java.awt.Dimension(200, 50));
        getContentPane().add(playerTypeComboBox4);
        playerTypeComboBox4.setBounds(660, 380, 200, 50);

        playerTypeComboBox5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playerTypeComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "AI" }));
        playerTypeComboBox5.setAlignmentX(0.0F);
        playerTypeComboBox5.setAlignmentY(0.0F);
        playerTypeComboBox5.setMaximumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox5.setMinimumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox5.setPreferredSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox5.setSize(new java.awt.Dimension(200, 50));
        getContentPane().add(playerTypeComboBox5);
        playerTypeComboBox5.setBounds(660, 430, 200, 50);

        playerTypeComboBox6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playerTypeComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "AI" }));
        playerTypeComboBox6.setAlignmentX(0.0F);
        playerTypeComboBox6.setAlignmentY(0.0F);
        playerTypeComboBox6.setMaximumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox6.setMinimumSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox6.setPreferredSize(new java.awt.Dimension(200, 50));
        playerTypeComboBox6.setSize(new java.awt.Dimension(200, 50));
        getContentPane().add(playerTypeComboBox6);
        playerTypeComboBox6.setBounds(660, 480, 200, 50);

        greenLabel.setBackground(new java.awt.Color(145, 181, 77));
        greenLabel.setAlignmentY(0.0F);
        greenLabel.setMaximumSize(new java.awt.Dimension(200, 50));
        greenLabel.setMinimumSize(new java.awt.Dimension(200, 50));
        greenLabel.setOpaque(true);
        greenLabel.setPreferredSize(new java.awt.Dimension(200, 50));
        getContentPane().add(greenLabel);
        greenLabel.setBounds(660, 150, 200, 50);

        redLabel.setBackground(new java.awt.Color(214, 83, 85));
        redLabel.setAlignmentY(0.0F);
        redLabel.setMaximumSize(new java.awt.Dimension(200, 50));
        redLabel.setMinimumSize(new java.awt.Dimension(200, 50));
        redLabel.setOpaque(true);
        redLabel.setPreferredSize(new java.awt.Dimension(200, 50));
        getContentPane().add(redLabel);
        redLabel.setBounds(660, 100, 200, 60);

        blueLabel.setBackground(new java.awt.Color(152, 180, 212));
        blueLabel.setAlignmentY(0.0F);
        blueLabel.setMaximumSize(new java.awt.Dimension(200, 50));
        blueLabel.setMinimumSize(new java.awt.Dimension(200, 50));
        blueLabel.setOpaque(true);
        blueLabel.setPreferredSize(new java.awt.Dimension(200, 50));
        getContentPane().add(blueLabel);
        blueLabel.setBounds(660, 50, 200, 56);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void threePlayersRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePlayersRadioButtonActionPerformed
        // TODO add your handling code here:
        playerTypeComboBox1.setVisible(true);
        playerTypeComboBox2.setVisible(false);
        playerTypeComboBox3.setVisible(true);
        playerTypeComboBox4.setVisible(false);
        playerTypeComboBox5.setVisible(true);
        playerTypeComboBox6.setVisible(false);
        
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_threePlayersRadioButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void playerTypeComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTypeComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerTypeComboBox2ActionPerformed

    private void twoPlayersRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayersRadioButtonActionPerformed
        // TODO add your handling code here:
        playerTypeComboBox1.setVisible(true);
        playerTypeComboBox2.setVisible(false);
        playerTypeComboBox3.setVisible(false);
        playerTypeComboBox4.setVisible(true);
        playerTypeComboBox5.setVisible(false);
        playerTypeComboBox6.setVisible(false);
        
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_twoPlayersRadioButtonActionPerformed

    private void sixPlayersRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixPlayersRadioButtonActionPerformed
        // TODO add your handling code here:
        playerTypeComboBox1.setVisible(true);
        playerTypeComboBox2.setVisible(true);
        playerTypeComboBox3.setVisible(true);
        playerTypeComboBox4.setVisible(true);
        playerTypeComboBox5.setVisible(true);
        playerTypeComboBox6.setVisible(true);
        
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_sixPlayersRadioButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        playerTypeComboBox1.setVisible(false);
        playerTypeComboBox2.setVisible(false);
        playerTypeComboBox3.setVisible(false);
        playerTypeComboBox4.setVisible(false);
        playerTypeComboBox5.setVisible(false);
        playerTypeComboBox6.setVisible(false);
        
        confirmButton.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SetGameModeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetGameModeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetGameModeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetGameModeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetGameModeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JComboBox<String> playerTypeComboBox1;
    private javax.swing.JComboBox<String> playerTypeComboBox2;
    private javax.swing.JComboBox<String> playerTypeComboBox3;
    private javax.swing.JComboBox playerTypeComboBox4;
    private javax.swing.JComboBox playerTypeComboBox5;
    private javax.swing.JComboBox playerTypeComboBox6;
    private javax.swing.JLabel redLabel;
    private javax.swing.JRadioButton sixPlayersRadioButton;
    private javax.swing.JRadioButton threePlayersRadioButton;
    private javax.swing.JRadioButton twoPlayersRadioButton;
    // End of variables declaration//GEN-END:variables


	/**
	 * @return the buttonGroup1
	 */
	public javax.swing.ButtonGroup getButtonGroup1() {
		return buttonGroup1;
	}

	/**
	 * @param buttonGroup1 the buttonGroup1 to set
	 */
	public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
		this.buttonGroup1 = buttonGroup1;
	}

	/**
	 * @return the buttonGroup2
	 */
	public javax.swing.ButtonGroup getButtonGroup2() {
		return buttonGroup2;
	}

	/**
	 * @param buttonGroup2 the buttonGroup2 to set
	 */
	public void setButtonGroup2(javax.swing.ButtonGroup buttonGroup2) {
		this.buttonGroup2 = buttonGroup2;
	}

	/**
	 * @return the confirmButton
	 */
	public javax.swing.JButton getConfirmButton() {
		return confirmButton;
	}

	/**
	 * @param confirmButton the confirmButton to set
	 */
	public void setConfirmButton(javax.swing.JButton confirmButton) {
		this.confirmButton = confirmButton;
	}

	/**
	 * @return the playerTypeComboBox1
	 */
	public javax.swing.JComboBox<String> getPlayerTypeComboBox1() {
		return playerTypeComboBox1;
	}

	/**
	 * @param playerTypeComboBox1 the playerTypeComboBox1 to set
	 */
	public void setPlayerTypeComboBox1(javax.swing.JComboBox<String> playerTypeComboBox1) {
		this.playerTypeComboBox1 = playerTypeComboBox1;
	}

	/**
	 * @return the playerTypeComboBox2
	 */
	public javax.swing.JComboBox<String> getPlayerTypeComboBox2() {
		return playerTypeComboBox2;
	}

	/**
	 * @param playerTypeComboBox2 the playerTypeComboBox2 to set
	 */
	public void setPlayerTypeComboBox2(javax.swing.JComboBox<String> playerTypeComboBox2) {
		this.playerTypeComboBox2 = playerTypeComboBox2;
	}

	/**
	 * @return the playerTypeComboBox3
	 */
	public javax.swing.JComboBox<String> getPlayerTypeComboBox3() {
		return playerTypeComboBox3;
	}

	/**
	 * @param playerTypeComboBox3 the playerTypeComboBox3 to set
	 */
	public void setPlayerTypeComboBox3(javax.swing.JComboBox<String> playerTypeComboBox3) {
		this.playerTypeComboBox3 = playerTypeComboBox3;
	}

	/**
	 * @return the playerTypeComboBox4
	 */
	public javax.swing.JComboBox getPlayerTypeComboBox4() {
		return playerTypeComboBox4;
	}

	/**
	 * @param playerTypeComboBox4 the playerTypeComboBox4 to set
	 */
	public void setPlayerTypeComboBox4(javax.swing.JComboBox playerTypeComboBox4) {
		this.playerTypeComboBox4 = playerTypeComboBox4;
	}

	/**
	 * @return the playerTypeComboBox5
	 */
	public javax.swing.JComboBox getPlayerTypeComboBox5() {
		return playerTypeComboBox5;
	}

	/**
	 * @param playerTypeComboBox5 the playerTypeComboBox5 to set
	 */
	public void setPlayerTypeComboBox5(javax.swing.JComboBox playerTypeComboBox5) {
		this.playerTypeComboBox5 = playerTypeComboBox5;
	}

	/**
	 * @return the playerTypeComboBox6
	 */
	public javax.swing.JComboBox getPlayerTypeComboBox6() {
		return playerTypeComboBox6;
	}

	/**
	 * @param playerTypeComboBox6 the playerTypeComboBox6 to set
	 */
	public void setPlayerTypeComboBox6(javax.swing.JComboBox playerTypeComboBox6) {
		this.playerTypeComboBox6 = playerTypeComboBox6;
	}

	/**
	 * @return the sixPlayersRadioButton
	 */
	public javax.swing.JRadioButton getSixPlayersRadioButton() {
		return sixPlayersRadioButton;
	}

	/**
	 * @param sixPlayersRadioButton the sixPlayersRadioButton to set
	 */
	public void setSixPlayersRadioButton(javax.swing.JRadioButton sixPlayersRadioButton) {
		this.sixPlayersRadioButton = sixPlayersRadioButton;
	}

	/**
	 * @return the threePlayersRadioButton
	 */
	public javax.swing.JRadioButton getThreePlayersRadioButton() {
		return threePlayersRadioButton;
	}

	/**
	 * @param threePlayersRadioButton the threePlayersRadioButton to set
	 */
	public void setThreePlayersRadioButton(javax.swing.JRadioButton threePlayersRadioButton) {
		this.threePlayersRadioButton = threePlayersRadioButton;
	}

	/**
	 * @return the twoPlayersRadioButton
	 */
	public javax.swing.JRadioButton getTwoPlayersRadioButton() {
		return twoPlayersRadioButton;
	}

	/**
	 * @param twoPlayersRadioButton the twoPlayersRadioButton to set
	 */
	public void setTwoPlayersRadioButton(javax.swing.JRadioButton twoPlayersRadioButton) {
		this.twoPlayersRadioButton = twoPlayersRadioButton;
	}
	
    
}
