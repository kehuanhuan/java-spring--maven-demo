package com.khh.demo;

/**
 * Hello world!
 *
 */
public class App
{

    String author;

    public App(String name){
      // 这个构造器仅有一个参数：name
      System.out.println("demo name is : " + name );
    }

    public void setAuthor( String name ){
       author = name;
    }

    public String getAuthor() {
       System.out.println("author name is : " + author );
       return author;
    }

    public static void main( String[] args )
    {
        if (args.length < 2) {
            System.out.println( "please enter args");
            System.exit(0);
        }
        App demo = new App(args[0]);
        demo.setAuthor(args[1]);
        demo.getAuthor();

        System.out.println( "Hello " + args[0] + " author " + args[1] );

    }
}
