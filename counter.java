/*2. Simulate a tally counter that can be used to admit a limited number of people. First,
the limit is set with a call public void setLimit(int maximum) If the click button is
clicked more often than the limit, it has no effect. (Hint: The call Math.min(n, limit)
returns n if n is less than limit, and limit otherwise.)*/


public class counter {
    private int value;
    int Limit;

    void setLimit(int maximum) {Limit=maximum;}


    public void click()
    {
        value=value + 1;
        if(value > Limit)
        value--;
    }

    public int getValue() {return value;}

    public void reset() {value = 0;}

}