package java31.st3library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bbs.inf.IServiceBoard;
import bbs.svr.ServiceBoard;
import java31.st3library.ModelBook;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class Main extends JFrame {
    
    private JPanel contentPane;
    private JPanel panel;
    private JButton btnExit;
    private JButton btnApplyUser;
    private JButton btnApplyBook;
    private JButton btnRefresh;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane_1;
    private JPanel panel_1;
    private JLabel lblNewLabel;
    private JTabbedPane tabbedPane;
    private JPanel bookinfo;
    private JPanel userinfo;
    private JPanel rentinfo;
    private JPanel panel_2;
    private JLabel lblNewLabel_1;
    private JTextField txtbname;
    private JLabel lblPublisher;
    private JTextField txtpub;
    private JLabel lblWriter;
    private JTextField txtyear;
    private JLabel lblPrice;
    private JTextField txtpri;
    private JLabel lblGenre;
    private JTextField txtgen;
    private JLabel lblSearch;
    private JTextField txtsch;
    private JLabel lblBookNo;
    private JTextField txtbno;
    private JButton btnNewButton;
    private JComboBox combobsch;
    private JButton btnNewButton_1;
    private JButton btnRevise;
    private JButton btnCancel;
    private JButton btnDelete;
    private JButton btnNewButton_2;
    private JScrollPane scrollPane_2;
    private JLabel lblRrn;
    private JLabel lblSearch_1;
    private JTextField txtbirth;
    private JTextField txtusch;
    private JComboBox combousch;
    private JButton authsearch;
    private JTextField txtname;
    private JButton btnNewButton_4;
    private JButton btnRevise_1;
    private JButton btnCancel_1;
    private JScrollPane scrollPane_3;
    private Login log = null;
    private static Main frame = null;
    private JTextField txtauthid;
    private JTree tree;
    private JScrollPane scrollPane_4;
    private static JTable btable;
    private static IServiceBook service_b = null;
    private static List<ModelBook> blist = null;
    private static JTable utable;
    private static IServiceAuth service_u = null;
    private static List<ModelAuth> ulist = null;
    private static List<ModelBook> rlist = null;
    private static List<ModelBook> rclist = null;
    private static JTable rtable;
    private static JTable rctable;
    private static ModelBook rent_book = new ModelBook(true);
    private JTextField txtpho;
    private JTextField txtemail;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
                    service_b = context.getBean("servicebook", ServiceBook.class);
                    service_u = context.getBean("serviceauth", ServiceAuth.class);
                    
                    frame = new Main();
                    frame.setVisible(true);
                    ulist = new ArrayList<>();
                    ulist = service_u.selectAll();
                    blist = new ArrayList<>();
                    blist = service_b.selectAll();
                    rlist = new ArrayList<>();
                    rlist = service_b.selectJoin(rent_book);
                    rclist = new ArrayList<>();
                    rclist = service_b.selectJoin2(rent_book);
                    
                    frame.refreshBTable(blist,btable);
                    
                    frame.refreshUTable(ulist,utable);
                    
                    frame.refreshRTable(rlist,rtable);
                    
                    frame.refreshRCTable(rclist,rctable);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    /**
     * Create the frame.
     * @throws SQLException 
     */
    public Main() throws SQLException {
        setTitle("Main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1001, 606);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getTabbedPane());
        contentPane.add(getPanel());
        contentPane.add(getScrollPane());
        contentPane.add(getPanel_1());
    }
    
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBounds(12, 10, 565, 61);
        	panel.setLayout(null);
        	panel.add(getBtnExit());
        	panel.add(getBtnApplyUser());
        	panel.add(getBtnApplyBook());
        	panel.add(getBtnRefresh());
        }
        return panel;
    }
    private JButton getBtnExit() {
        if (btnExit == null) {
        	btnExit = new JButton("exit");
        	btnExit.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        System.exit(0);
        	    }
        	});
        	btnExit.setBounds(396, 10, 116, 41);
        }
        return btnExit;
    }
    private JButton getBtnApplyUser() {
        if (btnApplyUser == null) {
        	btnApplyUser = new JButton("apply user");
        	btnApplyUser.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ApplyUser userinfo = new ApplyUser();
        	        userinfo.setVisible(true);
        	    }
        	});
        	btnApplyUser.setBounds(12, 10, 116, 41);
        }
        return btnApplyUser;
    }
    private JButton getBtnApplyBook() {
        if (btnApplyBook == null) {
        	btnApplyBook = new JButton("apply book");
        	btnApplyBook.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ApplyBook book = new ApplyBook();
        	        book.setVisible(true);
        	    }
        	});
        	btnApplyBook.setBounds(140, 10, 116, 41);
        }
        return btnApplyBook;
    }
    private JButton getBtnRefresh() {
        if (btnRefresh == null) {
        	btnRefresh = new JButton("refresh");
        	btnRefresh.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        try {
        	            ulist = new ArrayList<>();
                        ulist = service_u.selectAll();
                        blist = new ArrayList<>();
                        blist = service_b.selectAll();
                        rlist = new ArrayList<>();
                        rlist = service_b.selectJoin(rent_book);
                        rclist = new ArrayList<>();
                        rclist = service_b.selectJoin2(rent_book);
                        
                        frame.refreshRTable(rlist,rtable);
                        frame.refreshBTable(blist,btable);
                        frame.refreshUTable(ulist,utable);
                        frame.refreshRCTable(rclist,rctable);
                        
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});

        	btnRefresh.setBounds(268, 10, 116, 41);
        }
        return btnRefresh;
    }
    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
        	scrollPane = new JScrollPane();
        	scrollPane.setBounds(12, 109, 255, 444);
        	scrollPane.setViewportView(getRctable());
        }
        return scrollPane;
    }
    private JTable getRctable() {
        if (rctable == null) {
        	rctable = new JTable();
        	rctable.setModel(new DefaultTableModel(
        	    new Object[][] {
        	    },
        	    new String[] {
        	        "Name", "Bookname", "Rent_date"
        	    }
        	) {
        	    Class[] columnTypes = new Class[] {
        	        String.class, String.class, String.class
        	    };
        	    public Class getColumnClass(int columnIndex) {
        	        return columnTypes[columnIndex];
        	    }
        	});
        }
        return rctable;
    }
    private JScrollPane getScrollPane_1() {
        if (scrollPane_1 == null) {
        	scrollPane_1 = new JScrollPane();
        	scrollPane_1.setBounds(0, 241, 689, 199);
        	scrollPane_1.setViewportView(getBtable());
        }
        return scrollPane_1;
    }
    private JTable getBtable() {
        if (btable == null) {
        	btable = new JTable();
        	btable.addMouseListener(new MouseAdapter() {
        	    @Override
        	    public void mouseClicked(MouseEvent e) {
        	        
        	        int row = btable.getSelectedRow();
        	        String bno = btable.getValueAt(row, 0).toString();
        	        String bookname = btable.getValueAt(row, 1).toString();
        	        String publisher = btable.getValueAt(row, 2).toString();
        	        String year = btable.getValueAt(row, 3).toString();
        	        String price = btable.getValueAt(row, 4).toString();
        	        String dtm = btable.getValueAt(row, 5).toString();
        	        
        	        txtbno.setText(bno);
        	        txtbname.setText(bookname);
        	        txtpub.setText(publisher);
        	        txtyear.setText(year);
        	        txtpri.setText(price);
        	        txtgen.setText(dtm);
        	    }
        	});
        	btable.setModel(new DefaultTableModel(
        	    new Object[][] {
        	    },
        	    new String[] {
        	        "No.", "Title", "Publisher", "Year", "Price", "Genre", "Rent_date", "Rent_yn"
        	    }
        	) {
        	    Class[] columnTypes = new Class[] {
        	        Integer.class, String.class, String.class, String.class, Integer.class, String.class, String.class, Boolean.class
        	    };
        	    public Class getColumnClass(int columnIndex) {
        	        return columnTypes[columnIndex];
        	    }
        	});
        	btable.getColumnModel().getColumn(0).setPreferredWidth(62);
        	btable.getColumnModel().getColumn(1).setPreferredWidth(102);
        	btable.getColumnModel().getColumn(3).setPreferredWidth(86);
        	btable.getColumnModel().getColumn(4).setPreferredWidth(92);
        }
        return btable;
    }
    private JPanel getPanel_1() {
        if (panel_1 == null) {
        	panel_1 = new JPanel();
        	panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        	panel_1.setBounds(12, 81, 255, 30);
        	panel_1.add(getLblNewLabel());
        }
        return panel_1;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("rent condition");
        	lblNewLabel.setFont(new Font("굴림", Font.BOLD, 13));
        }
        return lblNewLabel;
    }
    private JTabbedPane getTabbedPane() throws SQLException {
        if (tabbedPane == null) {
        	tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        	tabbedPane.setBounds(279, 81, 694, 469);
        	tabbedPane.addTab("book info", null, getBookinfo(), null);
        	tabbedPane.addTab("user info", null, getUserinfo(), null);
        	tabbedPane.addTab("rent info", null, getRentinfo(), null);
        }
        return tabbedPane;
    }
    private JPanel getBookinfo() throws SQLException {
        if (bookinfo == null) {
        	bookinfo = new JPanel();
        	bookinfo.setLayout(null);
        	bookinfo.add(getPanel_2());
        	bookinfo.add(getScrollPane_1());
        }
        return bookinfo;
    }
    private JPanel getUserinfo() {
        if (userinfo == null) {
        	userinfo = new JPanel();
        	userinfo.setBackground(new Color(240, 248, 255));
        	userinfo.setLayout(null);
        	userinfo.add(getLblRrn());
        	userinfo.add(getLblSearch_1());
        	userinfo.add(getTxtbirth());
        	userinfo.add(getTxtusch());
        	userinfo.add(getCombousch());
        	userinfo.add(getAuthsearch());
        	userinfo.add(getTxtname());
        	userinfo.add(getBtnNewButton_4());
        	userinfo.add(getBtnRevise_1());
        	userinfo.add(getBtnCancel_1());
        	userinfo.add(getTxtauthid());
        	
        	JScrollPane scrollPane_5 = new JScrollPane();
        	scrollPane_5.setBounds(32, 229, 612, 184);
        	userinfo.add(scrollPane_5);
        	
        	utable = new JTable();
        	utable.addMouseListener(new MouseAdapter() {
        	    @Override
        	    public void mouseClicked(MouseEvent e) {
        	        int row = utable.getSelectedRow();
                    String uno = utable.getValueAt(row, 0).toString();
                    String name = utable.getValueAt(row, 1).toString();
                    String birth = utable.getValueAt(row, 2).toString();
                    
                    txtauthid.setText(uno);
                    txtname.setText(name);
                    txtbirth.setText(birth);
        	    }
        	});
        	utable.setModel(new DefaultTableModel(
        	    new Object[][] {
        	    },
        	    new String[] {
        	        "authID", "Name", "Birth", "Phone", "Email"
        	    }
        	) {
        	    Class[] columnTypes = new Class[] {
        	        Integer.class, String.class, String.class, String.class, String.class
        	    };
        	    public Class getColumnClass(int columnIndex) {
        	        return columnTypes[columnIndex];
        	    }
        	});
        	utable.getColumnModel().getColumn(0).setPreferredWidth(40);
        	utable.getColumnModel().getColumn(1).setPreferredWidth(70);
        	utable.getColumnModel().getColumn(2).setPreferredWidth(70);
        	utable.getColumnModel().getColumn(3).setPreferredWidth(80);
        	utable.getColumnModel().getColumn(4).setPreferredWidth(90);
        	scrollPane_5.setViewportView(utable);
        	
        	JLabel lblBirth = new JLabel("birth");
        	lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblBirth.setBounds(12, 50, 57, 15);
        	userinfo.add(lblBirth);
        	
        	JLabel lblPhone = new JLabel("phone");
        	lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblPhone.setBounds(12, 80, 57, 15);
        	userinfo.add(lblPhone);
        	
        	txtpho = new JTextField();
        	txtpho.setColumns(10);
        	txtpho.setBounds(81, 80, 167, 21);
        	userinfo.add(txtpho);
        	
        	JLabel lblEmail = new JLabel("email");
        	lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblEmail.setBounds(12, 110, 57, 15);
        	userinfo.add(lblEmail);
        	
        	txtemail = new JTextField();
        	txtemail.setColumns(10);
        	txtemail.setBounds(81, 110, 167, 21);
        	userinfo.add(txtemail);
        }
        return userinfo;
    }
    private JPanel getRentinfo() {
        if (rentinfo == null) {
        	rentinfo = new JPanel();
        	rentinfo.setLayout(null);
        	rentinfo.add(getBtnNewButton_2());
        	rentinfo.add(getScrollPane_2());
        }
        return rentinfo;
    }
    private JPanel getPanel_2() throws SQLException {
        if (panel_2 == null) {
        	panel_2 = new JPanel();
        	panel_2.setBounds(0, 0, 689, 231);
        	panel_2.setBackground(new Color(240, 248, 255));
        	panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        	panel_2.setForeground(Color.WHITE);
        	panel_2.setLayout(null);
        	panel_2.add(getLblNewLabel_1());
        	panel_2.add(getTxtbname());
        	panel_2.add(getLblPublisher());
        	panel_2.add(getTxtpub());
        	panel_2.add(getLblWriter());
        	panel_2.add(getTxtyear());
        	panel_2.add(getLblPrice());
        	panel_2.add(getTxtpri());
        	panel_2.add(getLblGenre());
        	panel_2.add(getTxtgen());
        	panel_2.add(getLblSearch());
        	panel_2.add(getTxtsch());
        	panel_2.add(getLblBookNo());
        	panel_2.add(getTxtbno());
        	panel_2.add(getBtnNewButton());
        	panel_2.add(getCombobsch());
        	panel_2.add(getBtnNewButton_1());
        	panel_2.add(getBtnRevise());
        	panel_2.add(getBtnCancel());
        	panel_2.add(getBtnDelete());
        }
        return panel_2;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("book title");
        	lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblNewLabel_1.setBounds(225, 13, 57, 15);
        }
        return lblNewLabel_1;
    }
    private JTextField getTxtbname() {
        if (txtbname == null) {
        	txtbname = new JTextField();
        	txtbname.setBounds(294, 7, 155, 21);
        	txtbname.setColumns(10);
        }
        return txtbname;
    }
    private JLabel getLblPublisher() {
        if (lblPublisher == null) {
        	lblPublisher = new JLabel("publisher");
        	lblPublisher.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblPublisher.setBounds(225, 41, 57, 15);
        }
        return lblPublisher;
    }
    private JTextField getTxtpub() {
        if (txtpub == null) {
        	txtpub = new JTextField();
        	txtpub.setColumns(10);
        	txtpub.setBounds(294, 35, 155, 21);
        }
        return txtpub;
    }
    private JLabel getLblWriter() {
        if (lblWriter == null) {
        	lblWriter = new JLabel("year");
        	lblWriter.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblWriter.setBounds(225, 69, 57, 15);
        }
        return lblWriter;
    }
    private JTextField getTxtyear() {
        if (txtyear == null) {
        	txtyear = new JTextField();
        	txtyear.setColumns(10);
        	txtyear.setBounds(294, 63, 155, 21);
        }
        return txtyear;
    }
    private JLabel getLblPrice() {
        if (lblPrice == null) {
        	lblPrice = new JLabel("price");
        	lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblPrice.setBounds(225, 97, 57, 15);
        }
        return lblPrice;
    }
    private JTextField getTxtpri() {
        if (txtpri == null) {
        	txtpri = new JTextField();
        	txtpri.setColumns(10);
        	txtpri.setBounds(294, 91, 116, 21);
        }
        return txtpri;
    }
    private JLabel getLblGenre() {
        if (lblGenre == null) {
        	lblGenre = new JLabel("genre");
        	lblGenre.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblGenre.setBounds(225, 125, 57, 15);
        }
        return lblGenre;
    }
    private JTextField getTxtgen() {
        if (txtgen == null) {
        	txtgen = new JTextField();
        	txtgen.setColumns(10);
        	txtgen.setBounds(294, 119, 116, 21);
        }
        return txtgen;
    }
    private JLabel getLblSearch() {
        if (lblSearch == null) {
        	lblSearch = new JLabel("search");
        	lblSearch.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblSearch.setBounds(225, 153, 57, 15);
        }
        return lblSearch;
    }
    private JTextField getTxtsch() {
        if (txtsch == null) {
        	txtsch = new JTextField();
        	txtsch.setColumns(10);
        	txtsch.setBounds(393, 151, 138, 21);
        }
        return txtsch;
    }
    private JLabel getLblBookNo() {
        if (lblBookNo == null) {
        	lblBookNo = new JLabel("book no");
        	lblBookNo.setBounds(461, 10, 57, 15);
        }
        return lblBookNo;
    }
    private JTextField getTxtbno() {
        if (txtbno == null) {
        	txtbno = new JTextField();
        	txtbno.setColumns(10);
        	txtbno.setBounds(507, 7, 29, 21);
        }
        return txtbno;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("search");
        	btnNewButton.setBounds(533, 150, 81, 23);
        }
        return btnNewButton;
    }
    private JComboBox getCombobsch() {
        if (combobsch == null) {
        	combobsch = new JComboBox();
        	combobsch.setModel(new DefaultComboBoxModel(new String[] {"title", "publisher", "year", "price", "genre"}));
        	combobsch.setBounds(294, 150, 95, 21);
        }
        return combobsch;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("rent");
        	btnNewButton_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        rent rent = new rent();
                    rent.setVisible(true);
                    String bi = txtbno.getText();
                    String bn = txtbname.getText();
                    String bp = txtpub.getText();
                    String bg = txtgen.getText();
                    rent.setText(bi, bn, bp, bg);
                    ulist = new ArrayList<>();
                    try {
                        ulist = service_u.selectAll();
                        rent.refreshUTable(ulist, utable);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});
        	btnNewButton_1.setBounds(248, 187, 73, 38);
        }
        return btnNewButton_1;
    }
    
    public Main(JTable utable){
        this.utable = utable;
    }
    
    private JButton getBtnRevise() {
        if (btnRevise == null) {
        	btnRevise = new JButton("revise");
        	btnRevise.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
                    int rst = JOptionPane.showConfirmDialog(null, "are you revise it?", "confirm window", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(rst==JOptionPane.YES_OPTION){
                       ModelBook wherebook = new ModelBook();
                       ModelBook setbook = new ModelBook();
                       if(btable.getSelectedRow() != -1){
                           wherebook.setBookid( btable.getSelectedRow() );
                       }
                       setbook.setBookname(txtbname.getText());
                       setbook.setPublisher(txtpub.getText());
                       setbook.setYear(txtyear.getText());
                       setbook.setPrice(Integer.valueOf(txtpri.getText()));
                       setbook.setGenre(txtgen.getText());
                       
                       try {
                        service_b.updateBook(wherebook, setbook);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                       
                    }
                    else{
                    }
        	    }
        	});
        	btnRevise.setBounds(333, 187, 73, 38);
        }
        return btnRevise;
    }
    private JButton getBtnCancel() {
        if (btnCancel == null) {
        	btnCancel = new JButton("cancel");
        	btnCancel.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        try {
        	            blist = new ArrayList<>();
        	            blist = service_b.selectAll();
                        frame.refreshBTable(blist, btable);
                    } catch (Exception e1) {
                        e1.printStackTrace();;
                    }
        	    }
        	});

        	btnCancel.setBounds(504, 187, 73, 38);
        }
        return btnCancel;
    }
    private JButton getBtnDelete() {
        if (btnDelete == null) {
        	btnDelete = new JButton("delete");
        	btnDelete.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ModelBook book = new ModelBook();
        	        book.setBookid( Integer.valueOf( txtbno.getText() ) );
        	        try {
                        service_b.deleteBook(book);
                    } catch (Exception e1) {
                        e1.printStackTrace();;
                    }
        	    }
        	});

        	btnDelete.setBounds(419, 187, 73, 38);
        }
        return btnDelete;
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("return");
        	btnNewButton_2.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ModelBook setbook = new ModelBook(false);
        	        ModelBook wherebook = new ModelBook();
        	        Integer bookid = rtable.getSelectedColumn();
        	        wherebook.setBookid(bookid);
        	        try {
                        service_b.updateRentBook(wherebook, setbook);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});
        	btnNewButton_2.setBounds(519, 10, 158, 53);
        }
        return btnNewButton_2;
    }
    private JScrollPane getScrollPane_2() {
        if (scrollPane_2 == null) {
        	scrollPane_2 = new JScrollPane();
        	scrollPane_2.setBounds(12, 76, 677, 364);
        	scrollPane_2.setViewportView(getRtable());
        }
        return scrollPane_2;
    }
    private JLabel getLblRrn() {
        if (lblRrn == null) {
        	lblRrn = new JLabel("name");
        	lblRrn.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblRrn.setBounds(12, 20, 57, 15);
        }
        return lblRrn;
    }

    private JLabel getLblSearch_1() {
        if (lblSearch_1 == null) {
        	lblSearch_1 = new JLabel("search");
        	lblSearch_1.setHorizontalAlignment(SwingConstants.RIGHT);
        	lblSearch_1.setBounds(12, 150, 57, 15);
        }
        return lblSearch_1;
    }
    private JTextField getTxtbirth() {
        if (txtbirth == null) {
        	txtbirth = new JTextField();
        	txtbirth.setBounds(81, 50, 167, 21);
        	txtbirth.setColumns(10);
        }
        return txtbirth;
    }
    private JTextField getTxtusch() {
        if (txtusch == null) {
        	txtusch = new JTextField();
        	txtusch.setColumns(10);
        	txtusch.setBounds(192, 147, 146, 21);
        }
        return txtusch;
    }
    private JComboBox getCombousch() {
        if (combousch == null) {
        	combousch = new JComboBox();
        	combousch.setModel(new DefaultComboBoxModel(new String[] {"name", "birth", "phone", "email"}));
        	combousch.setBounds(81, 147, 99, 21);
        }
        return combousch;
    }
    private JButton getAuthsearch() {
        if (authsearch == null) {
        	authsearch = new JButton("search");
        	authsearch.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ulist = new ArrayList<>();
        	        String searchWord = txtusch.getText();
        	        String select = combousch.getSelectedItem().toString();
        	        ModelAuth auth = new ModelAuth();
        	        if(select == "name"){
        	            auth.setName(searchWord);
        	        }
        	        else if(select == "birth"){
        	            auth.setBirth(searchWord);
        	        }
        	        else if(select == "phone"){
        	            auth.setPhone(searchWord);
        	        }
        	        else{
        	            auth.setEmail(searchWord);
        	        }
        	        
        	        try {
                        ulist = service_u.selectLike(auth, searchWord);
                        refreshUTable(ulist, utable);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});

        	authsearch.setBounds(346, 146, 82, 23);
        }
        return authsearch;
    }
    private JTextField getTxtname() {
        if (txtname == null) {
        	txtname = new JTextField();
        	txtname.setColumns(10);
        	txtname.setBounds(81, 20, 94, 21);
        }
        return txtname;
    }
    private JButton getBtnNewButton_4() {
        if (btnNewButton_4 == null) {
        	btnNewButton_4 = new JButton("delete");
        	btnNewButton_4.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ModelAuth auth = new ModelAuth();
        	        Integer authid = utable.getSelectedRow();
        	        auth.setAuthid(authid);
        	        try {
                        service_u.deleteAuth(auth);
                    } catch (Exception e1) {
                        e1.printStackTrace();;
                    }
        	    }
        	});

        	btnNewButton_4.setBounds(22, 185, 106, 34);
        }
        return btnNewButton_4;
    }
    private JButton getBtnRevise_1() {
        if (btnRevise_1 == null) {
        	btnRevise_1 = new JButton("revise");
        	btnRevise_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        ModelAuth whereauth = new ModelAuth();
        	        ModelAuth setauth = new ModelAuth();
        	        whereauth.setAuthid( utable.getSelectedRow() );
        	        setauth.setName( txtname.getText() );
        	        setauth.setBirth(txtbirth.getText());
        	        setauth.setEmail(txtemail.getText());
        	        setauth.setPhone(txtpho.getText());
        	        try {
                        service_u.updateAuth(whereauth, setauth);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});

        	btnRevise_1.setBounds(142, 185, 106, 34);
        }
        return btnRevise_1;
    }
    private JButton getBtnCancel_1() {
        if (btnCancel_1 == null) {
        	btnCancel_1 = new JButton("cancel");
        	btnCancel_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        try {
        	            ulist = new ArrayList<>();
        	            ulist = service_u.selectAll();
                        refreshUTable(ulist, utable);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
        	    }
        	});

        	btnCancel_1.setBounds(262, 185, 106, 34);
        }
        return btnCancel_1;
    }
    private JTextField getTxtauthid() {
        if (txtauthid == null) {
        	txtauthid = new JTextField();
        	txtauthid.setColumns(10);
        	txtauthid.setBounds(195, 20, 32, 21);
        }
        return txtauthid;
    }
    
    public void refreshBTable (List<ModelBook> blist, JTable btable) throws Exception{
        Object[] tempObj = new Object[8];
        DefaultTableModel model = (DefaultTableModel)btable.getModel();
        model.setRowCount(0);
        for(int i=0; i<blist.size();i++){
            tempObj[0] = blist.get(i).getBookid();
            tempObj[1] = blist.get(i).getBookname();
            tempObj[2] = blist.get(i).getPublisher();
            tempObj[3] = blist.get(i).getYear();
            tempObj[4] = blist.get(i).getPrice();
            tempObj[5] = blist.get(i).getGenre();
            tempObj[6] = blist.get(i).getDtm();
            tempObj[7] = blist.get(i).getUse_yn();
            model.addRow(tempObj);
        }
        // JTable 첫번째 로우에 focus 주기
        if( model.getRowCount() > 0 ){
            btable.setColumnSelectionInterval(0, 0);
        }
        btable.setModel(model);
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
    
    public void refreshRTable (List<ModelBook> rlist, JTable rtable) throws Exception{
        Object[] tempObj = new Object[8];

        DefaultTableModel model = (DefaultTableModel)rtable.getModel();
        model.setRowCount(0);
        for(int i=0; i<rlist.size();i++){
            tempObj[0] = rlist.get(i).getBookid();
            tempObj[1] = rlist.get(i).getBookname();
            tempObj[2] = rlist.get(i).getPublisher();
            tempObj[3] = rlist.get(i).getGenre();
            tempObj[4] = rlist.get(i).getDtm();
            tempObj[5] = rlist.get(i).getAuthid();
            tempObj[6] = rlist.get(i).getName();
            tempObj[7] = rlist.get(i).getBirth();
            model.addRow(tempObj);
        }
        // JTable 첫번째 로우에 focus 주기
        if( model.getRowCount() > 0 ){
            rtable.setColumnSelectionInterval(0, 0);
        }
        rtable.setModel(model);
    }
    
    public void refreshRCTable (List<ModelBook> rclist, JTable rctable) throws Exception{
        Object[] tempObj = new Object[3];
        DefaultTableModel model = (DefaultTableModel)rctable.getModel();
        model.setRowCount(0);
        for(int i=0; i<rclist.size();i++){
            tempObj[0] = rclist.get(i).getName();
            tempObj[1] = rclist.get(i).getBookname();
            tempObj[2] = rclist.get(i).getDtm();
            model.addRow(tempObj);
        }
        // JTable 첫번째 로우에 focus 주기
        if( model.getRowCount() > 0 ){
            rctable.setColumnSelectionInterval(0, 0);
        }
        rctable.setModel(model);
    }
    
    private JTable getRtable() {
        if (rtable == null) {
        	rtable = new JTable();
        	rtable.setModel(new DefaultTableModel(
        	    new Object[][] {
        	    },
        	    new String[] {
        	        "Book ID", "Book Title", "Publisher", "Genre", "Rent Date", "Auth ID", "Name", "Birth"
        	    }
        	) {
        	    Class[] columnTypes = new Class[] {
        	        Integer.class, String.class, String.class, String.class, String.class, Object.class, String.class, String.class
        	    };
        	    public Class getColumnClass(int columnIndex) {
        	        return columnTypes[columnIndex];
        	    }
        	});
        }
        return rtable;
    }
}
