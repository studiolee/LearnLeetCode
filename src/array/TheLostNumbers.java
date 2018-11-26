package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leeray
 * @version 创建时间：2018年11月26日 下午5:30:37 <br>
 *          描述：448. 找到所有数组中消失的数字<br>
 *          给定一个范围在 1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 
 *          找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 
 *          您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * 
 *          示例:
 */
public class TheLostNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;	//abs求绝对值，避免因index位置之前被访问过而出错
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] > 0) {
				list.add(j + 1);
			}
		}
		return list;
	}
}
