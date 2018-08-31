package enumeration;

public class Week {
    Day day;
    public Week(){}
    public Week(Day day){ //CONSTRUCTOR, this initialize
        this.day = day;
    }
    public void WhatToDo(Day day){ //Day day is reference variable
        switch(day){        //CONDITIONAL STATEMENT, que: case 1, 2, 3... what would be switch (?){
            case MONDAY:
                System.out.println("Meeting with boss");
                break;
            case TUESDAY:
                System.out.println("Order lab materials");
                break;
            case WEDNESDAY:
                System.out.println("Making modRNA");
                break;
            case THURSDAY:
                System.out.println("Cleaning of modRNA");
                break;
            case FRIDAY:
                System.out.println("Supply modRNA to lab members");
                break;
            case SATURDAY:
                System.out.println("Meeting with friend at pnt");
                break;
            case SUNDAY:
                System.out.println("Meeting with Mafi bhai at pnt");
                break;
            case MyDay:
                System.out.println("Hey! saturday to sunday");
                break;
            default:
                System.out.println("apnar ki matha noshto?");




        }
    }
}

