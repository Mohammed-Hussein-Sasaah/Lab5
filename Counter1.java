/*1. We want to add a button to the tally counter in Section 3.1 that allows an operator
 to undo an accidental button click. Provide a method public void undo() that
 simulates such a button. As an added precaution, make sure that clicking the undo
  button more often than the click button has no effect. (Hint: The call Math.max(n, 0)
  returns n if n is greater than zero, zero otherwise.)*/

public class Counter1 {
    private int value;
    int n = 0;

    public void undo()                     /
    {
        n++;
        if( n < value )
        {
            buttonclick();
        }
    }
    public int getValue()
    {
        return value;
    }
    public void buttonclick()
    {
        value = value + 1;
    }
    public void reset()
    {
        value = 0;
    }




}