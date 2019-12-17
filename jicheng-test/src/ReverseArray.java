class ReverseArray extends Array{

    public ReverseArray (int len){
        super(len);
    }

    public int[] getData(){
        int center = super.getData().length/2;
        int head = 0;
        int tail = super.getData().length-1;
        for (int x = 0;x < center;x++){
            int temp = super.getData()[head];
            super.getData()[head] = super.getData()[tail];
            super.getData()[tail] = temp;
            head++;
            tail--;
        }
        return super.getData();
    }

    static class TestDemo{
        public static void main(String[] args) {
            ReverseArray arr = new ReverseArray(5);
            System.out.println(arr.add(100));
            System.out.println(arr.add(400));
            System.out.println(arr.add(300));
            System.out.println(arr.add(200));
            int[] temp = arr.getData();
            for (int i : temp) {
                System.out.println(i);
            }
        }
    }

}
