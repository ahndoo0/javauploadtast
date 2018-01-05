package java31.st3library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
    
    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblPw;
    private JTextField txtid;
    private JButton btnlog;
    private static Login log = null;
    private boolean logchk = false;
    private JPasswordField pfield;
    private Main main = null;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    log = new Login();
                    log.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 208);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblPw());
        contentPane.add(getTxtid());
        contentPane.add(getPfield());
        contentPane.add(getBtnlog());
    }
    
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("ID");
        	lblNewLabel.setBounds(41, 48, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblPw() {
        if (lblPw == null) {
        	lblPw = new JLabel("PW");
        	lblPw.setBounds(41, 89, 57, 15);
        }
        return lblPw;
    }
    private JTextField getTxtid() {
        if (txtid == null) {
        	txtid = new JTextField();
        	txtid.setBounds(65, 42, 194, 21);
        	txtid.setColumns(10);
        }
        return txtid;
    }
    private JPasswordField getPfield() {
        if (pfield == null) {
            pfield = new JPasswordField();
            pfield.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                }
            });
            pfield.setColumns(10);
            pfield.setBounds(65, 83, 194, 21);
        }
        return pfield;
    }
    private JButton getBtnlog() {
        if (btnlog == null) {
        	btnlog = new JButton("Login");
        	btnlog.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        isLogchk();
        	        if(logchk == true){
       	            try {
                        main = new Main();
                    } catch (SQLException e1) {
                        e1.printStackTrace();          
                    }
        	        main.setVisible(true);
        	        dispose();
        	        }
        	    }
        	});
        	btnlog.setBounds(269, 40, 97, 64);
        }
        return btnlog;
    }
    
    public void isLogchk(){
        if( txtid.getText().equals("test") && pfield.getText().equals("1234") ){
            logchk = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
        }
    }
    public Login(Main main){
        this();
        this.main = main;
    }
    
}
