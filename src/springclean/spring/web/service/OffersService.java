package springclean.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springclean.spring.web.dao.Offer;
import springclean.spring.web.dao.OffersDAO;

@Service //Service resembles @Component
public class OffersService {

	private OffersDAO offersDao;
	
	public List<Offer> getCurrent() {
		return offersDao.getOffers();
	}

	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	public void create(Offer offer) {

		offersDao.create(offer);
		
	}

	public void throwTestException() {
		
		offersDao.getOffer(9999);
		
	}
	
}
