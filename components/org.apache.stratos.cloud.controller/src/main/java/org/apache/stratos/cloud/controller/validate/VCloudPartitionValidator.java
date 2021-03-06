/*
 * Licensed to the Apache Software Foundation (ASF) under one 
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied.  See the License for the 
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.stratos.cloud.controller.validate;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.stratos.cloud.controller.exception.InvalidPartitionException;
import org.apache.stratos.cloud.controller.interfaces.Iaas;
import org.apache.stratos.cloud.controller.pojo.IaasProvider;
import org.apache.stratos.cloud.controller.validate.interfaces.PartitionValidator;


/**
 * The VCloud {@link PartitionValidator} implementation.
 *
 */
public class VCloudPartitionValidator implements PartitionValidator {
    
    @SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(VCloudPartitionValidator.class);
    private IaasProvider iaasProvider;
    @SuppressWarnings("unused")
	private Iaas iaas;

    @Override
    public IaasProvider validate(String partitionId, Properties properties) throws InvalidPartitionException {
        //TODO: implement real validation logic 
        return iaasProvider;
       
    }

    @Override
    public void setIaasProvider(IaasProvider iaas) {
        this.iaasProvider = iaas;
        this.iaas = iaas.getIaas();
    }

}
