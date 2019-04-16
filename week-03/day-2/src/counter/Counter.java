package counter;

public class Counter {
    int number = 0;




    public void add(int c) {
        this.number=number+c;
    }
    public void add(){
        number+=1;
    }


    public int get() {
        return number;
    }

    public int reset(){
        return number=0;
    }
}
