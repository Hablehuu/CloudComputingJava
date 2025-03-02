package myDBoxClientMediator;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet("/FileUploadServlet")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		System.out.println("in file upload");	
        // Get the uploaded file
        Part filePart = request.getPart("fileInput");

        // Get the filename
        String fileName = filePart.getSubmittedFileName();

        // Get the input stream from the file part
        InputStream fileContent = filePart.getInputStream();
        
        byte[] data = new byte[1024];
        

        String access_token = request.getParameter("accessToken").toString();
		
        String content = "{\"path\": \"/MyDBoxClient_App01_files/images/"+fileName+"\",\"mode\": \"add\",\"autorename\": true,\"mute\": false,\"strict_conflict\": false}";
        URL url=new URL("https://content.dropboxapi.com/2/files/upload");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
        	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int bytesRead;
            while ((bytesRead = fileContent.read(data)) != -1) {
                byteArrayOutputStream.write(data, 0, bytesRead);
            }
        	data = byteArrayOutputStream.toByteArray();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer "+access_token);
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            connection.setRequestProperty("Dropbox-API-Arg", "" + content);
            connection.setRequestProperty("Content-Length", String.valueOf(data.length));
            
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(data);
            outputStream.flush();
            
            
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    		String inputLine;
    		StringBuffer dboxresponse = new StringBuffer();

    		while ((inputLine = in.readLine()) != null) {
    			dboxresponse.append(inputLine);
    		}
    		in.close();

    		//print result
    		System.out.println(dboxresponse.toString());
    		String queryResult=dboxresponse.toString();        
    		response.getWriter().write(queryResult);
 
        } finally {
            connection.disconnect();
        }
        
        
        
    }
}
