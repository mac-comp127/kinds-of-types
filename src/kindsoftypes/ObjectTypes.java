package kindsoftypes;

public class ObjectTypes {
    public static void main(String[] args) {
        System.out.println("────── Some Things Aren't Primitives ──────");

        // In the previous reading, you saw variables that are strings:

        String mascot = "Coo";

        // In many ways, the `String` in that line is a lot like the `int` in `int x`:
        //
        // - It's a type.
        // - The type specifies what kinds of values the variable can have.
        // - We initialize the variable to a specific value of the proper type. ("Coo" is a string.)
        //
        // In some ways, however, `String` is very different from `int`. Unlike primitive types,
        // strings do not have a fixed size; some are longer than others. Unlike primitive types,
        // string computations might be slow (milliseconds instead of nanoseconds -- slow!!). You
        // might have noticed that the type `String` is capitalized in code.
        // 
        // Here’s a really big difference: unlike primitive types, you do not only work with
        // strings using operators. For example, we can ask for the uppercase version of a string:

        System.out.println("toUpperCase: " + mascot.toUpperCase());

        // And we can ask a string how long it is:

        System.out.println("length: " + mascot.length());

        // In that code, `toUpperCase` and `length` are called _methods_. They are things we can
        // ask of a string. When we use one -- when we ask the string to give us an upper case
        // version, for example -- the term for that is “calling” or “invoking” the method.
        //
        // When we call a method, the thing we’re asking to take some action is the _receiver_,
        // and the name of the action we asking it to take is the _method name_:
        //
        //     ┌──────────── receiver: mascot
        //     │
        //     │      ┌───── method name: length
        //     ↓      ↓
        //     mascot.length()
        //
        // You may have seen this dot syntax before. If so, we’re asking you to pay closer attention
        // to it than you might have in the past. If not, you will have seen function calls of some
        // kind -- code like `someFunction(x, y)` -- and method calls are a lot like that, except
        // they use that dot syntax that also gives them a receiver.
        
        // Here’s what’s interesting methods: they are specific to the _type of the receiver_.
        // For example, try uncommenting this code, and study the error messages you get:

        // int notString = 17;
        // System.out.println("toUpperCase: " + notString.toUpperCase());
        // System.out.println("length: " + notString.length());

        // You can't ask for the upper case version of 17. Integers don't have a toUpperCase method.
        //
        // Remember our first day activity? We said that this class would be built around saying
        // “There are things called doors, and they can open” in code. Well, in Java, if you had
        // a door, here’s how you would tell it to open:
        //
        //     frontDoor.open()
        //
        // A really important thing about doors is that they can open (unlike, say, a chair).
        // Another really important thing about doors is that “open” means something specific for
        // them. A jar can open, too, but “open the jar” describes a different action than “open
        // the door.” And Java makes it possible for these to lines of code:
        //
        //     frontDoor.open()
        //     jarOfHotSauce.open()
        //
        // ...to do _completely different things_.

        // You can ask a string to do a lot of things; there are a lot of string methods available:

        System.out.println("Second character: " + mascot.charAt(1));
        System.out.println("Repeat 10 times: " + mascot.repeat(10));

        // You can even call one method, then call another method on its result:

        System.out.println("First two letters 100 times: " + mascot.substring(0, 2).repeat(100));

        // In tomorrow’s activity, you’ll be exploring them and learning about some of them.


        System.out.println("────── Primitive Types vs Object Types ──────");

        // Java divides its world of types into two categories: primitive types and object types.
        // (This particular distinction is very Java-specific; however, these ideas and these basic
        // building blocks show up in many other languages too.)
        //
        // Here are the important differences:
        //
        // PRIMITIVE TYPES      | OBJECT TYPES
        // -----------------------------------------------------------------------------------------
        // names are lowercase  | names are CapitalizedWordsLikeThis (sometimes called “camel case”)
        // don’t have methods   | have methods
        // operations are fast  | operations can sometimes be slow
        // always copied        | many variables can point to the same object
        // can’t be null        | can be null
        //
        // Those last two are big ideas. (Object? Null?) We’ll be studying both of these topics
        // in depth later. 


        System.out.println("────── Java's Biggest Mistake (Maybe) ──────");

        // What will this code print? Why? Run it. Study it.

        String mascotTwice = (mascot + "!").repeat(3);
        String happyBaby = "Coo!Coo!Coo!";
        System.out.println("mascotTwice = " + mascotTwice);
        System.out.println("  happyBaby = " + happyBaby);

        // Got it? Now, study this code, guess what it will print, and then run it.

        // if (mascotTwice == happyBaby) {
        //     System.out.println("The strings are the same.");
        // } else {
        //     System.out.println("The strings are not the same.");
        // }

        // Why?
        //
        // The short version: when you are working with strings, == doesn’t mean what you would
        // reasonably think it means, what it obviously _should_ mean.
        //
        // The slightly long version: Java makes a distinction between “the same string” and
        // “different strings that happen to contain the same characters.”  In Java, the == operator
        // checks where two strings are the same string. If you want to check whether two strings
        // have identical characters, you use the method name `equals` (uncomment and try it):

        // if (mascotTwice.equals(happyBaby)) {
        //     System.out.println("The strings are equal.");
        // } else {
        //     System.out.println("The strings are not equal.");
        // }

        // In most languages, == means what .equals() means in Java. This has caused innumerable
        // programmers immense confusion over the last ~3 decades. Many people (including the
        // author of this reading) think that was a mistake. But it’s a mistake Java can’t fix now,
        // because changing it would change the meaning of millions -- maybe billions? -- of lines
        // of existing code out there in the world.
        //
        // Every language, every programming tool, has mistakes. Part of a developer’s job is
        // learning them and learning how to either work around them or live with them. This, too,
        // is part of the experience of learning a new programming language!
    }
}
