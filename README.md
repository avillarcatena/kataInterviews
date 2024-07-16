
# BancoPichincha

### Your task
Write a program that prints one line for each number from 1 to 100
Usually just print the number itself.
For multiples of three print Banco instead of the number
For the multiples of five print Pichincha instead of the number
For numbers which are multiples of both three and five print BancoPichincha instead of the number
 
Sample output:
 
- 1
- 2
- Banco
- 4
- Buzz
- Pichincha
- 7
- 8
- Banco
- Pichincha
- 11
- Banco
- 13
- 14
- BancoPichincha
- 16
- 17
- Banco
- 19
- Pichincha
- ... etc up to 100


# StringCalculator
## Create a simple String calculator with a method signature:

- int Add(string numbers)

- The method can take up to two numbers, separated by commas, and will return their sum. 
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0) 
Hints:
  - Start with the simplest test case of an empty string and move to one and two numbers
  - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
  - Remember to refactor after each passing test
- Allow the Add method to handle an unknown amount of numbers
- Allow the Add method to handle new lines between numbers (instead of commas).
  - the following input is ok: “1\n2,3” (will equal 6)
  - the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
 
- Support different delimiters
  - to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
  the first line is optional. all existing scenarios should still be supported

- Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. 
  if there are multiple negatives, show all of them in the exception message.

- STOP HERE if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.

- Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2

- Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6

- Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.

- make sure you can also handle multiple delimiters with length longer than one char
