package swingapplaction;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class MyFrame extends JFrame {

    JLabel labelName;
    JLabel labelAge;
    JLabel labelEmail;
    JTextField textName;
    JTextField textAge;
    JTextField textEmail;
    JButton btnOk;
    JButton btnCancel;
    JButton btnClear;
    JPanel panelGird;
    JPanel panelFlow;
    GridLayout layoutpanelGrid;
    GridLayout frameGrid;

    public MyFrame() {

        //label with name
        labelName = new JLabel("Name :");
        labelAge = new JLabel("Age: ");
        labelEmail = new JLabel("Email :");

        textName = new JTextField(20);
        textAge = new JTextField(20);
        textEmail = new JTextField(20);

        panelGird = new JPanel();
        layoutpanelGrid = new GridLayout(3, 2);
        panelGird.setLayout(layoutpanelGrid);

        panelGird.add(labelName);
        panelGird.add(textName);
        panelGird.add(labelAge);
        panelGird.add(textAge);

        panelGird.add(labelEmail);

        panelGird.add(textEmail);

        btnOk = new JButton("OK");
        btnCancel = new JButton("Canel");
        btnClear = new JButton("Clear");
        panelFlow = new JPanel();
        panelFlow.add(btnOk);
        panelFlow.add(btnCancel);
        panelFlow.add(btnClear);

        //frame
        frameGrid = new GridLayout(2, 1);
        setLayout(frameGrid);
        add(panelGird);
        add(panelFlow);
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setName("frist GUI WITH swwing");
    }

}
