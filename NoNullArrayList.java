public class NoNullArrayList<T> extends ArrayList<T>{

  public void add(T element){
    if(element = null){
      throw new IllegalArgumentException("Element is null");
    }
    super.add(element);
  }

  public void add(int index, T element){
    if(element = null){
      throw new IllegalArgumentException("Element is null");
    }
    super.add(index, element);
  }

  public void set(int index, T element){
    if(element = null){
      throw new IllegalArgumentException("Element is null");
    }
    super.set(index, element);
  }

  

}
