package BinarySearchTree;

public class BinarySearchTree {
    static class TreeNode{
        public  int key;
        public TreeNode left;
        public TreeNode right;
        TreeNode(int key){
            this.key=key;
        }
    }




    public TreeNode root;
    public boolean insert(int key){
    if(root ==null){
        root =new TreeNode(key);
        return true;
    }
    TreeNode cur =root;
    TreeNode parent =null;
    while(root != null){
        if(cur.key<key){
            parent =cur;
            cur =cur.right;
        }else if(cur.key>key){
            parent =cur;
            cur =cur.right;
        }else{
            return false;
        }
    }

    TreeNode node = new TreeNode(key);
        //走到这root(cur)是空的
    if(parent.key<key){
        parent.right =node;
    }else{
        parent.left =node;
    }
    return true;


    }
    //中序遍历即可
    public void inorder(TreeNode root){
        if(root ==null) return;
        inorder(root.left);
        System.out.println(root.key+" ");
        inorder(root.right);
    }


}
