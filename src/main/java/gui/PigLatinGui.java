package main.java.gui;

import main.java.core.PigLatin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 71903 on 2017/5/9.
 */
public class PigLatinGui {
    private MyFrame frame;
    private MyLabel inputLabel;
    private MyLabel outputLabel;
    private MyTextField inputTextField;
    private MyTextField outputTextField;
    private MyButton button;


    private PigLatin sourceString;
    private String resultString;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public void initPigLatinGui(){
        frame=new MyFrame(400,300,(int)(screenSize.width*0.3),(int)(screenSize.height*0.2));
        inputLabel=new MyLabel();
        outputLabel=new MyLabel();
        inputTextField=new MyTextField();
        outputTextField=new MyTextField();
        button=new MyButton();
        sourceString=new PigLatin();
        resultString="";
        frame.setFrameTitle("PigLatin");
        frame.setLayout(new GridLayout(3,3,3,3));
        inputLabel.setText("请输入字符串：");
        outputLabel.setText("结果：");
        button.setText("PigLatin");
    }

    public void eventPigLatinGui(){

        button.addActionListener(e -> clickEvent());


    }

    public void addPigLatinGui(){
        frame.add(inputLabel);
        frame.add(inputTextField);
        frame.add(outputLabel);
        frame.add(outputTextField);
        frame.add(button);
        frame.showFrame();
    }

    public void run(){
        initPigLatinGui();
        eventPigLatinGui();
        addPigLatinGui();
    }

    public void clickEvent(){
        sourceString.setSourceString(inputTextField.getText());
        resultString=sourceString.getPigLatin();
        outputTextField.setText(resultString);
    }
}
