class Student{
    private String name;
    private char gender;

    public Student() {
        name = "Unknown";
        gender = 'u';
    }

    public Student(String name){
        this.name = name;
        this.gender = 'u';
    }

    public Student(char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }


    public Student(String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    public void display(){
        System.out.print("name: " + name);
        if(gender == 'm'){
            System.out.print("Gender: gender");
        }
        if(gender == 'f'){
            System.out.print("Gender: Female");
        }
        if(gender == 'u'){
            System.out.print("Gender: Unknown");
        }
    }



}