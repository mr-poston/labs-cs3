# Problem 1: Remove It

## tl;dr
This lab was designed to teach you more about Java's `Iterator` class.

## Getting Started
Read in a list of words and a word to remove from the list. Remove all occurrences of the word from the list. **You must use an `Iterator`**.

Here's how to download this problem's "distribution code" (i.e., starter code) into your own CS50 IDE. Log into CS50 IDE and then, in a terminal window, execute each of the following:

1. Execute `cd` to ensure that you're in `~/` (i.e., your home directory).
1. Execute `cd unit01` to change into (i.e., open) that directory.
1. Execute `wget https://raw.githubusercontent.com/mr-poston/labs-cs3/2021/remove/remove.zip` to download a (compressed) ZIP file with this problem's distribution.
1. Execute `unzip remove.zip` to uncompress that file.
1. Execute `rm remove.zip` followed by `yes` or `y` to delete that ZIP file.
1. Execute `ls`. You should see a directory called `remove`, which was inside that ZIP file.
1. Execute `cd remove` to change to that directory.
1. Execute `ls`. You should see this problem's distribution code, including `Grader.java`, `IteratorRemover.java`, and `IteratorRemoverRunner.java`.
1. To open a file for editing, use the `open` command or double click the file name in the lefthand file browser.

## Sample Data and Output
<table>
  <tr>
    <th>Sample Data</th>
    <th>Sample Output</th>
  </tr>
  <tr>
    <td><code>a b c a b c &emsp; a</code></td>
    <td><code>[b, c, b, c]</code></td>
  </tr>
  <tr>
    <td><code>a b c d e f g h i j x x x x &emsp; x</code></td>
    <td><code>[a, b, c, d, e, f, g, h, i, j]</code></td>
  </tr>
  <tr>
    <td><code>1 2 3 4 5 6 a b c a b c &emsp;</code></td>
    <td><code>[1, 2, 3, 4, 5, 6, a, c, a, c]</code></td>
  </tr>
</table>
    

## Compiling and Running Java code in CS50 IDE
### Compiling
In order to compile a java source code file, such as `IteratorRemover.java`, execute the following:

```
javac IteratorRemover.java
```

...or you can compile all of the java source code files in a directory by executing the following instead:

```
javac *.java
```

### Running
In order to run a java source code file that contains a `main()` method (after it has been compiled, of course!), such as `IteratorRemoverRunner.java`, execute the following:

```
java IteratorRemoverRunner
```

## Testing
To check the correctness of your program with check50, you may execute the following:

```
check50 mr-poston/labs-cs3/2021/remove
```

## How to Submit
### Step 1 of 3
Head to the [CS50 IDE](https://ide.cs50.io/) and ensure that `IteratorRemover.java`, `IteratorRemover.class`, `IteratorRemoverRunner.java`, `IteratorRemoverRunner.class`, `Grader.java`, and `Grader.class` are in `~/unit01/remove`, as with: 

```
cd ~/unit01/remove
ls
```

If any of the files listed above are not in `~/unit01/remove`, move it into that directory, as via `mv` (or via CS50 IDE’s lefthand file browser). 

### Step 2 of 3
Visit [submit.cs50.io](https://submit.cs50.io/), and login with your GitHub credentials. Then, head over to the email account you used to sign up for GitHub and accept the invitation link. 

### Step 3 of 3
Then, head back to the [CS50 IDE](https://ide.cs50.io/) to submit Replace It, as with:

```
cd ~/unit01/remove
submit50 mr-poston/labs-cs3/2021/remove
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

## This was Remove It.
