# Functions (Pass by Reference and Value)

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Things to Know in C++/Java/Python or any language | **Difficulty:** Easy

## Approach
In Java, primitive data types are always passed by value, meaning a copy of the variable is passed to the method and changes made inside the method do not affect the original variable. Objects and arrays are passed by reference value, meaning the reference (memory address) is copied, so changes made to the object's fields or array elements inside the method are reflected in the caller, but reassigning the reference itself inside the method does not affect the original reference. This solution demonstrates both behaviors with simple methods: one that attempts to modify a primitive int, one that modifies the contents of an array, and one that modifies a field of an object versus reassigning the object reference.

## Complexity
- Time: O(1)
- Space: O(1)
