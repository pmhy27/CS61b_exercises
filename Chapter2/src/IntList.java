public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
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


}
