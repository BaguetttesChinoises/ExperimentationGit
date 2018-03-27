package org.entrainement.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicsService topicsService;

    private TopicsService topicsService2 = new TopicsService();

    @RequestMapping("/topics")
    public List<Topic> yolo() {
        return topicsService.getAllTopics();
    }

    @RequestMapping("/topics/{id}/jem'enbaslesCouilles")
    public Topic yolo2 (@PathVariable String id) {
        return topicsService.getTopics(id);
    }
//entraineement sur les espaces

}
