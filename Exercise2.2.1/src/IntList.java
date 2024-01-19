public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public void addFirst(int x) {
        IntList temp = new IntList(0,null);
        helpAddFirst(this,temp);
        first = x;
    }

    public void helpAddFirst(IntList r,IntList temp){
        if( r.rest == null){
            temp.first = r.first;
            r.rest = temp;
        } else{
            r.helpAddFirst(r.rest,temp);
            r.rest.first = r.first;
        }
    }

}
