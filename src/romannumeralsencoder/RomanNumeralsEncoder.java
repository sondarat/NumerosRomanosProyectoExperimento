/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeralsencoder;

/**
 *
 * @author jesus
 */
public class RomanNumeralsEncoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sol = "";
        int n = 19;
        int contador = 0;
        int auxiliar=0;
        while ((n - 1000) > 0) {
            n = n - 1000;

            sol = sol + "M";

        }
        if (n - 1000 == 0) {
            n = n - 1000;
            sol = sol + "M";
        }
        while ((n - 500) > 0) {
            n = n - 500;
            contador = contador + 1;

        }

        if (n - 500 == 0 && contador < 3) {
            n = n - 500;
            sol = sol + "D";
        }
        if (contador > 3) {
            sol = sol + "CM";
        } else {
            for (int x = 0; x < contador; x++) {
                sol = sol + "D";
            }
            contador = 0;
        }
        while ((n - 100) > 0) {
            n = n - 100;
            contador = contador + 1;
        }
        if (n - 100 == 0 && contador < 3) {
            n = n - 100;
            sol = sol + "C";
        }
        if (contador > 3) {
            sol = sol + "CD";
        } else {
            for (int x = 0; x < contador; x++) {
                sol = sol + "C";
            }
            contador = 0;
            while ((n - 50) > 0) {
                n = n - 50;
                contador = contador + 1;

            }
            if (n - 50 == 0 && contador < 3) {
                n = n - 50;
                sol = sol + "L";
            }
            if (contador > 3) {
                sol = sol + "XC";
            } else {
                for (int x = 0; x < contador; x++) {
                    sol = sol + "L";
                }
                contador = 0;
                while ((n - 10) > 0) {
                    n = n - 10;
                    contador = contador + 1;

                }
                if (n - 10 == 0 && contador < 3) {
                    n = n - 10;
                    sol = sol + "X";
                }
                if (contador > 3) {
                    sol = sol + "XL";
                } else {
                    for (int x = 0; x < contador; x++) {
                        sol = sol + "X";
                    }
                }
                contador = 0;
                while ((n - 5) > 0) {
                    auxiliar=auxiliar+n;
                    n = n - 5;
                    contador = contador + 1;

                }
                if ((n - 5 == 0 && contador < 3) && 5+n!=9) {
                    
                    n = n - 5;
                    sol = sol + "V";
                }
                if (contador > 3 || auxiliar+1==10) {
                    sol = sol + "IX";
                    n=n-9;
                } else {
                    for (int x = 0; x < contador; x++) {
                        sol = sol + "V";
                    }
                }
                contador = 0;
                while ((n - 1) > 0) {
                    n = n - 1;
                    contador = contador + 1;

                }

                if (n - 1 == 0 && contador < 3) {
                    n = n - 1;
                    sol = sol + "I";
                }
                if (contador > 3 || n == 1) {
                    sol = sol + "IV";
                } else {
                    for (int x = 0; x < contador; x++) {
                        sol = sol + "I";
                    }
                    contador = 0;

                }

            }
        }
        System.out.println(sol);
    }

}
