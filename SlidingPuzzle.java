package javaapplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class SlidingPuzzle extends javax.swing.JFrame {
    int timer;
    Logic callClass = new Logic();
    
    public SlidingPuzzle() {
        initComponents();
        setResizable(false);
    }
    
    Timer time = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel4.setText(Integer.toString(timer));
            timer++;
        }           
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(375, 355));

        jLabel3.setText("Time:");

        jLabel2.setText("0");

        jLabel1.setText("Moves Count:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setText("14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setText("12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setText("15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton17.setText("Shuffle");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton18.setText("Quit");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel4.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        timer = 0;
        callClass.Shuffle();
        jButton1.setText(Integer.toString(callClass.shuffle[1]));
        jButton2.setText(Integer.toString(callClass.shuffle[2]));
        jButton3.setText(Integer.toString(callClass.shuffle[3]));
        jButton4.setText(Integer.toString(callClass.shuffle[4]));
        jButton5.setText(Integer.toString(callClass.shuffle[5]));
        jButton6.setText(Integer.toString(callClass.shuffle[6]));
        jButton7.setText(Integer.toString(callClass.shuffle[7]));
        jButton8.setText(Integer.toString(callClass.shuffle[8]));
        jButton9.setText(Integer.toString(callClass.shuffle[9]));
        jButton10.setText(Integer.toString(callClass.shuffle[10]));
        jButton11.setText(Integer.toString(callClass.shuffle[11]));
        jButton12.setText(Integer.toString(callClass.shuffle[12]));
        jButton13.setText(Integer.toString(callClass.shuffle[13]));
        jButton14.setText(Integer.toString(callClass.shuffle[14]));
        jButton15.setText(Integer.toString(callClass.shuffle[15]));
        jButton16.setText("");
        jLabel2.setText("0");
        time.start();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 2, 5;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton1.getText(), jButton2.getText());
                jButton1.setText(callClass.number[0]); jButton2.setText(callClass.number[1]);
            callClass.CheckButton(jButton1.getText(), jButton5.getText());
                jButton1.setText(callClass.number[0]); jButton5.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 1, 3, 6;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton2.getText(), jButton1.getText());
                jButton2.setText(callClass.number[0]); jButton1.setText(callClass.number[1]);
            callClass.CheckButton(jButton2.getText(), jButton3.getText());
                jButton2.setText(callClass.number[0]); jButton3.setText(callClass.number[1]);
            callClass.CheckButton(jButton2.getText(), jButton6.getText());
                jButton2.setText(callClass.number[0]); jButton6.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // 2, 4, 7;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton3.getText(), jButton2.getText());
                jButton3.setText(callClass.number[0]); jButton2.setText(callClass.number[1]);
            callClass.CheckButton(jButton3.getText(), jButton4.getText());
                jButton3.setText(callClass.number[0]); jButton4.setText(callClass.number[1]);
            callClass.CheckButton(jButton3.getText(), jButton7.getText());
                jButton3.setText(callClass.number[0]); jButton7.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // 3, 8;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton4.getText(), jButton3.getText());
                jButton4.setText(callClass.number[0]); jButton3.setText(callClass.number[1]);
            callClass.CheckButton(jButton4.getText(), jButton8.getText());
                jButton4.setText(callClass.number[0]); jButton8.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //1, 6, 9;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton5.getText(), jButton1.getText());   
                jButton5.setText(callClass.number[0]); jButton1.setText(callClass.number[1]);
            callClass.CheckButton(jButton5.getText(), jButton6.getText());
                jButton5.setText(callClass.number[0]); jButton6.setText(callClass.number[1]);
            callClass.CheckButton(jButton5.getText(), jButton9.getText());
            jButton5.setText(callClass.number[0]); jButton9.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //2, 5, 7, 10;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton6.getText(), jButton2.getText());     
                jButton6.setText(callClass.number[0]); jButton2.setText(callClass.number[1]);
            callClass.CheckButton(jButton6.getText(), jButton5.getText());  
                jButton6.setText(callClass.number[0]); jButton5.setText(callClass.number[1]);
            callClass.CheckButton(jButton6.getText(), jButton7.getText());
                jButton6.setText(callClass.number[0]); jButton7.setText(callClass.number[1]);
            callClass.CheckButton(jButton6.getText(), jButton10.getText());
                jButton6.setText(callClass.number[0]); jButton10.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //3, 6, 8, 11;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton7.getText(), jButton3.getText());
                jButton7.setText(callClass.number[0]); jButton3.setText(callClass.number[1]);        
            callClass.CheckButton(jButton7.getText(), jButton6.getText());   
                jButton7.setText(callClass.number[0]); jButton6.setText(callClass.number[1]);
            callClass.CheckButton(jButton7.getText(), jButton8.getText());
                jButton7.setText(callClass.number[0]); jButton8.setText(callClass.number[1]);
            callClass.CheckButton(jButton7.getText(), jButton11.getText());
                jButton7.setText(callClass.number[0]); jButton11.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // 4, 7, 12;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton8.getText(), jButton4.getText());  
                jButton8.setText(callClass.number[0]); jButton4.setText(callClass.number[1]);
            callClass.CheckButton(jButton8.getText(), jButton7.getText());
                jButton8.setText(callClass.number[0]); jButton7.setText(callClass.number[1]);
            callClass.CheckButton(jButton8.getText(), jButton12.getText());
                jButton8.setText(callClass.number[0]); jButton12.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // 5, 10, 13;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton9.getText(), jButton5.getText());   
                jButton9.setText(callClass.number[0]); jButton5.setText(callClass.number[1]);
            callClass.CheckButton(jButton9.getText(), jButton10.getText());
                jButton9.setText(callClass.number[0]); jButton10.setText(callClass.number[1]);
            callClass.CheckButton(jButton9.getText(), jButton13.getText());
                jButton9.setText(callClass.number[0]); jButton13.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // 6, 9, 11, 14;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton10.getText(), jButton6.getText());     
                jButton10.setText(callClass.number[0]); jButton6.setText(callClass.number[1]);
            callClass.CheckButton(jButton10.getText(), jButton9.getText());   
                jButton10.setText(callClass.number[0]); jButton9.setText(callClass.number[1]);
            callClass.CheckButton(jButton10.getText(), jButton11.getText());
                jButton10.setText(callClass.number[0]); jButton11.setText(callClass.number[1]);
            callClass.CheckButton(jButton10.getText(), jButton14.getText());
                jButton10.setText(callClass.number[0]); jButton14.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // 7, 10, 12, 15;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton11.getText(), jButton7.getText());        
                jButton11.setText(callClass.number[0]); jButton7.setText(callClass.number[1]);
            callClass.CheckButton(jButton11.getText(), jButton10.getText());
                jButton11.setText(callClass.number[0]); jButton10.setText(callClass.number[1]);        
            callClass.CheckButton(jButton11.getText(), jButton12.getText());
                jButton11.setText(callClass.number[0]); jButton12.setText(callClass.number[1]);
            callClass.CheckButton(jButton11.getText(), jButton15.getText());
                jButton11.setText(callClass.number[0]); jButton15.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // 8, 11, 16;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton12.getText(), jButton8.getText());  
                jButton12.setText(callClass.number[0]); jButton8.setText(callClass.number[1]);
            callClass.CheckButton(jButton12.getText(), jButton11.getText());
                jButton12.setText(callClass.number[0]); jButton11.setText(callClass.number[1]);
            callClass.CheckButton(jButton12.getText(), jButton16.getText());
                jButton12.setText(callClass.number[0]); jButton16.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // 9, 14;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton13.getText(), jButton9.getText());
                jButton13.setText(callClass.number[0]); jButton9.setText(callClass.number[1]);
            callClass.CheckButton(jButton13.getText(), jButton14.getText());
                jButton13.setText(callClass.number[0]); jButton14.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // 10, 13, 15;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton14.getText(), jButton10.getText()); 
                jButton14.setText(callClass.number[0]); jButton10.setText(callClass.number[1]);
            callClass.CheckButton(jButton14.getText(), jButton13.getText());
                jButton14.setText(callClass.number[0]); jButton13.setText(callClass.number[1]);
            callClass.CheckButton(jButton14.getText(), jButton15.getText());
                jButton14.setText(callClass.number[0]); jButton15.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // 11, 14, 16;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton15.getText(), jButton11.getText());
                jButton15.setText(callClass.number[0]); jButton11.setText(callClass.number[1]);
            callClass.CheckButton(jButton15.getText(), jButton14.getText());
                jButton15.setText(callClass.number[0]); jButton14.setText(callClass.number[1]);
            callClass.CheckButton(jButton15.getText(), jButton16.getText());
                jButton15.setText(callClass.number[0]); jButton16.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // 12, 15;
        if (callClass.start == 1) {
            callClass.CheckButton(jButton16.getText(), jButton12.getText());
                jButton16.setText(callClass.number[0]); jButton12.setText(callClass.number[1]);
            callClass.CheckButton(jButton16.getText(), jButton15.getText());
                jButton16.setText(callClass.number[0]); jButton15.setText(callClass.number[1]);
            if (callClass.CheckWin(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jButton10.getText(), jButton11.getText(), jButton12.getText(), jButton13.getText(), jButton14.getText(), jButton15.getText(), jButton16.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "You Won!");
                callClass.start = 0;
                time.stop();
            }
            jLabel2.setText(Integer.toString(callClass.movesCount));
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlidingPuzzle().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}