package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Print

        System.out.printf("Hello and welcome!");
        //Print dengan new line
        System.out.println("I'm Gita");
        System.out.print("without space\n");
        System.out.println("lallaa");

        boolean flag;
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //Data type and variable
        int a = 10;
        int b = 2;
        float c = 3;
        String name = "Gita";
        char q = 'Y';
        boolean flag2 = false; //true

        // ArithmeticException
        int result = a / b;
        int result2 = (int) (a / c); // 1 int dibagi 1 float --> Hierarki float lebih tinggi (hasilnya float)
        float result3 = a / c;
        float result4 = a / b;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //If, else, else-if
        int timeStart = 8;
        int timeFinish = 17;
        int waktuMasuk = 8;
        int waktuPulang = 18;

        // Karyawan masuk tepat waktu dan pulang tepat waktu atau lebih lama, diberi selamat
        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat! Anda masuk tepat waktu!");
            System.out.println("Anda sampai " + (timeStart - waktuMasuk) + " jam lebih cepat.");

            //Karyawan yang masuk tepat waktu, pulang duluan, being teased
        } else if (waktuMasuk <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("yee pulang duluan");

            //Karyawan yang telat masuk, tapi pulang lebih lama atau tepat waktu, dimaafkan
        }else if (waktuMasuk>=timeStart && waktuPulang>= timeFinish) {
            System.out.println("dimaafin telatnya");

            //Karyawan yang telat masuk, pulang duluan, disoraki
        }else{
            System.out.println("TELAT!!!");
            System.out.println("Anda telat " + (waktuMasuk-timeStart) + " jam lebih lama.");
        }

        int day = 5;
        char question ='Y';
        switch (day){
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2:
                System.out.println("Saya Cuti");
                break;
            case 3:
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Saya pengangguran");
                break;
        }
        switch (question){
            case 'Y':
                System.out.println("Yes");
                break;
            default:
                System.out.println("No");
                break;
        }


    }
}