package array;

/**
 * @author leeray
 * @version 创建时间：2018年12月13日 下午7:17:14 <br>
 *          描述：717. 1比特与2比特字符<br>
 *          有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * 
 *          现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 */
public class OneBit {
	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		for (; i < bits.length - 1; ++i) {
			if (bits[i] == 1) {
				++i;
			}
		}
		return i == bits.length - 1;
	}
}
