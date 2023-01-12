/**
 * 堆栈
 *
 * @author spong
 * @date 2023/01/12
 */
public class Stack<T>  {
    ArrayList<T> arrayList = new ArrayList<T>();

    public int size() {
        return arrayList.size();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public void push(T element) {
        arrayList.add(element);
    }

    public T pop() {
        return arrayList.remove(arrayList.size() - 1);
    }

    public T top() {
        return arrayList.get(arrayList.size() - 1);
    }
}
