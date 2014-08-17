/**
 * Created by Administrator on 2014-08-17.
 */
public class NumOrder {

    public Integer[] setOrder(Integer[] nums){
        int temp = 0;
        for(int i = 0 ;i<nums.length-1;i++){
            int numI = nums[i];
            for(int j = i+1;j<nums.length;j++){
                int numJ = nums[j];
                if(numI>numJ){
                    temp = nums[i];
                    nums[i] = numJ;
                    nums[j] = temp;
                    numI = nums[i];
                }
            }
        }
        System.out.println("本地更新");
        return nums;
    }
}
