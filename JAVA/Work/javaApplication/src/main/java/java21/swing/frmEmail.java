package java21.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class frmEmail extends JFrame {
    
    private JPanel contentPane;
    private JTextField textEmail;
    private JTextField textaddEmail;
    private JTextField textname;
    private JTextField textjob;
    private JTextField textid;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmEmail frame = new frmEmail();
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
    public frmEmail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 524);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("OK");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(211, 402, 97, 49);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Cancel");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_1.setBounds(325, 402, 97, 49);
        contentPane.add(btnNewButton_1);
        
        JPanel panel = new JPanel();
        panel.setBounds(12, 161, 410, 231);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JButton btnNewButton_2 = new JButton("Default");
        btnNewButton_2.setBounds(302, 148, 97, 23);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Add");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textaddEmail.getText()+textEmail.getText();
                textaddEmail.setText(text);
            }
        });
        btnNewButton_3.setBounds(302, 24, 97, 41);
        panel.add(btnNewButton_3);
        
        JButton btnNewButton_5 = new JButton("Edit");
        btnNewButton_5.setBounds(302, 76, 97, 23);
        panel.add(btnNewButton_5);
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JButton btnNewButton_4 = new JButton("Remove");
        btnNewButton_4.setBounds(302, 115, 97, 23);
        panel.add(btnNewButton_4);
        
        textaddEmail = new JTextField();
        textaddEmail.setBounds(12, 65, 278, 106);
        panel.add(textaddEmail);
        textaddEmail.setColumns(10);
        
        textEmail = new JTextField();
        textEmail.setBounds(95, 34, 195, 21);
        panel.add(textEmail);
        textEmail.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("E-mail");
        lblNewLabel_2.setBounds(12, 10, 57, 15);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("이메일주소");
        lblNewLabel_3.setBounds(12, 37, 71, 15);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Mail Format");
        lblNewLabel_4.setBounds(12, 176, 88, 15);
        panel.add(lblNewLabel_4);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("HTML");
        rdbtnNewRadioButton.setBounds(22, 197, 71, 23);
        panel.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Plain Text");
        rdbtnNewRadioButton_1.setBounds(95, 197, 104, 23);
        panel.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Custom");
        rdbtnNewRadioButton_2.setBounds(200, 197, 121, 23);
        panel.add(rdbtnNewRadioButton_2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(12, 24, 410, 112);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(12, 10, 57, 15);
        panel_1.add(lblName);
        
        JLabel label = new JLabel("이름");
        label.setBounds(12, 35, 57, 15);
        panel_1.add(label);
        
        JLabel lblNewLabel = new JLabel("직책");
        lblNewLabel.setBounds(12, 60, 57, 15);
        panel_1.add(lblNewLabel);
        
        textname = new JTextField();
        textname.setBounds(47, 32, 116, 21);
        panel_1.add(textname);
        textname.setColumns(10);
        
        textjob = new JTextField();
        textjob.setBounds(47, 60, 116, 21);
        panel_1.add(textjob);
        textjob.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("아이디");
        lblNewLabel_1.setBounds(207, 60, 57, 15);
        panel_1.add(lblNewLabel_1);
        
        textid = new JTextField();
        textid.setBounds(251, 57, 116, 21);
        panel_1.add(textid);
        textid.setColumns(10);
    }
}
