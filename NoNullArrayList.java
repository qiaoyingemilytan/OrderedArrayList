import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    return super.add(element);
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    super.add(index, element);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    return super.set(index, element);
  }

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

}
