public class IfElseStatementTheme{
    public static void main(String[] args) {

        System.out.println("Блок 1 - Перевод Псевдокода на язык java");
        boolean isFemale = false;
        if(!isFemale) {
            System.out.println("Вы Мужчина!");
        } else {
            System.out.println("Вы Женщина!");
        }

        int age = 21;
        if(age > 18){
            System.out.println("Вы совершеннолетний");
        } else{
            System.out.println("Вы не совершеннолетний");
        }

        float height = 1.76f;
        if (height < 1.8) {
            System.out.println("Ты не можешь пройти на атракцион");
        } else {
            System.out.println("Ты проходишь на атракцион");
        }

        String name = "Maksim";
        char firstLeterNam = name.charAt(0);
        if (firstLeterNam == 'M' ) {
            System.out.println("Хорошее имя");
        } else if (firstLeterNam == 'I'){
            System.out.println("Все имена хороши");
        }else {
            System.out.println("что - то не так");
        }
        System.out.println();

        System.out.println("Блок 2 - Поиск большего числа");
        int firstNum = 10;
        int secondNum = 5;

        if(firstNum > secondNum) {
            System.out.println(firstNum + " больше " + secondNum);
        }else if (firstNum < secondNum) {
            System.out.println(secondNum + " больше " + firstNum);
        }else {
            System.out.println("Числа равны");
        }
        System.out.println();
/////
        System.out.println ("Блок 3, 4, 5 - Проверка числа, ");
        int number = -10;
        int firstVar = 123;
        int secondVar = 223;
        if (number % 2 == 0 && number > 0){
            System.out.println(number + " является положительным и четным");
        }else if(number % 2 != 0 && number > 0){
            System.out.println(number + " является положительным и нечетным");
        }else if(number % 2 != 0 && number < 0){
            System.out.println(number + " является отрицательным и нечетным");
        }else if (number % 2 == 0 && number < 0){
            System.out.println(number + " является отрицательным и четным");
        }else {
            if (number == 0){
                System.out.println("Вы ввели нуль");
            } else if ()
        }
    }

}