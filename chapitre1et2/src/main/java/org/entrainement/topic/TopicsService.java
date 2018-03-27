package org.entrainement.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {

    private List<Topic> topics = Arrays.asList(
            new Topic("1","",""),
            new Topic("2","","")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopics(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
