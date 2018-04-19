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
        return _front.getCargo();
}

//dequeues to the end
public D pollLast(){
        return _end.getCargo();
}

//returns the first element in the deque
public D peekFirst(){
        return null;

}

//returns the last element in the deque
public D peekLast(){
        return null;

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
        test.addFirst("kathlenn");
        System.out.println(test);
        test.addFirst("kathlessn");
        System.out.println(test);
        test.addLast("pudding");
        System.out.println(test);
        System.out.println("Testing polls:");
        System.out.println(test.pollLast());
        System.out.println(test.pollFirst());
}
}
