import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    public List<T> fruitBox;
    public List<T> fruitBox2;

    /*Метод создания коробки для фруктов*/
    public Box() {

        this.fruitBox = new ArrayList<>();
    }

    /*Метод добавления фруктов в коробку */
    public void putFruit(T Fruit) {

        fruitBox.add(Fruit);
    }

    /*Метод высчитывающий вес коробки*/
    public float getWeight() {

        if (fruitBox.isEmpty()) {
            return 0;
        } else {
            if (fruitBox.get(0) instanceof Apple) {
                return (fruitBox.size() * ((Apple) fruitBox.get(0)).getFruitWeight());
            } else {
                return (fruitBox.size() * ((Orange) fruitBox.get(0)).getFruitWeight());
            }
        }
    }

    /*Метод сравнивающий коробки*/
    public boolean compare(Box<? extends Fruit> box) {

        if (fruitBox.isEmpty()) {
            return false;
        }
        if (box.fruitBox.isEmpty()) {
            return false;
        }
        return getWeight() == box.getWeight();
    }

    /*Метод перекладывающий фрукты из одной коробки в другую*/
    public void change(Box<T> box) {

        fruitBox2 = new ArrayList<>();
        fruitBox2.addAll(box.fruitBox);
        System.out.println(fruitBox2);
        box.fruitBox.clear();
    }
}




