package clone;
import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize()-1);
    }

    public Object pop(){
        return list.remove(getSize() - 1);

    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public Object clone() {
        try {
            MyStack stackClone = (MyStack) super.clone();
            stackClone.list = new ArrayList<>(list);  // Глубокое клонирование списка
            return stackClone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


}
