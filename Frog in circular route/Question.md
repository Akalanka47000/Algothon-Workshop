There are n rocks in a circular path. The rocks are numbered from 1 - n. You will given the energy that the frog need to move from rock to rock (from i th to (i + 1) th rock) and how much energy it will gain when it comes to a rock. Initially the frog has no energy. You need to find whether the frog can complete this this circular jorney from rock to rock. If it can find, from which rock it should start the journey. If it cannot return -1. If there exists a solution, it is guaranteed to be unique.

Explanation energy need -> 3, 4, 5 energy gain -> 2, 8, 4

Frog need 3 energy points to move from 1 st to 2 nd rock. But at 1 st rock it only has 2 energy points. So, it cannot start from there
Frog need 4 energy points to move from 2 nd to 3 rd rock. At 2 nd rock it will get 8 energy points. Therefore it can move from 2nd to 3rd. At 3rd rock it will get another 4 energy points. Now it has 8 energy points. It need 5 energy points to move from 3rd to 1st rock. It can move to 1 st rock and there it will gain another 2 points. Now total points are 5. It need only 3 points to move from 1 st to 2nd. Thus, it can move to the starting position
Therefore the starting rock should be 2nd rock
Input Format

First Line -> Needed energy by comma separated (e1, e2, e3 ...) Second Line -> Energy points gained at each rock (p1, p2, p3, ...)

Constraints

1 <= num of rocks <= 10^4 If there exists a solution, it is guaranteed to be unique.

Output Format

Rock number or -1

Sample Input 0

3,4,3
2,3,4
Sample Output 0

-1