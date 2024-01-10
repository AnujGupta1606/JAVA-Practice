package Generics.Twoarray;

public class Twoarray<T> {

 public  boolean compare_Arrays(T[] arr1, T[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }

    for (int i = 0; i < arr1.length; i++) {
      if (!arr1[i].equals(arr2[i])) {
        return false;
      }
    }
    return true;
  }

}
