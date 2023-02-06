package nursalim.dev.collection.program.retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class HookBinApp {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://hookb.in")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        HookBinService hookBinService = retrofit.create(HookBinService.class);

        HookBinRequest request = HookBinRequest.builder()
                .id("1")
                .firstName("Nursalim")
                .build();

        Call<HooBinResponse> call = hookBinService.test(request); // async
        call.execute().body();

    }
}

