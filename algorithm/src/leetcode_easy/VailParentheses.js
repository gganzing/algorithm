/* 유효한 괄호인지 판단하기
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 */

var isValid = function(s) {
    
    if(s.length % 2 != 0) {
        return false;
    }
    
    var arr = [];

    for(var i=0; i<s.length; i++){
        arr.push(s.charAt(i));
    }

    var parentheses = { "]":"[",  "}":"{",  ")":"(", "[":"]", "{":"}", "(":")" };

    var temp = [];

    var a = arr.pop();
    for(var j=arr.length-1; j>= 0; j--){
       
       var b = arr.pop();
       var p =  parentheses[a];
       if(b !== p){
           temp.push(a);
           a = b;

       }else{
           arr.push(temp.pop());
           a = arr.pop();
       }
    }

    if(temp.length === 0){
        return true;
        
    }else{
        return false;
    }
	
};

console.log(isValid("[{]}"))