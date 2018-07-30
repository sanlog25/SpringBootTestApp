package springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic> topics = Arrays.asList(
            new Topic("spring","springFramework","SpringDescription"),
            new Topic("java","Core Java","Java Description"),
            new Topic("javascript","javascript Framework","JS Description")
    );

    public List<Topic> getAllTopics()
    {
     return topics;
    }

    public Topic getTopic(String id)
    {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


}
