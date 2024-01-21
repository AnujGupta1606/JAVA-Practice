import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter show name");
        Scanner sc = new Scanner(System.in);
        String token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1YzNhNDk1Yzk5YTc3MjhiYmRhMzkzMGMxMTQzZThlOSIsInN1YiI6IjY1MDQ3ZmU5YzE2MDZhMDEzOWM5ZTlhZiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.e10ZxS2HBWqxPiZ0qTPdovRwqublWunpfXB4IncLNDg";
        String show = sc.nextLine();
        URI url = new URI(String.format("https://api.themoviedb.org/3/search/tv?&query=%s", show));
        HttpRequest request = HttpRequest.newBuilder()
        .uri(url)
        .GET()
        .header("Authorization", token)
        .build(); 

        HttpClient http = HttpClient.newHttpClient();

        HttpResponse<String> httpResponse = http.send(request, BodyHandlers.ofString());

        System.out.println(httpResponse.body());
    }
}
