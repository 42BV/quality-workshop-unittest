# Quality workshop: writing and maintaining unittests
Contains exercises on writing and maintaining unittests

These workshop assignments are meant to give an insight into writing unittests that will help the developer write software that actually works.  
Working on the exercises will help you:
- Understand that meaningful test-method names will help developers understand what is tested.
- Learn that tests without assertions only contribute to code-coverage but do not test anything.
- Experience that testing failure paths and not only success paths is crucial for a helpful unittest.   

For the assignments we have chosen to test an implementation of the pre-iban dutch accountnumber check: 11-check.  
The ElevenCheck.java utility is written on the 11-check requirements found at [wikipedia](https://nl.wikipedia.org/wiki/Elfproef).
There are 3 bugs in the util that have to be fixed. We are going to do that step by step.

## Bug 1
 
- Start with running the unittest that belongs to the ElevenCheck util: ElevenCheckTest.java. You will notice that 2 tests fail.
- Try to fix these 2 tests by fixing the first bug in ElevenCheck.java.
  - Hint: an exception is thrown by the ElevenCheck util, why?

## Bug 2

- So everything is fine, we fixed all unittests! But wait... let's look at the test methods in ElevenCheckTest.java that test failure paths in the code...
- Ok all 4 test methods that should test a failure path (..._shouldFail_...-methods) are testing nothing! Implement all 4. 
  - Hint: org.junit.Assert.assertFalse(..) at your service.
- Now run the complete ElevenCheckTest again; all newly implemented failure path tests are... failing!! Fix the bug in ElevenCheck that causes this!
  - Hint: for this step, only concentrate on these 4 test methods to pass.
  
## Bug 3
  
- Ok, you fixed the 4 failing tests, great! But now some success test are failing... Fix the last bug in the code!
  - Hint: where to start counting?
  