package controller;

public class HelloWorld {
    public static void main(String[] args) {
        StringBuffer id = new StringBuffer("asdfg");
        char[] ch = {'1','2','3','4'};
        id = id.append(ch,1,3);
        System.out.println(id);
    }
}
