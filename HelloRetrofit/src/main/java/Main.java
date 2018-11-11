import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {
	public static void main (String args[]) {
		
	Retrofit retrofit = new Retrofit.Builder()
		    .baseUrl("https://gist.github.com/marcelopickler/")

		    .addConverterFactory(GsonConverterFactory.create())
		    .build();

		TesteApi api = retrofit.create(TesteApi.class);
		
		try {
			Time tb = new Time();
			tb.setNome("Triple H");
			Call<Time> call = api.AddTime(tb);
			
			Response<Time> r = call.execute();
			
			Time t = r.body();
			
			System.out.println(t);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
