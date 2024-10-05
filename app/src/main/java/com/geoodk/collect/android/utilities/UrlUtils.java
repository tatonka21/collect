/*
 * Copyright (C) 2009 University of Washington
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.geoodk.collect.android.utilities;

import io.github.pixee.security.HostValidator;
import io.github.pixee.security.Urls;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlUtils {

    public static boolean isValidUrl(String url) {

        try {
            Urls.create(url, Urls.HTTP_PROTOCOLS, HostValidator.DENY_COMMON_INFRASTRUCTURE_TARGETS);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }

    }

}
