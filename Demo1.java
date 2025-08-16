class Demo1 {
	public static void main(String[]args){
		int nums[]={2,10,2,7};
		int target=9;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]==target){
                System.out.println("["+i+","+(i+1)+"]");
            }
        } 
    }
}