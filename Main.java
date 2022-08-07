package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
BufferedReader vVod = new BufferedReader(new InputStreamReader(System.in));
String a,b, c;
String[] str = vVod.readLine().replaceAll("\\s+", " ").split(" ");
    String [] romans = { "I","II","III","IV","V","VI","VII","VIII","IX","X", "XI","XII","XIII","XIV","XV","XVI","XVII"
    ,"XVIII","XIX","XX","XXI", "XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII"
    ,"XXXIV","XXXV", "XXXVI","XXXII", "XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII",
    "XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI",
            "LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX",
    "LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX",
            "XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

    String roman = "I II III IV V VI VII VIII IX X";

int s = 0;
int v = 0;
a = str[0];
b = str[1];
c = str[2];
int sum = 0;



if (roman.contains(a)&& roman.contains(c)) {

 for (int i = 0; i < 10; i++) {
     if (romans[i].equals(a))
         s =  i + 1;
 }
 for (int i = 0; i < 10; i++) {
     if (romans[i].equals(c))
         v = i + 1;
 }
 if ( s > 10 || v > 10) {
     System.out.print(" не коректный ввод числа не более 10");
 } else {
     if (b.equals("+")) {
         sum = s + v;

     }
     if (b.equals("-")) {
         sum = s - v;

     }
     if (b.equals("*")) {
         sum = s * v;

     }
     if (b.equals("/")) {
         sum = s / v;

     }
     for (int  y =0; y< romans.length; y++ ){
         if (y == (sum-1))
                  System.out.println(romans[y] );
     }
 }
}else {

 int q = Integer.parseInt(a);
 int w = Integer.parseInt(c);

 if (q > 10 || w > 10) {
     System.out.print(" не коректный ввод числа не более 10");
 } else {
     if (b.equals("+")) {
         sum = q + w;
         System.out.println(sum);
     }
     if (b.equals("-")) {
         sum = q - w;
         System.out.println(sum);
     }
     if (b.equals("*")) {
         sum = q * w;
         System.out.println(sum);
     }
     if (b.equals("/")) {
         sum = q / w;
         System.out.println(sum);
     }
 }
}

}
}
