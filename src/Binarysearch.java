public class Binarysearch {
             public class Node{
            private int data;
            private Node left;
            private Node right;

            public Node(int data){
                this.data= data;
            }
        }
        private Node root;


        public boolean insert(int data) {
            root = insert(root, data);
            return true;
        }

        private Node insert(Node node, int data) {


            if (node == null) {
                return new Node(data);
            }

            //if data is less than the current element,

            if (node.data > data) {
                node.left = insert(node.left, data);
            }

            //If data is greater than the current element,

            if (node.data < data) {
                node.right = insert(node.right, data);
            }

            else{
                return node;
            }
            return node;
        }
        public static void main(String[] args) {
            Binarysearch bst = new Binarysearch();

            bst.insert(52);
            bst.insert(15);
            bst.insert(56);
            bst.insert(9);
            bst.insert(11);
            bst.insert(54);
            bst.insert(3);
            bst.insert(5);
            bst.insert(61);
        }

}
