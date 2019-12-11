package Logic;

import Gui.LoginGui;
import Gui.MainGui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class Actions implements ActionListener, MouseListener {

    Color btnColorTable = new Color(30, 144, 255);
    LoginGui lg;
    MainGui mg;

    public Actions(LoginGui lg) {
        this.lg = lg;
    }

    public Actions(MainGui mg) {
        this.mg = mg;
       animationCreatorCaption();
    }

    String id = "Ahmet";
    String pw = "Adamdır";

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (lg != null) // Kullanıcı Girişi Kısmı Başlangıcı 
        {
            if (ae.getSource() == lg.getBtnGiris()) {
                if (lg.getTxtUser().getText().equals(id) && pw.equals(String.valueOf(lg.getTxtPassword().getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Hoşgeldiniz Sayın : " + id);
                    lg.getJfLogin().setVisible(false);

                    MainGui mg = new MainGui(lg);

                } else if (!lg.getTxtUser().getText().equals(id) && pw.equals(String.valueOf(lg.getTxtPassword().getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Hatalı Kullanıcı Adı !");
                } else if (lg.getTxtUser().getText().equals(id) && !pw.equals(String.valueOf(lg.getTxtPassword().getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Hatalı Şifre !");
                } else {
                    JOptionPane.showMessageDialog(null, "Hatalı Kullanıcı Adı / Şifre");
                    lg.getTxtPassword().setText("");
                    lg.getTxtUser().setText("");
                }
            }
        } // Kullanıcı Girişi Kısmı Sonu
        else if (mg != null) {
            // Main Gui den Kullanıcı Girişine Olan Kısım Başlangıcı
            if (ae.getSource() == mg.getBtnUserExit()) {
                int answer = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyormusunuz ?", "Çıkış Uyarısı", 2, 2);
                if (answer == 0) {
                    mg.getJfMain().setVisible(false);
                    lg = new LoginGui();
                }
            }
        }
        // Main Gui den Kullanıcı Girişine Olan Kısım Sonu
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (mg != null) {

            for (int i = 0; i < 7; i++) {
                if (me.getSource() == mg.btnMasalar[i]) {
                    mg.btnMasalar[i].setBackground(new Color(255, 107, 129));
                    mg.btnMasalar[i].setForeground(new Color(235, 235, 235));
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (mg != null) {

            for (int i = 0; i < 7; i++) {
                if (me.getSource() == mg.btnMasalar[i]) {
                    mg.btnMasalar[i].setBackground(new Color(236, 204, 104));
                    mg.btnMasalar[i].setForeground(new Color(0, 0, 0));
                }
            }
        }
    }

    public void animationCreatorCaption() {
        Thread th1 = new Thread() {
            public void run() {
                int index = -201;
                try {
                    while (true) {
                        for (int i = 880; i > index; i--) {
                            Thread.sleep(7);
                            mg.getCreatorCaption().setLocation(i, 530);
                        }      
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        };
        th1.start();
    }

}
