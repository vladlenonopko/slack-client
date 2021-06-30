package com.hubspot.slack.client.methods.params.migration;

import java.util.Optional;
import java.util.Set;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.common.base.Joiner;
import com.hubspot.immutables.style.HubSpotStyle;

@Value.Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface MigrationExchangeParamsIF {
  Joiner COMMA_JOINER = Joiner.on(',').skipNulls();

  Optional<String> getTeamId();

  Optional<Boolean> getToOld();

  @JsonIgnore
  Set<String> getUserIds();

  @JsonProperty("users")
  default String getUserIdsString() {
    return COMMA_JOINER.join(getUserIds());
  }
}
