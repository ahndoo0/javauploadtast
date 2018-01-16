package java31.st3library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java31.st3library.ModelBook;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ApplyBook extends JFrame {

    private JPanel contentPane;
    private JButton btnNewButton;
    private JButton btnCancel;
    private JLabel lblNewLabel;
    private JLabel lblTitle;
    private JLabel lblPublisher;
    private JLabel lblWriter;
    private JLabel lblPrice;
    private JLabel lblGenre;
    private JTextField txtbname;
    private JTextField txtpub;
    private JTextField txtyear;
    private JTextField txtprice;
    private JComboBox combogenre;
    private static IServiceBook service_b = null;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ApplyBook applyBook = new ApplyBook();
                    applyBook.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public ApplyBook() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 376);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnCancel());
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblTitle());
        contentPane.add(getLblPublisher());
        contentPane.add(getLblWriter());
        contentPane.add(getLblPrice());
        contentPane.add(getLblGenre());
        contentPane.add(getTxtbname());
        contentPane.add(getTxtpub());
        contentPane.add(getTxtyear());
        contentPane.add(getTxtprice());
        contentPane.add(getCombogenre());
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("regist");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
                    service_b = context.getBean("servicebook", ServiceBook.class);
                    
        	        ModelBook book = new ModelBook();
        	        Integer bookid = null;
                    try {
                        bookid = service_b.getMaxBookid()+1;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
        	        book.setBookid( bookid );
        	        book.setBookname( txtbname.getText() );
        	        book.setPublisher(txtpub.getText());
        	        book.setYear(txtyear.getText());
        	        book.setPrice( Integer.valueOf( txtprice.getText() ));
        	        book.setGenre( combogenre.getSelectedItem().toString() );
        	        try {
                        service_b.insertBook(book);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});
        	
        	btnNewButton.setBounds(105, 255, 97, 48);
        }
        return btnNewButton;
    }
    private JButton getBtnCancel() {
        if (btnCancel == null) {
        	btnCancel = new JButton("cancel");
        	btnCancel.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        dispose();
        	    }
        	});
        	btnCancel.setBounds(226, 255, 97, 48);
        }
        return btnCancel;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("Registration book");
        	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        	lblNewLabel.setBounds(155, 10, 103, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblTitle() {
        if (lblTitle == null) {
        	lblTitle = new JLabel("title");
        	lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblTitle.setBounds(12, 55, 57, 15);
        }
        return lblTitle;
    }
    private JLabel getLblPublisher() {
        if (lblPublisher == null) {
        	lblPublisher = new JLabel("publisher");
        	lblPublisher.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblPublisher.setBounds(12, 90, 57, 15);
        }
        return lblPublisher;
    }
    private JLabel getLblWriter() {
        if (lblWriter == null) {
        	lblWriter = new JLabel("year");
        	lblWriter.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblWriter.setBounds(12, 125, 57, 15);
        }
        return lblWriter;
    }
    private JLabel getLblPrice() {
        if (lblPrice == null) {
        	lblPrice = new JLabel("price");
        	lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblPrice.setBounds(12, 160, 57, 15);
        }
        return lblPrice;
    }
    private JLabel getLblGenre() {
        if (lblGenre == null) {
        	lblGenre = new JLabel("genre");
        	lblGenre.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblGenre.setBounds(12, 195, 57, 15);
        }
        return lblGenre;
    }
    private JTextField getTxtbname() {
        if (txtbname == null) {
        	txtbname = new JTextField();
        	txtbname.setBounds(86, 52, 202, 21);
        	txtbname.setColumns(10);
        }
        return txtbname;
    }
    private JTextField getTxtpub() {
        if (txtpub == null) {
        	txtpub = new JTextField();
        	txtpub.setColumns(10);
        	txtpub.setBounds(86, 87, 202, 21);
        }
        return txtpub;
    }
    private JTextField getTxtyear() {
        if (txtyear == null) {
        	txtyear = new JTextField();
        	txtyear.setColumns(10);
        	txtyear.setBounds(86, 122, 202, 21);
        }
        return txtyear;
    }
    private JTextField getTxtprice() {
        if (txtprice == null) {
        	txtprice = new JTextField();
        	txtprice.setColumns(10);
        	txtprice.setBounds(86, 157, 110, 21);
        }
        return txtprice;
    }
    private JComboBox getCombogenre() {
        if (combogenre == null) {
        	combogenre = new JComboBox();
        	combogenre.setModel(new DefaultComboBoxModel(new String[] {"novel", "education", "literature", "abroad", "etc"}));
        	combogenre.setBounds(86, 192, 110, 21);
        }
        return combogenre;
    }
      
}
