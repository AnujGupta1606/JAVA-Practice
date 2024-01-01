public class Addition<T> {

    T a, b;

    public void SetValues(T ab, T ba){
        this.a = ab;
        this.b = ba;
    }

    public T GetA(){
        return a;
    }

    public T GetB(){
        return b;
    }
    
}
