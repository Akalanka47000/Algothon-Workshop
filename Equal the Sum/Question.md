There is an array of integers and a total sum is given, decide the total sum closest to but not exceeding the total sum that can be created. To create the total sum, we can use any element of your array zero or more times. For example, if array = [1, 2, 3] and your target total sum is 5, you might select [1, 1, 1, 1, 1], [2, 3] or [2, 2, 1] In this examples, you can astimate at exactly the total sum.

Input Format

The first line contains an integer f, the number of test cases.

Each of the next f pairs of lines are as follows: - The first line contains two integers a and k, the length of array and the total sum. - The second line contains space separated integers array[i].

Constraints

1 <= t <= 10 1 <= a, b, array[i]<= 2000

Output Format

Print the maximum sum for each test case which is as near as possible, but not exceeding, to the target sum on a separate line.

Sample Input 0

2
3 12
1 6 9
5 9
3 4 4 4 8
Sample Output 0

12
9