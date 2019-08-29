public class Fab {
    public static void main (String args[]) {


//        int temp1 = 1;
//        int temp2 = 1;
//        int result = 0;
//
//        for(int i=3;i<=40; i++){
//            result = temp1 + temp2;
//            temp1 = temp2;
//            temp2 = result;
//        }

//        System.out.print("the 40th number is " + result);
        System.out.print("the 40th number is " + computerFab(-100));
    }

    public static long computerFab (int index){

        if(index < 1){
            System.out.print("invalid parameter!");
            return -1;
        }
        long t1 = 1L;
        long t2 = 1L;
        long result = 0L;
        if(index == 1 || index == 2){
            return 1;
        }else {
            for (int i=3; i<=index; i++){
                result = t1 + t2;
                t1 = t2;
                t2 = result;
            }
            return result;
        }
    }

}
