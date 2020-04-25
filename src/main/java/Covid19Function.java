
import org.apache.pulsar.functions.api.Context;
import org.apache.pulsar.functions.api.Function;
public class Covid19Function implements Function<Covid19Mobile, Covid19>
{
	public Covid19 process(Covid19Mobile input, Context context) throws Exception {
		Covid19 vid = new Covid19();
		vid.setDeviceId(input.getDeviceId());
		vid.setLatitude(input.getLatitude());
		vid.setLongitude(input.getTime());
		//sim. AI
		if(input.getLatitude() > 20)
		{
			vid.setFlag(Flag.Green);
		}
		else if(input.getLongitude() > 20)
		{
			vid.setFlag(Flag.Yellow);
		}
		else if((input.getLongitude() > 0 && input.getLongitude() < 2) && (input.getLatitude() > 0 && input.getLatitude() < 2))
		{
			vid.setFlag(Flag.Green);
		}
		else
			vid.setFlag(Flag.White);
		//am lazy
		vid.setConfirmed(10000);
		vid.setActive(5000);
		vid.setDeath(1500);
        return vid;
    }
}
