import javax.swing.*;

public class Buttons extends JFrame{

    private static boolean xTurn = true;

    private static boolean [] arr = new boolean[9];

    public Buttons(JFrame frame) {

        JButton square1 = new JButton("1");
        frame.add(square1);

        square1.addActionListener((event)->{
            xy(square1);
        });
        checkWin(arr);



        JButton square2 = new JButton("2");
        frame.add(square2);

        square2.addActionListener((event)->{
            xy(square2);
        });
        checkWin(arr);


        JButton square3 = new JButton("3");
        frame.add(square3);

        square3.addActionListener((event)->{
            xy(square3);
        });
        checkWin(arr);

        JButton square4 = new JButton("4");
        frame.add(square4);

        square4.addActionListener((event)->{
            xy(square4);
        });
        checkWin(arr);


        JButton square5 = new JButton("5");
        frame.add(square5);

        square5.addActionListener((event)->{
            xy(square5);
        });
        checkWin(arr);



        JButton square6 = new JButton("6");
        frame.add(square6);

        square6.addActionListener((event)->{
            xy(square6);
        });
        checkWin(arr);


        JButton square7 = new JButton("7");
        frame.add(square7);

        square7.addActionListener((event)->{
            xy(square7);
        });
        checkWin(arr);



        JButton square8 = new JButton("8");
        frame.add(square8);

        square8.addActionListener((event)->{
            xy(square8);
        });
        checkWin(arr);



        JButton square9 = new JButton("9");
        frame.add(square9);

        square9.addActionListener((event)->{
            xy(square9);
        });
        checkWin(arr);

    }

    public static void xy(JButton button){

        JLabel label;
        if(xTurn){
            label = new JLabel("X");
        }else{
            label = new JLabel("Y");
        }

        button.setText(label.getText());

        int x;
        x = Integer.parseInt(button.getText());

            arr[x] = xTurn;

            xTurn = !xTurn;


    }

    public static void checkWin (boolean[]arr){
        if(arr[0]==arr[1]&&arr[1]==arr[2]){
            if(arr[0]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[0]==arr[3]&&arr[3]==arr[6]){
            if(arr[0]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[0]==arr[4]&&arr[4]==arr[8]){
            if(arr[0]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[1]==arr[4]&&arr[4]==arr[7]){
            if(arr[1]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[2]==arr[5]&&arr[5]==arr[8]){
            if(arr[2]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[3]==arr[4]&&arr[4]==arr[5]){
            if(arr[3]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[6]==arr[7]&&arr[7]==arr[8]){
            if(arr[6]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }if(arr[2]==arr[4]&&arr[4]==arr[6]){
            if(arr[2]){
                System.out.println("x win");
            }else{
                System.out.println("y win");
            }
        }
    }


}
