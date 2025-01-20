package com.hubspot.slack.client.models.response.assistant;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

@Value.Immutable
@HubSpotStyle
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public interface AssistantThreadContextIF {
  String getChannelId();
  String getTeamId();
  String getEnterpriseId();
}
