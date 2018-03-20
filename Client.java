import java.io.*;
import java.net.*;
public class Client
{
Socket socket = null;
public Client()
{
try
{
socket = new Socket("localhost",4444);
new ClientThread(socket);
}
catch(UnknownHostException exp)
{
exp.printStackTrace();
}
catch(IOException exp)
{
exp.printStackTrace();
}
}
public static void main(String[] args)
{
new Client();
}
}
