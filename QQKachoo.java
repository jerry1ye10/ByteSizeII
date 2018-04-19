import java.util.NoSuchElementException;
public class QQKachoo<D> implements Deque<D> {

private DLLNode<D> _front,_end;
private int _size;

public QQKachoo(){
        _size = 0;
}

public boolean isEmpty(){
        return _size == 0;
}

//enqueues to the front
public void addFirst(D x){
        DLLNode<D> newNode;
        if (isEmpty()) {
                newNode = new DLLNode<D>(x,null,null);
                _front = newNode;
                _end = newNode;
        }
        else{
                newNode = new DLLNode<D>(x,null,_front);
                _front.setPrev(newNode);
                _front = _front.getPrev();
        }
        _size++;
}

//enqueues to the end
public void addLast(D c){
        DLLNode<D> newNode;
        if (isEmpty()) {
                newNode = new DLLNode<D>(c,null,null);
                _front = newNode;
                _end = newNode;
        }
        else{
                newNode = new DLLNode<D>(c,_end,null);
                _end.setNext(newNode);
                _end = _end.getNext();
        }
        _size++;
}

//dequeues to the front
public D pollFirst(){
        D ret = _front.getCargo();
        if(isEmpty()){
          throw new IndexOutOfBoundsException();
        }
        else{
        _front = _front.getNext();
        _front.setPrev(null);
        _size--;}
        return ret;
}

//dequeues to the end
public D pollLast(){
  D ret = _end.getCargo();
  if(isEmpty()){
    throw new IndexOutOfBoundsException();
  }
  else{
    _end = _end.getPrev();
    _end.setNext(null);
    _size--;}
    return ret;
}

//returns the first element in the deque
public D peekFirst(){
        return _front.getCargo();

}

//returns the last element in the deque
public D peekLast(){
        return _end.getCargo();

}

public String toString(){
        String str = "front -> ";
        DLLNode<D> currNode = _front;
        while(currNode != null) {
                str += currNode.toString() + " ";
                currNode = currNode.getNext();
        }
        str += "<- end";
        return str;
}

public static void main(String[] args) {
        QQKachoo<String> test = new QQKachoo<String>();
        System.out.println("Testing adds:");
        test.addFirst("kathlenn");
        System.out.println(test);
        test.addFirst("kathlessn");
        System.out.println(test);
        test.addLast("pudding");
        System.out.println(test);
        System.out.println("Testing polls:");
        System.out.println(test.pollLast());
        System.out.println(test.pollFirst());
        System.out.println(test);
        System.out.println("Testing peeks:");
        System.out.println("Peeking Last:" + test.peekLast());
        System.out.println("Peeking First:" + test.peekFirst());
}
}
