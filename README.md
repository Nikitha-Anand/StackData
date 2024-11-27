# StackData

A 1D array StackData is used to store the stack globally. The global variable StackPointer points to the next available space in the stack and is initialised to 0.

# Functions

- Push() : Takes an integer parameter and returns FALSE if the stack is full, else it puts the parameter value on the stack, updates the relevant pointer and returns TRUE
- Pop() : returns -1 if the stack is empty, else it returns the element at the top of the stack and updates relevant pointer
