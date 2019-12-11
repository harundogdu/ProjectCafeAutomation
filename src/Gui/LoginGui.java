package Gui;

import Logic.Actions;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGui {
    
    JFrame jfLogin = null;
    JPanel jpLogin = null;
    JLabel lblUser = null;
    JLabel lblPassword = null;
    JTextField txtUser = null;
    JPasswordField txtPassword = null;
    JButton btnGiris = null;
    Font font = new Font("monospaced", Font.BOLD, 16);
    
    Actions actions = new Actions(this);
    
    public LoginGui() {
        getJfLogin().add(getJpLogin());
        getJpLogin().add(getLblPassword());
        getJpLogin().add(getLblUser());
        getJpLogin().add(getTxtPassword());
        getJpLogin().add(getTxtUser());
        getJpLogin().add(getBtnGiris());
        
        getJfLogin().setVisible(true);
    }
    
    public JFrame getJfLogin() {
        if (jfLogin == null) {
            jfLogin = new JFrame();
            //jfLogin.setLocationRelativeTo(null);
            jfLogin.setSize(600, 450);
            jfLogin.setLocation(394, 159);
            jfLogin.setResizable(false);
            jfLogin.setUndecorated(true);
            
        }
        
        return jfLogin;
    }
    
    public void setJfLogin(JFrame jfLogin) {
        this.jfLogin = jfLogin;
    }
    
    public JPanel getJpLogin() {
        if (jpLogin == null) {
            jpLogin = new JPanel();
            
            jpLogin.setBounds(getJfLogin().getBounds());
            jpLogin.setBackground(new Color(231, 76, 60));
            
            jpLogin.setLayout(null);
        }
        return jpLogin;
    }
    
    public void setJpLogin(JPanel jpLogin) {
        this.jpLogin = jpLogin;
    }
    
    public JLabel getLblUser() {
        if (lblUser == null) {
            lblUser = new JLabel();
            lblUser.setBounds(100, 100, 200, 30);
            lblUser.setText("Kullanıcı Adı :");
            lblUser.setFont(font);
            lblUser.setForeground(new Color(236, 240, 241));
            
        }
        
        return lblUser;
    }
    
    public void setLblUser(JLabel lblUser) {
        this.lblUser = lblUser;
    }
    
    public JLabel getLblPassword() {
        if (lblPassword == null) {
            lblPassword = new JLabel();
            
            lblPassword.setBounds(100, 150, 200, 30);
            lblPassword.setText("Şifre Alanı   :");
            lblPassword.setFont(font);
            lblPassword.setForeground(new Color(236, 240, 241));
            
        }
        return lblPassword;
    }
    
    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }
    
    public JTextField getTxtUser() {
        if (txtUser == null) {
            txtUser = new JTextField();
            
            txtUser.setBounds(250, 100, 200, 30);
            txtUser.setFont(font);
            txtUser.setForeground(new Color(231, 76, 60));
            txtUser.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            txtUser.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        }
        return txtUser;
    }
    
    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }
    
    public JPasswordField getTxtPassword() {
        if (txtPassword == null) {
            txtPassword = new JPasswordField();
            
            txtPassword.setBounds(250, 150, 200, 30);
            txtPassword.setFont(font);
            txtPassword.setForeground(new Color(231, 76, 60));
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
            txtPassword.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            
        }
        return txtPassword;
    }
    
    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }
    
    public JButton getBtnGiris() {
        if (btnGiris == null) {
            btnGiris = new JButton();
            
            btnGiris.setText("Giriş Yap");
            btnGiris.setBounds(200, 215, 120, 30);
            btnGiris.setFont(font);
            btnGiris.setForeground(new Color(236, 240, 241));
            btnGiris.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnGiris.setBackground(new Color(241, 196, 15));
            
            btnGiris.addActionListener(actions);
            
        }
        return btnGiris;
    }
    
    public void setBtnGiris(JButton btnGiris) {
        this.btnGiris = btnGiris;
    }
    
}
