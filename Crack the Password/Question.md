There are N users registered on a website CuteKittens.com. Each of them have a unique password represented by pass[1], pass[2], ..., pass[N]. As this a very lovely site, many people want to access those awesomely cute pics of the kittens. But the adamant admin doesn't want this site to be available for general public. So only those people who have passwords can access it. Yu being an awesome hacker finds a loophole in their password verification system. A string which is concatenation of one or more passwords, in any order, is also accepted by the password verification system. Any password can appear 0 or more times in that string. He has access to each of the N passwords, and also have a string loginAttempt, determine whether this string be accepted by the password verification system of the website. If all of the string can be created by concatenating password strings, it is accepted. In this case, return the passwords in the order they must be concatenated, each separated by a single space on one line. If the password attempt will not be accepted, return 'WRONG PWASSWORD'.

Examples

passwords = ['abra','ka','dabra'] loginAttempt = 'abrakadabra'

Concatenate the passwords in index order 0,1,2 to match 'abrakadabra'. Return 'abra ka dabra'.

passwords = ['abra','ka','dabra'] loginAttempt = 'kaabra'

Concatenate the passwords in index order 1,0 to match 'kaabra'. Return 'ka abra'.

passwords = ['ab','ba'] loginAttempt = 'aba'

Concatenate the passwords in index order 0,1 to match 'abba'. 1,0 to match 'baab'. 0,0 to match 'abab' or 1,1 to match 'baba'.No combination of 1 or more passwords can be concatenated to match 'aba'. Return 'WRONG PASSWORD'.

Function Description

Complete the passwordCracker function in the editor below.

passwordCracker has the following parameters: - string passwords[n]: a list of password strings - string loginAttempt: the string to attempt to create

Returns

string: Return the passwords as a single string in the order required for the password to be accepted, each separated by a space. If it is not possible to form the string, return the string WRONG PASSWORD.
Input Format

The first line contains an integer t, the total number of test cases.

Each of the next sets of three lines is as follows: - The first line of each test case contains n, the number of users with passwords. - The second line contains n space-separated strings, passwords[i], that represent the passwords of each user. - The third line contains a string, loginAttempt, which Yu must test for acceptance.

Constraints

https://s3.amazonaws.com/hr-assets/0/1626447205-94895d1537-Screenshot2021-07-16202208.jpg

Output Format

string: Return the passwords as a single string in the order required for the password to be accepted, each separated by a space. If it is not possible to form the string, return the string WRONG PASSWORD.