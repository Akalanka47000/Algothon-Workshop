A task was assigned to Charles to print all the combinations for a given string S. If 2 strings were given to him with the same set of characters, he needs to print the smallest arrangement of the 2 strings in the lexicographic order.

https://s3.amazonaws.com/hr-assets/0/1628296917-5d7edc1fbb-c1.PNG

From all the strings' given above, the smallest string lexicographically is 'abc'.

Given that each character in the string s is unique, you need to print the entire list of Charle's in lexicographic order.

For the string abc, the list arranged lexicographically is :

https://s3.amazonaws.com/hr-assets/0/1628297235-251991e26a-c2.PNG

Input Format

The first line contains the number of T test cases.

Each test case contains 2 lines.

1. integer N - length of the string
2. string s
Constraints

0< T< 50

1< N< 16

string S contains only small alphabets(a-z)
Output Format

For each test case given, print all the list of combinations of string s, with each combination of letters in a new line.

Sample Input 0

1
5
abcde
Sample Output 0

a
ab
abc
abcd
abcde
abce
abd
abde
abe
ac
acd
acde
ace
ad
ade
ae
b
bc
bcd
bcde
bce
bd
bde
be
c
cd
cde
ce
d
de
e