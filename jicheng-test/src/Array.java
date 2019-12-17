class Array{
//    定义一个数组对象，此数组由外部设置长度
    private int data[];
//    表示数组得操作脚标
    private int foot;

    public Array(int len){
        if (len > 0){
            this.data = new int[len];
        }else {
            this.data = new int[1];
        }
    }

//    向数组中增加元素
    public boolean add(int num){
        if (this.foot<this.data.length){
            this.data[this.foot++] = num;
            return true;
        }
        return false;
    }

    public int[] getData(){
        return this.data;
    }

}


class TestDemo {

    public static void main(String[] args) {
        Array arr = new Array(3);
        System.out.println(arr.add(20));
        System.out.println();
        System.out.println(arr.add(10));
        System.out.println();
        System.out.println(arr.add(30));
        System.out.println();
        System.out.println(arr.add(100));
        int[] temp = arr.getData();
        for (int i : temp) {
            System.out.println(i);
        }
    }

}
