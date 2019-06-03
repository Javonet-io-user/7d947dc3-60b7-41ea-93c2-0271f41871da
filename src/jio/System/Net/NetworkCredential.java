package jio.System.Net;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Net.*;
import jio.System.Security.*;

public class NetworkCredential implements ICredentials, ICredentialsByHost {
  protected NObject javonetHandle;

  public NetworkCredential() {
    try {
      javonetHandle = Javonet.New("System.Net.NetworkCredential");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetworkCredential(java.lang.String userName, java.lang.String password) {
    try {
      javonetHandle = Javonet.New("System.Net.NetworkCredential", userName, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetworkCredential(java.lang.String userName, SecureString password) {
    try {
      javonetHandle = Javonet.New("System.Net.NetworkCredential", userName, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetworkCredential(
      java.lang.String userName, java.lang.String password, java.lang.String domain) {
    try {
      javonetHandle = Javonet.New("System.Net.NetworkCredential", userName, password, domain);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetworkCredential(
      java.lang.String userName, SecureString password, java.lang.String domain) {
    try {
      javonetHandle = Javonet.New("System.Net.NetworkCredential", userName, password, domain);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NetworkCredential(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
