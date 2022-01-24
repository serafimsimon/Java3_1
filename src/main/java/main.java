import java.util.ArrayList;
import java.util.Arrays;

public class main {


    public static void main(String[] args) {

        /* Задание №1*/
        /*Работа метода, меняющего два элемента местами*/
        Float[] iArray = {1.0f, 2.0f, 7.5f, 15.5f, 20.3f};
        System.out.println("Начальный массив: " + Arrays.toString(iArray));
        swap(iArray, 0, 4);
        System.out.println("Массив с перестановкой: " + Arrays.toString(iArray));

        /*Задание №2*/
        /*Работа метод, преобразующего массив в ArrayList*/
        String[] StringArray = {"кот", "собака", "дерево", "мышь"};
        System.out.println(transformationToArrList(StringArray));

        /*Задание №3*/
        /*Создаем коробку с яблоками и складываем яблоки*/
        Box<Apple> BoxApples = new Box<Apple>();
        BoxApples.putFruit(new Apple());
        BoxApples.putFruit(new Apple());
        BoxApples.putFruit(new Apple());
        BoxApples.putFruit(new Apple());

        /*Создаем коробку с апельсинами и складываем апельсины */
        Box<Orange> BoxOranges = new Box<Orange>();
        BoxOranges.putFruit(new Orange());
        BoxOranges.putFruit(new Orange());

        /*Расчитываем вес полученных коробок*/
        System.out.println(BoxApples.getWeight());
        System.out.println(BoxOranges.getWeight());

        /*Сравниваем разыне коробки*/
        System.out.println(BoxApples.compare(BoxOranges));
        System.out.println(BoxOranges.compare(BoxOranges));

        /*Перекладываем фрукты в новые коробки*/
        Box<Apple> NewBoxApples = new Box<>();
        Box<Orange> NewBoxOranges = new Box<>();
        NewBoxApples.change(BoxApples);
        NewBoxOranges.change(BoxOranges);
    }

    /*Задание №1*/
    /*Метод, меняющий два элемента массива местами*/

    private static <T extends Number> void swap(T[] array, int firstNumber, int secondNumber) {

        Object temp = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = (T) temp;
    }

    /*Задание №2*/
    /*Метод, преобразующий массив в ArrayList*/

    private static <T> ArrayList transformationToArrList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }


}

