public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public int findIndex(T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    int index = 0;
    for (int i = 0; i < size(); i++){
      if(element.compareTo(get(i)) > 0){
        index++;
      }
    }
    return index;
  }

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    super.add(findIndex(element), element);
    return true;
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    super.add(findIndex(element), element);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    T temp = get(index);
    remove(index);
    add(element);
    return temp;
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
}
