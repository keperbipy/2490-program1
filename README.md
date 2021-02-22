# 2490-program1
Simulating a DFA: Application 1 - Strings containing cbaa, bab, or cca
Due Date: Monday, February 15, 2021, 11:55pm
Write a program that recognizes strings over the alphabet {a,b,c} that contain any of the substrings cbaa, bab, or cca.
Your program is supposed to act like a finite state machine, so it is restricted to the following rules:

Read only one character at a time. Do not store the characters in an array or a string variable. Your program must keep track of what it has seen (and what it still needs to see in order to have a good substring) as it goes along because it can only read a character once. It will do this by changing states.
As soon as your program detects the newline character that marks the end of one string, it must write either "Accept" or "Reject" to the screen (depending on whether the string just read is or is not in the language), then skip a line, then print "Your string> " and start processing the next string.
If the user types a string that contains any character other than a or b or c, your program should answer "Reject" to that string.
If the user presses "Enter" without typing any letters, that entry is to be considered the empty string and so your program should respond with "Reject".
Your program will continue to process strings until the user breaks into the program by forcibly ending the infinite loop (typing & quot;Ctrl c" on student2), so your outermost loop can be an infinite loop.
You were given a handout in class on Friday that will help you design your program. Your program should follow this model.

Place your program on the student2 machine in a subdirectory 2490/program1. Make sure that your program runs on the student2 machine. Call your program Program1.java. I will type:

java Program1
at the keyboard, and the program needs to run as shown below. There is no test program, so you must make sure to debug your program by trying many different strings. Also, submit a copy of your program on ASULearn.
Sample run:

[aam@student2 ~] java Program1
Your string> bbbcbabb  
Accept

Your string>
Reject

Your string> cccbaaa 
Accept

Your string> cca 
Accept

Your string> acbacbacb 
Reject

Your string> ccbaa 
Accept

Your string> ^c
Your program should run on the student2 machine. If you use eclipse with a Windows operating system to test your program, you need to change your code slightly. See the information on the ASULearn website. Actually changing the while loop below in the run() method fixes the problem when working in eclipse, but remember to change the program back so it runs on the student2 machine. If you have never used the student2 machine, work on eclipse for now and then meet with your teacher or the teaching assistant (Willow Sapphire).
while (ch != '\r')
{
   state = STATE_TABLE[state][charToColumn(ch)];
   ch = (char) in.read();
}
in.readLine();
