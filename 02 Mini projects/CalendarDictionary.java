package coding.forest.pilot.controller;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String lang1, lang2;
        int month;
        ArrayList<String> Languages = new ArrayList<String>(Arrays.asList("kr", "pl", "hu", "ua", "es"));

        System.out.println("===== Learn month names in your fav language! =====");
        System.out.println("index: 1. kr for Korean\n       2. pl for Polish\n       3. hu for Hungarian\n       4. ua for Ukrainian\n       5. es for Spanish");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a language.");
        lang1 = scanner.nextLine();


        while (!Languages.contains(lang1)) {

            System.out.println("Wrong input. Please enter a correct language abbreviation.");
            lang1 = scanner.nextLine();

            if (Languages.contains(lang1)) {
                break;
            }
        }

        System.out.println("Choose another: ");
        lang2 = scanner.nextLine();

        while (!Languages.contains(lang2)) {

            System.out.println("Wrong input. Please enter a correct language abbreviation.");
            lang2 = scanner.nextLine();

            if (Languages.contains(lang2)) {
                break;
            }
        }


        System.out.println("Which month?: ");
        month = scanner.nextInt();

        while (month < 1 || month > 12) {
            System.out.println("Wrong input. Please enter a number in range 1-12.");
            month = scanner.nextInt();
        }

        Calendar cal = new Calendar();
        System.out.println(cal.getMonthDict(lang1, lang2, month));
    }
}


class Calendar {

    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] months_kr = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
    String[] months_pl = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień ", "Wrzesień", "październik", "Listopad", "Grudzień"};
    String[] months_hu = {"január", "február", "március", "április", "május", "június", "július", "augusztus", "szeptember", "október", "november", "december"};
    String[] months_ua = {"Січень", "Лютий", "Березень", "Квітень", "Травень", "Червень", "Липень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"};
    String[] months_es = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    String getMonthName(String language, int month) {

        String monthName;
        int inputMonth = month - 1;

        switch(language) {
            case "kr":
                monthName = this.months_kr[inputMonth];
                break;
            case "pl":
                monthName = this.months_pl[inputMonth];
                break;
            case "hu":
                monthName = this.months_hu[inputMonth];
                break;
            case "ua":
                monthName = this.months_ua[inputMonth];
                break;
            case "es":
                monthName = this.months_es[inputMonth];
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + language);
        }
        return monthName;
    }

    Hashtable<String, String> getMonthDict(String lang1, String lang2, int month) {

        Hashtable<String, String> dict = new Hashtable<String, String>();

        String monthName1 = getMonthName(lang1, month);
        String monthName2 = getMonthName(lang2, month);

        dict.put(monthName1, monthName2);

        return dict;
    }
}

/*

If the non-English letters break: 

## References

- unicode characters appear as question marks in IntelliJ IDEA console
https://stackoverflow.com/questions/1082343/unicode-characters-appear-as-question-marks-in-intellij-idea-console

*/
