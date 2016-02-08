
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony Tan
 */
public class TaxReturnForm extends javax.swing.JFrame
{
    
    //public static ArrayList recordList = new ArrayList();
    //String[] recordTemp = new String[10];
    String taxReturnOrOwing;

    /**
     * Creates new form SimpleTaxReturnMainForm
     */
    public TaxReturnForm()
    {
        initComponents();
        disableCalculateBtn();
        lblDateTime.setText(getCurrentDate().toString());
        
    }
    
    private void disableCalculateBtn()
    {
        if(txtFullName.getText().length()==0)
        {
            btnCalculate.setEnabled(false);
        }
        else if(txtAnnualIncome.getText().length()==0)
        {
            btnCalculate.setEnabled(false);
        }
        else if(txtTaxWithheld.getText().length()==0)
        {
            btnCalculate.setEnabled(false);
        }
        else if(txtTotalDeductibleExpenses.getText().length()==0)
        {
            btnCalculate.setEnabled(false);
        }
        else
        {
            btnCalculate.setEnabled(true);
        }
    }
    
    private String decideTaxReturnOrOwing(double value)
    {
        if (value < 0)
        {
            taxReturnOrOwing = "Tax Owing";
        }
        else
        {
            taxReturnOrOwing = "Tax Return";
        }
        return taxReturnOrOwing;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTaxWithheld = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        txtTotalDeductibleExpenses = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnnualIncome = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        txtFullName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        lblDateTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTaxReturn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIncomeTax = new javax.swing.JTextField();
        txtMedicareLevy = new javax.swing.JTextField();
        txtTaxReturn = new javax.swing.JTextField();
        txtActualTaxRate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel2.setText("Annual Income");

        jLabel1.setText("Full Name");

        txtTaxWithheld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTaxWithheldKeyReleased(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCalculate(evt);
            }
        });

        txtTotalDeductibleExpenses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalDeductibleExpensesKeyReleased(evt);
            }
        });

        jLabel4.setText("Total Deductible Expenses");

        jLabel3.setText("Tax Withheld(20-40%)");
        jLabel3.setToolTipText("");

        txtAnnualIncome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnnualIncomeKeyReleased(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onExit(evt);
            }
        });

        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClear(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Tax Return Calculator");

        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        lblDateTime.setText("DD/MM/YY 00:00 AM");

        jLabel6.setText("Income Tax");

        jLabel7.setText("Medicare Levy");

        lblTaxReturn.setText("Tax Return");

        jLabel9.setText("Actual Tax Rate");

        txtIncomeTax.setEditable(false);
        txtIncomeTax.setBackground(new java.awt.Color(204, 204, 204));

        txtMedicareLevy.setEditable(false);
        txtMedicareLevy.setBackground(new java.awt.Color(204, 204, 204));

        txtTaxReturn.setEditable(false);
        txtTaxReturn.setBackground(new java.awt.Color(204, 204, 204));

        txtActualTaxRate.setEditable(false);
        txtActualTaxRate.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExit)
                                        .addGap(22, 22, 22))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(lblTaxReturn)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(btnHelp)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotalDeductibleExpenses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTaxWithheld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAnnualIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIncomeTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMedicareLevy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTaxReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtActualTaxRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalculate)
                                .addGap(57, 57, 57)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReport)
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDateTime)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDateTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAnnualIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTaxWithheld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalDeductibleExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIncomeTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMedicareLevy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxReturn)
                    .addComponent(txtTaxReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtActualTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear)
                    .addComponent(btnReport))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnHelp))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onCalculate(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onCalculate
    {//GEN-HEADEREND:event_onCalculate
        Validation valid = new Validation();
        if(!valid.isName(txtFullName.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a valid name", "Invalid Name", WIDTH);
            txtAnnualIncome.setEditable(false);
            txtTaxWithheld.setEditable(false);
            txtTotalDeductibleExpenses.setEditable(false);
        }
        else if(!valid.isNumeric(txtAnnualIncome.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a numeric value for annual income", "Invalid annual income", WIDTH);
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(false);
            txtTotalDeductibleExpenses.setEditable(false);
        }
        else if(!valid.isPositive(txtAnnualIncome.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a positive number for annual income", "Invalid annual income", WIDTH);
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(false);
            txtTotalDeductibleExpenses.setEditable(false);
        }
        else if(!valid.isNumeric(txtTaxWithheld.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a numeric value for tax withheld", "Invalid tax withheld", WIDTH);
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(true);
            txtTotalDeductibleExpenses.setEditable(false);
        }
        else if(!valid.isWithinRange(20, 40, txtTaxWithheld.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter between 20-40% for tax withheld", "Invalid tax withheld", WIDTH);
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(true);
            txtTotalDeductibleExpenses.setEditable(false);
        }
        else if(!valid.isNumeric(txtTotalDeductibleExpenses.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a numeric value for total tax deductible", "Invalid total tax deductible", WIDTH);
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(true);
            txtTotalDeductibleExpenses.setEditable(true);
        }
        else if(!valid.isPositive(txtTotalDeductibleExpenses.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter a positive value for total tax deductible", "Invalid total tax deductible", WIDTH);
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(true);
            txtTotalDeductibleExpenses.setEditable(true);
        }
        else
        {
            txtFullName.setEditable(true);
            txtAnnualIncome.setEditable(true);
            txtTaxWithheld.setEditable(true);
            txtTotalDeductibleExpenses.setEditable(true);
            
            String name = txtFullName.getText();
            double annual = Double.parseDouble(txtAnnualIncome.getText());
            double taxWithheldPercent = Double.parseDouble(txtTaxWithheld.getText());
            double totalDeductible = Double.parseDouble(txtTotalDeductibleExpenses.getText());
            TaxReturn calc = new TaxReturn(name, getCurrentTime(), annual, taxWithheldPercent, totalDeductible, getCurrentDate());

            double taxReturn = calc.getTaxReturn();
            double incomeTax = calc.getIncomeTax();
            double medicareLevy = calc.getMedicareLevy();
            double actualTaxRate = calc.getActualTaxRate();
            //double taxableIncome = calc.getTaxableIncome();
            //double taxWithheld = calc.getTaxWithheld();
            
            
            txtTaxReturn.setText(String.format("$%.2f", taxReturn));
            txtTaxReturn.setHorizontalAlignment(JTextField.RIGHT);
            
            txtIncomeTax.setText(String.format("$%.2f", incomeTax));
            txtIncomeTax.setHorizontalAlignment(JTextField.RIGHT);
            txtMedicareLevy.setText(String.format("$%.2f", medicareLevy));
            txtMedicareLevy.setHorizontalAlignment(JTextField.RIGHT);
            txtActualTaxRate.setText(String.format("%.2f%%", actualTaxRate));
            txtActualTaxRate.setHorizontalAlignment(JTextField.RIGHT);
            
            lblTaxReturn.setText(decideTaxReturnOrOwing(taxReturn));
            if(lblTaxReturn.getText().equals("Tax Owing"))
            {
                txtTaxReturn.setForeground(Color.red);
            }
            else
            {
                txtTaxReturn.setForeground(Color.BLACK);
            }
            
            calc.addToDatabase();
            
            lblDateTime.setText(getDate());
            
            GlobalVar.recordList.add(calc);
//            String record = txtFullName.getText() + "|" + getTime() + "|" + taxableIncome + "|" + 
//                    taxWithheld + "|" + incomeTax + "|" + medicareLevy + "|" + taxReturn;
//            recordList.add(record);
            
        }
    }//GEN-LAST:event_onCalculate

    private void onExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onExit
    {//GEN-HEADEREND:event_onExit
        this.dispose();
    }//GEN-LAST:event_onExit

    private void onClear(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onClear
    {//GEN-HEADEREND:event_onClear
        txtFullName.setText("");
        txtAnnualIncome.setText("");
        txtTaxWithheld.setText("");
        txtTotalDeductibleExpenses.setText("");
        txtIncomeTax.setText("");
        txtMedicareLevy.setText("");
        txtTaxReturn.setText("");
        txtActualTaxRate.setText("");
        txtFullName.requestFocusInWindow();
        taxReturnOrOwing = "Tax Return";
        lblTaxReturn.setText("Tax Return");
        disableCalculateBtn();
    }//GEN-LAST:event_onClear

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtFullNameKeyReleased
    {//GEN-HEADEREND:event_txtFullNameKeyReleased
        disableCalculateBtn();
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtAnnualIncomeKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAnnualIncomeKeyReleased
    {//GEN-HEADEREND:event_txtAnnualIncomeKeyReleased
        disableCalculateBtn();
    }//GEN-LAST:event_txtAnnualIncomeKeyReleased

    private void txtTaxWithheldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTaxWithheldKeyReleased
    {//GEN-HEADEREND:event_txtTaxWithheldKeyReleased
        disableCalculateBtn();
    }//GEN-LAST:event_txtTaxWithheldKeyReleased

    private void txtTotalDeductibleExpensesKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTotalDeductibleExpensesKeyReleased
    {//GEN-HEADEREND:event_txtTotalDeductibleExpensesKeyReleased
        disableCalculateBtn();
    }//GEN-LAST:event_txtTotalDeductibleExpensesKeyReleased

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        
        TaxReportForm report = new TaxReportForm();
        //report.setBounds(0, 0, 950, 400);
        report.setVisible(true);
        report.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        TaxHelpForm help = new TaxHelpForm();
        //help.setBounds(0, 0, 800, 400);
        help.setVisible(true);
        help.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TaxReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TaxReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TaxReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TaxReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                TaxReturnForm simp = new TaxReturnForm();
                simp.setVisible(true);
                simp.setLocationRelativeTo(null);
                
                //simp.getDate();
            }
        });
    }
    
    private String getDate()
    {
        Date now = new Date();
        DateFormat formatDate = DateFormat.getDateTimeInstance(3, 3);
        String display = formatDate.format(now);
        return display;
    }
    
    private String getCurrentTime()
    {
        Date now = new Date();
        DateFormat formatDate = DateFormat.getTimeInstance(3);
        String display = formatDate.format(now);
        return display;
    }
        
    private Date getCurrentDate()
    {
        Date now = new Date();
        return now;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblTaxReturn;
    private javax.swing.JTextField txtActualTaxRate;
    private javax.swing.JTextField txtAnnualIncome;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtIncomeTax;
    private javax.swing.JTextField txtMedicareLevy;
    private javax.swing.JTextField txtTaxReturn;
    private javax.swing.JTextField txtTaxWithheld;
    private javax.swing.JTextField txtTotalDeductibleExpenses;
    // End of variables declaration//GEN-END:variables
}