class SortArray extends Array{

    public SortArray(int len){
        super(len);
    }

    public int[] getData(){
        java.util.Arrays.sort(super.getData()); //排序
        return super.getData();
    }

    static class TestDemo{
        public static void main(String[] args) {
            SortArray arr = new SortArray(3);
            System.out.println(arr.add(200));
            System.out.println(arr.add(100));
            System.out.println(arr.add(500));
            System.out.println(arr.add(1000));
            int[] temp = arr.getData();
            for (int i : temp) {
                System.out.println(i);
            }
        }
    }

}
