package lesso.num1;

// TODO Доработать со сканером

public class SwitchTest {
    public static void main(String[] args) {
        int month = 4;
        String monthString;

        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            default: monthString = "Нет такого";
                break;
        }
        System.out.println(monthString);
    }
}
