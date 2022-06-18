package com.komar_olga;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ExamplePainlessGridBag extends JFrame /*implements ActionListener*/ {
    private JLabel lblFirstName, lblFamilyName, lblAddress;
    private JTextField txtFirstName, txtFamilyName, txtAddress;

    public ExamplePainlessGridBag() {
        setTitle("Example");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        lblFirstName = new JLabel("First Name:");
        lblFamilyName = new JLabel("Family Name:");
        lblAddress = new JLabel("Address");
        txtFirstName = new JTextField();
        txtFamilyName = new JTextField();
        txtAddress = new JTextField();
        PainlessGridbagConfiguration config = new PainlessGridbagConfiguration();
        config.setFirstColumnLeftSpacing(5);
        config.setFirstRowTopSpacing(5);
        config.setLastColumnRightSpacing(5);
        config.setLastRowBottomSpacing(5);
        PainlessGridBag gbl = new PainlessGridBag(getContentPane(), config, false);
        gbl.row().cell(lblFirstName).cell(txtFirstName).fillX()
                .cell(lblFamilyName).cell(txtFamilyName).fillX();
        gbl.row().cell(lblAddress).cellXRemainder(txtAddress).fillX();
        gbl.doneAndPushEverythingToTop();
        setVisible(true);

    }


}
