public class Student{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    
    public void setId(int i){
        this.id=i;
    }
    public void setName(String j){
        this.name=j;
    }
    public void setMarks(int[] k){
        this.marks=k;
    }
    public void setAverage(float l){
        this.average=l;
    }
    public void setGrade(char m){
        this.grade=m;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int[] getMarks(){
        return this.marks;
    }
    public float getAverage(){
        return this.average;
    }
    public char getGrade(){
        return this.grade;
    }
    public void calculateAvg(){
        int sum=0;
        for (int i=0;i<this.marks.length;i++){
            sum = sum+this.marks[i];
        }
        this.average=(float)sum/(float)this.marks.length;
        setAverage(this.average);
    }
    
    public void findGrade(){
        for(int i=0;i<this.marks.length;i++)
        if(this.marks[i]<50){
                setGrade('F');
                return;
        }
        if(this.average>=80 && this.average<=100){
            setGrade('O');
        }
        else if(this.average>=50 && this.average<80){
            setGrade('A');
        }
        else{
            setGrade('F');
        }
    }
}