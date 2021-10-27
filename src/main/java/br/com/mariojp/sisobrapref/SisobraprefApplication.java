package br.com.mariojp.sisobrapref;

import br.com.mariojp.sisobrapref.clientws.wsdl.RecepcaoDSMResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@SpringBootApplication
public class SisobraprefApplication {

    public static void main(String[] args) {
        SpringApplication.run(SisobraprefApplication.class, args);
    }


    @Bean
    CommandLineRunner lookup(SisobraClient sisobraClient) {
        return args -> {

            TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }
                        @Override
                        public void checkClientTrusted(X509Certificate[] arg0, String arg1)
                                throws CertificateException {}

                        @Override
                        public void checkServerTrusted(X509Certificate[] arg0, String arg1)
                                throws CertificateException {}
                    }
            };

            SSLContext sc=null;
            try {
                sc = SSLContext.getInstance("SSL");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            try {
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
            } catch (KeyManagementException e) {
                e.printStackTrace();
            }
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            // Create all-trusting host name verifier
            HostnameVerifier validHosts = new HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }
            };
            // All hosts will be valid
            HttpsURLConnection.setDefaultHostnameVerifier(validHosts);
            String country = "Spain";

            if (args.length > 0) {
                country = args[0];
            }
//            RecepcaoDSMResponse response = sisobraClient.getCountry("");
            RecepcaoDSMResponse response = sisobraClient.getRecepcaoResponse();

            System.err.println(response.getXmlResultado().toString());
        };
    }

}
