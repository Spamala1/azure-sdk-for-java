/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.runtime;

import com.microsoft.azure.cognitiveservices.language.luis.runtime.models.ResolveOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.runtime.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.language.luis.runtime.models.AzureRegions;
import com.microsoft.azure.cognitiveservices.language.luis.runtime.models.LuisResult;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Predictions.
 */
public interface Predictions {
    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size
     *  is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @param resolveOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LuisResult object if successful.
     */
    LuisResult resolve(String appId, String query, ResolveOptionalParameter resolveOptionalParameter);

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size
     *  is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @param resolveOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LuisResult object
     */
    Observable<LuisResult> resolveAsync(String appId, String query, ResolveOptionalParameter resolveOptionalParameter);

}
