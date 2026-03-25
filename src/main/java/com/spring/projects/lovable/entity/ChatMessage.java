package com.spring.projects.lovable.entity;

import com.spring.projects.lovable.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.Instant;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ChatMessage {
    Long id;
    ChatSession chatSession;

    MessageRole role;

    String content;
    String toolCalls;

    Integer tokensUsed;

    Instant createdAt;
}
