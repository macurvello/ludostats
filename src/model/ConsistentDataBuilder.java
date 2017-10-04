package model;

public abstract class ConsistentDataBuilder implements Builder<ConsistentData> {

	private ConsistentData data;
	
	@Override
	public ConsistentData build() throws InconsistentDataException {
		if( !this.data.isConsistent() ) {
			throw new InconsistentDataException();
		}
		
		return this.data;
	}
	
	protected ConsistentData getData() {
		return this.data;
	}
	
	protected void setData(ConsistentData data) {
		this.data = data;
	}

}
