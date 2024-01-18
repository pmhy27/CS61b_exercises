public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public void addFirst(int x) {
        IntList p = new IntList()
    }

    public int size(){
        IntList p = this;
        int i = 1;
        if(p.rest == null){
            i = i;
        }else{
            i = p.rest.size() + 1;
        }
        return i;
    }

    public int iterativeSize(){
        IntList p = this;
        int i = 1;
        while (p.rest != null){
            i = i + 1;
            p = p.rest;
        }
        return i;

    }


}
