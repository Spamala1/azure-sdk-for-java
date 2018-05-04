/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the metrics that indicate how well an item was rated by others.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = AggregateRating.class)
@JsonTypeName("AggregateRating")
public class AggregateRating extends Rating {
    /**
     * The number of times the recipe has been rated or reviewed.
     */
    @JsonProperty(value = "reviewCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer reviewCount;

    /**
     * Get the reviewCount value.
     *
     * @return the reviewCount value
     */
    public Integer reviewCount() {
        return this.reviewCount;
    }

}
