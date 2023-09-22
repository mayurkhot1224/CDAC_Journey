package pkgPayroll;
//bydeault package level access specifier is default

//default are accessible inside package only,outside package default are private

class ImpClass {

	private int privateVariable;// insdie class
	public int publicVariable;// everywhere
	int defaultVariable;// outside class but only inside package
	public int getPrivateVariable() {
		return privateVariable;
	}
	public void setPrivateVariable(int privateVariable) {
		this.privateVariable = privateVariable;
	}
	public int getPublicVariable() {
		return publicVariable;
	}
	public void setPublicVariable(int publicVariable) {
		this.publicVariable = publicVariable;
	}
	public int getDefaultVariable() {
		return defaultVariable;
	}
	public void setDefaultVariable(int defaultVariable) {
		this.defaultVariable = defaultVariable;
	}

	// methods
	// getters and setters

}
