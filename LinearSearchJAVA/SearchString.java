package LinearSearchJAVA;


public class SearchString{
    public static void main(String[] args){
        String name = "mahek";
        char ch = 'e';
        
      
        System.out.println(search(name,ch));

    }
    public static boolean search(String name, char ch){
        if(name.length()==0){
            return false;
        }
        for(char el : name.toCharArray()){
            if(ch==el){
                return true;
            }
        }return false;
    }
}