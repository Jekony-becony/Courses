import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    private boolean isFree = true;
    private float maxWeight = 100.0f;
    private float currentWeight = 0;
    private ArrayList<T> arrayList = new ArrayList<>();

    void addFruit(T fruit) {
        if (currentWeight + fruit.weight <= maxWeight) {
            arrayList.add(fruit);
            currentWeight += fruit.weight;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("The box is full");
    }

    float getWeight(Fruit f) {
        return arrayList.size() * f.weight;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight) {
            return true;
        } else return false;

    }

    public void clear() {
        this.currentWeight = 0;
        arrayList.clear();
    }

    public void transfer(Box<? super T> box) {
        box.arrayList.addAll(this.arrayList);
        box.currentWeight = this.currentWeight;
        clear();

    }
}
