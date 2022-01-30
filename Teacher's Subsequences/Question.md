Siri got a sequence of n positive integers from his mathematics teacher an she wanted him to count consecutive subsequences whose sum is divisible by k. He reminind that the easiest way to count those are preparing a programme and keep it with him. So,he is asksking you to write a program to count them for him.

For

1 2 3 4 1

there exists,4 subsequences whose sum is divisible by 3, they are

3

1 2

1 2 3

2 3 4

For

1 2 1 2 1 2

there exists, 9 subsequences whose sum is divisible by 2, they are

2

2

2

1 2 1

1 2 1

1 2 1 2

2 1 2 1

1 2 1 2

2 1 2 1 2

Input Format

The first line contains T, the number of testcases. T testcases follow. Each testcase consists of 2 lines. The first line contains n and k separated by a single space. And the second line contains n space separated integers.

Constraints

https://s3.amazonaws.com/hr-assets/0/1629002171-1d24bda71c-Captureconstraintsrrr.PNG

Output Format

For each test case, output the number of consecutive subsequenences whose sum is divisible by k in a newline.

Sample Input 0

2
5 3
1 2 3 4 1
6 2
1 2 1 2 1 2
Sample Output 0

4
9