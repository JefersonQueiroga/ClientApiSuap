package br.edu.ifrn.jeferson.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrn.jeferson.dto.MeusDados;
import br.edu.ifrn.jeferson.resource.SuapResource;

@Controller
public class LoginController {

	@Autowired
	private SuapResource suapResource;
	
	@RequestMapping(method = RequestMethod.GET, path = { "/entrar" })
	public String entrar() {
		return "login";
	}
	
	@RequestMapping("/")
	public String index() {
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST, path= {"/logar"})
    public ModelAndView save(@RequestParam("username") String username , @RequestParam("password") String password) {
		
				
		if( username.isEmpty() || password.isEmpty()) {
			return null;
	    }
		
			
		try {
			MeusDados dados = suapResource.meusDados(username, password);
			ModelAndView mv = new ModelAndView("confirmacaoLogin");
			mv.addObject("dados", dados);
			return mv;
	
		}catch (Exception e) {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("error", true);
			return mv;
		}
			
		
	
	

	}	

	
	

}
