/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Jason
 */
public class main extends javax.swing.JFrame
{

    /**
     * Creates new form main
     */
    public main()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parent = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usersBtn = new javax.swing.JPanel();
        ind_users = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inventoryBtn = new javax.swing.JPanel();
        ind_tasks = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reportBtn = new javax.swing.JPanel();
        ind_logs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageBtn = new javax.swing.JPanel();
        ind_edit = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        logout_Btn = new javax.swing.JButton();
        panel5Btn = new javax.swing.JPanel();
        ind_edit1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        IDfield = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        inventoryPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        reportPanel = new javax.swing.JPanel();
        managePanel = new javax.swing.JPanel();
        panel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidePanel.setBackground(new java.awt.Color(1, 50, 67));

        jLabel2.setBackground(new java.awt.Color(236, 236, 236));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 236, 236));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventory Management");

        usersBtn.setBackground(new java.awt.Color(1, 50, 67));
        usersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usersBtnMousePressed(evt);
            }
        });
        usersBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_users.setOpaque(false);

        javax.swing.GroupLayout ind_usersLayout = new javax.swing.GroupLayout(ind_users);
        ind_users.setLayout(ind_usersLayout);
        ind_usersLayout.setHorizontalGroup(
            ind_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_usersLayout.setVerticalGroup(
            ind_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        usersBtn.add(ind_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jLabel1.setBackground(new java.awt.Color(236, 236, 236));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 236, 236));
        jLabel1.setText("USER");
        usersBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, 40));

        inventoryBtn.setBackground(new java.awt.Color(1, 50, 67));
        inventoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inventoryBtnMousePressed(evt);
            }
        });
        inventoryBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_tasks.setOpaque(false);

        javax.swing.GroupLayout ind_tasksLayout = new javax.swing.GroupLayout(ind_tasks);
        ind_tasks.setLayout(ind_tasksLayout);
        ind_tasksLayout.setHorizontalGroup(
            ind_tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_tasksLayout.setVerticalGroup(
            ind_tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        inventoryBtn.add(ind_tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jLabel3.setBackground(new java.awt.Color(236, 236, 236));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 236, 236));
        jLabel3.setText("INVENTORY");
        inventoryBtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 40));

        reportBtn.setBackground(new java.awt.Color(1, 50, 67));
        reportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportBtnMousePressed(evt);
            }
        });
        reportBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_logs.setOpaque(false);

        javax.swing.GroupLayout ind_logsLayout = new javax.swing.GroupLayout(ind_logs);
        ind_logs.setLayout(ind_logsLayout);
        ind_logsLayout.setHorizontalGroup(
            ind_logsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_logsLayout.setVerticalGroup(
            ind_logsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        reportBtn.add(ind_logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jLabel4.setBackground(new java.awt.Color(236, 236, 236));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 236, 236));
        jLabel4.setText("MONTHLY REPORT");
        reportBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, 40));

        manageBtn.setBackground(new java.awt.Color(1, 50, 67));
        manageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageBtnMousePressed(evt);
            }
        });
        manageBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_edit.setOpaque(false);

        javax.swing.GroupLayout ind_editLayout = new javax.swing.GroupLayout(ind_edit);
        ind_edit.setLayout(ind_editLayout);
        ind_editLayout.setHorizontalGroup(
            ind_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_editLayout.setVerticalGroup(
            ind_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageBtn.add(ind_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jLabel32.setBackground(new java.awt.Color(236, 236, 236));
        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(236, 236, 236));
        jLabel32.setText("MANAGE STAFF");
        manageBtn.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));

        logout_Btn.setBackground(new java.awt.Color(204, 0, 0));
        logout_Btn.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        logout_Btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_Btn.setText("LOG OUT");

        panel5Btn.setBackground(new java.awt.Color(1, 50, 67));
        panel5Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel5Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel5BtnMousePressed(evt);
            }
        });
        panel5Btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_edit1.setOpaque(false);

        javax.swing.GroupLayout ind_edit1Layout = new javax.swing.GroupLayout(ind_edit1);
        ind_edit1.setLayout(ind_edit1Layout);
        ind_edit1Layout.setHorizontalGroup(
            ind_edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_edit1Layout.setVerticalGroup(
            ind_edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel5Btn.add(ind_edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jLabel33.setBackground(new java.awt.Color(236, 236, 236));
        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(236, 236, 236));
        jLabel33.setText("Panel 5");
        panel5Btn.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 40));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel5Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        topPanel.setBackground(new java.awt.Color(1, 50, 67));

        jLabel10.setBackground(new java.awt.Color(236, 236, 236));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 236, 236));
        jLabel10.setText("ID :");

        IDfield.setBackground(new java.awt.Color(236, 236, 236));
        IDfield.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        IDfield.setForeground(new java.awt.Color(236, 236, 236));

        jLabel19.setBackground(new java.awt.Color(236, 236, 236));
        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(236, 236, 236));
        jLabel19.setText("Name :");

        jLabel20.setBackground(new java.awt.Color(236, 236, 236));
        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(236, 236, 236));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(943, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(IDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        //jLabel20.setText(a.getaFname()+" "+a.getaLname());

        body.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inventoryPanelLayout = new javax.swing.GroupLayout(inventoryPanel);
        inventoryPanel.setLayout(inventoryPanelLayout);
        inventoryPanelLayout.setHorizontalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        inventoryPanelLayout.setVerticalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        body.add(inventoryPanel, "card2");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        body.add(userPanel, "card3");

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        body.add(reportPanel, "card4");

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        body.add(managePanel, "card5");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        body.add(panel5, "card6");

        javax.swing.GroupLayout parentLayout = new javax.swing.GroupLayout(parent);
        parent.setLayout(parentLayout);
        parentLayout.setHorizontalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        parentLayout.setVerticalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(parentLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersBtnMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_usersBtnMousePressed
    {//GEN-HEADEREND:event_usersBtnMousePressed
        // TODO add your handling code here:
        resetColor(inventoryBtn);
        resetColor(panel5Btn);
        setColor(usersBtn);
        resetColor(reportBtn);
        resetColor(manageBtn);

        ind_tasks.setOpaque(false);
        ind_users.setOpaque(true);
        ind_logs.setOpaque(false);
        ind_edit.setOpaque(false);
        ind_edit1.setOpaque(false);

        userPanel.setVisible(true);
        reportPanel.setVisible(false);
        inventoryPanel.setVisible(false);
        managePanel.setVisible(false);
        panel5.setVisible(false);
    }//GEN-LAST:event_usersBtnMousePressed

    private void inventoryBtnMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_inventoryBtnMousePressed
    {//GEN-HEADEREND:event_inventoryBtnMousePressed
        // TODO add your handling code here:
        setColor(inventoryBtn);
        resetColor(panel5Btn);
        resetColor(usersBtn);
        resetColor(reportBtn);
        resetColor(manageBtn);

        ind_tasks.setOpaque(true);
        ind_users.setOpaque(false);
        ind_logs.setOpaque(false);
        ind_edit.setOpaque(false);
        ind_edit1.setOpaque(false);

        userPanel.setVisible(false);
        reportPanel.setVisible(false);
        inventoryPanel.setVisible(true);
        managePanel.setVisible(false);
        panel5.setVisible(false);
    }//GEN-LAST:event_inventoryBtnMousePressed

    private void reportBtnMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_reportBtnMousePressed
    {//GEN-HEADEREND:event_reportBtnMousePressed
        // TODO add your handling code here:
        resetColor(inventoryBtn);
        resetColor(panel5Btn);
        resetColor(usersBtn);
        setColor(reportBtn);
        resetColor(manageBtn);

        ind_tasks.setOpaque(false);
        ind_users.setOpaque(false);
        ind_logs.setOpaque(true);
        ind_edit.setOpaque(false);
        ind_edit1.setOpaque(false);

        userPanel.setVisible(false);
        reportPanel.setVisible(true);
        inventoryPanel.setVisible(true);
        managePanel.setVisible(false);
        panel5.setVisible(false);
    }//GEN-LAST:event_reportBtnMousePressed

    private void manageBtnMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_manageBtnMousePressed
    {//GEN-HEADEREND:event_manageBtnMousePressed
        // TODO add your handling code here:
        resetColor(panel5Btn);
        resetColor(inventoryBtn);
        resetColor(usersBtn);
        resetColor(reportBtn);
        setColor(manageBtn);

        ind_tasks.setOpaque(false);
        ind_users.setOpaque(false);
        ind_logs.setOpaque(false);
        ind_edit.setOpaque(true);
        ind_edit1.setOpaque(false);

        userPanel.setVisible(false);
        reportPanel.setVisible(false);
        inventoryPanel.setVisible(false);
        managePanel.setVisible(true);
        panel5.setVisible(false);
    }//GEN-LAST:event_manageBtnMousePressed

    private void panel5BtnMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panel5BtnMousePressed
    {//GEN-HEADEREND:event_panel5BtnMousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        resetColor(inventoryBtn);
        resetColor(usersBtn);
        resetColor(reportBtn);
        setColor(panel5Btn);
        resetColor(manageBtn);

        ind_tasks.setOpaque(false);
        ind_users.setOpaque(false);
        ind_logs.setOpaque(false);
        ind_edit.setOpaque(false);
        ind_edit1.setOpaque(true);

        userPanel.setVisible(false);
        reportPanel.setVisible(false);
        inventoryPanel.setVisible(false);
        managePanel.setVisible(false);
        panel5.setVisible(true);
    }//GEN-LAST:event_panel5BtnMousePressed

        void setColor(JPanel panel) {

        panel.setBackground(new Color(44, 62, 80));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(1, 50, 67));
    }
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
        } catch ( ClassNotFoundException ex )
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch ( InstantiationException ex )
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch ( IllegalAccessException ex )
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch ( javax.swing.UnsupportedLookAndFeelException ex )
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDfield;
    private javax.swing.JPanel body;
    private javax.swing.JPanel ind_edit;
    private javax.swing.JPanel ind_edit1;
    private javax.swing.JPanel ind_logs;
    private javax.swing.JPanel ind_tasks;
    private javax.swing.JPanel ind_users;
    private javax.swing.JPanel inventoryBtn;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logout_Btn;
    private javax.swing.JPanel manageBtn;
    private javax.swing.JPanel managePanel;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel5Btn;
    private javax.swing.JPanel parent;
    private javax.swing.JPanel reportBtn;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel usersBtn;
    // End of variables declaration//GEN-END:variables
}
