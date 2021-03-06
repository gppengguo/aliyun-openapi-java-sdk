/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ons.transform.v20180516;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180516.OnsSubscriptionGetResponse;
import com.aliyuncs.ons.model.v20180516.OnsSubscriptionGetResponse.SubscribeInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsSubscriptionGetResponseUnmarshaller {

	public static OnsSubscriptionGetResponse unmarshall(OnsSubscriptionGetResponse onsSubscriptionGetResponse, UnmarshallerContext context) {
		
		onsSubscriptionGetResponse.setRequestId(context.stringValue("OnsSubscriptionGetResponse.RequestId"));
		onsSubscriptionGetResponse.setHelpUrl(context.stringValue("OnsSubscriptionGetResponse.HelpUrl"));

		List<SubscribeInfoDo> data = new ArrayList<SubscribeInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsSubscriptionGetResponse.Data.Length"); i++) {
			SubscribeInfoDo subscribeInfoDo = new SubscribeInfoDo();
			subscribeInfoDo.setId(context.longValue("OnsSubscriptionGetResponse.Data["+ i +"].Id"));
			subscribeInfoDo.setChannelId(context.integerValue("OnsSubscriptionGetResponse.Data["+ i +"].ChannelId"));
			subscribeInfoDo.setChannelName(context.stringValue("OnsSubscriptionGetResponse.Data["+ i +"].ChannelName"));
			subscribeInfoDo.setOwner(context.stringValue("OnsSubscriptionGetResponse.Data["+ i +"].Owner"));
			subscribeInfoDo.setConsumerId(context.stringValue("OnsSubscriptionGetResponse.Data["+ i +"].ConsumerId"));
			subscribeInfoDo.setTopic(context.stringValue("OnsSubscriptionGetResponse.Data["+ i +"].Topic"));
			subscribeInfoDo.setStatus(context.integerValue("OnsSubscriptionGetResponse.Data["+ i +"].Status"));
			subscribeInfoDo.setStatusName(context.stringValue("OnsSubscriptionGetResponse.Data["+ i +"].StatusName"));
			subscribeInfoDo.setCreateTime(context.longValue("OnsSubscriptionGetResponse.Data["+ i +"].CreateTime"));
			subscribeInfoDo.setUpdateTime(context.longValue("OnsSubscriptionGetResponse.Data["+ i +"].UpdateTime"));
			subscribeInfoDo.setInstanceId(context.stringValue("OnsSubscriptionGetResponse.Data["+ i +"].InstanceId"));
			subscribeInfoDo.setIndependentNaming(context.booleanValue("OnsSubscriptionGetResponse.Data["+ i +"].IndependentNaming"));

			data.add(subscribeInfoDo);
		}
		onsSubscriptionGetResponse.setData(data);
	 
	 	return onsSubscriptionGetResponse;
	}
}