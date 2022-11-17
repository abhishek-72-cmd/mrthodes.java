package com.company ;

    class areaOfTheCircle {
     private int radius ;
     private float area ;
     private float parameter;


     public float getArea (float a){
         a=area;
     area =  3.14f*radius*radius;
     return a= 3.14f*radius*radius;
     }

     public float setParameter(float p ){
         p = parameter ;
         p=2*3.14f*radius;
         if(p==parameter){
             parameter=p;
         }else{
             System.out.println("wrong value for parameter");
            }
         return p=2*3.14f*radius;

         }

    }




public class class_getters_and_setters {

    public static void main(String[] args) {

        areaOfTheCircle a = new areaOfTheCircle();
        a.setParameter(36.21f);
        System.out.println(a.setParameter(36.12f));

        a.getArea(13.23f);
        System.out.println(a.getArea(13.23f));
    }
      }
