import java.util.HashMap;

public class reconstructBinaryTree_4 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }
    public static TreeNode reconstructBinaryTree(int [] pre,int [] in){
        if(pre==null||in==null||pre.length!=in.length) return null;
        HashMap<Integer,Integer> inmap=new HashMap<>();
        int len=pre.length;
        for(int i=0;i<len;i++){
            inmap.put(in[i],i);
        }
        TreeNode res=buildTree(pre,0,len-1,in,0,len-1,inmap);
        return res;
    }
    public static TreeNode buildTree(int [] pre,int st1,int end,int [] in,int st2,int end2,HashMap<Integer,Integer> inmap){
        if(st1>end||st2>end2) return null;
        TreeNode node=new TreeNode(pre[st1]);
        int index=inmap.get(pre[st1]);
        node.left=buildTree(pre,st1+1,st1+index-st2,in,st2,index-1,inmap);
        node.right=buildTree(pre,st1+index-st2+1,end,in,index+1,end,inmap);
        return node;
    }
    public static void main(String []args){
        int[] pre={3,9,20,15,7};
        int[] in={9,3,15,20,7};
        TreeNode result=reconstructBinaryTree(pre,in);

    }
}
