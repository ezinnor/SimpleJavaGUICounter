package com.ezinnor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame implements ActionListener {

        private Label lblCount;
        private TextField tfCount;
        private Button btnCount;
        private int count = 0;

        public Main(){
            setLayout(new FlowLayout());
//            This set the layout to Flow layout.

            lblCount = new Label("Counter");
            add(lblCount);    //set the label in frame container

            tfCount = new TextField("0", 10);
            tfCount.setEditable(false);
            add(tfCount);
//            Added the text field component in frame container

            btnCount = new Button("Count");
            add(btnCount);
//            Added the button component in to frame container


            btnCount.addActionListener(this);


//            Set title
            setTitle("Simple Counter");
            setSize(250,100);
            setVisible(true);
        }

        public static void main(String args[]){
            Main app = new Main();
        }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ++count;
        tfCount.setText(count + "");
    }
}
