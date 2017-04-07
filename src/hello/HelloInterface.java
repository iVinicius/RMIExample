/**
 * 
 */
package hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author 14108849
 *
 */
public interface HelloInterface extends Remote{
	public String say() throws RemoteException;

}
