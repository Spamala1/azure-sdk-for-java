/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sublist of items for a Closed list.
 */
public class SubClosedList {
    /**
     * The standard form that the list represents.
     */
    @JsonProperty(value = "canonicalForm")
    private String canonicalForm;

    /**
     * List of synonym words.
     */
    @JsonProperty(value = "list")
    private List<String> list;

    /**
     * Get the canonicalForm value.
     *
     * @return the canonicalForm value
     */
    public String canonicalForm() {
        return this.canonicalForm;
    }

    /**
     * Set the canonicalForm value.
     *
     * @param canonicalForm the canonicalForm value to set
     * @return the SubClosedList object itself.
     */
    public SubClosedList withCanonicalForm(String canonicalForm) {
        this.canonicalForm = canonicalForm;
        return this;
    }

    /**
     * Get the list value.
     *
     * @return the list value
     */
    public List<String> list() {
        return this.list;
    }

    /**
     * Set the list value.
     *
     * @param list the list value to set
     * @return the SubClosedList object itself.
     */
    public SubClosedList withList(List<String> list) {
        this.list = list;
        return this;
    }

}
