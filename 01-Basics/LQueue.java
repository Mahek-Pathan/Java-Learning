public class LQueue<T>{
    T arr[];
    int front,rear;
    public LQueue(){
        arr = (T[]) new Object[3];
        front = rear = -1;
    }
}