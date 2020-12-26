public class person {
    String name;
    String sex;
    String number;
    int age;

    public person(String setName,String setSex,String setNumber,int setAge){
        name = setName;
        sex = setSex;
        number = setNumber;
        age = setAge;
    }

    public person(String setName,String setSex,String setNumber){
        name = setName;
        sex = setSex;
        number = setNumber;
    }
//    public void setAge(int newAge) {
//        if (newAge>0) {
//            age = newAge;
//        }
//    }
//
//    public int getAge() {
//        return age;
//    }

}
