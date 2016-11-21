import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pccc on 11/21/2016.
 */
public class BaseFrame extends JFrame implements ActionListener {
    GridLayout gridLayout = new GridLayout(1, 2);
    JButton jButton = new JButton("namehere");


    public void getSoundButtons(){

    }

    BaseFrame(){
        super("Adrian's sound board");
        setLayout(gridLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        BaseFrame baseFrame = new BaseFrame();
        baseFrame.setVisible(true);
        baseFrame.setSize(500,500);
    }
}
