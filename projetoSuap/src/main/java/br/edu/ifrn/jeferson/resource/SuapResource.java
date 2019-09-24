package br.edu.ifrn.jeferson.resource;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.ifrn.jeferson.dto.MeusDados;

@RestController
public class SuapResource {

	private static final String URL_TOKEN_SUAP = "https://suap.ifrn.edu.br/api/v2/autenticacao/token/";
	private static final String URL_MEUS_DADOS_SUAP = "https://suap.ifrn.edu.br/api/v2/minhas-informacoes/meus-dados/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * Método para buscar o token para realizar o acesso a api
	 * @param username
	 * @param password
	 * @return
	 */
	public String takeToken(String username, String password) {

		Map<String, Object> body = new HashMap<String, Object>();
		body.put("username", username);
		body.put("password", password);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<?> httpEntity = new HttpEntity<Object>(body, headers);

		ResponseEntity<Map> response = restTemplate.exchange(URL_TOKEN_SUAP, HttpMethod.POST, httpEntity, Map.class);
		
		//Caso a senha está errada
		if(response.getStatusCode() == HttpStatus.UNAUTHORIZED) {
			return null;
		}
		
		String token = (String) response.getBody().get("token"); 
		
		System.out.println(token);
		
		return token;
	}
	
	/**
	 * Método para buscar os dados do usuários.
	 * @param username
	 * @param password
	 * @return
	 */
	public MeusDados meusDados(String username,String password) {
		
		String token = takeToken(username, password);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("X-CSRFToken", token );
		headers.add("Authorization", "JWT " + token );
		
		HttpEntity<?> httpEntity = new HttpEntity<Object>(headers);

		ResponseEntity<MeusDados> response = restTemplate.exchange(URL_MEUS_DADOS_SUAP, HttpMethod.GET, httpEntity, MeusDados.class);
		
		//Caso a senha está errada
		if(response.getStatusCode() == HttpStatus.UNAUTHORIZED) {
			return null;
		}
		
				
		return response.getBody();
	}
	
	
	
	

}
