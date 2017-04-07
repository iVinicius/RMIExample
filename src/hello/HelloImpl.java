/**
 * 
 */
package hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author 14108849
 *
 */
public class HelloImpl extends UnicastRemoteObject implements HelloInterface{
	
	private static final long serialVersionUID = 955232196266437606L;

	private String message;
	
	protected HelloImpl(String msg) throws RemoteException {
		message = msg;
	}	

	@Override
	public String say(){
		return message;
	}
}