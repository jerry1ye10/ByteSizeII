# ByteSizeII
## Kathleen Wong, Raunak Chowdhury, Daniel Jiang

### Prioritized Methods ###

* addFirst(e)
* addLast(e)
* pollFirst()
* pollLast()
* peekFirst()
* peekLast()
* size()

### Development Plan ###

  1. Create the Deque interface with prioritized methods
  2. We will implement size() first so that we can add the empty Deque
    case for the other methods
  3. Implement every other method one at a time in QQKachoo
  4. Once all prioritized methods have been tested, add any non-essential methods
  5. Update README

### Architecture ###

 Doubly-linked node-based architecture seems most similar to a Deque
 because the nodes can be altered from either side. As a result, methods
 for adding and removing at either end should run in constant time. This was
 considered over ArrayList and array because we would encounter linear runtime for adding and removing elements at an index because of the need to shift every element, where as nodes can simply rearrange their pointers.
