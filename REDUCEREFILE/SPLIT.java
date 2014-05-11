package REDUCEREFILE;

import java.util.ArrayList;
import java.util.List;

public class SPLIT {
    public static void main(String[] args){
        //Problem 27 - Reduce file path
        
       //Може и с по бърз алгоритъм, обаче мало мe мързи )))
       System.out.println("Problem 27 - Reduce file path");
       String str= "/123/../../";

       System.out.println("before:");
       System.out.println(str);
       
       System.out.println("\nafter:");
       System.out.println(reduce_file_path(str));
    }
    
       public static String reduce_file_path(String path){
       String newStr= new String("");
       String []arr = path.split("/");
       List<String> tmp = new ArrayList<String>();
       int t=0;
       for(int i = 1;i<arr.length;i++){
           if(arr[1].equals("..")){
                tmp.add("");
                break;
           } else if(!arr[i].equals(".") && !arr[i].equals("..") && !arr[i].equals("")){
               tmp.add(arr[i]);
               t++;
           }else if(arr[i].equals("..")){
               if(t>0){
                   tmp.remove(t-1);
                   t--;
               }
           }
       }
       
       if(tmp.isEmpty())newStr="/";
       
       for(int i=0;i<tmp.size();i++){
           newStr = newStr + "/" + tmp.get(i);
       }
       
       return newStr;
   } 
}
