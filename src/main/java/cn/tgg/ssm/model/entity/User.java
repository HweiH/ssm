package cn.tgg.ssm.model.entity;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.ID
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.age
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	private Integer age;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.name
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.ID
	 * @return  the value of t_user.ID
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.ID
	 * @param id  the value for t_user.ID
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.age
	 * @return  the value of t_user.age
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.age
	 * @param age  the value for t_user.age
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.name
	 * @return  the value of t_user.name
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.name
	 * @param name  the value for t_user.name
	 * @mbggenerated  Sat Aug 06 18:49:18 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}
}