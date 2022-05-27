package cn.com.xuxiaowei.messagesresource.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Joe Grandja
 * @since 0.0.1
 */
@RestController
public class MessagesController {

    @GetMapping("/messages")
    public String[] getMessages() {
        return new String[]{"Message " + UUID.randomUUID(), "Message " + UUID.randomUUID(), "Message " + UUID.randomUUID()};
    }
}
