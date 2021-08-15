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
        
     }
     
     /**
      * Returns the index position in the list of `let`, if `let` exists
      * Otherwise returns -1
      */
      public int indexOf(char let) {
         
      }
      
      /**
       * Returns a reference to the node at `spot`
       */
       public HistoNode nodeAt(int spot) {
          
       }
       
       /**
        * Returns a string with all values from the list
        */
        @Override
        public String toString() {
            String output = "";
           
            return output;
        }

    public HistoNode getFront() {
        return front;
    }
}
