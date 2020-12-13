public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public int findIndex(T element){
    if(element == null){
      throw new IllegalArgumentException("Element is null");
    }
    int index = 0;
    for (int i = 0; i < size()-1; i++){
      if(element.compareTo(get(index + 1)) > 0){
        index ++;
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
    remove(index);
    add(element);
    return get(index);
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
}
