/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.runtime.models;


/**
 * The optional parameters class for "resolve" method.
 */
public class ResolveOptionalParameter {
    /**
    * The timezone offset for the location of the request.
    */
    private Double timezoneOffset;

    /**
    * If true, return all intents instead of just the top scoring intent.
    */
    private Boolean verbose;

    /**
    * Use the staging endpoint slot.
    */
    private Boolean staging;

    /**
    * Enable spell checking.
    */
    private Boolean spellCheck;

    /**
    * The subscription key to use when enabling bing spell check.
    */
    private String bingSpellCheckSubscriptionKey;

    /**
    * Log query (default is true).
    */
    private Boolean log;

    /**
    * Get the timezoneOffset value.
    *
    * @return the timezoneOffset value
    */
    public Double timezoneOffset() {
        return this.timezoneOffset;
    }

    /**
    * Get the verbose value.
    *
    * @return the verbose value
    */
    public Boolean verbose() {
        return this.verbose;
    }

    /**
    * Get the staging value.
    *
    * @return the staging value
    */
    public Boolean staging() {
        return this.staging;
    }

    /**
    * Get the spellCheck value.
    *
    * @return the spellCheck value
    */
    public Boolean spellCheck() {
        return this.spellCheck;
    }

    /**
    * Get the bingSpellCheckSubscriptionKey value.
    *
    * @return the bingSpellCheckSubscriptionKey value
    */
    public String bingSpellCheckSubscriptionKey() {
        return this.bingSpellCheckSubscriptionKey;
    }

    /**
    * Get the log value.
    *
    * @return the log value
    */
    public Boolean log() {
        return this.log;
    }

    /**
    * Set the timezoneOffset value.
    * <p>
    * The timezone offset for the location of the request.
    *
    * @param timezoneOffset the timezoneOffset value to set
    * @return the resolveOptionalParameter object itself.
    */
    public ResolveOptionalParameter withTimezoneOffset(double timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
    * Set the verbose value.
    * <p>
    * If true, return all intents instead of just the top scoring intent.
    *
    * @param verbose the verbose value to set
    * @return the resolveOptionalParameter object itself.
    */
    public ResolveOptionalParameter withVerbose(boolean verbose) {
        this.verbose = verbose;
        return this;
    }

    /**
    * Set the staging value.
    * <p>
    * Use the staging endpoint slot.
    *
    * @param staging the staging value to set
    * @return the resolveOptionalParameter object itself.
    */
    public ResolveOptionalParameter withStaging(boolean staging) {
        this.staging = staging;
        return this;
    }

    /**
    * Set the spellCheck value.
    * <p>
    * Enable spell checking.
    *
    * @param spellCheck the spellCheck value to set
    * @return the resolveOptionalParameter object itself.
    */
    public ResolveOptionalParameter withSpellCheck(boolean spellCheck) {
        this.spellCheck = spellCheck;
        return this;
    }

    /**
    * Set the bingSpellCheckSubscriptionKey value.
    * <p>
    * The subscription key to use when enabling bing spell check.
    *
    * @param bingSpellCheckSubscriptionKey the bingSpellCheckSubscriptionKey value to set
    * @return the resolveOptionalParameter object itself.
    */
    public ResolveOptionalParameter withBingSpellCheckSubscriptionKey(String bingSpellCheckSubscriptionKey) {
        this.bingSpellCheckSubscriptionKey = bingSpellCheckSubscriptionKey;
        return this;
    }

    /**
    * Set the log value.
    * <p>
    * Log query (default is true).
    *
    * @param log the log value to set
    * @return the resolveOptionalParameter object itself.
    */
    public ResolveOptionalParameter withLog(boolean log) {
        this.log = log;
        return this;
    }

    }
