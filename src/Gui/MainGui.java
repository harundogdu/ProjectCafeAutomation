package Gui;

import Logic.Actions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainGui {
    
    JFrame jfMain;
    JPanel jpMain;
    JButton btnUserExit;
    JButton btnMasa1;
    JButton btnMasa2;
    JButton btnMasa3;
    JButton btnMasa4;
    JButton btnMasa5;
    JButton btnMasa6;
    JButton btnMasa7;
    JLabel creatorCaption;
    LoginGui lg;
    Font font = new Font("monospaced", Font.BOLD, 16);
    Actions actions = new Actions(this);
    
    Icon iconTable = new ImageIcon("src/Images/sun-umbrella.png");
    Color btnColorTable = new Color(236, 204, 104);
    Color btnColorText = new Color(47, 53, 66);
    
    public JButton[] btnMasalar = new JButton[7];
    
    final int btnWidth = 120;
    final int btnHeigth = 120;
    
    public MainGui(LoginGui lg) {
        this.lg = lg;
        
        getJfMain().add(getJpMain());
        getJpMain().add(getBtnUserExit());
        getJpMain().add(getBtnMasa1());
        getJpMain().add(getBtnMasa2());
        getJpMain().add(getBtnMasa3());
        getJpMain().add(getBtnMasa4());
        getJpMain().add(getBtnMasa5());
        getJpMain().add(getBtnMasa6());
        getJpMain().add(getBtnMasa7());
        masalarıButonDizisineEkleme();
        getJpMain().add(getCreatorCaption());
        getJfMain().setVisible(true);
        
    }
    
    public void masalarıButonDizisineEkleme() {
        
        btnMasalar[0] = btnMasa1;
        btnMasalar[1] = btnMasa2;
        btnMasalar[2] = btnMasa3;
        btnMasalar[3] = btnMasa4;
        btnMasalar[4] = btnMasa5;
        btnMasalar[5] = btnMasa6;
        btnMasalar[6] = btnMasa7;
        
    }
    
    public JFrame getJfMain() {
        if (jfMain == null) {
            jfMain = new JFrame();
            
            jfMain.setBounds(250, 80, 900, 600);
            //jfMain.setResizable(false);
            jfMain.setUndecorated(true);
            
        }
        return jfMain;
    }
    
    public void setJfMain(JFrame jfMain) {
        this.jfMain = jfMain;
    }
    
    public JPanel getJpMain() {
        if (jpMain == null) {
            jpMain = new JPanel();
            jpMain.setBounds(getJfMain().getBounds());
            jpMain.setBackground(new Color(241, 196, 15));            
            jpMain.setLayout(null);
            
        }
        return jpMain;
    }
    
    public void setJpMain(JPanel jpMain) {
        this.jpMain = jpMain;
    }
    
    public JButton getBtnUserExit() {
        if (btnUserExit == null) {
            btnUserExit = new JButton();
            btnUserExit.setBounds(15, 15, 180, 64);
            btnUserExit.setText("   " + lg.getTxtUser().getText());
            btnUserExit.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnUserExit.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 10));
            btnUserExit.setBackground(new Color(22, 160, 133));
            btnUserExit.setForeground(new Color(223, 228, 234));
            btnUserExit.setFocusable(false);
            btnUserExit.setFont(font);
            Icon iconExit = new ImageIcon("src/Images/exit.png");
            btnUserExit.setIcon(iconExit);
            btnUserExit.setToolTipText("Çıkış");
            btnUserExit.addActionListener(actions);
            btnUserExit.setCursor(new Cursor(12));
            
        }
        return btnUserExit;
    }
    
    public void setBtnUserExit(JButton btnUserExit) {
        this.btnUserExit = btnUserExit;
    }
    
    public JButton getBtnMasa1() {
        if (btnMasa1 == null) {
            btnMasa1 = new JButton();
            btnMasa1.setText("MASA 1");
            btnMasa1.setIcon(iconTable);
            btnMasa1.setBounds(250, 120, btnWidth, btnHeigth);
            btnMasa1.setFocusable(false);
            btnMasa1.setCursor(new Cursor(12));
            btnMasa1.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa1.setName("Table1");
            btnMasa1.addMouseListener(actions);
            btnMasa1.setBackground(btnColorTable);
            btnMasa1.setForeground(btnColorText);
            
        }
        
        return btnMasa1;
    }
    
    public void setBtnMasa1(JButton btnMasa1) {
        this.btnMasa1 = btnMasa1;
    }
    
    public JButton getBtnMasa2() {
        if (btnMasa2 == null) {
            btnMasa2 = new JButton();
            btnMasa2.setText("MASA 2");
            btnMasa2.setIcon(iconTable);
            btnMasa2.setBounds(250, 250, btnWidth, btnHeigth);
            btnMasa2.setFocusable(false);
            btnMasa2.setCursor(new Cursor(12));
            btnMasa2.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa2.setName("Table2");
            btnMasa2.addMouseListener(actions);
            btnMasa2.setBackground(btnColorTable);
            btnMasa2.setForeground(btnColorText);
            
        }
        return btnMasa2;
    }
    
    public void setBtnMasa2(JButton btnMasa2) {
        this.btnMasa2 = btnMasa2;
    }
    
    public JButton getBtnMasa3() {
        if (btnMasa3 == null) {
            btnMasa3 = new JButton();
            btnMasa3.setText("MASA 3");
            btnMasa3.setIcon(iconTable);
            btnMasa3.setBounds(250, 380, btnWidth, btnHeigth);
            btnMasa3.setFocusable(false);
            btnMasa3.setCursor(new Cursor(12));
            btnMasa3.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa3.setName("Table3");
            btnMasa3.addMouseListener(actions);
            btnMasa3.setBackground(btnColorTable);
            btnMasa3.setForeground(btnColorText);
        }
        return btnMasa3;
    }
    
    public void setBtnMasa3(JButton btnMasa3) {
        this.btnMasa3 = btnMasa3;
    }
    
    public JButton getBtnMasa4() {
        if (btnMasa4 == null) {
            btnMasa4 = new JButton();
            btnMasa4.setText("MASA 4");
            btnMasa4.setIcon(iconTable);
            btnMasa4.setBounds(385, 250, btnWidth, btnHeigth);
            btnMasa4.setFocusable(false);
            btnMasa4.setCursor(new Cursor(12));
            btnMasa4.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa4.setName("Table4");
            btnMasa4.addMouseListener(actions);
            btnMasa4.setBackground(btnColorTable);
            btnMasa4.setForeground(btnColorText);
        }
        return btnMasa4;
    }
    
    public void setBtnMasa4(JButton btnMasa4) {
        this.btnMasa4 = btnMasa4;
    }
    
    public JButton getBtnMasa5() {
        if (btnMasa5 == null) {
            btnMasa5 = new JButton();
            btnMasa5.setText("MASA 5");
            btnMasa5.setIcon(iconTable);
            btnMasa5.setBounds(520, 120, btnWidth, btnHeigth);
            btnMasa5.setFocusable(false);
            btnMasa5.setCursor(new Cursor(12));
            btnMasa5.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa5.setName("Table5");
            btnMasa5.addMouseListener(actions);
            btnMasa5.setBackground(btnColorTable);
            btnMasa5.setForeground(btnColorText);
        }
        return btnMasa5;
    }
    
    public void setBtnMasa5(JButton btnMasa5) {
        this.btnMasa5 = btnMasa5;
    }
    
    public JButton getBtnMasa6() {
        if (btnMasa6 == null) {
            btnMasa6 = new JButton();
            btnMasa6.setText("MASA 6");
            btnMasa6.setIcon(iconTable);
            btnMasa6.setBounds(520, 250, btnWidth, btnHeigth);
            btnMasa6.setFocusable(false);
            btnMasa6.setCursor(new Cursor(12));
            btnMasa6.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa6.setName("Table6");
            btnMasa6.addMouseListener(actions);
            btnMasa6.setBackground(btnColorTable);
            btnMasa6.setForeground(btnColorText);
        }
        return btnMasa6;
    }
    
    public void setBtnMasa6(JButton btnMasa6) {
        this.btnMasa6 = btnMasa6;
    }
    
    public JButton getBtnMasa7() {
        if (btnMasa7 == null) {
            btnMasa7 = new JButton();
            btnMasa7.setText("MASA 7");
            btnMasa7.setIcon(iconTable);
            btnMasa7.setBounds(520, 380, btnWidth, btnHeigth);
            btnMasa7.setFocusable(false);
            btnMasa7.setCursor(new Cursor(12));
            btnMasa7.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa7.setName("Table7");
            btnMasa7.addMouseListener(actions);
            btnMasa7.setBackground(btnColorTable);
            btnMasa7.setForeground(btnColorText);
        }
        return btnMasa7;
    }
    
    public void setBtnMasa7(JButton btnMasa7) {
        this.btnMasa7 = btnMasa7;
    }
    
    public JLabel getCreatorCaption() {
        if (creatorCaption == null) {
            creatorCaption = new JLabel();
            
            creatorCaption.setText("  Creators by Ahmet & Harun ™  ");
            creatorCaption.setBounds(720, 530, 200, 40);
            creatorCaption.setForeground(btnColorText);
            
        }
        return creatorCaption;
    }
    
    public void setCreatorCaption(JLabel creatorCaption) {
        this.creatorCaption = creatorCaption;
    }
    
}
