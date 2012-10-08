package ee.itcollege.i377.praktikum1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		File file = new File("C:\\Projects\\Java praks\\workspace\\Praktikum1\\WebContent\\praktikum2\\coffee.jpg");
		
		//Set image size
		int imageSize = (int)file.length();
		resp.setContentLength(imageSize);
		
		//Set content type
		resp.setContentType("image/jpeg");
		
		// Open the file and output streams
	    FileInputStream in = new FileInputStream(file);
	    OutputStream out = resp.getOutputStream();

	    // Copy the contents of the file to the output stream
	    byte[] buf = new byte[1024];
	    int count = 0;
	    while ((count = in.read(buf)) >= 0) {
	        out.write(buf, 0, count);
	    }
	    in.close();
	    out.close();
	}
	

}
