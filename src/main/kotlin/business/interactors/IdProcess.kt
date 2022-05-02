package kotlin;

import java.util.Date;

public class ID {

    public int[] setIdGetArr(String idinput) {
//        int[] ID = {9, 6, 1, 1, 2, 2, 5, 0, 8, 3, 0, 8, 3};
        int[] ID = new int[13];
//        String id = "9611225083083";
        String id = idinput;
        for (int i = 0; i < 13; i++) {
            ID[i] = id.charAt(i) - 48;
//            ID[i] = new Scanner(System.in).nextInt();
        }
        return ID;
    }

    public int getAge(int[] ID) {
        int year = 0, month = 0, day = 0, count = 0, age = 0;
        Date date = new Date();

        year = ID[0] * 10;
        year += ID[1];
        month = ID[2] * 10;
        month += ID[3];
        day = ID[4] * 10;
        day += ID[5];

        age = ((date.getYear() - 100 + 2000) - (1900 + year));

        if (month > (date.getMonth() + 1)) {

        }
        else {
            if (day > (date.getDate())) {

            } else
                age += 1;
        }

        System.out.println("Age: " + age);
        return age;

    }


    public char getSex(int[] ID) {
        char s = 'M';
        int value = 0;
        value = ID[6] * 1000;
        value += ID[7] * 100;
        value += ID[8] * 10;
        value += ID[9];


        if (value > 4999) s = 'M';
        else s = 'F';
        System.out.println("Gender: " + s);

        return s;
    }

    public String getCitizenship(int[] ID) {
        if(ID[10] == 0) {
            System.out.println("Citizenship: SA Citizen");
            return "SC";
        }
        else {
            System.out.println("Citizenship: Permanant Resident");
            return "PR";
        }
    }

    public String getValidity(int[] id) {
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            sum += id[i];
        }
        if (sum % 1 == 0) {
            System.out.println("Valid");
            return "Valid";
        } else {
            System.out.println("Invalid");
            return "Invalid";
        }
    }
}

