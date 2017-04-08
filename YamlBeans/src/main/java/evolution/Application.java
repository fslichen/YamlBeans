package evolution;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

import evolution.dto.AnyDto;
import evolution.util.Sys;

public class Application {
	public static void write(Object object, String filePath, boolean overwrite) {
		File file = new File(filePath);
		if (file.exists()) {
			if (overwrite == false) {
				Sys.println("The file " + filePath + " already exists. In order to overwrite, set the overwrite property as true.");
				return;
			} else {
				Sys.println("The file " + filePath + " will be overwritten.");
			}
		}
		try {
			YamlWriter writer = new YamlWriter(new FileWriter(filePath));
			writer.getConfig().setPrivateFields(true);
			writer.write(object);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static <T> T read(String filePath, Class<T> clazz) {
		File file = new File(filePath);
		if (!file.exists()) {
			Sys.println("The file " + filePath + " does not exist.");
		}
		try {
			YamlReader reader = new YamlReader(new FileReader(filePath));
			T t = reader.read(clazz);
			reader.close();
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
