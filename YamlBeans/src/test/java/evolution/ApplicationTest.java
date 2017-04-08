package evolution;

import java.util.Arrays;

import org.junit.Test;

import evolution.dto.AnyDto;
import evolution.util.Sys;

public class ApplicationTest {
	@Test
	public void testWrite() {
		AnyDto anyDto = new AnyDto();
		anyDto.setName("Chen");
		anyDto.setAddresses(Arrays.asList("Champaign", "Urbanba"));
		Application.write(anyDto, "/home/chen/Desktop/Playground/Data/Yml_Output.yml", true);
	}
	
	@Test
	public void testRead() {
		AnyDto anyDto = Application.read("/home/chen/Desktop/Playground/Data/Yml_Output.yml", AnyDto.class);
		Sys.println(anyDto);
	}
}
