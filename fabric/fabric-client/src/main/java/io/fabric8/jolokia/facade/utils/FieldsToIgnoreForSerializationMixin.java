package io.fabric8.jolokia.facade.utils;

import org.codehaus.jackson.annotate.JsonIgnore;
import io.fabric8.api.CreationStateListener;

/**
 */
public abstract class FieldsToIgnoreForSerializationMixin {

    @JsonIgnore
    public abstract CreationStateListener getCreationStateListener();

}
