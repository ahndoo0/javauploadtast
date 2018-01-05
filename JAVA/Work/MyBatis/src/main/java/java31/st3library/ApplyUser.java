package java31.st3library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApplyUser extends JFrame {
    
    private JPanel contentPane;
    private JButton btnUapply;
    private JButton btnCancel;
    private JLabel lblNewLabel;
    private JLabel lblName;
    private JTextField txtUname;
    private JTextField txtUcode1;
    private JLabel lblRnn;
    private JTextField txtPhone1;
    private JLabel lblPhone;
    private JTextField txtEmail;
    private JLabel lblEmail;
    private JTextField txtPhone2;
    private JTextField tempEm;
    private JComboBox comboEmail;
    private JComboBox comboPhone;
    private JLabel label_5;
    private JLabel label_6;
    private JLabel label_7;
    private static IServiceAuth service_u = null;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ApplyUser frame = new ApplyUser();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public ApplyUser() {
        setTitle("회원가입");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 594, 359);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnUapply());
        contentPane.add(getBtnCancel());
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblName());
        contentPane.add(getTxtUname());
        contentPane.add(getTxtUcode1());
        contentPane.add(getLblRnn());
        contentPane.add(getTxtPhone1());
        contentPane.add(getLblPhone());
        contentPane.add(getTxtEmail());
        contentPane.add(getLblEmail());
        contentPane.add(getTextField_5_1());
        contentPane.add(getComboEmail());
        contentPane.add(getComboPhone());
        contentPane.add(getLabel_5());
        contentPane.add(getLabel_6());
        contentPane.add(getLabel_7());
    }
    
    private JButton getBtnUapply() {
        if (btnUapply == null) {
        	btnUapply = new JButton("regist");
        	btnUapply.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
                    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
                    service_u = context.getBean("serviceauth", ServiceAuth.class);
                    Integer authid = null;
                    try {
                        authid = service_u.getMaxAuthid()+1;
                    } catch (Exception e2) {
                        e2.printStackTrace();;
                    }
        	        String name = txtUname.getText(); 
        	        String birth = txtUcode1.getText();
        	        String phone = comboPhone.getSelectedItem().toString()+"-"+txtPhone1.getText()+"-"+txtPhone2.getText();
        	        String email = txtEmail.getText()+"@"+comboEmail.getSelectedItem().toString();
        	    
        	        ModelAuth auth = new ModelAuth();
        	        auth.setAuthid(authid);
        	        auth.setName(name);
        	        auth.setBirth(birth);
        	        auth.setPhone(phone);
        	        auth.setEmail(email);
        	        
        	        try {
                        service_u.insertAuth(auth);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});
        	btnUapply.setBounds(113, 223, 164, 65);
        }
        return btnUapply;
    }
    private JButton getBtnCancel() {
        if (btnCancel == null) {
        	btnCancel = new JButton("cancel");
        	btnCancel.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        dispose();
        	    }
        	});
        	btnCancel.setBounds(300, 223, 164, 65);
        }
        return btnCancel;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("registration user");
        	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        	lblNewLabel.setBounds(234, 10, 105, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblName() {
        if (lblName == null) {
        	lblName = new JLabel("name");
        	lblName.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblName.setBounds(37, 42, 57, 15);
        }
        return lblName;
    }
    private JTextField getTxtUname() {
        if (txtUname == null) {
        	txtUname = new JTextField();
        	txtUname.setBounds(113, 39, 169, 21);
        	txtUname.setColumns(10);
        }
        return txtUname;
    }
    private JTextField getTxtUcode1() {
        if (txtUcode1 == null) {
        	txtUcode1 = new JTextField();
        	txtUcode1.setColumns(10);
        	txtUcode1.setBounds(113, 79, 169, 21);
        }
        return txtUcode1;
    }
    private JLabel getLblRnn() {
        if (lblRnn == null) {
        	lblRnn = new JLabel("birth");
        	lblRnn.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblRnn.setBounds(37, 82, 57, 15);
        }
        return lblRnn;
    }
    private JTextField getTxtPhone1() {
        if (txtPhone1 == null) {
        	txtPhone1 = new JTextField();
        	txtPhone1.setColumns(10);
        	txtPhone1.setBounds(193, 124, 89, 21);
        }
        return txtPhone1;
    }
    private JLabel getLblPhone() {
        if (lblPhone == null) {
        	lblPhone = new JLabel("phone");
        	lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblPhone.setBounds(37, 124, 57, 15);
        }
        return lblPhone;
    }
    private JTextField getTxtEmail() {
        if (txtEmail == null) {
        	txtEmail = new JTextField();
        	txtEmail.setColumns(10);
        	txtEmail.setBounds(113, 161, 139, 21);
        }
        return txtEmail;
    }
    private JLabel getLblEmail() {
        if (lblEmail == null) {
        	lblEmail = new JLabel("email");
        	lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblEmail.setBounds(37, 164, 57, 15);
        }
        return lblEmail;
    }
    private JTextField getTextField_5_1() {
        if (txtPhone2 == null) {
        	txtPhone2 = new JTextField();
        	txtPhone2.setColumns(10);
        	txtPhone2.setBounds(306, 124, 89, 21);
        }
        return txtPhone2;
    }
    private JComboBox getComboEmail() {
        if (comboEmail == null) {
        	comboEmail = new JComboBox();
        	comboEmail.addMouseListener(new MouseAdapter() {
        	    @Override
        	    public void mouseClicked(MouseEvent e) {
        	        if(comboEmail.getSelectedItem().toString() == "직접입력"){
        	            tempEm = new JTextField();
        	            tempEm.setColumns(10);
        	            tempEm.setBounds(282, 161, 142, 21);
        	        }
        	    }
        	});
        	comboEmail.setModel(new DefaultComboBoxModel(new String[] {"gmail.com", "hanmail.net", "naver.com", "yahoo.co.kr"}));
        	comboEmail.setBounds(282, 161, 142, 21);
        }
        return comboEmail;
    }
    private JComboBox getComboPhone() {
        if (comboPhone == null) {
        	comboPhone = new JComboBox();
        	comboPhone.setModel(new DefaultComboBoxModel(new String[] {"010", "011", "016", "017", "018", "019"}));
        	comboPhone.setBounds(113, 124, 57, 21);
        }
        return comboPhone;
    }
    private JLabel getLabel_5() {
        if (label_5 == null) {
        	label_5 = new JLabel("-");
        	label_5.setHorizontalAlignment(SwingConstants.CENTER);
        	label_5.setFont(new Font("굴림", Font.PLAIN, 14));
        	label_5.setBounds(169, 127, 24, 15);
        }
        return label_5;
    }
    private JLabel getLabel_6() {
        if (label_6 == null) {
        	label_6 = new JLabel("-");
        	label_6.setHorizontalAlignment(SwingConstants.CENTER);
        	label_6.setFont(new Font("굴림", Font.PLAIN, 14));
        	label_6.setBounds(282, 127, 24, 15);
        }
        return label_6;
    }
    private JLabel getLabel_7() {
        if (label_7 == null) {
        	label_7 = new JLabel("@");
        	label_7.setHorizontalAlignment(SwingConstants.CENTER);
        	label_7.setFont(new Font("굴림", Font.PLAIN, 14));
        	label_7.setBounds(253, 164, 24, 15);
        }
        return label_7;
    }
    
}
