package com.hubspot.slack.client.models.blocks.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.blocks.objects.ConfirmationDialog;
import com.hubspot.slack.client.models.blocks.objects.Text;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface UsersMultiSelectMenuIF extends BlockElement, HasActionId {
  String TYPE = "multi_users_select";

  @Override
  @Value.Derived
  default String getType() {
    return TYPE;
  }

  @Value.Parameter
  Text getPlaceholder();

  @Value.Parameter
  String getActionId();

  @JsonProperty("initial_users")
  List<String> getInitialUserIds();

  @JsonProperty("confirm")
  Optional<ConfirmationDialog> getConfirmationDialog();
}
