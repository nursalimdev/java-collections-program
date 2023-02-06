package nursalim.dev.collection.program.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class CreditCardBinApp {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://lookup.binlist.net")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        CreditCardBinService creditCardBinService = retrofit.create(CreditCardBinService.class);

        CreditCardBin body = creditCardBinService.get("45717360").execute().body();
        System.out.println(body);


    }
}
