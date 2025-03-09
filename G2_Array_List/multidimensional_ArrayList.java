package G2_Array_List;
import java.util.ArrayList;
public class multidimensional_ArrayList {
    public static void main(String[] args) {

        //  multiple array list
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        //  print numbers
        for(int i=1 ; i<=5 ; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        // add to mainlist
        MainList.add(list1);
        MainList.add(list2);
        MainList.add(list3);

        for(int i=0 ; i<MainList.size(); i++){
            ArrayList<Integer> currlist = MainList.get(i);
        for(int j=0 ; j<currlist.size(); j++){
            System.out.print(currlist.get(j) + " ");
        }
        System.out.println();
        }
    }
}
