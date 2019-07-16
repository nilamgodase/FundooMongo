/*package com.bridglabz.fundoo.services;

import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import com.bridgelabz.fundoo.dto.UserLoginDto;
import com.bridgelabz.fundoo.dto.UserRegistrationDto;
import com.bridgelabz.fundoo.model.User;
import com.bridgelabz.fundoo.repository.UserRepositoryInterface;
import com.bridgelabz.fundoo.services.UserServiceInterface;
import com.bridgelabz.fundoo.utility.EmailSenderUtil;

@RunWith(SpringRunner.class)
public class UserServiceTest 
{
@MockBean
ModelMapper modelMapper;

@Mock
UserServiceInterface userservice;

@MockBean
PasswordEncoder passwordEncoder;

@Mock
EmailSenderUtil mailservice;

@Mock 
UserRepositoryInterface userReository;
 

@Test
public void RegisterUser()
{
	UserRegistrationDto userRegistrationDto=new UserRegistrationDto("Nilam","Godase","nilam.godse1997@gmail.com","8978885858","Nilam@123");
    User user=new User("1","Nilam","Godase","nilam.godse1997@gmail.com", "8978885858", "Nilam@123","registerStamp", "updateStamp",false,"token","image",null,null);
    when(modelMapper.map(userRegistrationDto,User.class)).thenReturn(user);
	when(passwordEncoder.encode(userRegistrationDto.getPassword())).thenReturn(user.getPassword());
	when(userReository.save(user)).thenReturn(user);
}

@Test
public void LoginUser() 
{
	UserLoginDto userDto = new UserLoginDto("nilam.godse1997@gmail.com","Nilam@123");
	User user=new User("1","Nilam","lastName","nilam.godse1997@gmail.com", "8978885858", "Nilam@123","registerStamp", "updateStamp",false,"token","image",null,null);
	when(modelMapper.map(userDto,User.class)).thenReturn(user);
	when(passwordEncoder.encode(userDto.getPassword())).thenReturn(user.getPassword());
	when(userReository.save(user)).thenReturn(user);
	
}
}*/
