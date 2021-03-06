package dynamicProgramming;

/**
 * @author leeray
 * @version 创建时间：2018年11月27日 上午11:17:18 <br>
 * 			描述：303. 区域和检索 - 数组不可变<br>
 * 			给定一个整数数组 nums，求出数组从索引 i 到 j (i ≤ j) 范围内元素的总和，包含 i, j 两点。
 * 
 *          示例：
 * 
 *          给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 * 
 *          sumRange(0, 2) -> 1 sumRange(2, 5) -> -1 sumRange(0, 5) -> -3 说明:
 *          <p>
 *          你可以假设数组不可变。 会多次调用 sumRange 方法。
 *          </p>
 */

/*
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
public class SumRange {
	int [] array;    
    public SumRange(int[] nums) {
        
        array = new int[nums.length];
        if(nums.length > 0){
            array[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            array[i] = array[i - 1] + nums[i];
        }
        }
    }
    
    public int sumRange(int i, int j) {
        
        if(i == 0){
            return array[j];
        } else{
            return array[j] - array[i - 1];
        }
       
    }
}
