public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public int findIndex(T element){
    int index = 0;
    for (int i = 0; i < super.size(); i++){
      if(element.compareTo(get(index + 1)) > 0){
        index ++;
      }
    }
    return index;
  }

}
