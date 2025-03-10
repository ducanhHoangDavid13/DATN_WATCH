package sd_19.watch.config;
import com.google.api.services.storage.Storage;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
@Configuration
public class FirebaseConfig {
//    @Bean
//    public Storage firebaseStorage() throws IOException {
//        FileInputStream serviceAccount = new FileInputStream("src/main/resources/serviceAccountKey.json");
//
//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//
//        if (FirebaseApp.getApps().isEmpty()) {
//            FirebaseApp.initializeApp(options);
//        }
//
//        return StorageOptions.newBuilder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build()
//                .getService();
//    }
}
