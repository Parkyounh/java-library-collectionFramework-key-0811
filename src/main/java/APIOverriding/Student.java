package APIOverriding;

import java.util.Objects;

public class Student {
	public int sno;

	public Student(int sno) {;
		this.sno = sno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student)/*getClass() != obj.getClass()*/)
			return false;
		Student other = (Student) obj;
		return sno == other.sno;
	}
	
	
}
