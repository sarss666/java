

public class MyArrayList {

    public int[] elem;
    public int usedSize;

    public MyArrayList(){
        this.elem = new int[10];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display(){
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }
    //在pos位置新增元素
    public  void  add(int pos,int data){
        //pos位置是否合法
        if(pos < 0 || pos > this.usedSize){
            System.out.println("pos位置不合法！");
            return;
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;

    }
    //判断是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i < usedSize ; i++) {
            if(elem[i] == toFind){
                return true;
            }
        }
        return false;

    }
    //查找某个元素的位置
    public int search(int toFind){
        for (int i = 0; i < usedSize ; i++) {
            if(elem[i] == toFind){
                return i;
            }
        }

        return -1;}
    //获取pos位置的元素

    public int getpos(int pos){
        for (int i = 0; i < usedSize ; i++) {
            if(i == pos){
                return this.elem[pos];
            }
        }

        return -1;
    }
    //给pos位置的元素设置为value
    public void setpos(int pos,int value){

        if (pos < 0 || pos > this.usedSize){
            return;
        }
        this.elem[pos] = value;


    }
    //删除第一次出现的关键字
    public void remove(int toRemove){
        int index = search(toRemove);
        if(index == -1){
            System.out.println("未找到！");
            return;
        }
        //i = index  i< usedSize - 1
        for(int i = index;i < this.usedSize - 1;i++){
            this.elem[i] = this.elem[i + 1];
        }
        //this.usedSize - 1
        this.usedSize --;

    }
    //获取顺序表的长度
    public int size(){
        int len = this.usedSize;
        return len;
    }
    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }

}
