class BST{
    public int data;
    public int left;
    public int right;
}

public class BinarySearchTree {
    public static BST[] tree = new BST[10];
    public static int rootIdx = 0;
    public static int newIdx = 0;

    public static void addBST(int data){
        int currentIdx;
        boolean addFlag;

        tree[newIdx].data = data;
        tree[newIdx].left = -1;
        tree[newIdx].right = -1;

        if(newIdx != rootIdx){
            currentIdx = rootIdx; //根から二分探索木を辿る
            addFlag = false;
            do {
                //より小さい場合は、左側にたどる
                if (data < tree[currentIdx].data){
                    //左側が末端なら、そこに追加する
                    if(tree[currentIdx].left == -1){
                        tree[currentIdx].left = newIdx;
                        addFlag =true;
                    }
                    //左側が末端でないなら、さらに左側の要素を辿る
                    else {
                        currentIdx = tree[currentIdx].left;
                    }
                }else {
                    //右側が末端なら、そこに追加する
                    if(tree[currentIdx].right == -1){
                        tree[currentIdx].right = newIdx;
                        addFlag = true;
                    }
                    //右側が末端でないなら、さらに右側の要素を辿る
                    else {
                        currentIdx = tree[currentIdx].right;
                    }
                }

            }while ( !(addFlag) );
        }
        //次に格納する要素のために添字を1増やしておく
        newIdx++;
    }

    //二分探索木の実体の配列を、物理的な順序で表示するメソッド
    public static void printPhysicalBST() {
        int i;
        for(i = 0;i < newIdx; i++){
            System.out.printf("tree[%d]:data = %d, left = %d, right = %d\n", i, tree[i].data, tree[i].left, tree[i].right);
        }
    }

    public static void main(String[] args){
        for(int i = 0;i < tree.length; i++){
            tree[i] = new BST();
        }
    }

    addBST(4);
    addBST(6);
    addBST(5);
    addBST(2);
    addBST(3);
    addBST(7);
    addBST(1);
    printPhysicalBST();


}
