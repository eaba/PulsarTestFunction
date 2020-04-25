public enum Flag
{
	Red, // Avoid this area
	Green, //Area Recovered from the virus
	Yellow, // Be cautious in this area
	White; // no covid case, caution not to be an index case

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Flag forValue(int value)
	{
		return values()[value];
	}
}