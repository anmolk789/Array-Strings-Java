import java .util.*;
public class StudentMain{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int id,sub;
        String s;
        System.out.println("Enter the id:");
        id=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the name:");
        s=obj.nextLine();
        System.out.println("Enter the no of subjects:");
        sub=obj.nextInt();
        obj.nextLine();
        int arr[]=new int[sub];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter mark for subject "+(i+1)+":");
            arr[i]=obj.nextInt();
            obj.nextLine();
        }
        Student ss=new Student();
        ss.setName(s);
        ss.setId(id);
        ss.setMarks(arr);
        ss.calculateAvg();
        ss.findGrade();
        System.out.println("Id:"+ss.getId());
        System.out.println("Name:"+ss.getName());
        System.out.println("Average:"+ss.getAverage());
        System.out.println("Grade:"+ss.getGrade());
    }
}