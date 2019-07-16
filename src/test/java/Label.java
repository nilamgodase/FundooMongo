/*import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import com.bridgelabz.fundoo.controller.LabelController;
import com.bridgelabz.fundoo.dto.LabelDto;
import com.bridgelabz.fundoo.services.LabelServiceInterface;

@RunWith(SpringRunner.class)
public class Label
{
@InjectMocks 
private LabelController Labelcontroller;
@Mock
private LabelServiceInterface LabelServiceImpl;

LabelDto labelDto;
@Before 
public void setup()throws Exception
{
	MockitoAnnotations.initMocks(this);
}

@Test
public void CreateLabel()
{
	when(LabelServiceImpl.create(labelDto,toString())).thenReturn(null);
}
public void UpdateNote() 
{
	when(LabelServiceImpl.update(labelDto,toString(),toString())).thenReturn(null);
}
public void DeleteNote() 
{
	when(LabelServiceImpl.delete(toString(),toString())).thenReturn(null);
}
}*/
