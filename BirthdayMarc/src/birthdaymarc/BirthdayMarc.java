/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaymarc;


public class BirthdayMarc {

  
    public static void main(String[] args) {
       int day=12, month=9, year=2024;
       String stDat=InicioDiaMesZeller(day, month, year);
        System.out.println("International programmer's day: "+stDat +"Sep2021" );
    }
       private static String InicioDiaMesZeller(int day, int month, int year)
{
String[]ArrayWeek ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };    
int a, y, m, d;
a = (14 - month) / 12;
y = year - a;
m = month + 12 * a - 2;
d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
return ArrayWeek[d];
}
    
    
}
