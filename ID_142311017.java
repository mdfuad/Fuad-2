/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ID_142311017 extends javax.swing.JFrame {
private double total1=0.0;
   private double total2=0.0;
   private double total3=0.0;
   private char math_operator;
  //  private Object add;
   // private Object sub;
  //  private Object mul;
   // private Object div;
   //
public ID_142311017() {      super("Made by Fuad.ID-142311017");
        initComponents();
  
    }
    private void getOperator(String btnText)
    {
    math_operator= btnText.charAt(0);
    total1 = total1 + Double.parseDouble( txtdisplay.getText( ) ) ;//(+,-,/,*)will not work&print last valu gvn byuser
     txtdisplay.setText(" ");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtdisplay = new javax.swing.JTextField();
        Sqrt = new javax.swing.JButton();
        qub = new javax.swing.JButton();
        qbroot = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        root = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(100, 209, 20));
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(24, 240, 240));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(24, 240, 240));
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMul.setBackground(new java.awt.Color(24, 240, 240));
        btnMul.setText("*");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(24, 240, 240));
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnEqual.setBackground(new java.awt.Color(240, 24, 240));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnSin.setBackground(new java.awt.Color(240, 240, 40));
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setBackground(new java.awt.Color(240, 240, 40));
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setBackground(new java.awt.Color(240, 240, 40));
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        Sqrt.setForeground(new java.awt.Color(100, 70, 30));
        Sqrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roots.jpg"))); // NOI18N
        Sqrt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrtActionPerformed(evt);
            }
        });

        qub.setMnemonic('1');
        qub.setText("X3");
        qub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qubActionPerformed(evt);
            }
        });

        qbroot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuberoot1.jpg"))); // NOI18N
        qbroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qbrootActionPerformed(evt);
            }
        });

        btnLog.setBackground(new java.awt.Color(240, 240, 40));
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(240, 200, 20));
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        root.setIcon(new javax.swing.ImageIcon(getClass().getResource("/n1.png"))); // NOI18N
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qbroot, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(qub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1))
                            .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(qub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEqual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnZero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(qbroot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        qub.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        String btnOneText = txtdisplay.getText() /*without it one Button will apear once*/+ btnOne.getText();//without btnOnegetText() 1 will not appear.
        
        txtdisplay.setText(btnOneText);//btn will no0t apear
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
       String btnTwoText = txtdisplay.getText() + btnTwo.getText();
        txtdisplay.setText(btnTwoText); 
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        String btnThreeText = txtdisplay.getText() + btnThree.getText();
        txtdisplay.setText(btnThreeText);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
       String btnFourText = txtdisplay.getText() + btnFour.getText();
        txtdisplay.setText(btnFourText);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
      String btnFiveText = txtdisplay.getText() + btnFive.getText();
        txtdisplay.setText(btnFiveText);  
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
      String btnSixText = txtdisplay.getText() + btnSix.getText();
        txtdisplay.setText(btnSixText);  
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        String btnSevenText = txtdisplay.getText() + btnSeven.getText();
        txtdisplay.setText(btnSevenText);
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
      String btnEightText = txtdisplay.getText() + btnEight.getText();
        txtdisplay.setText(btnEightText);  
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
    String btnNineText = txtdisplay.getText() + btnNine.getText();
        txtdisplay.setText(btnNineText);   
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
    String btnZeroText = txtdisplay.getText() + btnZero.getText();
        txtdisplay.setText(btnZeroText);   
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        total2=0;     
        txtdisplay.setText(""); 
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
         switch ( math_operator ) {
        case '+':
            total2 = total1+ Double.parseDouble(txtdisplay.getText( ) );
        break;
        case '-':
           
            total2 = total1 - Double.parseDouble(txtdisplay.getText( ) );
             
        break;
        case '/':
            total2 = total1 / Double.parseDouble(txtdisplay.getText( ) );
        break;
        case '*':
            total2 = total1 * Double.parseDouble(txtdisplay.getText( ) );
        break;
        }
        
          txtdisplay.setText( Double.toString(total2) );//Result dekhabena
        total1 = 0;// without it ager resulter sathe jog kore result dibe
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        String btnPlusq;
    btnPlusq = btnPlus.getText();
        getOperator(btnPlusq); 
       
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
       String Minus=  btnMinus.getText();
        getOperator(Minus); 
         
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
       String Multiplication = btnMul.getText();
        getOperator(Multiplication);  
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
      String Divition = btnDiv.getText();
        getOperator(Divition);   
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        double s=Double.parseDouble(txtdisplay.getText( ) );
         txtdisplay.setText(Double.toString(java.lang.Math.sin(s*Math.PI/180)));
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
       double p=Double.parseDouble(txtdisplay.getText( ) );
        txtdisplay.setText(Double.toString(java.lang.Math.cos(p*Math.PI/180))); 
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
      double value=Double.parseDouble(txtdisplay.getText( ) );
      if(value==90){
          txtdisplay.setText("Infinait");
      }
      else
         txtdisplay.setText(Double.toString(java.lang.Math.tan(value*Math.PI/180)));  
    }//GEN-LAST:event_btnTanActionPerformed

    private void SqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrtActionPerformed
          double t=Double.parseDouble(txtdisplay.getText( ) );
         txtdisplay.setText(Double.toString(java.lang.Math.pow(t,2)));
    }//GEN-LAST:event_SqrtActionPerformed

    private void qubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qubActionPerformed
        double q=Double.parseDouble(txtdisplay.getText( ) );
         txtdisplay.setText(Double.toString(java.lang.Math.pow(q,3))); 
    }//GEN-LAST:event_qubActionPerformed

    private void qbrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qbrootActionPerformed
        double q=Double.parseDouble(txtdisplay.getText( ) );
         txtdisplay.setText(Double.toString(java.lang.Math.pow(q,1.0/3))); // TODO add your handling code here:
    }//GEN-LAST:event_qbrootActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
 double v=Double.parseDouble(txtdisplay.getText( ) );
         txtdisplay.setText(Double.toString(java.lang.Math.log10(v)));          
    }//GEN-LAST:event_btnLogActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
       double q=Double.parseDouble(txtdisplay.getText( ) );
         txtdisplay.setText(Double.toString(java.lang.Math.pow(q,1.0/2))); // TODO add your handling code here:
    }//GEN-LAST:event_rootActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ID_142311017().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sqrt;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton qbroot;
    private javax.swing.JButton qub;
    private javax.swing.JButton root;
    private javax.swing.JTextField txtdisplay;
    // End of variables declaration//GEN-END:variables

}
   

