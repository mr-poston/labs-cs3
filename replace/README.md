# Problem 2: Replace It

## tl;dr
This lab was designed to teach you more about Java's `ListIterator` class.

## Getting Started
Read in a list of words and a word to remove from the list. Remove all occurrences of the word from the list. **You must use an `Iterator`**.

Here's how to download this problem's "distribution code" (i.e., starter code) into your own CS50 IDE. Log into CS50 IDE and then, in a terminal window, execute each of the following:

1. Execute `cd` to ensure that you're in `~/` (i.e., your home directory).
1. Execute `cd unit01` to change into (i.e., open) that directory.
1. Execute `wget https://raw.githubusercontent.com/mr-poston/labs-cs3/2021/replace/replace.zip` to download a (compressed) ZIP file with this problem's distribution.
1. Execute `unzip replace.zip` to uncompress that file.
1. Execute `rm replace.zip` followed by `ye`s or `y` to delete that ZIP file.
1. Execute `ls`. You should see a directory called `replace`, which was inside that ZIP file.
1. Execute `cd replace` to change to that directory.
1. Execute `ls`. You should see this problem's distribution code, including `Grader.java`, `IteratorReplacer.java`, and `IteratorReplacerRunner.java`.
1. To open a file for editing, use the `open` command or double click the file name in the lefthand file browser.

## Sample Data and Output
Sample Data | Sample Output
----------- | -------------
`a b c a b c     a     +` | `[+, b, c, +, b, c]`
`a b c d e f g h i j x x x x     x     7` | `[a, b, c, d, e, f, g, h, i, j, 7, 7, 7, 7]`
`1 2 3 4 5 6 a b c a b c     b     #` | `[1, 2, 3, 4, 5, 6, a, #, c, a, #, c]`

## Compiling and Running Java code in CS50 IDE
### Compiling
In order to compile a java source code file, such as `IteratorReplacer.java`, execute the following:

```
javac IteratorReplacer.java
```

...or you can compile all of the java source code files in a directory by executing the following instead:

```
javac *.java
```

### Running
In order to run a java source code file that contains a `main()` method (after it has been compiled, of course!), such as `IteratorReplacerRunner.java`, execute the following:

```
java IteratorReplacerRunner
```

## Testing
To check the correctness of your program with check50, you may execute the following:

```
check50 mr-poston/labs-cs3/2021/replace/admin
```

## How to Submit
### Step 1 of 3
Head to the [CS50 IDE](https://ide.cs50.io/) and ensure that `IteratorReplacer.java`, `IteratorReplacer.class`, `IteratorReplacerRunner.java`, `IteratorReplacerRunner.class`, `Grader.java`, and `Grader.class` are in `~/unit01/replace`, as with: 

```
cd ~/unit01/replace
ls
```

If any of the files listed above are not in `~/unit01/replace`, move it into that directory, as via `mv` (or via CS50 IDE’s lefthand file browser). 

### Step 2 of 3
Visit [submit.cs50.io](https://submit.cs50.io/), and login with your GitHub credentials. Then, head over to the email account you used to sign up for GitHub and accept the invitation link. 

### Step 3 of 3
Then, head back to the [CS50 IDE](https://ide.cs50.io/) to submit Replace It, as with:

```
cd ~/unit01/replace
submit50 mr-poston/labs-cs3/2021/replace/admin
```

inputting your GitHub username and GitHub password as prompted.
If you run into any trouble, email me at [john.poston@risd.org](mailto:john.poston@risd.org).
You may resubmit any problem as many times as you’d like before the deadline.
Your submission should be graded for correctness within 2 minutes, at which point your score will appear at [submit.cs50.io](https://submit.cs50.io/)!

{% spoiler "Hints" %}

Use an `ArrayList` to store the list.
Use `split()` to split the `String` into a `String[]` array.

```
String[] words = "abc def ghi jkl".split(" ");
ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
```

You can use `list.toString()` to print out the `ArrayList` in one line.

{% endspoiler %}

## This was Replace It.
