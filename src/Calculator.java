//Imported Moduels
import java.awt.Color;
import java.awt.Desktop;
import java.io.*;

/**Runs a calculator GUI
 * 2021-02-11
 * Created by: Connor
 * ICS4U
 * 
 * Added Features
 * Dark mode and light mode for the user to pick their preference.
 * Power, Square root, negative/positive toggle button (NOTE: A number must be selected before pressing the negative/positive toggle button and the sqrt root button)
 * Calculator history text document which shows the calculations the user made (Called "Calculator History.txt")
 */

public class Calculator extends javax.swing.JFrame {
    
    
    //Declaring my double variables total1 and total2
    private double total1 = 0.0;
    private double total2 = 0.0;
    //Declaring my char variable math_operator
    private char math_operator;
    
    //Custom Function
    private void getOperator(String btnText) {
        //Sets the math_operator to the first character of the button
        math_operator = btnText.charAt(0);
        //Setting total1 (0.0) to total1 + the number in the txtDisplay to get the first value from the user
        total1 = total1 + Double.parseDouble(txtDisplay.getText());
        //Settin the txtDisplay to clear so the user can pick the second number later on.
        txtDisplay.setText("");
    }
    

    public Calculator() {
        initComponents();
    }
    
    //Configuration of GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        btnBackspace = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        negativeOrPositive = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        history = new javax.swing.JMenuItem();
        mode = new javax.swing.JMenu();
        darkMode = new javax.swing.JMenuItem();
        lightMode = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(255, 255, 255));

        btnOne.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDecimal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClear.setText("Cl");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtDisplay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnBackspace.setText("Backspace");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPower.setText("^");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        btnSqrt.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnSqrt.setText("√");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        negativeOrPositive.setText("-/+");
        negativeOrPositive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeOrPositiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(negativeOrPositive)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackspace))
                .addGap(1, 1, 1)
                .addComponent(negativeOrPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        File.setText("File");

        history.setText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        File.add(history);

        jMenuBar1.add(File);

        mode.setText("Mode");

        darkMode.setText("Dark Mode");
        darkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkModeActionPerformed(evt);
            }
        });
        mode.add(darkMode);

        lightMode.setText("Light Mode");
        lightMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightModeActionPerformed(evt);
            }
        });
        mode.add(lightMode);

        jMenuBar1.add(mode);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //When the addition button is clicked the following occurs
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Creating a variable called button text which pulls the text of the button and sets it to the variable as a string
        String button_text = btnAdd.getText();
        //this takes the text of the symbol the user clicks and sends the information back to the custom function
        getOperator(button_text);
    }//GEN-LAST:event_btnAddActionPerformed
    
//When the Subtraction button is clicked the following occurs
    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        //Creating a variable called button text which pulls the text of the button and sets it to the variable as a string
        String button_text = btnSub.getText();
        //this takes the text of the symbol the user clicks and sends the information back to the custom function
        getOperator(button_text);
    }//GEN-LAST:event_btnSubActionPerformed
    
//When the Multiplication button is clicked the following occurs
    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        //Creating a variable called button text which pulls the text of the button and sets it to the variable as a string
        String button_text = btnMulti.getText();
        //this takes the text of the symbol the user clicks and sends the information back to the custom function
        getOperator(button_text);
    }//GEN-LAST:event_btnMultiActionPerformed
    
//When the Division button is clicked the following occurs
    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        //Creating a variable called button text which pulls the text of the button and sets it to the variable as a string
        String button_text = btnDiv.getText();
        //this takes the text of the symbol the user clicks and sends the information back to the custom function
        getOperator(button_text);
    }//GEN-LAST:event_btnDivActionPerformed
    
//When the backspace button is clicked the following occurs
    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        //Setting the txtDisplay to the current text in the txtDisplay but with 1 less char (the most recent char)
        txtDisplay.setText(txtDisplay.getText().substring(0,txtDisplay.getText().length()-1));
    }//GEN-LAST:event_btnBackspaceActionPerformed
    
//When the Power button is clicked the following occurs
    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        //Creating a variable called button text which pulls the text of the button and sets it to the variable as a string
        String button_text = btnPower.getText();
        //this takes the text of the symbol the user clicks and sends the information back to the custom function
        getOperator(button_text);
    }//GEN-LAST:event_btnPowerActionPerformed
    
//When the Sqrt root button is clicked the following occurs. 
    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        //Creating a double variable which gets the current text from the txtDisplay which is the number that will be square rooted
        double NumSqrt = Double.parseDouble(txtDisplay.getText());
        
        //Writing to the Calculator History.txt document
        try (FileWriter writer = new FileWriter("Calculator History.txt", true)) { 
            //Writing the following to the document
            writer.write("√" + NumSqrt + " = " + Math.sqrt(NumSqrt) + "\n"); 
        } catch (IOException i) { 
            i.printStackTrace(); 
        }
        //Create a new variable to record the awnser
        double sqrtRooted = Math.sqrt(Double.parseDouble(txtDisplay.getText()));
        //Set the text of the txtDisplay to the number square rooted
        txtDisplay.setText(Double.toString(sqrtRooted));
    }//GEN-LAST:event_btnSqrtActionPerformed
    
    //When the equals button is clicked the following occurs
    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        //Creating a switch using my variable math_operator
        switch(math_operator) {
            //Case + if the user presses +
            case '+':
                //Creating a double variable for the second number that is added
                double secondNumAdd = Double.parseDouble(txtDisplay.getText());
                //creating a variable total2 and adding it to secondnum to get the total
                total2 = total1 + secondNumAdd;
                //Writing to the Calculator History.txt document
                try (FileWriter writer = new FileWriter("Calculator History.txt", true)) { 
                    //Writing the following to the document
                    writer.write(total1 + " + " + secondNumAdd + " = " + total2 + "\n"); 
                } catch (IOException i) { 
                    i.printStackTrace(); 
                }
                break;
            //Case - if the user presses -
            case '-':
                //Creating a double variable for the second number that is subtracted
                double secondNumSub = Double.parseDouble(txtDisplay.getText());
                //Creating a variable total2 and subtracting it to seocndnum to get the total
                total2 = total1 - secondNumSub;
                //Writing to the Calculator History.txt document
                try (FileWriter writer = new FileWriter("Calculator History.txt", true)) { 
                    //Writing the following to the document
                    writer.write(total1 + " - " + secondNumSub + " = " + total2 + "\n"); 
                } catch (IOException i) { 
                    i.printStackTrace(); 
                }
                break;
            //Case / if the user presses /
            case '/':
                //Creating a double variable for the second number that is divided
                double secondNumDiv = Double.parseDouble(txtDisplay.getText());
                //Creating a variable total2 and dividing it to seocndnum to get the total
                total2 = total1 / Double.parseDouble(txtDisplay.getText());
                //Writing to the Calculator History.txt document
                try (FileWriter writer = new FileWriter("Calculator History.txt", true)) { 
                    //Writing the following to the document
                    writer.write(total1 + " / " + secondNumDiv + " = " + total2 + "\n"); 
                } catch (IOException i) { 
                    i.printStackTrace(); 
                }
                break;
            //Case * if the user presses *
            case '*':
                //Creating a double variable for the second number that is multiplied
                double secondNumMulti = Double.parseDouble(txtDisplay.getText());
                //Creating a variable total2 and multiplying it to seocndnum to get the total
                total2 = total1 * Double.parseDouble(txtDisplay.getText());
                //Writing to the Calculator History.txt document
                try (FileWriter writer = new FileWriter("Calculator History.txt", true)) { 
                    //Writing the following to the document
                    writer.write(total1 + " * " + secondNumMulti + " = " + total2 + "\n"); 
                } catch (IOException i) { 
                    i.printStackTrace(); 
                }
                break;
            //Case ^ if the user presses ^
            case '^':
                //Creating a double variable for the second number that is powered
                double secondNumPow = Double.parseDouble(txtDisplay.getText());
                //Creating a variable total2 and puttint it to the power of seocndnum to get the total
                total2 = Math.pow(total1, Double.parseDouble(txtDisplay.getText()));
                try (FileWriter writer = new FileWriter("Calculator History.txt", true)) { 
                    //Writing the following to the document
                    writer.write(total1 + " ^ " + secondNumPow + " = " + total2 + "\n"); 
                } catch (IOException i) { 
                    i.printStackTrace(); 
                }
                break;
            
        } 
        //Depending on the case total2 has a different value therefore whatever number and operator the user picks determines the awnser in the txtDisplay
        txtDisplay.setText(Double.toString(total2));
        //Setting total to 0 for a fresh restart
        total1 = 0;
        
            
    }//GEN-LAST:event_btnEqualsActionPerformed
    //When button one is clicked the following occurs
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        //Creating a variable
        String btnOnetxt = txtDisplay.getText() + btnOne.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnOnetxt);
    }//GEN-LAST:event_btnOneActionPerformed
    //When button two is clicked the following occurs
    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        //Creating a variable
        String btnTwotxt = txtDisplay.getText() + btnTwo.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnTwotxt);
    }//GEN-LAST:event_btnTwoActionPerformed
    //When button three is clicked the following occurs
    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        //Creating a variable
        String btnThreetxt = txtDisplay.getText() + btnThree.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnThreetxt);
    }//GEN-LAST:event_btnThreeActionPerformed
    //When button four is clicked the following occurs
    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        //Creating a variable
        String btnFourtxt = txtDisplay.getText() + btnFour.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnFourtxt);
    }//GEN-LAST:event_btnFourActionPerformed
    //When button five is clicked the following occurs
    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        //Creating a variable
        String btnFivetxt = txtDisplay.getText() + btnFive.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnFivetxt);
    }//GEN-LAST:event_btnFiveActionPerformed
    //When button six is clicked the following occurs
    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        //Creating a variable
        String btnSixtxt = txtDisplay.getText() + btnSix.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnSixtxt);
    }//GEN-LAST:event_btnSixActionPerformed
    //When button seven is clicked the following occurs
    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        //Creating a variable
        String btnSeventxt = txtDisplay.getText() + btnSeven.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnSeventxt);
    }//GEN-LAST:event_btnSevenActionPerformed
    //When button eight is clicked the following occurs
    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        //Creating a variable
        String btnEighttxt = txtDisplay.getText() + btnEight.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnEighttxt);
    }//GEN-LAST:event_btnEightActionPerformed
    //When button nine is clicked the following occurs
    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        String btnNinetxt = txtDisplay.getText() + btnNine.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnNinetxt);
    }//GEN-LAST:event_btnNineActionPerformed
    //When button zero is clicked the following occurs
    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        //Creating a variable
        String btnZerotxt = txtDisplay.getText() + btnZero.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnZerotxt);
    }//GEN-LAST:event_btnZeroActionPerformed
    //When button decimal is clicked the following occurs
    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        //Creating a variable
        String btnDecimaltxt = txtDisplay.getText() + btnDecimal.getText();
        //Setting the text of txtDisplay to the button text
        txtDisplay.setText(btnDecimaltxt);
    }//GEN-LAST:event_btnDecimalActionPerformed
    //When button clear is clicked the following occurs
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //Clearing the txtDisplay
        txtDisplay.setText("");
        //Clearing both variable values to 0
        total1 = 0.0;
        total2 = 0.0;
    }//GEN-LAST:event_btnClearActionPerformed
    //When button History under File is clicked the following occurs
    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        try {
            //Opens the Calculator History.txt document for the user
            Desktop.getDesktop().open(new java.io.File("Calculator History.txt"));
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_historyActionPerformed
    //When button Dark Mode under Mode is clicked the following occurs
    private void darkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkModeActionPerformed
        //Setting the panel to a grey/black background
        mainPanel.setBackground(new Color(32,32,32));
        
        //Setting the txtDisplay box background and foreground accordingly (foreground = white, background = black/grey)
        txtDisplay.setForeground(new Color(224,224,224));
        txtDisplay.setBackground(new Color(64,64,64));
        
        //Setting the button background and foreground accordingly (foreground = white, background = black/grey)
        btnOne.setForeground(new Color(224,224,224));
        btnOne.setBackground(new Color(64,64,64));
        btnTwo.setForeground(new Color(224,224,224));
        btnTwo.setBackground(new Color(64,64,64));
        btnThree.setForeground(new Color(224,224,224));
        btnThree.setBackground(new Color(64,64,64));
        btnFour.setForeground(new Color(224,224,224));
        btnFour.setBackground(new Color(64,64,64));
        btnFive.setForeground(new Color(224,224,224));
        btnFive.setBackground(new Color(64,64,64));
        btnSix.setForeground(new Color(224,224,224));
        btnSix.setBackground(new Color(64,64,64));
        btnSeven.setForeground(new Color(224,224,224));
        btnSeven.setBackground(new Color(64,64,64));      
        btnEight.setForeground(new Color(224,224,224));        
        btnEight.setBackground(new Color(64,64,64));
        btnNine.setForeground(new Color(224,224,224));
        btnNine.setBackground(new Color(64,64,64));        
        btnZero.setForeground(new Color(224,224,224));
        btnZero.setBackground(new Color(64,64,64));
        btnDecimal.setForeground(new Color(224,224,224));        
        btnDecimal.setBackground(new Color(64,64,64));   
        btnClear.setForeground(new Color(224,224,224)); 
        btnClear.setBackground(new Color(64,64,64));   
        btnBackspace.setForeground(new Color(224,224,224)); 
        btnBackspace.setBackground(new Color(64,64,64));
        btnDiv.setForeground(new Color(224,224,224)); 
        btnDiv.setBackground(new Color(64,64,64));
        btnMulti.setForeground(new Color(224,224,224)); 
        btnMulti.setBackground(new Color(64,64,64));
        btnSub.setForeground(new Color(224,224,224)); 
        btnSub.setBackground(new Color(64,64,64));
        btnAdd.setForeground(new Color(224,224,224)); 
        btnAdd.setBackground(new Color(64,64,64));
        btnPower.setForeground(new Color(224,224,224)); 
        btnPower.setBackground(new Color(64,64,64));
        btnSqrt.setForeground(new Color(224,224,224)); 
        btnSqrt.setBackground(new Color(64,64,64));
        btnEquals.setForeground(new Color(224,224,224)); 
        btnEquals.setBackground(new Color(64,64,64));
        negativeOrPositive.setForeground(new Color(224,224,224)); 
        negativeOrPositive.setBackground(new Color(64,64,64));
                
        
        
    }//GEN-LAST:event_darkModeActionPerformed
    //When button Light Mode under Mode is clicked the following occurs
    private void lightModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightModeActionPerformed
        //Setting the panel to a white background
        mainPanel.setBackground(new Color(240,240,240));
        
        //Setting the txtDisplay box background and foreground accordingly (foreground = black, background = white/light grey)
        txtDisplay.setForeground(new Color(0,0,0));
        txtDisplay.setBackground(new Color(255,255,255));
        
        //Setting the button background and foreground accordingly (foreground = black, background = white/light Grey)
        btnOne.setForeground(new Color(0,0,0));
        btnOne.setBackground(new Color(225,225,225));
        btnTwo.setForeground(new Color(0,0,0));
        btnTwo.setBackground(new Color(225,225,225));
        btnThree.setForeground(new Color(0,0,0));
        btnThree.setBackground(new Color(225,225,225));
        btnFour.setForeground(new Color(0,0,0));
        btnFour.setBackground(new Color(225,225,225));
        btnFive.setForeground(new Color(0,0,0));
        btnFive.setBackground(new Color(225,225,225));
        btnSix.setForeground(new Color(0,0,0));
        btnSix.setBackground(new Color(225,225,225));
        btnSeven.setForeground(new Color(0,0,0));
        btnSeven.setBackground(new Color(225,225,225));      
        btnEight.setForeground(new Color(0,0,0));        
        btnEight.setBackground(new Color(225,225,225));
        btnNine.setForeground(new Color(0,0,0));
        btnNine.setBackground(new Color(225,225,225));        
        btnZero.setForeground(new Color(0,0,0));
        btnZero.setBackground(new Color(225,225,225));
        btnDecimal.setForeground(new Color(0,0,0));        
        btnDecimal.setBackground(new Color(225,225,225));   
        btnClear.setForeground(new Color(0,0,0)); 
        btnClear.setBackground(new Color(225,225,225));   
        btnBackspace.setForeground(new Color(0,0,0)); 
        btnBackspace.setBackground(new Color(225,225,225));
        btnDiv.setForeground(new Color(0,0,0)); 
        btnDiv.setBackground(new Color(225,225,225));
        btnMulti.setForeground(new Color(0,0,0)); 
        btnMulti.setBackground(new Color(225,225,225));
        btnSub.setForeground(new Color(0,0,0)); 
        btnSub.setBackground(new Color(225,225,225));
        btnAdd.setForeground(new Color(0,0,0)); 
        btnAdd.setBackground(new Color(225,225,225));
        btnPower.setForeground(new Color(0,0,0)); 
        btnPower.setBackground(new Color(225,225,225));
        btnSqrt.setForeground(new Color(0,0,0)); 
        btnSqrt.setBackground(new Color(225,225,225));
        btnEquals.setForeground(new Color(0,0,0)); 
        btnEquals.setBackground(new Color(225,225,225));  
        negativeOrPositive.setForeground(new Color(0,0,0)); 
        negativeOrPositive.setBackground(new Color(225,225,225));  
    }//GEN-LAST:event_lightModeActionPerformed

    //When the negative/positive toggle button is clicked the following occurs
    private void negativeOrPositiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeOrPositiveActionPerformed
        //if the current text in the txtDisplay is positive multiply the value by -1
        if (Double.parseDouble(txtDisplay.getText()) > 0.0) {
            //Creating a double variable called valueNegative which is the negative version of the positive number
            double valueNegative = Double.parseDouble(txtDisplay.getText()) * -1.0;
            //Set the txtDisplay to the valueNegative
            txtDisplay.setText(Double.toString(valueNegative));
        //if the current text in the txtDisplay is negative multiply the value by -1 ( -x * -1 = x)
        }else if (Double.parseDouble(txtDisplay.getText()) < 0.0) {
            //Creating a double variable called valuePositive which is the positive version of the negative number
            double valuePositive = Double.parseDouble(txtDisplay.getText()) * -1.0;
            //Set the txtDisplay to the valuePositive
            txtDisplay.setText(Double.toString(valuePositive));
        }
    }//GEN-LAST:event_negativeOrPositiveActionPerformed


    public static void main(String args[]) throws IOException {
        //Create a file called Calculator History.txt on the users computer
        File file = new File("Calculator History.txt");
        file.createNewFile();
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JMenuItem darkMode;
    private javax.swing.JMenuItem history;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem lightMode;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu mode;
    private javax.swing.JButton negativeOrPositive;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
