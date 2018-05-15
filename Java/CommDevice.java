public interface CommDevice
{
	public void transmit   (String destination, String message);
	public boolean receive (String source, String message);
}