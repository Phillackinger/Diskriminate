package phil.fsst;
import java.lang.Math;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //a+x^2 + bx + c = 0

        // Start
        float a=0;
        float b=0;
        float c=0;
        float p=0;
        float q=0;
        double xkp, xkn, quadratkp, quadratkn; //xk kleine Diskriminante ergebnis; quadratzahl;  p = positiv; n = negativ
        double xgp, xgn, quadratgp, quadratgn; //xg große Diskriminante ergebnis; quadratzahl;  p = positiv; n = negativ


        //Input

        String Decide = JOptionPane.showInputDialog("Wähle ob du die \ngroße Diskriminaten [1] \noder \nkleine Diskrimante[2]");
        int decide = Integer.parseInt(Decide);

        if (decide == 1) {

            String Input = JOptionPane.showInputDialog("Gib deine Gleichung in diesem Format ein: a*x^2+b*x+c=0 \n!WICHTIG! KEINE LEERZEICHEN BENÜTZEN");

            String A = Input.substring(0, 1);
            System.out.println(A);
            a = Float.parseFloat(A);

            String B = Input.substring(5, 7);
            System.out.println(B);
            b = Float.parseFloat(B);

            String C = Input.substring(9, 11);
            System.out.println(C);
            c = Float.parseFloat(C);

            JOptionPane.showMessageDialog(null, "Deine Eingabe lautet: " + A + "*x^2 + " + B + "*x + " + C + " = 0");

            //große Diskriminante
            //große Diskriminante positiv
            quadratgp = b * b;
            xgp = (-b + Math.sqrt(quadratgp - (4 * a * c))) / (2 * a);

            //große Diskriminante negativ
            quadratgn = b * b;
            xgn = (-b - Math.sqrt(quadratgn - (4 * a * c))) / (2 * a);

            System.out.println(xgp);
            System.out.println(xgn);

            if(xgp > 0){
                //2 Reelle Lösungen

                JOptionPane.showMessageDialog(null, "D+ = " +  xgp + "\nD- = " +  xgn);

            }else if( xgp == 0){
                //1 Lösung
                JOptionPane.showMessageDialog(null, "D = " +  xgp);
            }else if(xgp < 0){
                //Keine Reele Lösung
                JOptionPane.showMessageDialog(null, "Die von dir eingebe Gleichung hat keine Lösung");
            }

        }

        if (decide == 2) {

            String InputB = JOptionPane.showInputDialog("Gib deine Gleichung in diesem Format ein: (p/2)^2-q \n!WICHTIG! KEINE LEERZEICHEN BENÜTZEN");

            String P = InputB.substring(1, 2);
            System.out.println(P);
            p = Float.parseFloat(P);

            String Q = InputB.substring(7, 9);
            System.out.println(Q);
            q = Float.parseFloat(Q);

            JOptionPane.showMessageDialog(null, "Deine Eingabe lautet: D = (" + P + "/2)^2-" + Q);

            //Kleine Diskriminante
            //Kleine Diskriminante positiv
            quadratkp = (((p / 2) * (p / 2)) - q);
            xkp = -(p / 2) + Math.sqrt(quadratkp);

            //Kleine Diskriminante negativ
            quadratkn = (((p / 2) * (p / 2)) - q);
            xkn = -(p / 2) - Math.sqrt(quadratkn);


            System.out.println(quadratkp);
            System.out.println(quadratkn);

            if(quadratkp > 0){
                //2 Reelle Lösungen
                JOptionPane.showMessageDialog(null, "D- = " +  xkp +  "\nD+ = " +  xkn);
            }
            else if( quadratkp == 0){
                //1 Lösung
                JOptionPane.showMessageDialog(null, "D = " +  xkp);
            }
            else if(quadratkp < 0){
                //Keine Reele Lösung
                JOptionPane.showMessageDialog(null, "Die von dir eingebe Gleichung hat keine Lösung");

            }

        }

        if (decide == 3) {

            String A = JOptionPane.showInputDialog("Gib a ein");
            System.out.println(A);
            a = Float.parseFloat(A);

            String B = JOptionPane.showInputDialog("Gib b ein");
            System.out.println(B);
            b = Float.parseFloat(B);

            String C = JOptionPane.showInputDialog("Gib c ein");
            System.out.println(C);
            c = Float.parseFloat(C);

            //große Diskriminante
            //große Diskriminante positiv
            quadratgp = b * b;
            xgp = (-b + Math.sqrt(quadratgp - (4 * a * c))) / (2 * a);

            //große Diskriminante negativ
            quadratgn = b * b;
            xgn = (-b - Math.sqrt(quadratgn - (4 * a * c))) / (2 * a);

            System.out.println(xgp);
            System.out.println(xgn);

            if(xgp > 0){
                //2 Reelle Lösungen

                JOptionPane.showMessageDialog(null, "D+ = " +  xgp + "\nD- = " +  xgn);

            }else if( xgp == 0){
                //1 Lösung
                JOptionPane.showMessageDialog(null, "D = " +  xgp);
            }else if(xgp < 0){
                //Keine Reele Lösung
                JOptionPane.showMessageDialog(null, "Die von dir eingebe Gleichung hat keine Lösung");
            }

        }


        }

        if (decide == 4) {

            String P = JOptionPane.showInputDialog("Gib P ein");
            System.out.println(P);
            p = Float.parseFloat(P);

            String Q = JOptionPane.showInputDialog("Gib Q ein");
            System.out.println(Q);
            q = Float.parseFloat(Q);

            //Kleine Diskriminante
            //Kleine Diskriminante positiv
            quadratkp = (((p / 2) * (p / 2)) - q);
            xkp = -(p / 2) + Math.sqrt(quadratkp);

            //Kleine Diskriminante negativ
            quadratkn = (((p / 2) * (p / 2)) - q);
            xkn = -(p / 2) - Math.sqrt(quadratkn);


            System.out.println(quadratkp);
            System.out.println(quadratkn);

            if(quadratkp > 0){
                //2 Reelle Lösungen
                JOptionPane.showMessageDialog(null, "D- = " +  xkp +  "\nD+ = " +  xkn);
            }
            else if( quadratkp == 0){
                //1 Lösung
                JOptionPane.showMessageDialog(null, "D = " +  xkp);
            }
            else if(quadratkp < 0){
                //Keine Reele Lösung
                JOptionPane.showMessageDialog(null, "Die von dir eingebe Gleichung hat keine Lösung");

            }



        }
    }

};