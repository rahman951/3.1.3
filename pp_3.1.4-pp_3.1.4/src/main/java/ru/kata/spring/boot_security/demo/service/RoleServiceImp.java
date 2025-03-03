package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
	
	private final RoleRepository roleRepository;
	
	public RoleServiceImp(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}
	
	@Override
	public Role findById(Long id) {
		return roleRepository.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
	@Override
	@Transactional
	public Role update(Role role) {
		return roleRepository.save(role);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		roleRepository.deleteById(id);
	}
}
