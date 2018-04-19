# ByteSizeII
## Kathleen Wong, Raunak Chowdhury, Daniel Jiang

###Prioritized Methods
* addFirst(e)
* addLast(e)
* pollFirst()
* pollLast()
* peekFirst()
* peekLast()
* size()

###Development Plan
  1. Create the Deque interface with prioritized methods
  2. Implement each method one at a time in QQKachoo
  3. Once all prioritized methods have been tested, add any non-essential methods
  4. Update README

#### Architecture
 Doubly-linked node-based architecture seems most similar to a Deque
 because the nodes can be altered from either side. As a result. methods
 for adding and removing at either end should run in constant time.
