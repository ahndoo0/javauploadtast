package java31.st3library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class rent extends JFrame {
    
    private JPanel contentPane;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel;
    private JLabel lblPublisher;
    private JLabel lblWriter;
    private JLabel lblUsernosearch;
    private JTextField txtrsch;
    private JTextField txtrgen;
    private JTextField txtrname;
    private JTextField txtrpub;
    private JButton btnNewButton_2;
    private JScrollPane scrollPane;
    private static rent rent = null;
    private JTextField txtrbno;
    private static IServiceAuth service_u = null;
    private static IServiceBook service_b = null;
    private static ModelBook rent_book = new ModelBook(true);
    private static JTable rutable;
    private static List<ModelAuth> ulist = null;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
                    service_u = context.getBean("serviceauth", ServiceAuth.class);
                    
                    rent = new rent();
                    rent.setVisible(true);
                    ulist = new ArrayList<>();
                    ulist = service_u.selectAll();
                    rent.refreshUTable(ulist, rutable);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public rent() {
        setTitle("책 대여");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 547, 428);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblPublisher());
        contentPane.add(getLblWriter());
        contentPane.add(getLblUsernosearch());
        contentPane.add(getTxtrsch());
        contentPane.add(getTxtrgen());
        contentPane.add(getTxtrname());
        contentPane.add(getTxtrpub());
        contentPane.add(getBtnNewButton_2());
        contentPane.add(getScrollPane());
        contentPane.add(getTxtrbno());
    }
    

    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("rent");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
                    service_b = context.getBean("servicebook", ServiceBook.class);
                    ModelBook wherebook = new ModelBook();
                    wherebook.setBookid( Integer.valueOf( txtrbno.getText() ) );
        	        try {
                        service_b.updateRentBook(wherebook, rent_book);
                    } catch (Exception e1) {
                        e1.printStackTrace();;
                    }
        	        dispose();
        	    }
        	});
        	
        	btnNewButton.setBounds(422, 36, 97, 53);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("cancel");
        	btnNewButton_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        dispose();
        	    }
        	});
        	btnNewButton_1.setBounds(422, 111, 97, 43);
        }
        return btnNewButton_1;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("title");
        	lblNewLabel.setBounds(12, 34, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblPublisher() {
        if (lblPublisher == null) {
        	lblPublisher = new JLabel("publisher");
        	lblPublisher.setBounds(12, 69, 57, 15);
        }
        return lblPublisher;
    }
    private JLabel getLblWriter() {
        if (lblWriter == null) {
        	lblWriter = new JLabel("genre");
        	lblWriter.setBounds(12, 104, 57, 15);
        }
        return lblWriter;
    }
    private JLabel getLblUsernosearch() {
        if (lblUsernosearch == null) {
        	lblUsernosearch = new JLabel("authid search");
        	lblUsernosearch.setBounds(12, 139, 91, 15);
        }
        return lblUsernosearch;
    }
    private JTextField getTxtrsch() {
        if (txtrsch == null) {
        	txtrsch = new JTextField();
        	txtrsch.setBounds(114, 136, 167, 21);
        	txtrsch.setColumns(10);
        }
        return txtrsch;
    }
    private JTextField getTxtrgen() {
        if (txtrgen == null) {
        	txtrgen = new JTextField();
        	txtrgen.setColumns(10);
        	txtrgen.setBounds(78, 101, 296, 21);
        }
        return txtrgen;
    }
    private JTextField getTxtrname() {
        if (txtrname == null) {
        	txtrname = new JTextField();
        	txtrname.setColumns(10);
        	txtrname.setBounds(78, 33, 224, 21);
        }
        return txtrname;
    }
    private JTextField getTxtrpub() {
        if (txtrpub == null) {
        	txtrpub = new JTextField();
        	txtrpub.setColumns(10);
        	txtrpub.setBounds(78, 68, 296, 21);
        }
        return txtrpub;
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("search");
        	btnNewButton_2.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	    }
        	});
        	
        	btnNewButton_2.setBounds(294, 135, 80, 23);
        }
        return btnNewButton_2;
    }
    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
        	scrollPane = new JScrollPane();
        	scrollPane.setBounds(12, 180, 507, 200);
        	scrollPane.setViewportView(getRutable());
        }
        return scrollPane;
    }
    private JTable getRutable() {
        if (rutable == null) {
        	rutable = new JTable();
        	rutable.setModel(new DefaultTableModel(
        	    new Object[][] {
        	    },
        	    new String[] {
        	        "Id", "Name", "Birth", "Phone", "Email"
        	    }
        	) {
        	    Class[] columnTypes = new Class[] {
        	        Integer.class, String.class, String.class, String.class, String.class
        	    };
        	    public Class getColumnClass(int columnIndex) {
        	        return columnTypes[columnIndex];
        	    }
        	});
        	rutable.getColumnModel().getColumn(1).setPreferredWidth(100);
        	rutable.getColumnModel().getColumn(2).setPreferredWidth(100);
        	rutable.getColumnModel().getColumn(3).setPreferredWidth(117);
        	rutable.getColumnModel().getColumn(4).setPreferredWidth(130);
        }
        return rutable;  
    }
    

    public void setText(String bi, String bn, String bp, String bg){
        txtrbno.setText(bi);
        txtrname.setText(bn);
        txtrpub.setText(bp);
        txtrgen.setText(bg);
   }
    private JTextField getTxtrbno() {
        if (txtrbno == null) {
        	txtrbno = new JTextField();
        	txtrbno.setColumns(10);
        	txtrbno.setBounds(329, 33, 41, 21);
        }
        return txtrbno;
    }
    
    public void refreshUTable (List<ModelAuth> ulist, JTable utable) throws Exception{
        Object[] tempObj = new Object[5];
        DefaultTableModel model = (DefaultTableModel)utable.getModel();
        model.setRowCount(0);
        for(int i=0; i<ulist.size();i++){
            tempObj[0] = ulist.get(i).getAuthid();
            tempObj[1] = ulist.get(i).getName();
            tempObj[2] = ulist.get(i).getBirth();
            tempObj[3] = ulist.get(i).getPhone();
            tempObj[4] = ulist.get(i).getEmail();
            model.addRow(tempObj);
        }
        // JTable 첫번째 로우에 focus 주기
        if( model.getRowCount() > 0 ){
            utable.setColumnSelectionInterval(0, 0);
        }
        utable.setModel(model);
    }
    
}
