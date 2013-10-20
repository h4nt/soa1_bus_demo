
package proxies.ext.taxComputer;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-21T00:05:22.055+02:00
 * Generated source version: 2.5.1
 * 
 */
public final class TaxComputer_TaxComputerPort_Client {

    private static final QName SERVICE_NAME = new QName("http://external/", "TaxComputerService");

    private TaxComputer_TaxComputerPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TaxComputerService.WSDL_LOCATION;
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
      
        TaxComputerService ss = new TaxComputerService(wsdlURL, SERVICE_NAME);
        TaxComputer port = ss.getTaxComputerPort();  
        
        {
        System.out.println("Invoking simple...");
        proxies.ext.taxComputer.SimpleTaxRequest _simple_simpleTaxInfo = null;
        proxies.ext.taxComputer.TaxComputation _simple__return = port.simple(_simple_simpleTaxInfo);
        System.out.println("simple.result=" + _simple__return);


        }
        {
        System.out.println("Invoking complex...");
        proxies.ext.taxComputer.AdvancedTaxRequest _complex_complexTaxInfo = null;
        proxies.ext.taxComputer.TaxComputation _complex__return = port.complex(_complex_complexTaxInfo);
        System.out.println("complex.result=" + _complex__return);


        }

        System.exit(0);
    }

}
