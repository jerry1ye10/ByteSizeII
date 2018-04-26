  import java.util.NoSuchElementException;
  public class QQKachoo<D> implements Deque<D> {

    //instance variables
    private DLLNode<D> _front,_end;
    private int _size;

    //constructor
    public QQKachoo(){
      _size = 0;
    }

    //checks if deque is empty
    public boolean isEmpty(){
      return _size == 0;
    }

    //adds a node at the front of the deque
    public void addFirst(D x){
      DLLNode<D> newNode;
      //first checks if deque is empty
      if (isEmpty()) {
        //set new node as front and end node
        newNode = new DLLNode<D>(x,null,null);
        _front = newNode;
        _end = newNode;
      }
      //otherwise, link current front node to new node
      //and set new node as the new front node
      else{
        newNode = new DLLNode<D>(x,null,_front);
        _front.setPrev(newNode);
        _front = _front.getPrev();
      }
      //increment size
      _size++;
    }

    //adds a node to the end of the deque
    public void addLast(D c){
      DLLNode<D> newNode;
      //first checks if deque is empty
      if (isEmpty()) {
        //set new node as front and end node
        newNode = new DLLNode<D>(c,null,null);
        _front = newNode;
        _end = newNode;
      }
      //otherwise, link end node to new node
      //and set new node as the new end node
      else{
        newNode = new DLLNode<D>(c,_end,null);
        _end.setNext(newNode);
        _end = _end.getNext();
      }
      //increment size
      _size++;
    }

    //removes the first node
    public D pollFirst(){
      //store node being removed
      D ret = _front.getCargo();
      //throws IndexOutOfBoundsException if deque is empty
      if(isEmpty()){
        throw new IndexOutOfBoundsException();
      }
      //remove pointer to node being removed
      else{
        _front = _front.getNext();
        _front.setPrev(null);
        //decrement size
        _size--;
      }
      return ret;
    }

    //removes the last node
    public D pollLast(){
      //store node being removed
      D ret = _end.getCargo();
      //throws IndexOutOfBoundsException if deque is empty
      if(isEmpty()){
        throw new IndexOutOfBoundsException();
      }
      //remove pointer to node being removed
      else{
        _end = _end.getPrev();
        _end.setNext(null);
        //decrement size
        _size--;
      }
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

    //toString
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

    //main method for testing
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
