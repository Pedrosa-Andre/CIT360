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
     * URI/URL's as the addresses the HTTP would be the protocol the mailman 
     * have to follow when transferring things. This transfer (or communication)
     * happens between a client and a server where the client asks something 
     * through an HTTP request, then the server read the request, execute it and
     * return a response message with either completion states or requested 
     * content. The protocol does not just help the mailman to know how to 
     * transfer, but what to respond in case of failure (The HTTP, for example, 
     * has its own status codes like 404 for pages not found, or 500 for 
     * internal server errors, etc.).
     */
    
    
    // I have created this method to read JSON files stored in the web, but it 
    // works for reading any file that can be converted to text, like .css .txt 
    // and even the HTML pages are successfully read as .html,  although it gets
    // glitchy when trying to read any other types of files (which makes sense; 
    // its like when you change an image file extension to .txt and open it).
    
    // To be honest I based my code in this example: 
    // https://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
    // but I rewrote the parts I used here testing "what ifs" for different 
    // changes and studied about each part until I understood them and could 
    // write a simpler example that fitted my needs.
    
    public void getURLdata(String urlString) throws Exception{
        
        //Create URL object using the given string.
        URL url = new URL(urlString);
        
        //Establishes a connection with the URL.
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        //Use the GET method to get the data from the connection.
        con.setRequestMethod("GET");
        
        //Use a try-catch to catch any possible error (like invalid URL etc)
        try (InputStream in = con.getInputStream();){
            
            // Create a BufferedReader to read the data we got from the conection.
            BufferedReader tess = new BufferedReader(new InputStreamReader(in));

            // Use a loop to read and print the data (line by line).
            String data = tess.readLine();
            while (data != null) {
                System.out.println(data);
                data = tess.readLine();
            }

        }catch (Exception e){
            //print the error type if something went wrong
            System.out.println("Error: " + e);

        }
                
    }
}
