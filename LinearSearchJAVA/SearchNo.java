package LinearSearchJAVA;
//arr=[18,12,-7,3,14,28] search for 3 in the range of [1,4]

public class SearchNo {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int no = 3;
        int start = 1;
        int end = 4;
        System.out.println(search(arr,no,start,end));
    }
    static int search(int[] arr, int no,int start,int end){
        if(arr==null){
            return -1;
        }
        for(int i = start;i<end;i++){
            if(no==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
