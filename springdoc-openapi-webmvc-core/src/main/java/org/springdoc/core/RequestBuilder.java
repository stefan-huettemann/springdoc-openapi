/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.springdoc.core;

import java.util.List;
import java.util.Optional;

import org.springdoc.core.customizers.OperationCustomizer;
import org.springdoc.core.customizers.ParameterCustomizer;

public class RequestBuilder extends AbstractRequestBuilder {

	static {
		addResponseWrapperToIgnore(javax.servlet.ServletRequest.class);
		addResponseWrapperToIgnore(javax.servlet.ServletResponse.class);
		addResponseWrapperToIgnore(javax.servlet.http.HttpServletRequest.class);
		addResponseWrapperToIgnore(javax.servlet.http.HttpServletResponse.class);
		addResponseWrapperToIgnore(javax.servlet.http.HttpSession.class);
		addResponseWrapperToIgnore(javax.servlet.http.HttpSession.class);
	}

	public RequestBuilder(AbstractParameterBuilder parameterBuilder, RequestBodyBuilder requestBodyBuilder,
			OperationBuilder operationBuilder, Optional<List<OperationCustomizer>> customizers,
			Optional<List<ParameterCustomizer>> parameterCustomizers) {
		super(parameterBuilder, requestBodyBuilder, operationBuilder, customizers, parameterCustomizers);
	}
}
