# quality-workshop-unittest
Contains exercises on maintaining unittests

These workshop assignments are meant to give an insight into writing unittest that will help the developer write software that actually works.  
Working on the exercises will help you:
- Understand that meaningful test-method names will help developers understand what is tested.
- Learn that tests without assertions only contribute to code-coverage but do not test anything.
- Experience that testing failure paths and not only success paths is crucial for a helpful unittest.   

For these first assignments we have chosen to test an implementation of the pre-iban dutch accountnumber check: 11-proef.  
The ElfProef.java utility is written on the 11-proef requirements found at [wikipedia](https://nl.wikipedia.org/wiki/Elfproef).
There are 3 bugs in the util that have to be fixed. We are going to do that step by step.

## Assignment 1
 
- Start with running the unittest that belongs to the ElfProef util: ElfProefTest.java. You will notice that 2 tests fail.
- Try to fix these 2 tests by fixing the first bug in ElfProef.java.
  - Hint: an exception is thrown by the ElfProef util, but that should not have happened... we are testing a success path here!

## Assignment 2

- So everything is fine here, we fixed all unittests! But wait... let's look at the test methods in ElfProefTest.java that test failure paths in the code...
- Ok all 4 test methods that should test a failure path (..._shouldFail_...-methods) are testing... nothing! Implement all 4. 
  - Hint: org.junit.Assert.assertFalse(..) at your service).
- Now run the complete ElfProefTest again; all newly implemented failure path tests are... failing!! Fix the bug in ElfProef that causes this!
  - Hint: for this step, only concentrate on these 4 test methods to pass.
- Ok, you fixed the 4 failing tests, great! But now some success test are failing... Fix the last bug in the code!
  - Hint: one- or zero based, that's the question...
  