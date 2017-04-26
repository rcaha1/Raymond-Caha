package ObjectLabEnterpriseSoftware;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ReportsView extends javax.swing.JFrame 
{
    //private static final String NAME_OF_PAGE = "Reports";
    private static final MainView home = new MainView();
	
    private static DefaultTableModel model;
    private FileManager inst;
    private String selectedPrinter;
    private UtilController controller;
    private String[] headers = {"Job ID", "File Name", "First Name", "Last Name", "Date", "Printer", "Class", "Section", "Stat1", "Stat2"};
    private String[] laserHeaders = {"User ID", "User Name", "Monitor", "Material", "Thickness", "Hours", "Minutes", "Seconds"}; 
    private ArrayList<String> printers;
	// --nav bar views ~Alex
	private BuildView buildView;
	private newJobsMgr jobsMgr;
	private ReportsView reportsView;
        private AddAdminView addAdminView;
        //private LaserView laserView;
        private newStudentView studentView;
        private BalanceView balanceView;
	private newSettingsMenu adminSettingsView;
        private String id;
	//

    public ReportsView(String userID) 
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Administration Panel");
        //setTitle(UtilController.getPageName(NAME_OF_PAGE));
        id = userID;
        this.controller = new UtilController();
        printers = UtilController.getListOfCurrentDevices();
        if(printers.size() > 0){
            selectedPrinter = printers.get(1);
          //* THIS IS THE PROBLEM WITH THE REPORTS NOT OPENING, THIS FEEDS THEM THE WRONG HEADERS NOW - used to be sql error. *\\\
            
          //headers = UtilController.getReportColumnHeaders(selectedPrinter);

        }
        else{
            headers = new String[1];
        }
        addWindowListener
        (
            new WindowAdapter() 
            {
                @Override
                public void windowClosing(WindowEvent we)
                {
                    /* If they close the program then close out the window properly */
                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    dispose();
                    //home.resetAdminMode();
                }
            }
        );
        
        // ***
        // This line is necessary for debugging with WindowsBuilder
        //ReportsPage();
    }

    public void ReportsPage() 
    {
    	getContentPane().setBackground(Color.WHITE);
        setTitle("Administration Panel");
        //setTitle(UtilController.getPageName(NAME_OF_PAGE));
        initComponents();
        initNavBar();
        model = (DefaultTableModel) reportsTable.getModel();
        if(selectedPrinter != null){
            for (ArrayList<Object> retval1 : UtilController.updateReportTableData(selectedPrinter)){ 
                model.addRow(retval1.toArray());
            }
        }
	setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
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
        jSeparator1 = new javax.swing.JSeparator();
        ExportMasterReportButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();
        exportBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        JLabel titleLabel = new JLabel("Reports");
        titleLabel.setBounds(430, 11, 159, 41);
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        getContentPane().add(titleLabel);
        
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 520));
        setPreferredSize(new java.awt.Dimension(995, 660));
        setSize(new java.awt.Dimension(995, 660));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Object Lab Search");

        ExportMasterReportButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ExportMasterReportButton.setText("All Devices Report");
        ExportMasterReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportMasterReportButtonActionPerformed(evt);
            }
        });

        //jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        //jLabel3.setText("Reports");
        //getContentPane().add

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(printers.toArray()));
        jComboBox1.setName("PrinterSelection"); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        reportsTable.setAutoCreateRowSorter(true);
        reportsTable.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            headers
        )
    );
    jScrollPane1.setViewportView(reportsTable);

    exportBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    exportBtn.setText("Current Device Report");
    exportBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    exportBtn.setMaximumSize(new java.awt.Dimension(141, 23));
    exportBtn.setMinimumSize(new java.awt.Dimension(141, 23));
    exportBtn.setPreferredSize(new java.awt.Dimension(141, 23));
    exportBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            exportBtnActionPerformed(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    jLabel4.setText("Device Name:");

  

    jMenuItem1.setText("User Guide");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(jLabel3))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExportMasterReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
                        .addComponent(jLabel1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(34, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel3)
            .addGap(6, 6, 6)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(9, 9, 9)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(exportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ExportMasterReportButton))
            .addContainerGap(74, Short.MAX_VALUE))
    );

    getAccessibleContext().setAccessibleDescription("");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        
        //Exports the grid plus headers to an excel file
        if(selectedPrinter.equals("Laser Cutter")){
            controller.exportReportToFile(model, laserHeaders, (String)jComboBox1.getSelectedItem(), 'b');
        }
        else{
            controller.exportReportToFile(model, headers, (String)jComboBox1.getSelectedItem(), 'b');
        }
    }//GEN-LAST:event_exportBtnActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        //System.out.println(evt.getItem().toString());
        selectedPrinter = evt.getItem().toString();
        //System.out.println(report);
        
        //headers = UtilController.getReportColumnHeaders(selectedPrinter);
        while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
        if(selectedPrinter.equals("Laser Cutter")){
            reportsTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, laserHeaders));
            model = (DefaultTableModel) reportsTable.getModel();
            
            for(ArrayList<Object> retval1 : UtilController.updateReportLaserTableData()){
                model.addRow(retval1.toArray());
            }
        }
        else{
            reportsTable.setModel(new javax.swing.table.DefaultTableModel( new Object[][]{}, headers));
            model = (DefaultTableModel) reportsTable.getModel();
            
            for (ArrayList<Object> retval1 : UtilController.updateReportTableData(selectedPrinter)){ 
                model.addRow(retval1.toArray());
            }
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void initNavBar()
    {
    	jMenuBar1.setPreferredSize(new Dimension(995, 40));
        setJMenuBar(jMenuBar1);
        
        navBtn_jobsMgr = new JButton("Jobs Manager");
        navBtn_jobsMgr.setIcon(new ImageIcon(newJobsMgr.class.getResource("/ObjectLabEnterpriseSoftware/images/view_file_icon.png")));
        navBtn_jobsMgr.setPreferredSize(new Dimension(166, 40));
        
        jMenuBar1.add(Box.createRigidArea(new Dimension(0,0)));
        jMenuBar1.add(navBtn_jobsMgr);
        
        navBtn_build = new JButton("Enter Build");
        navBtn_build.setIcon(new ImageIcon(newJobsMgr.class.getResource("/ObjectLabEnterpriseSoftware/images/hammer_icon.png")));
        
        navBtn_build.setPreferredSize(new Dimension(166, 40));
        jMenuBar1.add(navBtn_build);
        
        navBtn_reports = new JButton("Reports");
        navBtn_reports.setIcon(new ImageIcon(newJobsMgr.class.getResource("/ObjectLabEnterpriseSoftware/images/reports_icon.png")));
        navBtn_reports.setPreferredSize(new Dimension(166, 40));
        jMenuBar1.add(navBtn_reports);              
                
        navBtn_balance = new JButton("Balance");
	navBtn_balance.setIcon(new ImageIcon(newJobsMgr.class.getResource("/ObjectLabEnterpriseSoftware/images/stats_icon.png")));
	navBtn_balance.setPreferredSize(new Dimension(166, 40));

	jMenuBar1.add(navBtn_balance);
        
        navBtn_studentView = new JButton("Student View");
        navBtn_studentView.setIcon(new ImageIcon(newJobsMgr.class.getResource("/ObjectLabEnterpriseSoftware/images/icon_person.png")));
        navBtn_studentView.setPreferredSize(new Dimension(166,40));

        jMenuBar1.add(navBtn_studentView);
        
        navBtn_settings = new JButton("Settings");
        navBtn_settings.setIcon(new ImageIcon(newJobsMgr.class.getResource("/ObjectLabEnterpriseSoftware/images/cog_icon.png")));
        navBtn_settings.setPreferredSize(new Dimension(166, 40));
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
        
        navBtn_studentView.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        navBtn_studentActionPerformed(evt);
                }
        });
                

        navBtn_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		navBtn_balanceActionPerformed(evt);
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
    	jobsMgr = new newJobsMgr(id);
        jobsMgr.setVisible(true);
    	dispose();
    	
    }
    
    private void navBtn_buildActionPerformed(java.awt.event.ActionEvent evt)
    {
    	buildView = new BuildView(id);
        buildView.startMakeBuildProcess();
    	dispose();
    	
    }
    
    private void navBtn_reportsActionPerformed(java.awt.event.ActionEvent evt)
    {
    	reportsView = new ReportsView(id);
        reportsView.ReportsPage();
    	dispose();
    	
    }
    
    private void navBtn_studentActionPerformed(java.awt.event.ActionEvent evt)
    {
        studentView = new newStudentView();
        studentView.newStudentView(id, UtilController.getStudentFname());
        studentView.setVisible(true);
        dispose();

    }
        
        private void navBtn_adminActionPerformed(java.awt.event.ActionEvent evt)
	{
                addAdminView = new AddAdminView();
                addAdminView.setVisible(true);
                dispose();
	}    
    
    private void navBtn_balanceActionPerformed(java.awt.event.ActionEvent evt)
    {
	balanceView = new BalanceView(id);
	balanceView.setVisible(true);
        dispose();

    }
    
    private void navBtn_settingsActionPerformed(java.awt.event.ActionEvent evt)
    {
    	adminSettingsView = new newSettingsMenu(id);
    	adminSettingsView.setVisible(true);
    	dispose();
    	
    }
    private void navBtn_logoutActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mv = new MainView();
	mv.setVisible(true);
        dispose();
    }
    
    /*private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
    	//GEN-HEADEREND:event_logoutButtonActionPerformed
    	    		dispose();
    	            home.setVisible(true);
    	    }//GEN-LAST:event_logoutButtonActionPerformed
    	  */  
    
    
    /////// Nav Bar ~Alex /////

    private void ExportMasterReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportMasterReportButtonActionPerformed
        
        UtilController.exportReportsForPrinters();
        
    }//GEN-LAST:event_ExportMasterReportButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        UtilController.openAdminHelpPage();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
	/////// Nav Bar ~Alex /////
	// --nav bar vars ~Alex
	private JButton navBtn_jobsMgr;
	private JButton navBtn_build;
	private JButton navBtn_reports;
        //private JButton navBtn_laser;
        private JButton navBtn_studentView;
        private JButton navBtn_admin;        
        private JButton navBtn_balance;
	private JButton navBtn_settings;
        private JButton navBtn_logout;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportMasterReportButton;
    private javax.swing.JButton exportBtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable reportsTable;
    // End of variables declaration//GEN-END:variables
}
