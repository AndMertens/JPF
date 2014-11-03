/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpf;

import java.util.Scanner;

/**
 *
 * @author Laptop-andy
 */
public class JPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     //THEORIE HOOFDSTUK 2/3
     //celciusNaarFahrenheit(20);
     //System.out.println();
     //berekenBMI(68F,1.68F);
     //System.out.println();
     //controleerBtwNummer(460593315);
     //System.out.println();
     //controleerRekeningNummer(737524091952L);
           
     // OEFENINGEN HOOFDSTUK 2/3 (1 tm 5)
     //initialiseerVariabelen();
     //berekenGemiddelde(8,6,9,4);
     //berekenWisselgeld(0.42F);
     //berekenTijd(5924);
         
     // OEFENINGEN HOOFDSTUK 4 (6 tm 10)
     //lijstVanGetallen();
     //genereerGetallen();
     //sorteerGetallen();
     //genereerLottoGetallen();   
     //aantalHuisdieren();
    }
    
    // OEFENINGEN HOOFDSTUK 4 (6 tm 10)
    static protected void aantalHuisdieren(){
        int aantalHuisdieren;
        System.out.print("Hoeveel huisdieren hebt u? ");
        Scanner huisdier = new Scanner(System.in);
        aantalHuisdieren = huisdier.nextInt();
        System.out.println();
        
        switch(aantalHuisdieren) {
            case 1:
                System.out.println("Je hebt 1 huisdier");
                break;
            case 2:
                System.out.println("Je hebt 2 huisdieren");
                break;
            case 3:
                System.out.println("Je hebt 3 huisdieren");
                break;
            default:
                System.out.println("Je hebt meer dan 3 huisdieren");
                
        }       
        
    }
    
    static protected void genereerLottoGetallen(){
        int [] reeksGetallen= new int[6];
        int lottoGetal;
        boolean IsAlGetrokken;
        //vul reeks getallen
        for(int i=0; i<reeksGetallen.length;i++) {
            /*random gaat tussen 0 en 1 : om grens 1-42 te nemen voegen we 0.01 toe aan de generator
            en vermenigvuldigen met 42 */
            do {
                IsAlGetrokken=false;
                lottoGetal = (int)((Math.random()+0.01F)*42);
                for(int j=0;j<=i;j++) {
                    if (reeksGetallen[j]==lottoGetal)
                        IsAlGetrokken=true;
                }
            }
                while(IsAlGetrokken);
                reeksGetallen[i]= lottoGetal;
        }
        
        //Sorter reeks getallen
        int tempGetal;
        for(int i=0; i<reeksGetallen.length-1;i++) {
            tempGetal=0;
            for(int j=i+1;j<reeksGetallen.length;j++) {
                if(reeksGetallen[i]>reeksGetallen[j]) {
                    tempGetal=reeksGetallen[j]; 
                    reeksGetallen[j]=reeksGetallen[i];
                    reeksGetallen[i]= tempGetal;
                }
            }
        }
            
        //Druk reeks getallen af
        for(int i=0; i<reeksGetallen.length;i++) {
            System.out.println(reeksGetallen[i]);
        }
    }
    
    static protected void sorteerGetallen() {
        int [] reeksGetallen= new int[100];
        
        //vul reeks getallen
        for(int i=0; i<reeksGetallen.length;i++) {
            //random geet tussen 0 en 1 : om grens 1-1000 te nemen voegen we 0.01 toe aan de generator
            reeksGetallen[i]= (int)((Math.random()+0.001F)*1000);
        }
        //Sorter reeks getallen
        int tempGetal;
        for(int i=0; i<reeksGetallen.length-1;i++) {
            tempGetal=0;
            for(int j=i+1;j<reeksGetallen.length;j++) {
                if(reeksGetallen[i]>reeksGetallen[j]) {
                    tempGetal=reeksGetallen[j]; 
                    reeksGetallen[j]=reeksGetallen[i];
                    reeksGetallen[i]= tempGetal;
                }
            }
        }
            
        //Druk reeks getallen af
        for(int i=0; i<reeksGetallen.length;i++) {
            System.out.println(reeksGetallen[i]);
        }
    }
            
    static protected void genereerGetallen(){
        int [] reeksGetallen= new int[10000];
               
        for(int i=0; i<reeksGetallen.length;i++) {
            //random geet tussen 0 en 1 : om grens 1-100 te nemen voegen we 0.01 toe aan de generator
            reeksGetallen[(int)((Math.random()+0.01F)*100)]+= 1;
        }
        
        for(int i=0; i<reeksGetallen.length;i++) {
            if(reeksGetallen[i]!=0)
                System.out.println("Getal " + i + " : " + reeksGetallen[i] + " maal") ;
        }
    }
    
    static protected void lijstVanGetallen(){
        int [] reeksGetallen = new int[5];
        long somGetallen=0;
        
        // vul de lijst op
        for(int i=0;i<reeksGetallen.length;i++)
             reeksGetallen[i]=(int)(Math.random()*1000);
        
        //print resultaat
        for(int i=0;i<reeksGetallen.length;i++)
        {
            System.out.println("Getal " + i + " : " + reeksGetallen[i]);
            somGetallen+=reeksGetallen[i];
        }
            System.out.println("Som van de getallen is : " + somGetallen);
            System.out.println("Gemiddelde is : " + (float)somGetallen/reeksGetallen.length);
    }
    
    // OEFENINGEN HOOFDSTUK 2 (1 tm 5)
    static protected void initialiseerVariabelen(){
        char charCode = 'a';
        byte byteCode=125;
        short shortCode=32767;
        int intCode=2147483647;
        long longCode=2147483648328L;
        float floatCode=32768.258F;
        double doubleCode=5289740332768.56879D;
        String stringCode="Hallo, 2500.";
        
        System.out.println("char: " + charCode);
        System.out.println("char: " + byteCode);
        System.out.println("short: " + shortCode);
        System.out.println("int: " + intCode);
        System.out.println("long: " + longCode);
        System.out.println("float: " + floatCode);
        System.out.println("double: " + doubleCode);
        System.out.println("String: " + stringCode);
    }
    
    static protected void berekenGemiddelde(int getal1, int getal2,int getal3, int getal4){
        int som = (getal1 + getal2+ getal3 + getal4);
        float gemiddelde=(float)som/4;
        float percentage=gemiddelde*10;
        System.out.println("Gemiddelde : " + gemiddelde + "\t Percentage : " + percentage);
    }
    
    static protected void berekenWisselgeld(float kostprijs){
        final byte BETAAL_BEDRAG = 2;
        float restBedrag;
        float tempBedrag;
        restBedrag = BETAAL_BEDRAG - kostprijs;
        System.out.println("Terug te geven bedrag op 2 euro voor kostprijs " + kostprijs + " is : " + restBedrag);
        System.out.println("------------------------------------------------------------------------");
        
        if (restBedrag >1){
            System.out.println("Aantal munten van 1 euro: " + (int)(restBedrag/1F));
            restBedrag %= (int)(restBedrag/1F);
        }
        if(restBedrag>0.50) {
            System.out.println("Aantal munten van 50 eurocent: " + (int)(restBedrag/0.50));
            restBedrag -= (int)(restBedrag/0.50F)* 0.50F;
        }       
        if(restBedrag>0.20) {
            System.out.println("Aantal munten van 20 eurocent: " + (int)(restBedrag/0.20));
            restBedrag -= (int)(restBedrag/0.20F)* 0.20F;
        }
        if(restBedrag>0.10) {
            System.out.println("Aantal munten van 10 eurocent: " + (int)(restBedrag/0.10));
            restBedrag -= (int)(restBedrag/0.10F)* 0.10F;
        }
        if(restBedrag>0.05) {
            System.out.println("Aantal munten van 5 eurocent: " + (int)(restBedrag/0.05));
            restBedrag -= (int)(restBedrag/0.05F)* 0.05F;
        }
        if(restBedrag>0.02) {
            System.out.println("Aantal munten van 2 eurocent: " + (int)(restBedrag/0.02));
            restBedrag -= (int)(restBedrag/0.02F)* 0.02F;
        }
        if(restBedrag>0.01) {
            System.out.println("Aantal munten van 1 eurocent: " + (int)(restBedrag/0.01));
              tempBedrag= 
            restBedrag -= (int)(restBedrag/0.01F)* 0.01F;
        }
       
    }
    
    static protected void berekenTijd(long tijdInSeconden){
        final byte SECONDEN_IN_MINUUT = 60;
        final int SECONDEN_IN_UUR = 3600;
        byte aantalUren;
        byte aantalMinuten;
        
        aantalUren = (byte)(tijdInSeconden/SECONDEN_IN_UUR);
        tijdInSeconden-= aantalUren * SECONDEN_IN_UUR;
        
        aantalMinuten = (byte)(tijdInSeconden/SECONDEN_IN_MINUUT);
        tijdInSeconden-= aantalMinuten * SECONDEN_IN_MINUUT; 
            
        System.out.println("U:" + aantalUren + " M:" + aantalMinuten + " S:" + (byte)tijdInSeconden);
    }
    
   
    
    //THEORIE HOOFDSTUK 2
    static protected void berekenBMI(float gewicht, float lengte)
    {
        float bmi = gewicht / (lengte * lengte);
        System.out.println(bmi);
    }
    
    static protected void celciusNaarFahrenheit(float gradenCelcius){
        float gradenFahrenheit = gradenCelcius*9/5+32;
        System.out.println(gradenCelcius + " graden Celcius in graden Fahrenheit is : " + gradenFahrenheit);
    }
    
    static protected void controleerBtwNummer(int nummerBTW){
    
        final byte CONTROLE_GETAL = 97;
                
        if (CONTROLE_GETAL-(byte)((nummerBTW/100)%CONTROLE_GETAL)==(byte)(nummerBTW%100))
            System.out.println("BTW nummer " + nummerBTW + " is ok");
        else
            System.out.println("BTW nummer " + nummerBTW + " is NIET ok");
    }
    
    static protected void controleerRekeningNummer(long nummerRekening){
    
        final byte CONTROLE_GETAL = 97;
                
        if ((byte)((nummerRekening/100)%CONTROLE_GETAL)==(byte)(nummerRekening%100))
            System.out.println("Bankrekening nummer " + nummerRekening + " is ok");
        else
            System.out.println("Bankrekening nummer " + nummerRekening + " is NIET ok");
    }
    
}
