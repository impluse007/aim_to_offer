import java.util.ArrayList;
public class printListFromTailToHead_3 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode bulidlistNode(int[] nums,int st){
        if(nums==null||st>=nums.length)
            return null;
        ListNode root=new ListNode(nums[st]);
        root.next=bulidlistNode(nums,st+1);
        return root;
    }
    public static ArrayList<Integer> res=new ArrayList<>();
    public static ArrayList<Integer> printListFromTailToHead(ListNode listnode)//还可以利用栈或者倒置list这样的做法
    {
        if(listnode==null) return res;
        if(listnode.next!=null)
            printListFromTailToHead(listnode.next);
        res.add(listnode.val);
        return res;
    }
    public static void main(String[] args)
    {
        ListNode l1=bulidlistNode(new int[]{1, 2, 3, 4, 5},0);
        System.out.println(printListFromTailToHead(l1));

    }
}
