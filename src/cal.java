//https://copyassignment.com/swing-gui-calculator-in-java/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cal implements ActionListener {

    int casee=0;
    String str;
    double ans=0,num=0;

    JFrame frame = new JFrame();

    JTextField textField = new JTextField();

    //buttons
    JButton bsefr = new JButton("0");
    JButton byek = new JButton("1");
    JButton bdo = new JButton("2");
    JButton bse = new JButton("3");
    JButton bchahar = new JButton("4");
    JButton bpanj = new JButton("5");
    JButton bshish = new JButton("6");
    JButton bhaft = new JButton("7");
    JButton bhasht = new JButton("8");
    JButton bnoh = new JButton("9");
    JButton jam = new JButton("+");
    JButton menha = new JButton("-");
    JButton zarb = new JButton("x");
    JButton taghsim = new JButton("/");
    JButton momayez = new JButton(".");
    JButton clr = new JButton("CLR");
    JButton del = new JButton("DEL");
    JButton mosavi = new JButton("=");
    JButton gharineh = new JButton("-/+");




    cal() {

        setthings();
        addActionEvent();
    }
    public void setthings() {

        //FRAME
        frame.setTitle("Mashin Hesab");
        frame.setSize(270, 500);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //satr aval
        byek.setBounds(10, 150, 50, 50);
        frame.add(byek);
        bdo.setBounds(70, 150, 50, 50);
        frame.add(bdo);
        bse.setBounds(130, 150, 50, 50);
        frame.add(bse);
        jam.setBounds(190, 150, 50, 50);
        frame.add(jam);

        //satr dovom
        bchahar.setBounds(10, 210, 50, 50);
        frame.add(bchahar);
        bpanj.setBounds(70, 210, 50, 50);
        frame.add(bpanj);
        bshish.setBounds(130, 210, 50, 50);
        frame.add(bshish);
        menha.setBounds(190, 210, 50, 50);
        frame.add(menha);

        //satr sevom
        bhaft.setBounds(10, 270, 50, 50);
        frame.add(bhaft);
        bhasht.setBounds(70, 270, 50, 50);
        frame.add(bhasht);
        bnoh.setBounds(130, 270, 50, 50);
        frame.add(bnoh);
        zarb.setBounds(190, 270, 50, 50);
        frame.add(zarb);

        //satr chaharom
        momayez.setBounds(10, 330, 50, 50);
        frame.add(momayez);
        bsefr.setBounds(70, 330, 50, 50);
        frame.add(bsefr);
        mosavi.setBounds(130, 330, 50, 50);
        frame.add(mosavi);
        taghsim.setBounds(190, 330, 50, 50);
        frame.add(taghsim);

        //satr akhar
        del.setBounds(20, 400, 60, 40);
        frame.add(del);
        clr.setBounds(100, 400, 60, 40);
        frame.add(clr);
        gharineh.setBounds(180, 400, 60, 40);
        frame.add(gharineh);

        textField.setBounds(10, 50, 230, 40);
        frame.add(textField);


    }

    public void addActionEvent() {

        byek.addActionListener(this);
        bdo.addActionListener(this);
        bse.addActionListener(this);
        bchahar.addActionListener(this);
        bpanj.addActionListener(this);
        bshish.addActionListener(this);
        bhaft.addActionListener(this);
        bhasht.addActionListener(this);
        bnoh.addActionListener(this);
        bsefr.addActionListener(this);
        jam.addActionListener(this);
        menha.addActionListener(this);
        zarb.addActionListener(this);
        taghsim.addActionListener(this);
        momayez.addActionListener(this);
        clr.addActionListener(this);
        del.addActionListener(this);
        mosavi.addActionListener(this);
        gharineh.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object dokme = e.getSource();



        //aadad
        if(dokme==byek){
            textField.setText(textField.getText() + "1");
        }
        if(dokme==bdo){
            textField.setText(textField.getText() + "2");
        }
        if(dokme==bse){
            textField.setText(textField.getText() + "3");
        }
        if(dokme==bchahar){
            textField.setText(textField.getText() + "4");
        }
        if(dokme==bpanj){
            textField.setText(textField.getText() + "5");
        }
        if(dokme==bshish){
            textField.setText(textField.getText() + "6");
        }
        if(dokme==bhaft){
            textField.setText(textField.getText() + "7");
        }
        if(dokme==bhasht){
            textField.setText(textField.getText() + "8");
        }
        if(dokme==bnoh){
            textField.setText(textField.getText() + "9");
        }
        if(dokme==bsefr){
            textField.setText(textField.getText() + "0");
        }
        if(dokme==momayez){
            String tmp_str=textField.getText();
            if (tmp_str.contains(".")){
                textField.setText(textField.getText());
            }
            else {
                textField.setText(textField.getText() + ".");
            }

        }

        //amaliat
        str= textField.getText();
        if (dokme==jam){

            num= Double.parseDouble(str);
            textField.setText("");
            casee=1;
            System.out.println(casee);
        }
        if (dokme==menha){
            num= Double.parseDouble(str);
            textField.setText("");
            casee=2;
        }
        if (dokme==zarb){
            num= Double.parseDouble(str);
            textField.setText("");
            casee=3;
        }
        if (dokme==taghsim){
            num= Double.parseDouble(str);
            textField.setText("");
            casee=4;
        }
        if (dokme==gharineh){
            num= Double.parseDouble(str);
            num*=-1;
            textField.setText(Double.toString(num));

        }
        if (dokme == mosavi) {
            // System.out.println(casee);
            if (casee==1){
                ans = num + Double.parseDouble(str);
                textField.setText(Double.toString(ans));

            }
            if (casee==2){
                ans = num - Double.parseDouble(str);
                textField.setText(Double.toString(ans));

            }
            if (casee==3){
                ans = num * Double.parseDouble(str);
                textField.setText(Double.toString(ans));

            }
            if (casee==4){
                if (Double.parseDouble(str)==0){
                    System.out.println("you can't divide number by 0 ");
                }
                ans = num / Double.parseDouble(str);
                textField.setText(Double.toString(ans));

            }


        }

        if (dokme==clr){
            textField.setText("");
        }
        if (dokme==del) {
            str=textField.getText();
            int length = str.length(); // Get the length of the text field
            length--;

            if (length >=0) {
                StringBuilder st = new StringBuilder(str);
                st.deleteCharAt(length);
                textField.setText(st.toString());


            }
        }

    }


    public static void main(String[] args)
    {
        new cal();
    }
}