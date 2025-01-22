New! Keyboard shortcuts … Drive keyboard shortcuts have been updated to give you first-letters navigation
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class wordle extends JFrame implements
        ActionListener {
    JPanel p1;
    JButton check;
    JLabel chn;
    int chances = 5;
    static ArrayList<JTextField> tf = new ArrayList<>();
    wordle(){
        setSize(500,500);
        p1 = new JPanel();
        p1.setBounds(100,80,300,60);
        p1.setLayout(new
                BoxLayout(p1,BoxLayout.X_AXIS));
// p1.setBackground(Color.GRAY);
        add(p1);
        createTexfields();
        chn = new JLabel("Chances remaining: "+chances);
        chn.setBounds(150,500,150,50);
        add(chn);
        chn = new JLabel("HINT: No one can survive without it");
        chn.setBounds(150,250,550,50);
        add(chn);
        check = new JButton("Check");
        check.setBounds(150,350,150,50);
        check.addActionListener(this);
        add(check);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==check) {
            if (chances > 0) {
                Object Frame = null;
                wordle.java (Frame);
                //checking each textboxes loop
                for (int i = 0; i < wordle_logic.wordSize;
                     i++) {
                    if (wordle_logic.matchExactLetter(i)) {

                        tf.get(i).setBackground(Color.green);
                    } else if (wordle_logic.matchLetter(i))
                    {

                        tf.get(i).setBackground(Color.yellow);
                    } else {

                        tf.get(i).setBackground(Color.WHITE);
                    }
                }
                chances--;
                chn.setText("Chances remaining: "+chances);
            }
            else{
                JOptionPane.showMessageDialog(null,"sorry mate, you couldnt make it!");
                System.exit(0);
            }
        }
    }

    private static void java(Object frame) {
    }

    void createTexfields(){
        //for adding the textboxes in arraylist
        for(int i =0; i<wordle_logic.wordSize ; i++){
            tf.add(new JTextField());
            tf.get(i).setFont(new
                    Font("Tahoma",Font.BOLD,32));

            tf.get(i).setHorizontalAlignment(JTextField.CENTER);
        }
        //for placing the textboxes on the JPanel
        for(int i =0;i<wordle_logic.wordSize;i++){
            p1.add(tf.get(i));
        }
    }
    public static void main(String[] args) {
        new wordle_logic();
        new wordle();
    }
}