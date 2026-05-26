import java.util.*;

public class MergedArray{
  public static int[] mergedArrayOf(int [] firstArray, int [] secondArray){
    int [] newArray = new int[firstArray.length + secondArray.length];
    
    for(int index =0; index < firstArray.length; index++){
      newArray[index] = firstArray[index];
      }
     for(int index =0; index < secondArray.length; index++){
      newArray[firstArray.length + index] = secondArray[index];
      }
  Arrays.sort(newArray);
  return newArray;
}


}
