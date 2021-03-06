
package proxies.ext.idgen;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-21T00:05:09.069+02:00
 * Generated source version: 2.5.1
 * 
 */
public final class AnonymousIdentifier_AnonymousIdentifierPort_Client {

    private static final QName SERVICE_NAME = new QName("http://external/", "IdentifierGeneratorService");

    private AnonymousIdentifier_AnonymousIdentifierPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IdentifierGeneratorService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IdentifierGeneratorService ss = new IdentifierGeneratorService(wsdlURL, SERVICE_NAME);
        AnonymousIdentifier port = ss.getAnonymousIdentifierPort();  
        
        {
        System.out.println("Invoking build...");
        java.lang.String _build__return = port.build();
        System.out.println("build.result=" + _build__return);


        }

        System.exit(0);
    }

}
