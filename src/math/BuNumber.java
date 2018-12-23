package math;

/**
 * @author leeray
 * @version 创建时间：2018年12月23日 上午10:54:41 <br>
 *          描述：476. 数字的补数<br>
 *          给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 
 *          注意:
 * 
 *          给定的整数保证在32位带符号整数的范围内。 你可以假定二进制数不包含前导零位。
 * 
 */
public class BuNumber {
	public int findComplement(int num) {
		return ~num & (Integer.highestOneBit(num) - 1);
	}
}
