package com.bridgelabz.fundoo.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import java.nio.file.Files;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.bridgelabz.fundoo.dto.UserForgetPasswordDto;
import com.bridgelabz.fundoo.dto.UserLoginDto;
import com.bridgelabz.fundoo.dto.UserRegistrationDto;
import com.bridgelabz.fundoo.model.Response;
import com.bridgelabz.fundoo.services.UserServiceImpl;

import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(value="/user")
public class UserController 
{
	 private final Path pathlocation=Paths.get("/home/admin/Downloads");
	@Autowired
	private UserServiceImpl userServiceImpl;
//************************ registration ***************************************************************//
	
	@PostMapping("/register")
	public ResponseEntity<Response> userRegister(@RequestBody UserRegistrationDto userRegistrationDto, HttpServletRequest request) throws UserException, UnsupportedEncodingException 
	{
		Response response = userServiceImpl.register(userRegistrationDto, request);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
//************************ token-activation ***************************************************************//
	@GetMapping("/activation/{token}")
	public ResponseEntity<Response> validatResponse(@RequestHeader String token) throws UserException, UnsupportedEncodingException 
	{
		Response response=userServiceImpl.validateMail(token);
		return new ResponseEntity<Response>(response,HttpStatus.OK);	
	}
//*********************** login *************************************************************************//	
	@PostMapping("/login")
	public ResponseEntity<Response> userLogin(@RequestBody UserLoginDto userLoginDto, HttpServletResponse resopnse) 	throws UserException, UnsupportedEncodingException 
	{
		Response response = userServiceImpl.login(userLoginDto,resopnse);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
//*********************************************************************************************************//
	@PutMapping("/forgotpassword")
	public ResponseEntity<Response> forgetPassword(@RequestBody UserForgetPasswordDto userForgetpassword,String token)throws UserException, UnsupportedEncodingException 
	{
		Response response = userServiceImpl.forget(userForgetpassword,token);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
//******************************************************************************************************//	
	@PutMapping("/setPassword/{token}")
	public ResponseEntity<Response> setPassword(@RequestBody UserForgetPasswordDto userForgetpassword,@PathVariable String token)throws UserException, UnsupportedEncodingException 
	{
		Response response=userServiceImpl.setPassword(userForgetpassword, token);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
}
//**********************************************************************************************************************************************
    @PutMapping("/setProfile")
	public ResponseEntity<Response>setProfile(@RequestParam("imageFile") MultipartFile imageFile,@RequestParam String token) throws IOException 
	{
	 	 UUID uuid = UUID.randomUUID();
		 String uuidString = uuid.toString();  
	    	        
	     Files.copy(imageFile.getInputStream(),this.pathlocation.resolve(uuidString),StandardCopyOption.REPLACE_EXISTING);
	            
  	     Response response=userServiceImpl.setProfile(uuidString,token); 
  	    
		 return new ResponseEntity<>(response,HttpStatus.OK);
	}
//***************************************************************************************************************************************//
	
}