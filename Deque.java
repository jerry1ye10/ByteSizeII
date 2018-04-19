public interface Deque<Card> {

//enqueues to the front
public void addFirst(Card c);

//enqueues to the end
public void addLast(Card c);

//dequeues to the front
public Card pollFirst();

//dequeues to the end
public Card pollLast();

//returns the first element in the deque
public Card peekFirst();

//returns the last element in the deque
public Card peekLast();

//returns the size of the deque
public boolean isEmpty();
}
