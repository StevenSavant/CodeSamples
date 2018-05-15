import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ThreadDriver {
	private static int NUM_PRINT = 2;
	private static int NUM_THREADS = 2;

	public static void main(String args[]) {
		setProperties();
		for (int i = 1; i <= NUM_THREADS; i++) {
			(new Thread(new PrintSym(NUM_PRINT, i))).start();
		}
	}

	private static void setProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("resource/config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and set values
			NUM_THREADS = Integer.parseInt(prop.getProperty("numThreads"));
			NUM_PRINT = Integer.parseInt(prop.getProperty("numPrints"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}