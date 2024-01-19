public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
//    Method I wrote
//
//    public void addLast(int x) {
//        IntNode p = new IntNode(x,null);
//        helpAddLast(this.first,p);
//    }
//
//    public void helpAddLast(IntNode t,IntNode p){
//        if (t.next == null){
//            t.next = p;
//        }else{
//            helpAddLast(t.next,p);
//        }
//    }


    public void addLast(int x) {
        IntNode p = first;

        while(p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x,null);
    }


    /** Returns the number of items in the list using recursion. */
//    Method I wrote
//    public int size() {
//        int i;
//        if (first != null){
//             i =1;
//        }else{
//            i = 0;
//        }
//        while (first.next != null){
//            i += 1;
//            first = first.next;
//        }
//        return i;
//    }

    public int size(){
        return size(first);
    }
    public int size(IntNode p) {
        if (p.next == null){
            return 1;
        }else{
            return size(p.next) + 1;
        }



    }
}
