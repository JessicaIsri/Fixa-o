package datas;

public class MainDate {
    public static void  main(String [] args){
        DateManipulator date = new DateManipulator();

        System.out.println(date.toString());
        date.nextDay();
        System.out.println(date.toString());
        date.insertDate(30, 2, 2020);
        System.out.println(date.toString());
        date.nextDay();
        System.out.println(date.toString());
    }
}
