package com.bridgelabz.fundoo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bridgelabz.fundoo.dto.NoteDto;
import com.bridgelabz.fundoo.model.Note;
import com.bridgelabz.fundoo.model.Response;

@Service
public interface NoteServiceInteface 
{
	
	Response create(NoteDto noteDto, String token);
	Response update(NoteDto noteDto, String token, String noteId);
	Response delete(String token, String noteId);
	List<NoteDto> retrieve(String token);
	Response Archive(String token, String noteId);
	Response Trash(String token, String noteId);
	Response Pin(String token, String noteId);
	Response addLabelsToNote(String token, String noteId, String labelId);
	Response revomeLabelsFromNote(String token, String noteId, String labelId);
	 List<Note> sortNoteByNameDsend(String token);
	 List<Note> sortNoteByNameAsend(String token); 
	 List<Note> sortNoteByDateDsend(String token);
	 List<Note> sortNoteByDateAsend(String token);
	 Response setRemainder(String noteId, String token, String time);
     Response deleteRemainder(String noteId, String token);
	
}