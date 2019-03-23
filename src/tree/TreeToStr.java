package tree;
/**
* @author leeray
* @version 创建时间：2019年3月23日 下午10:02:56
* <br>描述：606. 根据二叉树创建字符串<br>
* 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。

空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。

示例 1:

输入: 二叉树: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

输出: "1(2(4))(3)"

解释: 原本将是“1(2(4)())(3())”，
在你省略所有不必要的空括号对之后，
它将是“1(2(4))(3)”。
*/
public class TreeToStr {
	 StringBuilder sb = new StringBuilder();
	    public String tree2str(TreeNode t) {
		       if(t == null)
	               return "";
		        Ergodic(t);
		        sb.deleteCharAt(sb.length()-1);
		        return sb.toString();
		    }
		    
		    void Ergodic(TreeNode root){
		        if(root == null)
		            return;
		        if(sb.length() != 0)
		           sb.append('(');
		        
		        sb.append(String.valueOf(root.val));
		        
		        if(root.left == null && root.right != null)
		            sb.append("()");
		        	
		        Ergodic(root.left);
		        Ergodic(root.right);
		        sb.append(')');
		    }
}
