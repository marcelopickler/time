import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface TesteApi {
	@Headers("Student:1144002449")
	@GET("times")
	Call<List<Time>> getTime();
	
	@Headers("Student:1144002449")
	@POST("times")
	Call<Time> 
	AddTime(@Body Time time);

	

}
