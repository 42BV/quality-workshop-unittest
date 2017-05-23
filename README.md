# Quality workshop: writing and maintaining unittests
This branch contains the solution of the unittest exercises

## Bug 1
 
- The max length check was executed on the given raw accountNumber; this check should be done after the stripping of non-digits.

## Bug 2

- See implementations of the 4 failure path test methods in ElevenCheckTest.java.
- The ElevenCheck util always returns true... No 11-check done at all! That shows us the importance of testing success and failure paths!
  
## Bug 3
  
- One remaining pretty nasty bug: the position in the accountNumber 11-check sum calculation starts at 1, not 0!