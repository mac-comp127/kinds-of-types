package kindsoftypes;

public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("────── More Operators ──────");

        // It is very common in code to take a variable, add something to it, then assign the result
        // of the addition back to the same variable. For example:

        int personCount = 0;
        System.out.println("There are " + personCount + " people");
        personCount = personCount + 5;  // Five people arrive
        System.out.println("Now there are " + personCount);
        personCount = personCount + 2;  // ...then 2 more
        System.out.println("Now there are " + personCount);
        personCount = personCount + 7;  // ...then 7
        System.out.println("Now there are " + personCount);

        // This is so common that there is a special shortcut for it:

        personCount += 3;  // ...then 3 more arrive
        System.out.println("Now there are " + personCount + ". Getting crowded in here!");
        personCount += 110;  // whoa
        System.out.println("Now there are " + personCount + ". Yikes!!");

        // The shortcut works for other operators too:

        personCount -= 60;  // A bunch of people leave to go see the African Music Ensemble concert
        System.out.println("Now there are " + personCount);

        personCount *= 2;  // But everyone who's still there invites a friend
        System.out.println("Now there are " + personCount);

        personCount /= 10;  // 90% of the people are tired now; only 10% stay
        System.out.println("Now there are " + personCount);  // (Why isn’t this a fraction?)

        // These += and -= operators and similar shortcuts also exist in Python. One that doesn’t
        // exist in Python, however, is the special shortcuts for adding exactly 1, also known
        // as “incrementing:”

        personCount = personCount + 1;
        personCount += 1;  // same thing
        ++personCount;     // same thing
        personCount++;     // same thing (almost; see bonus challenge in ASTs class activity)

        // (Python doesn’t have ++, but many other languages do, most notable the C programming
        // language. You may have heard of the programming language C++, and now yet get the nerdy
        // joke of that name: C++ is “like C, but more!”)

        // There is also a shortcut for subtracting one (“decrementing”):

        personCount = personCount - 1;
        personCount -= 1;  // same thing
        --personCount;     // same thing
        personCount--;     // same thing (almost; see bonus challenge in ASTs class activity)

        // Let's use one of those shortcuts to have a little head-exploding fun.


        System.out.println("────── Int Limits ──────");

        // What will this print? Think about it, then run it and see:

        int x = 1;
        System.out.println("x=" + x);
        x *= 100;
        System.out.println("x=" + x);
        x *= 100;
        System.out.println("x=" + x);
        x *= 100;
        System.out.println("x=" + x);
        
        // The pattern is obvious, right? Uncomment a few more repetitions and check the output:
        // (In VS Code, you can comment/uncomment many lines at once by selecting them, then
        // pressing command-slash (Mac) or ctrl-slash (Windows).)

        // x *= 100;
        // System.out.println("x=" + x);
        // x *= 100;
        // System.out.println("x=" + x);
        // x *= 100;
        // System.out.println("x=" + x);
        // x *= 100;
        // System.out.println("x=" + x);

        // wat?! (This is programmer slang for “what??” but with extra disbelief.)
        //
        // Here’s what’s going on:
        //
        // In Java, the type called `int` has a minimum value and maximum value. We can ask Java
        // to show those values to us:

        System.out.println("Minimum Java int: " + Integer.MIN_VALUE);
        System.out.println("Maximum Java int: " + Integer.MAX_VALUE);

        // When Java does arithmetic with integers, it does _modular arithmetic_: if a result goes
        // off one end of that range between min and max -- if it “overflows” -- then Java makes the
        // result “wrap around” to the other end of the range. (It works a lot like doing arithmetic
        // on a clock, where 10 + 3 = 1.) When you add 1 to the max int, it wraps around to the min
        // int, and vice versa when subtracting:

        System.out.println("Max int plus 1:   " + (Integer.MAX_VALUE + 1));
        System.out.println("Min int minus 1:  " + (Integer.MIN_VALUE - 1));

        // This raises several questions:
        //
        // 1. Why?!??
        // 2. Why these particular min and max numbers? Where did they come from??
        // 3. Doesn’t this cause weird bugs sometimes?
        // 4. Are all programming languages like this???
        //
        // Here are some short answers, if you’re curious:
        //
        // 1. Because of the way computer hardware works, it’s really, really fast that way. Fast as
        //    in billions of mathematical operations per second fast.
        //
        // 2. They come from the way computers represent numbers using powers of two. You’ll learn
        //    about it in detail if you take COMP 240.
        //
        // 3. Yes! In fact, there was a bug in Java itself caused by int overflow that went
        //    undetected for about a decade.
        //
        // 4. No. There are many other approaches. For example:
        //
        //    Python will just keep making more and more storage space for all the digits of an
        //    integer as needed. This is handy -- but Python is much, much slower at doing numeric
        //    computations as a result!
        //
        //    Swift can do limited-range high-performance int computation like Java, but overflows
        //    cause an error by default instead of wrapping around.
        //
        // You don’t need to keep track of all those details.
        //
        // For now, the big thing to keep in mind is this: 🚨🚨 Integer types in Java have a limited
        // range. Watch out for that. 🚨🚨


        System.out.println("────── Integers Big and Small ──────");

        // Because of this problem of limited range, Java offers us a little menu of integer types.
        // Up above, find this line:
        //
        //      int x = 1;
        // 
        // ...and change it to:
        //
        //      short x = 1;
        //
        // What is the output now?
        //
        // Try changing `short` to `byte`. Now what happens?
        //
        // Finally, try changing the type to `long`. What happens then? Does that mean that `long`
        // has no maximum, like Python integers? (How could you explore that question? How could you
        // find out for sure?)
        //
        // Here are the ranges of all those types:

        System.out.println("byte range: " + Byte.MIN_VALUE + "..." + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + "..." + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + "..." + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + "..." + Long.MAX_VALUE);
        
        // What happens if you try to stuff a bigger type inside a smaller one? Guess what this
        // code will do, then uncomment it and try it:

        // int thousand = 1000;
        // short thousandShort = thousand;

        // Study that error message (starts with “Type mismatch”). What exactly is Java saying?
        // (Now comment out those lines again.)
        //
        // Two questions:
        //
        // 1. Why is it useful for Java to say that?
        // 2. But what if we need to assign an int value to a short variable?
        //
        // The answer to question 1: Java doesn't want our code to surprise us; it wants us to stop
        // and _think_. What if the int value doesn't fit in a short? Is that OK? Should it be an
        // error? Should it wrap around?
        //
        // Java gives us a way to say, “Yes! I thought about it! Force it to happen!” It is called
        // _type casting_. “Casting” means “please force this value of one type to be a different
        // type, yes, I really mean that, please do it if you can.” The syntax is:
        //
        //    (SomeOtherType) someValue
        //
        // ...and that means “please take someValue and convert its type to SomeOtherType.”
        //
        // That solves our problem from above:

        int thousand = 1000;
        short thousandShort = (short) thousand;  // Here is the type cast
        System.out.println(thousandShort);

        // What happens if you do a type cast but the number is too big to fit in the new type, i.e.
        // it overflows? Run this code and see:

        System.out.println("A pretty big int: " + 123456789);
        System.out.println("...cast to short: " + (short) 123456789);
        System.out.println("...cast to byte:  " + (byte) 123456789);


        System.out.println("────── Beyond Integers ──────");

        // All these types -- byte, short, int, and long -- are called _primitive types_. Primitive
        // types have several features in common in Java:
        //
        // - They have a fixed range of values (and take a fixed amount of memory in the computer).
        // - You work with them using operators (+ - * / etc).
        // - They allow for very fast computation.
        //
        // There are two more numeric primitive types in Java: `float` and `double`. These are both
        // floating point numeric types. Remember that floating point means (1) fractions allowed,
        // and (2) all results are approximations. The difference between float and double is how
        // precise the approximations are. On a modern computer, most of the time you should just
        // use double. The main reasons to use float are (1) other existing code requires it, or
        // (2) you are storing a large quantity of numbers, and you are concerned about being
        // efficient with memory.
        //
        // There is a primitive type `char` that represents just one character of a string. In Java
        // (but not in every language), char literals use single quotes and string literals use
        // double quotes:

        char letter = 'a';
        String manyLetters = "abcxyz";

        // And there is one more primitive type, the one with the most limited range of all.


        System.out.println("────── Boolean ──────");

        // What does this print?

        System.out.println(1 < 2);
        System.out.println(1 > 2);

        // Both of those expressions -- `1 < 2` and `1 > 2` -- are boolean expressions. This means
        // that when Java evaluates them, it produces a value whose type is `boolean`. The two
        // (and only two!) possible boolean values are true and false.
        //
        // Here is the thing that’s a little surprising at first: true and false are values just
        // like 317 and "hello" are values. You can assign them to variables:

        boolean oneIsSmaller = 1 < 2;
        boolean oneIsBigger = 1 > 2;
        System.out.println(oneIsSmaller);  // What is the value of this variable?
        System.out.println(oneIsBigger);   // And this variable?

        // You can use the literal values true and false in code, just like you can use the literal
        // values -7 or 12:

        boolean doingTheReading = true;
        System.out.println("Are you doing the reading? " + doingTheReading);

        // You can even do arithmetic with them! With integers, doing arithmetic means operators
        // like + and -, but with boolean, it means these three operators:
        //
        //    x && y   AND: true if x and y are both true, otherwise false
        //    x || y   OR:  true if either x or y is true, otherwise false
        //    !x       NOT: true if x is false, false if x is true

        // Thus this works:
        
        int num = 37;
        if (num >= 10 && num < 100) {
            System.out.println("num has two digits");
        }

        // ...but so does this:
        
        boolean twoOrMoreDigits = num >= 10;
        boolean threeOrMoreDigits = num >= 100;
        if (twoOrMoreDigits && !threeOrMoreDigits) {  // Notice the ! operator on this line?
            System.out.println("num has two digits");
        }

        // (Take a moment to study those two snippets of code until you’re convinced that they are
        // equivalent to each other.)

        // Even == (the equality operator) just gives you a booolean, the same as < or >:

        boolean oneEqualsOne = 1 == 1;
        boolean oneEqualsTwo = 1 == 2;
        System.out.println(oneEqualsOne);
        System.out.println(oneEqualsTwo);

        // Why do we mention this? Sometimes, code using boolean just reads like English. Beginning
        // programmers can get away with understanding booleans like that for a long time.
        //
        // For example, this code:

        if (num >= 10 && num < 100) {
            //...
        }

        // ...looks a lot like an English phrase: “If num is greater than or equal to 10 and num is
        // less than 100, then....”
        //
        // However, code is not English, and sometimes thinking in English can mislead you. For
        // example, suppose we have this variable:

        boolean exactlyTwoDigits = twoOrMoreDigits && !threeOrMoreDigits;

        // Now suppose you want to use that variable as a condition in an if statement, so that some
        // code runs if exactlyTwoDigits is true. How would you do that?
        //
        // We often see then from Macalester students:
        
        if (exactlyTwoDigits == true) {  // ❌ Unnecessarily complicated
            System.out.println("It has two digits");
        }

        // Here’s the thing: an if statement expects the condition to be a boolean -- and the
        // variable `exactlyTwoDigits` already _is_ a boolean! You don’t have to do anything to it
        // to use it as the condition:

        if (exactlyTwoDigits) {  // ✅ That's the stuff!
            System.out.println("It has two digits");
        }

        // Try drawing the AST for `exactlyTwoDigits == true`. Think about why it will always be
        // the same as just `exactlyTwoDigits`. (Not convinced? Try evaluating it when
        // exactlyTwoDigits is true, and when exactlyTwoDigits is false.)


        System.out.println("────── Tricky Puzzles to Ponder ──────");

        // What will this print? Guess, then try it.
        //
        // System.out.println((1 == 2) == (3 == 4));
        //
        // Why? Try drawing the AST.

        // What will this print? Guess, then try it.
        // 
        // int n = 2;
        // System.out.println(1 < n < 3);
        // 
        // Why? Again, try drawing the AST, and now think about the types.

        // What do you think this will print? Guess, then try it.
        // 
        // System.out.println('a' + 1);
    }
}
