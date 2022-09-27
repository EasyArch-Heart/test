
import com.lktest.array_to_tree.ArrayToTree;
import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import sun.reflect.generics.tree.Tree;

import javax.swing.plaf.TreeUI;
import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlList;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

abstract class T{
    public final void a(){
        System.out.println("aaa");
    }
}
public class Example {
    //    public void deleteNode(ListNode node) {
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int length = 0;
//        int index = 0;
//        HashMap<Integer,ListNode> nodes = new HashMap<>();
//        ListNode nowNode = head;
//        //特殊情况，长度为1
//        if (nowNode.next==null){
//            return null;
//        }else {
//            while (nowNode!=null){
//                length++;
//                nodes.put(index++,nowNode);
//                nowNode = nowNode.next;
//            }
//        }
//        ListNode removeNode = nodes.get(length - n);
//        //最后一个
//        if (removeNode.next == null){
//            nodes.get(length-n-1).next = null;
//        }else {
//            removeNode.val = removeNode.next.val;
//            removeNode.next = removeNode.next.next;
//        }
//        return head;
//    }[3,9,20,null,null,15,7]
    //[1,2,3,4,null,null,5]
//    public int maxDepth(TreeNode root) {
//        return root==null? 0 : Math.max(maxDepth(root.left), maxDepth(root.right))+1;
//    }

    //
//        ArrayList<Integer> left = new ArrayList<>();
//        ArrayList<Integer> right = new ArrayList<>();
//        if (root.left!=null){
//            check(root.left,left);
//        }
//        if (root.right!=null){
//            rightBL(root.right,right);
//        }
//        if (left.equals(right))
//            return true;
//        return false;
//    boolean flag = true;
//    public boolean isSymmetric(ArrayToTree.TreeNode root) {
//        if (root.left!=null&&root.right!=null){
//            check(root.left,root.right);
//        }else if (!(root.left==null&&root.right==null)){
//            return flag = false;
//        }
//
//        return flag;
//    }
//    public void check(ArrayToTree.TreeNode left,ArrayToTree.TreeNode right){
//        if (left.left!=null&&right.right!=null){
//            check(left.left,right.right);
//        }else if (!(left.left==null&&right.right==null)){
//            flag = false;
//        }
//        if (left.val!= right.val)
//            flag = false;
//        if (left.right!=null&&right.left!=null){
//            check(left.right,right.left);
//        }else if (!(left.right==null&&right.left==null)){
//            flag = false;
//        }
//    }
//    public void rightBL(ArrayToTree.TreeNode right,ArrayList list){
//        if (right.right!=null){
//            rightBL(right.right,list);
//        }else {
//            list.add(null);
//        }
//        list.add(right.val);
//        if (right.left!=null){
//            rightBL(right.left,list);
//        }else {
//            list.add(null);
//        }
//    }
//    public List<List<Integer>> levelOrder(ArrayToTree.TreeNode root) {
//        int florNum = 0;
//        ArrayList<ArrayToTree.TreeNode> allNode = new ArrayList<>();
//        ArrayList<List<Integer>> results = new ArrayList<>();
//        allNode.add(root);
//        while (allNode.size()>0){
//
//        }
//
//    }
//    public void check(ArrayToTree.TreeNode node,int limit){
//        if (node.left!=null){
//            if(node.left.val>=node.val||node.left.val){
//                flag = false;
//            }
//            check(node.left,node.val);
//        }
//        if (node.right!=null){
//            if(node.right.val<=node.val){
//                flag = false;
//            }
//            check(node.right);
//        }


//    }
//    public ArrayToTree.TreeNode sortedArrayToBST(int[] nums) {
//        if(nums.length==1)
//            return new ArrayToTree.TreeNode(nums[0]);
//        int mid = nums.length/2;
//        ArrayToTree.TreeNode root = new ArrayToTree.TreeNode(nums[mid]);
//        root.left = sortedArray(Arrays.copyOf(nums,mid));
//        if (mid+1<nums.length) {
//            root.right = sortedArray(Arrays.copyOfRange(nums,mid+1,nums.length));
//        }
//        return root;
//    }
//    public ArrayToTree.TreeNode sortedArray(int[] nums){
//        if (nums.length==1)
//            return new ArrayToTree.TreeNode(nums[0]);
//        int mid = nums.length/2;
//        ArrayToTree.TreeNode node = new ArrayToTree.TreeNode(nums[mid]);
//        node.left = sortedArray(Arrays.copyOf(nums,mid));
//        if (mid+1<nums.length) {
//            node.right = sortedArray(Arrays.copyOfRange(nums, mid + 1, nums.length));
//        }
//        return node;
//    }
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (m==0){
//            for (int i = 0;i<nums2.length;i++){
//                nums1[i] = nums2[i];
//            }
//            return;
//        }else if (n==0){
//            return;
//        }
//        int[] mid = new int[m+n];
//        int index = 0;
//        int index1 = 0;
//        int index2 = 0;
//        while ( index1 < m || index2 < n ){
//            if (index1<m && index2<n){
//                if (nums1[index1] <= nums2[index2]){
//                    mid[index++] = nums1[index1++];
//                }else {
//                    mid[index++] = nums2[index2++];
//                }
//            }else if (index1>=m && index2>=n){
//                break;
//            }else if (index1<m && index2>=n){
//                mid[index++] = nums1[index1++];
//            }else {
//                mid[index++] = nums2[index2++];
//            }
//        }
//        System.arraycopy(mid,0,nums1,0,nums1.length);
//    }
//    public int firstBadVersion(int n) {
//        int mid = n/2;
//        boolean b = isBadVersion(mid);
//        if (b == false){
//            return find(mid,n);
//        }else{
//            return find(1,mid);
//        }
//    }
//    public int find(int start,int end){
//        if (end-start==1){
//            return isBadVersion(start)?start:end;
//        }else if (start == end) {
//            return start;
//        }
//        int mid = start+(end-start)/2;
//        boolean b = isBadVersion(mid);
//        if (b == false){
//            return find(mid,end);
//        }else{
//            return find(start,mid);
//        }
//    }
//    public int climbStairs(int n) {
//        if (n == 1){
//            return 1;
//        }else if (n == 2){
//            return 2;
//        }else {
//            return climbStairs(n-1)+climbStairs(n-2);
//        }
//        int num1 = 0;
//        int num2 = 0;
//        int sum =1;
//        for (int i = 1;i<=n;i++){
//            num1 = num2;
//            num2 = sum;
//            sum = num1+num2;
//        }
//        return sum;
//    }
//    private boolean isBadVersion(int start) {
//        return start >= 4?true:false;
//    }
//    static class InnerClass{
//
//    }
//    public int maxProfit(int[] prices) {
//        try {
//            int a = 100/0;
//            System.out.println("1");
//        }catch (Exception e){
//            System.out.println("2");
//        }finally {
//            System.out.println("3");
//        }
//        System.out.println("4");
//        int minprice = Integer.MAX_VALUE;
//        int profit = 0;
//        for (int i = 0;i<prices.length;i++){
//            if (prices[i]<minprice){
//                minprice = prices[i];
//            }else if (prices[i] - minprice>profit){
//                profit = prices[i] - minprice;
//            }
//        }
//        return profit;
//    }
//    public int maxSubArray(int[] nums) {
//        int nowSub = nums[0];
//        int maxSub = nowSub;
//        if (nums.length ==1){
//            return nowSub;
//        }
//        for (int i = 1;i<nums.length;i++){
//            if (nowSub>0){
//                nowSub += nums[i];
//            }else{
//                nowSub = nums[i];
//            }
//            maxSub = Math.max(maxSub,nowSub);
//        }
//        return maxSub;
//    }
//    public void xxx(XXX x){
//        x.i = 20;
//    }
//    public int removeElement(int[] nums, int val) {
//        int length = nums.length;
//        if (length == 0){
//            return 0;
//        }
//        int head = 0;
//        int tail = length - 1;
//        int mid;
//        int newLength = length;
//        out:
//        while (tail>head){
//            while (nums[tail] == val){
//                if (tail>head){
//                    --tail;
//                    newLength--;
//                }else {
//                    break out;
//                }
//
//            }
//            if (nums[head] == val){
//                mid = nums[tail];
//                nums[tail--] = nums[head];
//                nums[head++] = mid;
//                newLength--;
//            }else {
//                head++;
//            }
//        }
//        if (head == tail&&nums[head] == val){
//            nums[head] = val+1;
//            --newLength;
//        }
//        return newLength;
//    }
//    public int searchInsert(int[] nums, int target) {
//        if (nums.length == 1){
//            if (nums[0]==target) {
//                return 0;
//            }else {
//                return nums[0]>target?0:1;
//            }
//        }
//        int mid = nums.length/2;
//        int start,end;
//        if (nums[mid]>target){
//            start = 0;
//            end = mid;
//        }else {
//            start = mid;
//            end = nums.length-1;
//        }
//        if (start==end){
//            if (nums[start]==target){
//                return start;
//            }else if (start == 0){
//                return nums[start]>target?0:1;
//            }else {
//                return nums[start]>target?1:2;
//            }
//        }
//        while (end-start!=1){
//            mid = (end-start+1)/2+start;
//            if (nums[mid]>target){
//                end = mid;
//            }else {
//                start = mid;
//            }
//        }
//        if (nums[start]==target){
//            return start;
//        }else if (nums[end] == target){
//            return end;
//        }else if (nums[start]>target){
//            return start == 0?0:start-1;
//        }else if (nums[end]<target){
//            return end+1;
//        }else {
//            return start+1;
//        }
//        int n = nums.size();
//        int l=0,r=n-1;
//        while(l<=r){
//            int mid=l+(r-l)/2;
//            if(nums[mid]<target)
//                l=mid+1;
//            else r=mid-1;
//        }
//        return l;
//    }
//    public int lengthOfLastWord(String s) {
//        int tail = s.length()-1;
//        int wordLength = 0;
//        boolean flag = false;
//        out:
//        while (tail>=0){
//            if(s.charAt(tail)!=' '){
//                flag = true;
//                while (flag){
//                    if (tail>=0&&s.charAt(tail--)!=' '){
//                        wordLength++;
//                    }else {
//                        break out;
//                    }
//                }
//            }else {
//                tail--;
//                continue;
//            }
//        }
//        return wordLength;
//    }
//    List<Integer> list = new ArrayList<>();
//    public List<Integer> inorderTraversal(ArrayToTree.TreeNode root) {
//        inputNode(root);
//        return list;
//    }
//    public void inputNode(ArrayToTree.TreeNode node1){
//        if (node1!=null){
//            list.add(node1.val);
//            inputNode(node1.left);
//            inputNode(node1.right);
//        }
//    }
//    boolean flag = true;
//    public boolean isSameTree(ArrayToTree.TreeNode p, ArrayToTree.TreeNode q) {
//        compareNode(p,q);
//        return flag;
//    }
//    public void compareNode(ArrayToTree.TreeNode p, ArrayToTree.TreeNode q){
//        if (flag == true){
//            if ((p!=null&&q!=null)||(p==null&&q==null)){
//                if (p!=null&&p.val != q.val) {
//                    flag = false;
//                }else{
//                    if (p!=null){
//                        compareNode(p.left, q.left);
//                        compareNode(p.right, q.right);
//                    }
//                }
//            }else{
//                flag = false;
//            }
//
//        }
//    }
//    boolean flag = true;
//    public boolean isBalanced(ArrayToTree.TreeNode root) {
//        computeDeep(root);
//        return flag;
//    }
//    public int computeDeep(ArrayToTree.TreeNode node){
//        if (flag){
//            if (node!=null){
//                int leftDeep = computeDeep(node.left);
//                int rightDeep = computeDeep(node.right);
//                if (Math.abs(leftDeep-rightDeep)>1){
//                    flag = false;
//                }
//                return Math.max(leftDeep,rightDeep)+1;
//            }
//            return 1;
//        }
//        return 0;
//    }
//    public int minDepth(ArrayToTree.TreeNode root) {
//        if (root.left == null)
//            return minLength(root.right)+1;
//        if (root.right == null)
//            return minLength(root.left)+1;
//        return minLength(root);
//    }
//    public int minLength( ArrayToTree.TreeNode root){
//        if (root!=null) {
//            return (root.left == null && root.right == null) ? 1 : Math.min(minLength(root.left), minLength(root.right)) + 1;
//        }
//    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i<numRows; i++){
            List line = new ArrayList<Integer>();
            for (int j = 0; j<=i; j++){
                if (j == 0 || j == i){
                    line.add(1);
                }else {
                    line.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(line);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(3*0.1);

//        Boolean flag = new Boolean(true);
//        System.out.println(flag.hashCode());
//        flag = new Boolean(false);
//        System.out.println(flag.hashCode());
//        Example example = new Example();
//        ArrayToTree.TreeNode root1 = new ArrayToTree.TreeNode();
//        ArrayToTree.TreeNode root2 = new ArrayToTree.TreeNode();
//        ArrayToTree.TreeNode node1 = new ArrayToTree.TreeNode();
//        ArrayToTree.TreeNode node2 = new ArrayToTree.TreeNode();
//        ArrayToTree.TreeNode node3 = new ArrayToTree.TreeNode();
//        ArrayToTree.TreeNode node4 = new ArrayToTree.TreeNode();
//        node2.val = 2;
//        node1.val = 2;
//        root1.val = 1;
//        root2.val = 1;
//        node3.val = 3;
//        node4.val = 3;
//        root1.left = node1;
//        root1.right = node3;
//        root2.left = node2;
//        root2.right = node4;
//        Integer[] tree = {1,2,2,3,3,null,null,4,4};
//        ArrayToTree arrayToTree = new ArrayToTree(tree);
//        ArrayToTree.TreeNode treeNode = arrayToTree.toTree();
//        System.out.println(example.isBalanced(treeNode));
//        System.out.println(example.isSameTree(root1, root2));
//        try {
//            example.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(example.lengthOfLastWord("l"));
//        System.out.println(example.searchInsert(nums,1));
//        System.out.println(example.removeElement(nums, 4));
//        try {
//            int a = 100/0;

//            System.out.println("1");
//            throw  new RuntimeException();
//        }catch (Exception e){
//            System.out.println(e.getClass());
//            System.out.println("2");
////            System.out.println("2");
//        }finally {
//            System.out.println("3");
//        }
//        System.out.println("4");
//        System.out.println(1.0/0);
//        InnerClass innerClass = new InnerClass();
//        Integer a = 1;
//        Integer b = 1;
//        System.out.println(a==b);
//        int[] nums = {-2,-1};
//        Test1 t = new Test1();
//            List list = new ArrayList();
//        System.out.println(-1&7);
//        Example example = new Example();
//        XXX xxx = new XXX();
//        example.xxx(xxx);
//        System.out.println(xxx.i);
//        System.out.println(example.xxx());
//        ArrayList<String> strings = new ArrayList<>();
//        ArrayList strings2 = new ArrayList<String>();
//        strings2.add(1);

//        int a = 10;
//        System.out.println(a++ + a--);
//        System.out.println(example.maxProfit(nums));
//        System.out.println(example.climbStairs(45));
//        System.out.println(example.firstBadVersion(5));
//        int[] test = {0,0,3,0,0,0,0,0,0};
//        int[] test1 = {-1,1,1,1,2,3};
//        int[] xx = new int[5];
//        System.out.println(Arrays.toString(xx));
//        example.merge(test,3,test1,6);
//        System.out.println(Arrays.toString(test));
//        example.sortedArrayToBST(test);

//        ArrayToTree.TreeNode root = new ArrayToTree.TreeNode(1);
//        ArrayToTree.TreeNode node1 = new ArrayToTree.TreeNode(2);
//        ArrayToTree.TreeNode node2 = new ArrayToTree.TreeNode(2);
//        ArrayToTree.TreeNode node3 = new ArrayToTree.TreeNode(3);
//        ArrayToTree.TreeNode node4 = new ArrayToTree.TreeNode(4);
//        ArrayToTree.TreeNode node5 = new ArrayToTree.TreeNode(3);
//        ArrayToTree.TreeNode node6 = new ArrayToTree.TreeNode(4);
//        ArrayToTree.TreeNode node6 = new ArrayToTree.TreeNode(0);
//        root.left = node6;
//        root.right = node2;
//        node1.left = node3;
//        node1.right = node4;
//        node2.right = node5;
//        node2.left = node6;
//        System.out.println(example.isSymmetric(root));
    }

}
//class ArrayToTree.TreeNode {
//    int val;
//    ArrayToTree.TreeNode left;
//    ArrayToTree.TreeNode right;
//    ArrayToTree.TreeNode() {}
//    ArrayToTree.TreeNode(int val) { this.val = val; }
//    ArrayToTree.TreeNode(int val, ArrayToTree.TreeNode left, ArrayToTree.TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ArrayToTree.TreeNode)) return false;
//        ArrayToTree.TreeNode node1 = (ArrayToTree.TreeNode) o;
//        return val == node1.val && Objects.equals(left, node1.left) && Objects.equals(right, node1.right);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(val, left, right);
//    }
//}

class ListNode {
      int val;
      ListNode next;
      ListNode() {};
      ListNode(int x) { val = x; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 class Test1{

    private int x;
    private int y;
    public final void test1(int x){
        this.x = x;
    }

    public Test1(int x){
        this(x,1);
        this.x = x;
    }
    public Test1(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class XXX extends Test1{
    public int i = 15;

    public XXX(int x) {
        super(x);
    }
}
