import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxLevelSum(TreeNode root) {
        int max=root.val;
        int level=1;
        int templvl=0;
        int tempval=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size =queue.size();
            tempval=0;
            templvl++;
            while (size-->0)
            {
                TreeNode temp=queue.poll();
                tempval+=temp.val;
                if (temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if (temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
            if (max<tempval)
            {
                max=tempval;
                level=templvl;
            }
        }
        return level;
    }
}