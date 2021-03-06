/*
 * Copyright 2016-2017, Youqian Yue (devefx@163.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.devefx.validator.messageinterpolation;

import org.devefx.validator.internal.resourceloading.ResourceBundleLocator;

import java.util.Locale;
import java.util.Map;

public interface MessageInterpolator {

    String interpolate(String messageTemplate, Context context, ResourceBundleLocator validationResourceBundleLocator);

    String interpolate(String messageTemplate, Context context, ResourceBundleLocator validationResourceBundleLocator,  Locale locale);

    String interpolateBundleMessage(String messageTemplate, ResourceBundleLocator validationResourceBundleLocator);
    
    String interpolateBundleMessage(String messageTemplate, ResourceBundleLocator validationResourceBundleLocator,  Locale locale);
    
    interface Context {

        Map<String, Object> getInitParams();

        Object getValidatedValue();

        Class<?> getRootBeanType();

        <T> T unwrap(Class<T> type);
    }
}
