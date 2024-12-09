import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        Написать функциональный интерфейс Printable с методом print().
        В классе с методом main создать несколько анонимных классов с различными реализациями метода print().
        */

        Printable<String> printableOne = new Printable() {
            @Override
            public void print(Object o) {
                System.out.println(o);
            }
        };

        Printable<Integer> printableTwo = new Printable() {
            @Override
            public void print(Object o) {
                char[] charArray = o.toString().toCharArray();
                for (char c : charArray) {
                    System.out.print(c);
                }
                System.out.println("\s");
            }
        };

        Printable<Date> printableThree = new Printable() {
            @Override
            public void print(Object o) {
                Date date = (Date) o;
                System.out.println(date.getTime());
            }
        };

        printableOne.print("11111111");
        printableTwo.print(2222);
        printableThree.print(new Date("01/01/2022"));


         /*
        Написать функциональный интерфейс Concationble с методом concat(), который объединяет две строковых переменных,
        передаваемых в параметры метода и возвращает строку.
        В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().
        */

        Concationble<String> concationbleOne = new Concationble<String>() {
            @Override
            public String concat(String string, String e) {
                return string + e;
            }
        };

        Concationble<String> concationbleTwo = new Concationble<String>() {
            @Override
            public String concat(String string, String e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(e);
                return stringBuilder.toString();
            }
        };

        Concationble<String> concationbleThree = new Concationble<String>() {
            @Override
            public String concat(String string, String e) {
                return string.concat(e);
            }
        };

        System.out.println(concationbleOne.concat("aaa", "bbb"));
        System.out.println(concationbleTwo.concat("ccc", "ddd"));
        System.out.println(concationbleThree.concat("eee", "fff"));

    }

}
