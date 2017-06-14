package trees;

public class TreeType {

	private String commonName;
	private String family;
	private String genus;
	private String species;

	public TreeType(String commonName, String family, String genus, String species) {
		this.commonName = commonName;
		this.family = family;
		this.genus = genus;
		this.species = species;
	}
	
	@Override
	public String toString() {
		return genus + " " + species;
	}

	public String getCommonName() {
		return commonName;
	}

	public String getFamily() {
		return family;
	}

	public String getGenus() {
		return genus;
	}

	public String getSpecies() {
		return species;
	}

}
