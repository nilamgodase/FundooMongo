/*package com.bridglabz.fundoo.services;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.io.UnsupportedEncodingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit4.SpringRunner;

import com.bridgelabz.fundoo.dto.LabelDto;
import com.bridgelabz.fundoo.model.Label;
import com.bridgelabz.fundoo.model.Response;
import com.bridgelabz.fundoo.repository.LabelRepositoryInterface;
import com.bridgelabz.fundoo.services.LabelServiceInterface;
import com.bridgelabz.fundoo.utility.TokenUtility;

@RunWith(SpringRunner.class)
public class LabelServiceTest
{

	@Mock
	LabelRepositoryInterface labelRepo;
	
	@Mock
	TokenUtility tokenGenerator;
	
	@Mock
	ModelMapper modelMapper;
	
   @Mock
    LabelServiceInterface labelService;
   
   @Mock
	private TokenUtility tokenutility;
   
   @Test
	public void createlabel() throws IllegalArgumentException,UnsupportedEncodingException
	{
	
	LabelDto labelDto= new LabelDto();
	Label label=new Label("1","1","Hi","null","null");
	//Response response = new Response(200, "success");
	
	when(tokenutility.verifyToken(toString())).thenReturn(label.getUserId());
	when(modelMapper.map(labelDto, Label.class)).thenReturn(label);

	
	when(labelRepo.save(label)).thenReturn(label);
	//Response result = labelService.create(labelDto, "token");	
	//assertEquals(response.getStatusMessage(), result.getStatusMessage());
	
	}
   
  @Test
  public void Update() throws IllegalArgumentException,UnsupportedEncodingException
	{
	  
	}
  
  @Test
  public void Delete()throws IllegalArgumentException,UnsupportedEncodingException
  {
	  
  }
}*/
