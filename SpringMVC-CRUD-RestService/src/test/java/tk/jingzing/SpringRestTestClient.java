package tk.jingzing;

import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by wangyunjing on 16/5/24.
 */
public class SpringRestTestClient {
    public static final String REST_SERVICE_URI = "http://localhost:8080/Spring4MVCCRUDRestService";

    /* GET */
    @SuppressWarnings("unchecked")
    private static void listAllUsers() {
        System.out.println("Testing listAllUsers API-----------");
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
        if(usersMap!=null){
            for(LinkedHashMap<String, Object> map : usersMap){
                System.out.println("User : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
            }
        }else{
            System.out.println("No user exist----------");
        }
    }

    public static void main(String[] args) {
        listAllUsers();
    }
}
