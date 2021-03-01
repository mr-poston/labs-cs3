public class HistoList {

    private HistoNode front;
    
    public HistoList() {
        front = null;
    }
    
    /**
     * Adds a new node to the front for `let`, if `let` does not exist
     * Bumps up the count if `let` already exists
     *      Hint: You should make use of the indexOf and nodeAt methods here!
     */
     public void addLetter(char let) {
         if (indexOf(let) == -1) {
             front = new HistoNode(let, 1, front);
         } else {
             HistoNode current = nodeAt(indexOf(let));
             current.setLetterCount(current.getLetterCount() + 1);
         }
     }
     
     /**
      * Returns the index position in the list of `let`, if `let` exists
      * Otherwise returns -1
      */
      public int indexOf(char let) {
          int spot = -1;
          HistoNode current = front;
          while (current != null) {
              spot++;
              char temp = current.getLetter();
              if (temp == let) {
                  return spot;
              }
              current = current.getNext();
          }
          return -1;
      }
      
      /**
       * Returns a reference to the node at `spot`
       */
       public HistoNode nodeAt(int spot) {
           HistoNode current = front;
           for (int i = 0; i < spot; i++) {
               current = current.getNext();
           }
           return current;
       }
       
       /**
        * Returns a string with all values from the list
        */
        @Override
        public String toString() {
            String output = "";
            HistoNode current = front;
            while (current != null) {
                output += current.getLetter() + " - " + current.getLetterCount() + "\t";
                current = current.getNext();
            }
            return output;
        }

    public HistoNode getFront() {
        return front;
    }
}