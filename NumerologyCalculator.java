import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.*;

public class Try {
    public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter current year:");
    int current_year=obj.nextInt();
    System.out.print("Enter birth date(DD/MM/YYYY)=");
    int date=obj.nextInt();
    int date_copy=date;
    int b=date/1000000;
    int bn=(b/10)+(b%10);
    if (b>=10){
        bn=(bn/10)+(bn%10);
        System.out.println("Basic Number:"+bn);
    }
    else{
    System.out.println("Basic Number:"+bn);
    }
    int sum=0;
    for (int i=0;i<70;i++){
        sum=sum+(date%10);
        date=date/10;
    }
    sum=(sum%10)+(sum/10);
     if (sum>=10){
       System.out.println("no");
        System.out.println(sum);
        sum=(sum%10)+(sum/10);
        System.out.println("Destiny Number:"+sum);
    }
    else{
    System.out.println("Destiny Number:"+sum);
    }
    int dn=sum;
    int year=date_copy%10000;
    //formatting purpose only
    int a=date_copy/1000000;//date
    int e=date_copy%1000000;
    int c=e/10000;//month
    int d=date_copy%10000;//year
    while (year<=2035){
        date_copy+=bn;
        d+=bn;
         System.out.println("Maha Dasha of "+bn+" till "+a+"/"+c+"/"+d);
         
         bn+=1;
         if (bn==0){
             continue;
         }
         if (bn==10){
            bn=1;
         }
         year+=bn;
     }

     //for AntarDasha Calculation
     int previous_year=current_year-5;
     int next_year=current_year+5;
     int AD_constant=0;
     for (int i=previous_year;i<=next_year;i++){
        LocalDate ld=LocalDate.of(i,c,a);
        DayOfWeek dow=ld.getDayOfWeek();
        String dowS=dow.toString();
        //System.out.println("day in year "+i+"was "+dow);
        if (dowS.equalsIgnoreCase("MONDAY")){
            AD_constant=2;
        }
        else if (dowS.equalsIgnoreCase("TUESDAY")){
            AD_constant=9;
        }
        else if(dowS.equalsIgnoreCase("WEDNESDAY")){
            AD_constant=5;
        }
        else if(dowS.equalsIgnoreCase("THURSDAY")){
            AD_constant=3;
        }
        else if (dowS.equalsIgnoreCase("FRIDAY")){
            AD_constant=6;
        }
    else if (dowS.equalsIgnoreCase("SATURDAY")){
        AD_constant=8;
    }
    else if (dowS.equalsIgnoreCase("SUNDAY")){
        AD_constant=1;
    }
        int AD=a+c+(i%100)+AD_constant;
        //System.out.println("Antar Dasha in year "+i+" was "+AD);
        AD=(AD/10)+(AD%10);
        if (AD>=10){
            AD=(AD/10)+(AD%10);
        }
        System.out.println("Antar Dasha in year "+i+": "+AD);
     }    

    }
}
