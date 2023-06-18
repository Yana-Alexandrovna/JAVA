public class MyStack{
    Integer[] array = new Integer[10];
    int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int item){
        if (size >= array.length){
            Integer[] newArray = new Integer[array.length *2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = item;
    }

    int peek(){
        return array[size-1];
    }

    int pop(){
        return array[--size];
    }
}