//Wrap-around (Jude Grodesky, Oliver Frank, Jerry Ye)
public class DequeDriver{
    public static void main(String[] args){
	QQKachoo deque = new QQKachoo<Integer>();
	deque.add(1);
	deque.addFirst(2);
	deque.add(3);
	deque.add(4);
	deque.add(5);
	deque.addFirst(6);
	System.out.println(deque);
	System.out.println("Should print true:" + deque.contains(6));
	System.out.println(deque.size());
	System.out.println("Should print false:" + deque.isEmpty());
    }
}
