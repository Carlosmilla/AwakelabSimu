package com.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.AutoDao;
import com.demo.model.Auto;

@Service("autoServiceImpl")
public class AutoServiceImpl implements AutoService{

	@Autowired
	private AutoDao autoDao;
	
	@Override
	@Transactional(readOnly = false) // false porque son cambios
	public void insertar(Auto auto) {
	    autoDao.save(auto);
	}

	@Override
	@Transactional(readOnly = false)
	public void actualizar(Auto auto) {
        autoDao.save(auto);
	}

	@Override
	@Transactional(readOnly = false)
	public void eliminar(Integer id_auto) {
		autoDao.delete(findById(id_auto));
	}

	@Override
	@Transactional(readOnly = true)
	public Auto findById(Integer id_auto) {
		return autoDao.findById(id_auto).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Auto> findAll() {
		return (Collection<Auto>)autoDao.findAll();
	}

}
