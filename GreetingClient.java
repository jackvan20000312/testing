package a;

//File Name GreetingClient.java
import java.net.*;
import java.io.*;

public class GreetingClient
{
	public static void main(String args[])
	{
		try
		{
			Socket s = new Socket("localhost", 7777);
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String msg = dis.readLine();
			System.out.println("Server message is: "+ msg);
			dis.close();
			s.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}