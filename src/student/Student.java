package student;

public class Student {
    private String name;
    private String surname;
    private int dateBirth;
    private String email;

    public Student() {
    }

    public Student(String name, String surname, int dateBirth, String email) {
        this.name = name;
        this.surname = surname;
        if(2022-dateBirth<0){
            System.out.println(" studenttin datasyn tuura kirgile");
            return;
        }else {
            this.dateBirth = dateBirth;
        }
        this.email = email;
    }

    public String getName() { return name;    }

    public void setName(String name) {       this.name = name;   }

    public String getSurname() {        return surname;    }

    public void setSurname(String surname) {        this.surname = surname;    }

    public int getDateBirth() {        return dateBirth;    }

    public void setDateBirth(int dateBirth) {        this.dateBirth = dateBirth;    }

    public String getEmail() {        return email;    }

    public void setEmail(String email) {        this.email = email;    }


    @Override
    public String toString() {
        return
                "{"+"Name" +"\t"+"Surname"+"\t"+"Date"+"\t"+"Email"+"\n" +
                "{"+name.toUpperCase() + "\t" + surname.toUpperCase() + "\t" + dateBirth + "\t"+ email ;
    }
    public String mStudent(){
        return "{"+name.toUpperCase() + "\t" + surname.toUpperCase() + "\t" + dateBirth + "\t"+ email + "}";
    }
}
