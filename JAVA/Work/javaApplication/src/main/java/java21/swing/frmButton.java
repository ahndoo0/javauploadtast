package java21.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frmButton extends JFrame {
    
    private JPanel contentPane;
    private JTextField textField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmButton frame = new frmButton();
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
    public frmButton() {
        setTitle("테스트 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("왼쪽버튼");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(50, 50, 97, 48);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("중간버튼");
        btnNewButton_1.setBounds(169, 50, 97, 48);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("오른쪽버튼");
        btnNewButton_2.setBounds(289, 50, 97, 48);
        contentPane.add(btnNewButton_2);
        
        textField = new JTextField();
        textField.setBounds(50, 141, 336, 21);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton_3 = new JButton("창닫기");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_3.setBounds(50, 199, 336, 39);
        contentPane.add(btnNewButton_3);
    }
}
