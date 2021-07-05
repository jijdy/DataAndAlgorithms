package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterMiddleTree {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root; // 工作指针

        while(p != null || !stack.isEmpty()){
            if(p != null){
                stack.push(p);
                p = p.left;
            }
            else{
                p = stack.pop();//栈的运用，和递归有相似之处，其实就是递归的深入用法，此处再调回到树的上一个结点
                res.add(p.val);
                p = p.right;
            }
        }

        return res;
    }

    public static List<Integer> solution(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();//用于存放结点
        List<Integer> list = new ArrayList<>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()){
            if(p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }
        }
        return list;
    }

    public static List<Integer> middleIter(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        middleIterProvide(root, list);

        return list;
    }

    static void middleIterProvide(TreeNode root, List<Integer> list) {
        if (root == null) return;
        middleIterProvide(root.left, list);
        list.add(root.val);
        middleIterProvide(root.right, list);
    }
    public static void main(String[] args) {
        TreeNode tr = new TreeNode();
        tr.val = 5;
        tr.left = new TreeNode(4);
        tr.left.left = new TreeNode(1);
        tr.left.left.right = new TreeNode(3);
        tr.right = new TreeNode(6);
        tr.right.right = new TreeNode(78);
        tr.right.right.left = new TreeNode(38);

        List<Integer> l = IterMiddleTree.inorderTraversal(tr);
        System.out.println(l.toString());

        List<Integer> ls = IterMiddleTree.middleIter(tr);
        System.out.println(ls);


    }
}

