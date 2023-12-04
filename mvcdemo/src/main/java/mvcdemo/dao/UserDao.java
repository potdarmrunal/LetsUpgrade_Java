package mvcdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mvcdemo.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hiberntaeTemplate;
	
	@Transactional
	public int saveUser(User user) {
		// TODO Auto-generated method stub
		int id = (int) this.hiberntaeTemplate.save(user);
		return id;
	}

}
