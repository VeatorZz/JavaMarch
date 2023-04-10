package BinarySearchTree;

public class BinarySearchTree {
    static class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int key) {
            this.key = key;
        }
    }

    public TreeNode root;

    /**
     *
     * @param key
     */
    public boolean insert(int key) {
        if(root == null) {
            root = new TreeNode(key);
            return true;
        }

        TreeNode cur = root;
        TreeNode parent = null;

        while (cur != null) {
            if(cur.key < key) {
                parent = cur;
                cur = cur.right;
            }else if(cur.key > key) {
                parent = cur;
                cur = cur.left;
            }else {
                return false;
            }
        }
        TreeNode node = new TreeNode(key);
        //当代码执行到这里之后。cur == null
        if(parent.key < key) {
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;
    }

    public TreeNode search(int key) {
        TreeNode cur = root;
        while (cur != null) {
            if(cur.key == key) {
                return cur;
            }else if(cur.key < key) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean remove(int key) {
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null) {
            if(cur.key < key) {
                parent = cur;
                cur = cur.right;
            }else if(cur.key == key) {
                //这里开始删除！
                removeNode(parent,cur);
                return true;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        return false;
    }

    private void removeNode(TreeNode parent,TreeNode cur) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            TreeNode targetParent = cur;
            TreeNode target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.key = target.key;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

    //中序遍历即可
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }


}
