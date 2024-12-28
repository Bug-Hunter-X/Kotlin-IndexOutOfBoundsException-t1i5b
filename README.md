# Kotlin IndexOutOfBoundsException Bug
This repository demonstrates a common Kotlin bug: an `IndexOutOfBoundsException`. The bug occurs when trying to access an element in a list using an index that is out of bounds.

## Bug Description
The `main` function in `bug.kt` creates a list of numbers and doubles each element using the `map` function.  It then attempts to access an element at index 10, which is beyond the list's size, resulting in an `IndexOutOfBoundsException`.

## Solution
The `bugSolution.kt` file shows a possible solution. Before accessing the element, it checks if the index is within the bounds of the list using the `in` operator.  If not, it handles the error gracefully (in this case, by printing a message).

## How to Reproduce
1. Clone this repository.
2. Compile and run `bug.kt`. Observe the `IndexOutOfBoundsException`.
3. Run `bugSolution.kt`. Observe how the error is handled. 
