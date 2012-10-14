package ee.itcollege.i377.praktikum4.entities;

import java.io.Serializable;
import javax.persistence.*;


@NamedQueries({
    @NamedQuery(name="Guard.findAll", query="SELECT g FROM Guard g")
})
@Entity
public class Guard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int age;

	private String name;

    public Guard() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}