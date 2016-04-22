/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectLabEnterpriseSoftware;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AdminSettingsView extends javax.swing.JFrame 
{
	public AdminSettingsView() {
	}
	private static final String NAME_OF_PAGE = "\tSettings";
	private static final MainView home = new MainView();
    // --nav bar views ~Alex
    private BuildView buildView;
    private newJobsMgr jobsView;
    private ReportsView reportsView;	
    private AdminSettingsView adminSettingsView;
    //
    public void AdminSettingsViewStart() {
        initComponents();
        initNavBar();
        setLocationRelativeTo(null);
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
          addWindowListener(new WindowAdapter() {
			@Override
            public void windowClosing(WindowEvent e) 
            {
                dispose();
                home.resetAdminMode();
            }
        });
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        addPrinterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        help = new javax.swing.JMenu();
        userGuide = new javax.swing.JMenuItem();

        setTitle(UtilController.getPageName(NAME_OF_PAGE));

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/back_arrow_button.png"))); // NOI18N
        jButton5.setToolTipText("Back");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setVisible(false); // old backbutton still there but invis ~Alex
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton4.setLabel("Modify Classes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 140, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, getContentPane().getWidth(), 10));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Archive");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 140, -1));

        addPrinterButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        addPrinterButton.setLabel("Add Device");
        addPrinterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrinterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addPrinterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 140, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Settings");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Remove Class/Device");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton3.setText("Change Password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 140, -1));

        jLabel2.setBackground(new java.awt.Color(40, 41, 40));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/white_bg.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 300));

    /*    help.setText("Help");

        userGuide.setText("User Guide");
        userGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuideActionPerformed(evt);
            }
        });
        help.add(userGuide);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);*/
        setPreferredSize(new Dimension(650,375));
        setResizable(false);
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void initNavBar()
    {

    	jMenuBar1.setPreferredSize(new Dimension(200, 30));
        setJMenuBar(jMenuBar1);
        
        navBtn_jobsMgr = new JButton("Jobs Manager");
        navBtn_jobsMgr.setIcon(new ImageIcon(JobsView.class.getResource("/ObjectLabEnterpriseSoftware/images/view_file_icon.png")));
        navBtn_jobsMgr.setPreferredSize(new Dimension(100,24));
        //spacing
        jMenuBar1.add(Box.createRigidArea(new Dimension(35,0)));
        //
        jMenuBar1.add(navBtn_jobsMgr);
        
        navBtn_build = new JButton("Enter Build");
        navBtn_build.setIcon(new ImageIcon(JobsView.class.getResource("/ObjectLabEnterpriseSoftware/images/hammer_icon.png")));
        
        navBtn_build.setPreferredSize(new Dimension(100,24));
        jMenuBar1.add(navBtn_build);
        
        navBtn_reports = new JButton("Reports");
        navBtn_reports.setIcon(new ImageIcon(JobsView.class.getResource("/ObjectLabEnterpriseSoftware/images/reports_icon.png")));
        navBtn_reports.setPreferredSize(new Dimension(100,24));
        jMenuBar1.add(navBtn_reports);
        
        navBtn_settings = new JButton("Settings");
        navBtn_settings.setIcon(new ImageIcon(JobsView.class.getResource("/ObjectLabEnterpriseSoftware/images/cog_icon.png")));
        navBtn_settings.setPreferredSize(new Dimension(100,24));
        jMenuBar1.add(navBtn_settings);

        
        navBtn_jobsMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBtn_jobsMgrActionPerformed(evt);
            }
        });
        
        navBtn_build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBtn_buildActionPerformed(evt);
            }
        });
        
        navBtn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBtn_reportsActionPerformed(evt);
            }
        });
        
        navBtn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	navBtn_settingsActionPerformed(evt);
            }
        }); 

    }
    
    
    private void navBtn_jobsMgrActionPerformed(java.awt.event.ActionEvent evt)
    {
    	jobsView = new newJobsMgr();
        jobsView.setVisible(true);
    	dispose();
    	
    }
    
    private void navBtn_buildActionPerformed(java.awt.event.ActionEvent evt)
    {
    	buildView = new BuildView();
        buildView.startMakeBuildProcess();
    	dispose();
    	
    }
    
    private void navBtn_reportsActionPerformed(java.awt.event.ActionEvent evt)
    {
    	reportsView = new ReportsView();
        reportsView.ReportsPage();
    	dispose();
    	
    }
    
    private void navBtn_settingsActionPerformed(java.awt.event.ActionEvent evt)
    {
    	adminSettingsView = new AdminSettingsView();
    	adminSettingsView.AdminSettingsViewStart();
    	dispose();
    	
    }
    
    
    
    /////// Nav Bar ~Alex /////
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ClassOptionsView op = new ClassOptionsView();
        op.OptionsStart();
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

        private void addPrinterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrinterButtonActionPerformed
		AddDeviceView ap = new AddDeviceView();
		ap.AddPrinterStart();
                dispose();
        }//GEN-LAST:event_addPrinterButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        home.resetAdminMode();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ArchiveView archive = new ArchiveView(this);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RemoveClassPrinterView remove = new RemoveClassPrinterView();
        remove.removeClassPrinterStart();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuideActionPerformed
        UtilController.openAdminHelpPage();
        
    }//GEN-LAST:event_userGuideActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ChangePasswordView change = new ChangePasswordView();
        change.passwordChangeStart();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPrinterButton;
    private javax.swing.JMenu help;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem userGuide;
    private JButton navBtn_jobsMgr;
    private JButton navBtn_build;
    private JButton navBtn_reports;
    private JButton navBtn_settings;
    // End of variables declaration//GEN-END:variables
}
