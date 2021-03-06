package array;

/**
 * @author leeray
 * @version 创建时间：2018年11月17日 上午10:37:58 
 * 描述：27. 移除元素<br>
 *          给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *          不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *          元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int p = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != val){
				nums[p] = nums[i];
				p++;
			}
		}
		return p;
	}
}
