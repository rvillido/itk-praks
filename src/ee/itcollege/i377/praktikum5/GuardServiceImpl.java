package ee.itcollege.i377.praktikum5;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ee.itcollege.i377.praktikum4.dao.GuardDao;
import ee.itcollege.i377.praktikum4.dao.GuardDaoImpl;
import ee.itcollege.i377.praktikum4.entities.Guard;

@Service
public class GuardServiceImpl implements GuardService{
	
	@Resource(name=GuardDaoImpl.NAME)
	private GuardDao guardDao;
	
	public List<Guard> getGuards() {
		return guardDao.getGuards();
	}
}
