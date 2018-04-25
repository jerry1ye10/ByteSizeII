//driver for QQKachoo by Square

public class DequeTester3 {
    public static void main(String[] args) {
	QQKachoo<Integer> wow = new QQKachoo<Integer>();
	System.out.println(wow.isEmpty());//true
	wow.addFirst(5);
	wow.addFirst(4);
	wow.addLast(6);
	System.out.println(wow);
	System.out.println(wow.isEmpty());//false
	System.out.println("First: "+wow.peekFirst());//4
	System.out.println("Last: "+wow.peekLast());//6
	System.out.println("pollFirst: "+wow.pollFirst());//4
       	System.out.println("pollLast: "+wow.pollLast());//6
	System.out.println(wow);//5
	wow.pollLast();
	System.out.println("empty deque, pollFirst(): "+wow.pollFirst());
    }
}
