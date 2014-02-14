package jpipe;

import java.util.ArrayList;
import java.util.List;

public class MemoriaDatos {
	
	private List<Integer> memo;

	public MemoriaDatos() {
		super();
		memo=new ArrayList<Integer>();
	}

	public boolean llena(){
		return memo.size()==32;
	}
	
	public boolean vacia(){
		return memo.size()==0;
	}
	
	public List<Integer> getMemo() {
		return memo;
	}

	public void setMemo(List<Integer> memo) {
		this.memo = memo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemoriaDatos other = (MemoriaDatos) obj;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		return true;
	}
	
	

}
