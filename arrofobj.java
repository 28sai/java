
class student {
        int rollno;
        String name;
        int marks;
}

public class arrofobj{
    public static void main(String[] args) 
    
    {
        student obj = new student();
        obj.rollno=1;
        obj.name="sai";
        obj.marks=98;


        student obj2 = new student();
        obj2.rollno=2;
        obj2.name="teja";
        obj2.marks=99;



        student obj3 = new student();
        obj3.rollno=3;
        obj3.name="saiteja";
        obj3.marks=97;

        student students[] = new student[3];
        students[0]=obj;
        students[1]= obj2;
        students[2]=obj3;


        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+ " : "+ students[i].marks);
        // }


        for(student stud: students)
        System.out.println(stud.name + " : "+ stud.marks);

        // int nums[]=new int[4];
        // nums[0]=2;
        // nums[1]=4;
        // nums[2]=5;
        // nums[3]=7;
        // for(int i=0;i<nums.length;i++)
        // System.out.println(nums[i]);

            
        // for(int n: nums)
        // System.out.println(n);


    }
}


//by default integer array elements are zero

//by default integer array elements are zero