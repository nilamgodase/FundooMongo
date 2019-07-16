package com.bridgelabz.fundoo.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.fundoo.dto.NoteDto;
import com.bridgelabz.fundoo.model.Note;
import com.bridgelabz.fundoo.model.Response;
import com.bridgelabz.fundoo.services.NoteServiceImpl;
 
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/note")
public class NoteController {
	@Autowired
	private NoteServiceImpl noteServiceImpl;

//********************************** create ***************************************************************************************************************//
	
	@PostMapping("/create")
	public ResponseEntity<Response> create(@RequestBody NoteDto noteDto, @RequestHeader String token) throws UserException,UnsupportedEncodingException
	{
		Response response = noteServiceImpl.create(noteDto, token);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//********************************** update ***************************************************************************************************************//
	
	@PutMapping("/update")
	public ResponseEntity<Response> update(@RequestBody NoteDto noteDto, @RequestHeader String token, @RequestParam String noteId) throws UserException,UnsupportedEncodingException
	{
		Response response = noteServiceImpl.update(noteDto, token, noteId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//********************************** delete ***************************************************************************************************************//
	
	@DeleteMapping("/delete")
	public ResponseEntity<Response> delete(@RequestHeader String token, @RequestParam String noteId) throws UserException,UnsupportedEncodingException
	{
		Response response = noteServiceImpl.delete(token, noteId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//********************************** get-all **************************************************************************************************************//
	
	@GetMapping("/retrieve")
	public List<NoteDto> retrieve(@RequestHeader String token) 
	{
		List<NoteDto> list = noteServiceImpl.retrieve(token);
		return list;
	}
//********************************** Archive **************************************************************************************************************//
	
	@PostMapping("/archive")
	public ResponseEntity<Response> Archive(@RequestHeader String token, @RequestParam String noteId) throws UserException,UnsupportedEncodingException
	{
		Response response = noteServiceImpl.Archive(token, noteId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//********************************** Trash ****************************************************************************************************************//
	
	@PostMapping("/trash")
	public ResponseEntity<Response> Trash(@RequestHeader String token, @RequestParam String noteId) throws UserException,UnsupportedEncodingException
	{
		Response response = noteServiceImpl.Trash(token, noteId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

//**********************************Pin***********************************************************************************************************************//
	
	@PostMapping("/pin")
	public ResponseEntity<Response> Pin(@RequestHeader String token, @RequestParam String noteId)  throws UserException,UnsupportedEncodingException
	{
		Response response = noteServiceImpl.Pin(token, noteId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//*************************************add labels********************************************************************************************************************//

	@PostMapping("/addLabels")
	public ResponseEntity<Response> addLabels(@RequestHeader String token,@RequestParam String noteId,@RequestHeader String labelId)
	{
		Response response=noteServiceImpl.addLabelsToNote(token, noteId, labelId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//***********************************************remove lebels*********************************************************************************************************//	
	@PostMapping("/revomeLabels")
	public ResponseEntity<Response> revomeLabels(@RequestHeader String token,@RequestParam String noteId,@RequestHeader String labelId)
	{
		Response response=noteServiceImpl.revomeLabelsFromNote(token, noteId, labelId);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
//***************************************sort note by name******************************************************************************************************************//
	@GetMapping("/sortnotebyTitleAsend")
	@ApiOperation(value= "To sort the notes by its name in asending order")
public List<Note>sortNoteBynameAsend(@RequestHeader String token)
{
	return noteServiceImpl.sortNoteByNameAsend(token);
}
//****************************************sort note by name dsend*****************************************************************************************************************//
	@GetMapping("/sortNotebyTitleDsend")
	@ApiOperation(value= "To sort the notes by its name in desending order")
public List<Note>sortNoteByNamedesend(@RequestHeader String token)
{
	return noteServiceImpl.sortNoteByNameDsend(token);
}
//***************************************sort note by date asend*******************************************************************************************************************//
	@GetMapping("/sortNotebyDateAsend")
	@ApiOperation(value= "To sort the notes by its date in Ascending order")
	public List<Note>sortNoteBydateAsend(@RequestHeader String token)
	{
		return noteServiceImpl.sortNoteByDateAsend(token);
	}
//************************************sort note by date dsend***********************************************************************************************************************//
	@GetMapping("/sortnotebyDateDsend")
	@ApiOperation(value= "To sort the notes by its date in Dscending order")
	public List<Note>sortNoteBydateDsend(@RequestHeader String token)
	{
		return noteServiceImpl.sortNoteByDateDsend(token);
	}
//***********************************Set Remainder************************************************************************************************************************************************//
	@PostMapping("/setRemainder")
	public ResponseEntity<Response>setRemainder(@RequestParam String noteId,@RequestHeader String token,@RequestParam String time) 
	{
		Response response=noteServiceImpl.setRemainder(noteId,token,time);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
//******************************Delete Remainder****************************************************************************************************************************************************//
	@PostMapping("/deleteRemainder")
	public ResponseEntity<Response>deleteRemainder(@RequestParam String noteId,@RequestHeader String token) 
	{
	  Response response=noteServiceImpl.deleteRemainder(noteId,token);	
	  return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

}