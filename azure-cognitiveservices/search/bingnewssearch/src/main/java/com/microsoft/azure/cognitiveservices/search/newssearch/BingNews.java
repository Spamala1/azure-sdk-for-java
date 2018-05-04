/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.newssearch;

import com.microsoft.azure.cognitiveservices.search.newssearch.models.SearchOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.newssearch.models.CategoryOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.newssearch.models.TrendingOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.newssearch.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.search.newssearch.models.NewsModel;
import com.microsoft.azure.cognitiveservices.search.newssearch.models.TrendingTopics;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingNews.
 */
public interface BingNews {
    /**
     * The News Search API lets you send a search query to Bing and get back a list of news that are relevant to
     *  the search query. This section provides technical details about the query parameters and headers that you
     *  use to request news and the JSON response objects that contain them.  For examples that show how to make
     *  requests, see [Searching the web for
     *  news](https://docs.microsoft.com/en-us/azure/cognitive-services/bing-news-search/search-the-web).
     *
     * @param query The user's search query string. The query string cannot be empty. The query string may contain [Bing
     *  Advanced Operators](http://msdn.microsoft.com/library/ff795620.aspx). For example, to limit news to a
     *  specific domain, use the [site:](http://msdn.microsoft.com/library/ff795613.aspx) operator. Use this
     *  parameter only with the News Search API. Do not specify this parameter when calling the Trending Topics API
     *  or News Category API.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NewsModel object if successful.
     */
    NewsModel search(String query, SearchOptionalParameter searchOptionalParameter);

    /**
     * The News Search API lets you send a search query to Bing and get back a list of news that are relevant to
     *  the search query. This section provides technical details about the query parameters and headers that you
     *  use to request news and the JSON response objects that contain them.  For examples that show how to make
     *  requests, see [Searching the web for
     *  news](https://docs.microsoft.com/en-us/azure/cognitive-services/bing-news-search/search-the-web).
     *
     * @param query The user's search query string. The query string cannot be empty. The query string may contain [Bing
     *  Advanced Operators](http://msdn.microsoft.com/library/ff795620.aspx). For example, to limit news to a
     *  specific domain, use the [site:](http://msdn.microsoft.com/library/ff795613.aspx) operator. Use this
     *  parameter only with the News Search API. Do not specify this parameter when calling the Trending Topics API
     *  or News Category API.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NewsModel object
     */
    Observable<NewsModel> searchAsync(String query, SearchOptionalParameter searchOptionalParameter);

    /**
     * The News Category API lets lets you search on Bing and get back a list of top news articles by category.
     *  This section provides technical details about the query parameters and headers that you use to request news
     *  and the JSON response objects that contain them.  For examples that show how to make requests, see
     *  [Searching the web for
     *  news](https://docs.microsoft.com/en-us/azure/cognitive-services/bing-news-search/search-the-web).
     *
     * @param categoryOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NewsModel object if successful.
     */
    NewsModel category(CategoryOptionalParameter categoryOptionalParameter);

    /**
     * The News Category API lets lets you search on Bing and get back a list of top news articles by category.
     *  This section provides technical details about the query parameters and headers that you use to request news
     *  and the JSON response objects that contain them.  For examples that show how to make requests, see
     *  [Searching the web for
     *  news](https://docs.microsoft.com/en-us/azure/cognitive-services/bing-news-search/search-the-web).
     *
     * @param categoryOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NewsModel object
     */
    Observable<NewsModel> categoryAsync(CategoryOptionalParameter categoryOptionalParameter);

    /**
     * The News Trending Topics API lets lets you search on Bing and get back a list of trending news topics that
     *  are currently trending on Bing. This section provides technical details about the query parameters and
     *  headers that you use to request news and the JSON response objects that contain them.  For examples that
     *  show how to make requests, see [Searching the web for
     *  news](https://docs.microsoft.com/en-us/azure/cognitive-services/bing-news-search/search-the-web).
     *
     * @param trendingOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrendingTopics object if successful.
     */
    TrendingTopics trending(TrendingOptionalParameter trendingOptionalParameter);

    /**
     * The News Trending Topics API lets lets you search on Bing and get back a list of trending news topics that
     *  are currently trending on Bing. This section provides technical details about the query parameters and
     *  headers that you use to request news and the JSON response objects that contain them.  For examples that
     *  show how to make requests, see [Searching the web for
     *  news](https://docs.microsoft.com/en-us/azure/cognitive-services/bing-news-search/search-the-web).
     *
     * @param trendingOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrendingTopics object
     */
    Observable<TrendingTopics> trendingAsync(TrendingOptionalParameter trendingOptionalParameter);

}
