/*****************************************************
* class DLLNode v1
* Implements a node, for use in lists and other container classes.
* Stores a String as cargo.
*****************************************************/

public class DLLNode<D>
{
private D _cargo;      //cargo may only be of type D
private DLLNode<D> _nextNode, _prevNode;   //pointers to next, prev DLLNodes


// constructor -- initializes instance vars
public DLLNode( D value, DLLNode<D> prev, DLLNode<D> next )
{
        _cargo = value;
        _nextNode = next;
        _prevNode = prev;
}


//--------------v  ACCESSORS  v--------------
public D getCargo() {
        return _cargo;
}

public DLLNode<D> getNext() {
        return _nextNode;
}

public DLLNode<D> getPrev() {
        return _prevNode;
}
//--------------^  ACCESSORS  ^--------------


//--------------v  MUTATORS  v--------------
public D setCargo( D newCargo )
{
        D foo = getCargo();
        _cargo = newCargo;
        return foo;
}

public DLLNode<D> setNext( DLLNode<D> newNext )
{
        DLLNode<D> foo = getNext();
        _nextNode = newNext;
        return foo;
}

public DLLNode<D> setPrev( DLLNode<D> newPrev )
{
        DLLNode<D> foo = getPrev();
        _prevNode = newPrev;
        return foo;
}
//--------------^  MUTATORS  ^--------------


// override inherited toString
public String toString() {
        return _cargo.toString();
}


//main method for testing
public static void main( String[] args )
{
        //Below is an exercise in creating a linked list...

        /*********************
           //Create a node
           DLLNode first = new DLLNode( "cat", null );

           //Create a new node after the first
           first.setNext( new DLLNode( "dog", null ) );

           //Create a third node after the second
           first.getNext().setNext( new DLLNode( "cow", null ) );

           DLLNode temp = first;
           while( temp != null ) {
           System.out.println( temp );
           temp = temp.getNext();
           }
         ***********************/
}  //end main

}//end class DLLNode
