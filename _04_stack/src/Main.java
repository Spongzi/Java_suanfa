/**
 * 入口函数
 *
 * @author spong
 * @date 2023/01/12
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}