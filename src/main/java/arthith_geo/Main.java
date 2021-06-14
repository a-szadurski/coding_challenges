package arthith_geo;

public class Main {

    public static String ArithGeoII(int[] arr) {
        // code goes here
        if(arr.length>1){
            if(arr[1]%arr[0]==0){
                for(int i = 2; i<arr.length;i++){
                    if(arr[i]%arr[i-1] != 0){
                        break;
                    }
                    if(i == arr.length -1 && arr[i]%arr[i-1] ==0){
                        return "Geometric";
                    }
                }
            }
            int diff = arr[1]-arr[0];
            for(int i = 2; i<arr.length; i++){
                if(arr[i]-arr[i-1] != diff){
                    break;
                }
                if(i == arr.length -1 && arr[i] - arr[i-1] == diff){
                    return "Arithmetic";
                }
            }
        }
        return "-1";
    }
}
