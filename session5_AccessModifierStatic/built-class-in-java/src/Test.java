public class Test {
    private String name;
    private String classes;

    Test(){
       name = "John";
       classes = "C02";
    }
//    Test(String name, String classes){
//        this.name = name;
//        this.classes = classes;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString(){
        return name +  " " + classes;
    }
}
