/*package com.bridglabz.fundoo.services;

import static org.mockito.Mockito.when;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit4.SpringRunner;
import com.bridgelabz.fundoo.dto.NoteDto;
import com.bridgelabz.fundoo.model.Note;
import com.bridgelabz.fundoo.model.Response;
import com.bridgelabz.fundoo.repository.NoteRepositoryInterface;
import com.bridgelabz.fundoo.services.NoteServiceImpl;
import com.bridgelabz.fundoo.utility.TokenUtility;
import org.junit.Assert.*; 



@RunWith(SpringRunner.class)
//@RunWith(PowerMockRunner.class)
public class NoteServicetest 
{

	@Mock
	private NoteRepositoryInterface noterepository;
	
	@Mock
	private NoteServiceImpl noteService ;
	
	@Mock
	private TokenUtility tokenutility;
	
	@Mock
	private ModelMapper modelMapper;
	
	
//	@Before
//	public void setUp() throws Exception {
//	}
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreateNote() 
	{	

		NoteDto noteDto = new NoteDto("createTest", "testing creaete");
		Note note= new Note("1", "101","Java","Spring core",null,null,false,false,false,null,null);
		Response response = new Response(200,"success");
    	when(tokenutility.verifyToken(toString())).thenReturn(note.getUserId());
		when(modelMapper.map(noteDto,Note.class)).thenReturn(note);
//		when(statushelper.statusInfo(anyString(), (int) anyLong())).thenReturn(response);
        when(noterepository.save(note)).thenReturn(note);
		Response result = noteService.create(noteDto,"token");	
		
		//assertEquals(200, 200);
		
	//  assertEquals(response.getStatusCode(), result.getStatusMessage());
	}
	
	@Test
	public void testUpdateNote()
	{
		
		NoteDto noteDto = new NoteDto("Java", "Spring core");
		Note note= new Note("1", "101","Java","Spring core",null,null,false,false,false,null,null);
		when(tokenutility.verifyToken(toString())).thenReturn(note.getUserId());
		when(modelMapper.map(noteDto,Note.class)).thenReturn(note);
		when(noteService.update(noteDto,toString(),toString())).thenReturn(null);

		//when(note.setTitle("Note")).thenReturn(note.getTitle());
		//when(note.setDescription("Description")).thenReturn(note.getDescription());
		when(noterepository.save(note)).thenReturn(note);
	
    }
	
	
   @Test
   public void testDeleteNote()
   {
	   NoteDto noteDto = new NoteDto("createTest", "testing creaete");
	   Note note= new Note("1", "101","Java","Spring core",null,null,false,false,false,null,null);
	   when(tokenutility.verifyToken(toString())).thenReturn("1");
		// when(noterepository.delete(note)).thenReturn(note);
  
   }
   
}*/
