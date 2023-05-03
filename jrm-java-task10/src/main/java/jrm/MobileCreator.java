package jrm;

public class MobileCreator {
    public static void main(String[] args) {
        Mobile firstMobile = new Mobile();
        firstMobile.cost = 10000;
        firstMobile.countOfButtons = 10;

        Mobile secondMobile = new Mobile();
        secondMobile.cost = 5000;
        secondMobile.countOfButtons = 5;


        if(firstMobile.cost == 10000 & firstMobile.countOfButtons==10){
            firstMobile.model= "iphone";
            System.out.println(firstMobile.model);
        }

        if(secondMobile.cost == 5000 & secondMobile.countOfButtons==5){
            secondMobile.model= "samsung";
            System.out.println(secondMobile.model);
        }
    }
}
