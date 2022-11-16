package com.hubspot.slack.client.models.blocks.messages;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

@Value.Immutable
@HubSpotStyle
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public interface RichTextPreformattedIF extends RichMessageBlock{
    String TYPE = "rich_text_preformatted";

    @Override
    @Value.Derived
    default String getType() {
        return TYPE;
    }
}