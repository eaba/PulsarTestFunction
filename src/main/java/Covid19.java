

public class Covid19
{
	private String DeviceId;
	public final String getDeviceId()
	{
		return DeviceId;
	}
	public final void setDeviceId(String value)
	{
		DeviceId = value;
	}
	private double Latitude;
	public final double getLatitude()
	{
		return Latitude;
	}
	public final void setLatitude(double value)
	{
		Latitude = value;
	}
	private double Longitude;
	public final double getLongitude()
	{
		return Longitude;
	}
	public final void setLongitude(double value)
	{
		Longitude = value;
	}
	private long Time;
	public final long getTime()
	{
		return Time;
	}
	public final void setTime(long value)
	{
		Time = value;
	}

	/** 
	 
	*/
	private long Active;
	public final long getActive()
	{
		return Active;
	}
	public final void setActive(long value)
	{
		Active = value;
	}
	private long Confirmed;
	public final long getConfirmed()
	{
		return Confirmed;
	}
	public final void setConfirmed(long value)
	{
		Confirmed = value;
	}
	private long Death;
	public final long getDeath()
	{
		return Death;
	}
	public final void setDeath(long value)
	{
		Death = value;
	}
	@SuppressWarnings("static-access")
	private Flag Flag = getFlag().values()[0];
	public final Flag getFlag()
	{
		return Flag;
	}
	public final void setFlag(Flag value)
	{
		Flag = value;
	}
}


