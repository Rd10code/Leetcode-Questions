class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j]==target)){
                    return new int[]{i,j};
                }
            }
        }
            return new int[]{-1,-1};
    }
}


// Here We have given a array and a target elemment and the array any two element should give sum equal to the target element

// so  pahile apan array cha first element ghetla ani mg tyla first for loop madhe takla ani mg tyat 2nd for loop madhe i+1 pasun shuru kela ani mg if statement vaparun add karun key or target element sobat compare kela jr asla tr mg tyla
// return new int[]{i,j} he vaparun doni indexes return kele ani 
//if not avaible tr mg return int[]{-1,-1} asa return kela manje tasa sum nai bhetla
