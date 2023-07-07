import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int day,month;
        String burc ="";
        boolean isError=false;


        Scanner input = new Scanner(System.in);

        System.out.println("Dogudugunuz Ay girniz : ");
        month= input.nextInt();

        System.out.println("Dogudugunuz gunu giriniz :");
        day=input.nextInt();



        switch (month){
                case 1:
                if (day >=1 && day <=31){
                    if (day<22){
                        burc="Oglak Burcu";
                    } else {
                        burc="Kova Burcu";
                    }
                }else {
                    isError=true;
                }
                break;

            case 2:
                if (day>=1 && day<=28){
                    if (day<20){
                        burc="kova burcu";
                    }else {
                        burc="Balik Burcu";
                    }
                }else {
                   isError=true;
                }break;
            case 3:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="Balik burcu";
                    }else {
                        burc="Koc Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 4:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="koc burcu";
                    }else {
                        burc="Boga Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 5:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="boga burcu";
                    }else {
                        burc="ikizler Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 6:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="ikizler burcu";
                    }else {
                        burc="yengec Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 7:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="yengec burcu";
                    }else {
                        burc="aslan Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 8:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="aslan burcu";
                    }else {
                        burc="Basak Burcu";
                    }
                }else {
                    isError=true;

                }break;
            case 9:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="basak burcu";
                    }else {
                        burc="terazi Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 10:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="terazi burcu";
                    }else {
                        burc="akrep Burcu";
                    }
                }else {
                    isError=true;
                }break;
            case 11:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="akrep burcu";
                    }else {
                        System.out.println(" yay Burcu");
                    }
                }else {
                    isError=true;
                }break;
            case 12:
                if (day>=1 && day<=31){
                    if (day<20){
                        burc="yay burcu";
                    }else {
                        burc="oglak Burcu";
                    }
                }else {
                    isError=true;
                }
                break;


            default:
                isError=true;

             break;
        }
            if (isError){
                System.out.println("Hatali giris yaptiniz, tekrar deneyiniz...");
            }else {
                System.out.println("Burcunuz :"+burc);
            }

    }

}