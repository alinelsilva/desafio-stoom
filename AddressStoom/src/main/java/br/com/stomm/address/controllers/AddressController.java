package br.com.stomm.address.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.com.stomm.address.model.Address;
import br.com.stomm.address.repository.AddressRepository;

@Controller
public class AddressController {
	
	@Autowired
	AddressRepository addressRepository;
	
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String form(){
		return "formCadastro";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String form(Address address) {
		addressRepository.save(address);
		
		return "redirect:/address";
	}
	
	@RequestMapping("/address")
	public ModelAndView listaEndereco() {
		ModelAndView mv= new ModelAndView("lista");
		Iterable<Address> address = addressRepository.findAll();
		mv.addObject("address",  address);
		
		return mv;
		
	}
	
	@RequestMapping("/excluirEndereco")
	public String excluirEndereco(long id) {
		Address address = addressRepository.findById(id);
		addressRepository.delete(address);
		return "redirect:/address";
	}
	
	 @RequestMapping(value="/alterar/{id}", method=RequestMethod.GET)
	public ModelAndView alterar(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("alterar");
		Address address = addressRepository.getOne(id);
		mv.addObject("address", address);
		return mv;
	}
	
	 @RequestMapping(value="/alterar", method=RequestMethod.POST)
	public ModelAndView alterar(Address address) {
		ModelAndView mv = new ModelAndView();
		addressRepository.save(address);
		mv.setViewName("redirect:/address");
		return mv;
	}

}
