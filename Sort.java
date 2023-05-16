import java.util.ArrayList;

class Sort{


  public Sort(ArrayList<Double> List, Double item){
  
    ArrayList<Double> arr = List;
    Double Article = item;
    
  }
  
  public boolean searchItem(ArrayList<Double> arr, double Article, int low, int high){

    if (high >= low) {
      int mid = low + (high - low) / 2;

      if (arr.get(mid) == Article)
        return true;


      if (arr.get(mid) > Article)
        return searchItem(arr, Article, low, mid - 1);


      return searchItem(arr, Article, mid + 1, high);
    }

    return false;
  }


  public ArrayList<Double> sort(ArrayList<Double> arr){
    int size = arr.size();

    for (int i = 1; i < size; i++) {
      double key = arr.get(i);
      int j = i - 1;

      while (j >= 0 && (key < arr.get(j))) {
        arr.set((j+1),arr.get(j));
        --j;
      }

      arr.set((j+1),key);
    }
  return arr;
}
}