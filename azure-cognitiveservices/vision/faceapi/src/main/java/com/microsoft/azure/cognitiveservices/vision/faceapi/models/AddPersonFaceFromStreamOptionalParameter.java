/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;

/**
 * The optional parameters class for "addPersonFaceFromStream" method.
 */
public class AddPersonFaceFromStreamOptionalParameter {
    /**
    * User-specified data about the face for any purpose. The maximum length is 1KB.
    */
    private String userData;

    /**
    * A face rectangle to specify the target face to be added to a person in the format of
    * "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image,
    * targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire
    * image.
    */
    private List<Integer> targetFace;

    /**
    * Get the userData value.
    *
    * @return the userData value
    */
    public String userData() {
        return this.userData;
    }

    /**
    * Get the targetFace value.
    *
    * @return the targetFace value
    */
    public List<Integer> targetFace() {
        return this.targetFace;
    }

    /**
    * Set the userData value.
    * <p>
    * User-specified data about the face for any purpose. The maximum length is 1KB.
    *
    * @param userData the userData value to set
    * @return the addPersonFaceFromStreamOptionalParameter object itself.
    */
    public AddPersonFaceFromStreamOptionalParameter withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
    * Set the targetFace value.
    * <p>
    * A face rectangle to specify the target face to be added to a person in the format of
    * "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image,
    * targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire
    * image.
    *
    * @param targetFace the targetFace value to set
    * @return the addPersonFaceFromStreamOptionalParameter object itself.
    */
    public AddPersonFaceFromStreamOptionalParameter withTargetFace(List<Integer> targetFace) {
        this.targetFace = targetFace;
        return this;
    }

    }
