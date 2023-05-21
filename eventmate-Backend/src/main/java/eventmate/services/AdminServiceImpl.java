package eventmate.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventmate.daos.AdminDao;
import eventmate.entities.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;

	@Override
	public Admin validate(String userid, String pwd) {
		try {
			Optional<Admin> admin = dao.findById(userid);
			if (admin.isPresent() && admin.get().getPwd().equals(pwd)) {
				return admin.get();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateAdmin(Admin admin) {
		if (admin.getPwd().equals("") || admin.getPwd() == null) {
			admin.setPwd(dao.getById(admin.getUserid()).getPwd());
		}
		dao.save(admin);
	}

}
