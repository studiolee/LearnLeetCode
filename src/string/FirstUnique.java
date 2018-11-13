package string;

import org.junit.Test;

/**
 * 
 * 387. 字符串中的第一个唯一字符 
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 */
public class FirstUnique {
	public int firstUniqChar(String s) { 
        char[] array = s.toCharArray(); 
        int[] a = new int[26]; 
        for(int i=0;i<s.length();i++)a[array[i]-'a']++; 
        for(int i=0;i<s.length();i++){ 
            if(a[array[i]-'a']==1){ 
                return i; 
            } 
        } 
        return -1; 
    }
	@Test
	public void test1(){
		
	}
}
