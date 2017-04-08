package evolution.dto;

import java.util.List;

public class AnyDto {
	@Override
	public String toString() {
		return "AnyDto [name=" + name + ", addresses=" + addresses + "]";
	}

	private String name;
	private List<String> addresses;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
}
