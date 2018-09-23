package Days_of_Code;

import java.util.*;

public class DictionariesMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> data = new TreeMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            data.put(name,phone);

        }
        while(in.hasNext()){
            String s = in.next();
            if(data.get(s) != null){
                System.out.println(s+"="+data.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}