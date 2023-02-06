package nursalim.dev.collection.program.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface HookBinService {
    @POST("/8PMnzRr93da3l")
    Call<HooBinResponse> test(@Body HookBinRequest request);
}
