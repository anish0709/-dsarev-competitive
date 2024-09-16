public class Tree
{
    private TreeNode root;

    private class TreeNode
    {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data)
        {
            this.data = data;
        }


        public void preOrder(TreeNode root)
        {
            if(root==null)
            return;

            System.out.print(root.data + "");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(TreeNode root)
        {
            if(root==null)
            return;

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public void postOrder(TreeNode root)
        {
            if(root==null)
            return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String args[])
        {

        }
    }
}