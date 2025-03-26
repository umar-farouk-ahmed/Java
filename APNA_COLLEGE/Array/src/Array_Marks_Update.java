public class Array_Marks_Update {
    public static void update(int[] mark){
        for(int i=0;i< mark.length;i++){
            mark[i] = mark[i] + 1;
        }
    }
    public static void main(String[] args) {
        int[] marks = {10,11,12,13,14};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
    }
}
