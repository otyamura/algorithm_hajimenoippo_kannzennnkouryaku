import java.util.Scanner;

public class HashTableSearchTrace {
    //ハッシュ表の実態となる配列
    public static int[] hashTable = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    //ハッシュ関数
    public static int hashFunc(int data){
        return data % 10;
    }

    public static void main(String[] args){
        int data,hashValue;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("格納するデータ:");
            data = scn.nextInt();

            //マイナスの値が入力されたらおしまい
            if(data<0){
                break;
            }
            //ハッシュ値を求める
            hashValue = hashFunc(data);
            hashTable[hashValue] = data;
            System.out.printf("hashTable[%d]=%d\n",hashValue,data);
        }while(true);
    }

}
