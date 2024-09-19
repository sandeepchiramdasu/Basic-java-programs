// java program to find largest number in an array
class LargestNum{
    
    static int largest(int arr[]){
        
        //initiate a variable to store largest number
        int largest = arr[0];
        for(int i = 1;i < arr.length; i++){

            // check whether current element is larger than largest elememt 
            if(arr[i]>largest){

                // if current element is larger than largest is updated
                largest = arr[i];
            }           
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {9,0,4,7,12,3,6,-1,7,11};
        int num = largest(arr);
        System.out.println("Largest element : "+num);
    }
}