import java.util.*;
public class test{

public static int solution(int[] nums) {
    
    int sum = -1;
    Map<Integer, ArrayList<Integer>()> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++){
      for(int j = i+1; j < nums.length; j++){
        sum = nums[i] + nums[j];
        if(map.containsKey(sum)){
          if(map.get(sum).contains(i) || map.get(sum).contains(j)){
              continue;
          } else {
              map.get(sum).add(i);
              map.get(sum).add(j);
          }
        } else{
            map.put
        }
      }
    }

    return 0;
  }
}

public static void main(String[] args){
    List<String> deleteBlankItems = (items) -> {
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).length() == 0){
                items.remove(i);
            }
        }
    };

    List<String> names = new ArrayList<>(Arrays.asList("Rachel", "Meg", "", "",   "TIim"  ));
    deleteBlankItems.accept(names);
}
}
