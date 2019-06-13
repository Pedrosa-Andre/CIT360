/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicHTTP;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;
import java.io.*;

/**
 *
 * @author Andre Matheus
 */
public class HTTPClass {
    
    /**
     * HTTP stands for Hypertext Transfer Protocol. It's a protocol that rules 
     * how hypertexts (texts with hyperlinks) will be transeferred through the 
     * world-wide-web.
     * Comparatively, if we imagine the pages as real locations and the 
     * URI/URL's as the addresses the HTTP would be the protocol the mailmen 
     * have to follow when transferring things. This transfer (or communication)
     * happens between a client and a server where the client asks something 
     * through an HTTP request, then the server read the request, execute it and
     * return a response message with either completion states or requested 
     * content. The protocol does not just help the mailmen to know how to 
     * transfer, but what to respond in case of failure (The HTTP, for example, 
     * has its own status codes like 404 for pages not found, or 500 for 
     * internal server errors, etc.).
     * @throws java.lang.Exception
     */
    
    public HttpURLConnection start() throws Exception{
        //Create URL object
        URL url = new URL("https://pedrosa-andre.github.io/assignments/lesson-10/scripts/cities.json");
        //Stabilishes connection with it.
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        //Use the GET method to get the data from the connection.
        con.setRequestMethod("GET");
        return con;
    }
    
    public void test() throws Exception{
        HttpURLConnection con = start();
        
        BufferedReader tess = new BufferedReader(new InputStreamReader(con.getInputStream()));
        InputStream re = con.getInputStream();
        System.out.println(re);
        
        

        String data = tess.readLine();
            while (data != null) {
                   System.out.println(data);

                          data = tess.readLine();

            }
        re.close();
        tess.close();
        
        
        
        
        
        
        
        


        //print result
//        System.out.println(response.toString());
    }
    
    String url2 = "https://pedrosa-andre.github.io/assignments/lesson-10/scripts/cities.json";
    
    
}
