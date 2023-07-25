package hs.example.keycloak.oidc.api.v1.movie;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MovieController {

    @GetMapping("/movie")
    public Map print() {
//    public String print() {
        ClassPathResource resource = new ClassPathResource("data/data.json");
        // log.info(resource.getFile()); // 파일 객체
        log.info(resource.getFilename()); // 파일 이름
        // log.info(resource.getInputStream()); // InputStream 객체
        log.info(resource.getPath()); // 파일 경로
        // log.info(resource.getURL()); // URL 객체
        // log.info(resource.getURI()); // URI 객체

        List<String> content = null;
        Map<String,Object> map = null;
        String s = null;
        byte[] bytes = null;
        try {
            Path path = Paths.get(resource.getURI());
            bytes = Files.readAllBytes(path);
            s= new String(bytes);

//            content = Files.readAllLines(path);
//            content.forEach(System.out::println);
            ObjectMapper om = new ObjectMapper();
            map = om.readValue(new String(bytes), Map.class);
        } catch (Exception e) {
            log.error("Error" , e);
        }
        log.info(new String(bytes));
        return map;
//        return s;
    }

    @GetMapping("/movie/cast/{castId}")
    public Map<String, Object> cast(
            @PathVariable Integer castId) {
        log.info("Cast ID : {}",castId); // 파일 이름
        ClassPathResource resource = new ClassPathResource("data/data.json");
        log.info(resource.getFilename()); // 파일 이름
        log.info(resource.getPath()); // 파일 경로

        List<String> content = null;
        Map<String,Object> map = null;
        byte[] bytes = null;
        try {
            Path path = Paths.get(resource.getURI());
            bytes = Files.readAllBytes(path);
            ObjectMapper om = new ObjectMapper();
            map = om.readValue(new String(bytes), Map.class);
        } catch (Exception e) {
            log.error("Error" , e);
        }

        List<Map<String,Object>> castList = (List<Map<String, Object>>) map.get("cast");
        log.info("cast : {}",castList.size());
        castList.forEach(x-> {
            System.out.println(x.get("id"));
            // System.out.println(x.get("id").getClass());
        });
        Map<String, Object> cast = castList.stream()
                .filter(
                        x -> castId.equals((Integer) x.get("id"))
                )
                .findAny()
                .orElseThrow(() -> new RuntimeException("cast doesn't exist"));

        log.info("cast : {}",cast);

        return cast;
    }
}
