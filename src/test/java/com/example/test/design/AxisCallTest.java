/**  
 * Project Name:spring-cloud-eureka-client  
 * File Name:AxisCallTest.java  
 * Package Name:com.example.test.design 
 * Date:2019年5月8日下午12:01:34  
 * Copyright (c) 2019,  
 *  
*/

package com.example.test.design;

import java.io.IOException;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.AxisMessage;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName:AxisCallTest Date: 2019年5月8日 下午12:01:34
 * 
 * @version
 * @author yin
 * @since JDK 1.8
 * @see
 */
public class AxisCallTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AxisCallTest.class);

	private static final String URL = "http://192.168.18.71:8010/Portal/WebServices/XZWebService.asmx";

	private static final String NAMESPACE = "http://tempuri.org/";

	private static final String METHODNAME = "GetSubsidyApplyByUserName";

	@Test
	public void callTest() {
		try {
			String res = this.callXZWebService("林国伟");
			LOGGER.info(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String callXZWebService(String userName) throws Exception {
		// String url = "http://192.168.18.71:8010";
		// String endpoint = url + "/Portal/WebServices/XZWebService.asmx";
		/** 命名空间 */
		String namespace = "http://tempuri.org/";
		/** 调用的方法名 */
		String method = "GetSubsidyApplyByUserName";
		Service service = new Service();
		/** 通过service创建call对象 */
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress(new java.net.URL(URL));
		/** 设置调用方法 */
		call.setOperationName(new QName(namespace, method));
		call.setUseSOAPAction(true);
		call.addParameter(new QName(namespace, "userName"), org.apache.axis.encoding.XMLType.XSD_STRING,
				javax.xml.rpc.ParameterMode.IN);
		/** 设置返回类型 */
		call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
		call.setSOAPActionURI("http://tempuri.org/" + method);
		/** 设置输出参数，OUT代表输出 */
		call.addParameter("GetSubsidyApplyByUserNameResult", org.apache.axis.encoding.XMLType.XSD_STRING,
				javax.xml.rpc.ParameterMode.OUT);
		String ret = (String) call.invoke(new Object[] { userName });
		return ret;
	}

	@Test
	public void testAxis2() throws Exception {
		String result = testAxis2Call("林国伟");
		LOGGER.info(result);
	}

	// @SuppressWarnings("unused")
	private String testAxis2Call(String userName) throws Exception {
		try {
			ServiceClient serviceClient = new ServiceClient();
			EndpointReference reference = new EndpointReference(URL);
			org.apache.axis2.client.Options options = serviceClient.getOptions();
			options.setTo(reference);
			/** 确定调用方法（wsdl 命名空间地址 (wsdl文档中的targetNamespace) 和 方法名称 的组合） */
			options.setAction(NAMESPACE + METHODNAME);
			OMFactory fac = OMAbstractFactory.getOMFactory();
			/**
			 * 指定命名空间，参数： uri--即为wsdl文档的targetNamespace，命名空间 perfix--可不填
			 */
			OMNamespace omNs = fac.createOMNamespace(NAMESPACE, "");
			/** 指定方法 */
			OMElement method = fac.createOMElement(METHODNAME, omNs);
			/** 指定方法的参数 */
			OMElement theRegionCode = fac.createOMElement("userName", omNs);
			theRegionCode.setText(userName);
			method.addChild(theRegionCode);
			method.build();
			/** 远程调用web服务 */
			OMElement result = serviceClient.sendReceive(method);
			String first = result.getFirstElement().getText();
			return first;
		} catch (org.apache.axis2.AxisFault e) {
			throw new Exception(e);
		}
	}

//	@Test
//	public void testRpcClient() throws AxisFault {
//		String res = rpcClient("林国伟");
//		LOGGER.info(res);
//	}
	
	
	public static void main(String[] args) {
		AxisCallTest axisCallTest = new AxisCallTest();
		try {
			axisCallTest.rpcClient("林国伟");
//			LOGGER.info(res);
		} catch (Exception e) {
			e.printStackTrace();  
		}
	}

	/**
	 * Remote Procedure Call rpcClient:(这里用一句话描述这个方法的作用). <br/>
	 *
	 * @param userName
	 * @return
	 * @throws IOException 
	 * @throws Excepti
	 * @since JDK 1.8
	 */
	private void rpcClient(String userName) throws IOException {
//		String result = "";
		/** 使用RPC方式调用WebService */
		RPCServiceClient serviceClient = new RPCServiceClient();
		/** 创建WSDL的URL，注意不是服务地址 */
		// String url = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";
		/** 指定调用WebService的URL */
		EndpointReference targetEPR = new EndpointReference(URL);
		Options options = serviceClient.getOptions();
		/** 确定目标服务地址 */
		options.setTo(targetEPR);
		/** 确定调用方法（wsdl 命名空间地址 (wsdl文档中的targetNamespace) 和 方法名称 的组合） */
		options.setAction(NAMESPACE + METHODNAME);
		/** 指定方法的参数值 */
		Object[] parameters = new Object[] { userName };
		QName opName = new QName(NAMESPACE, "userName");
		/**
		 * 创建服务名称 1.namespaceURI - 命名空间地址 (wsdl文档中的targetNamespace) 2.localPart - 服务视图名
		 * (wsdl文档中operation的方法名称，例如<wsdl:operation name="getMobileCodeInfo">)
		 */
		/** 调用方法一 ：传递参数，阻塞Blocking调用服务，获取服务返回结果集 */
		// OMElement element = serviceClient.invokeBlocking(opName, parameters);
		/** 调用方法二：非阻塞调用 */
		serviceClient.invokeNonBlocking(opName, parameters, new AxisCallback() {
			/**
			 * 
			 * TODO This is called when we receive a message.
			 * 
			 * @see org.apache.axis2.client.async.AxisCallback#onMessage(org.apache.axis2.context.MessageContext)
			 */
			@Override
			public void onMessage(MessageContext msgContext) {
//				AxisMessage message = msgContext.getAxisMessage();
				String resp = msgContext.getEnvelope().getFirstElement().getText();
//				result = message;
				LOGGER.info("返回结果，{}", resp);
			}

			/**
			 * 
			 * TODO This gets called when a fault message is received.
			 * 
			 * @see org.apache.axis2.client.async.AxisCallback#onFault(org.apache.axis2.context.MessageContext)
			 */
			@Override
			public void onFault(MessageContext msgContext) {
				AxisMessage message = msgContext.getAxisMessage();
				String info = message.toString();
				LOGGER.info("默认信息被接收，{}", info);
			}

			/**
			 * 
			 * TODO This gets called ONLY when an internal processing exception occurs.
			 * 
			 * @see org.apache.axis2.client.async.AxisCallback#onError(java.lang.Exception)
			 */
			@Override
			public void onError(Exception e) {
				LOGGER.info("RPC 调用webservice发生错误");
			}

			/**
			 * 
			 * TODO This is called at the end of the MEP no matter what happens, quite like
			 * a finally block.
			 * 
			 * @see org.apache.axis2.client.async.AxisCallback#onComplete()
			 */
			@Override
			public void onComplete() {
				LOGGER.info("异步调用完成");
			}
		});
		/**
		 * 值得注意的是，返回结果就是一段由OMElement对象封装的xml字符串。
		 * 我们可以对之灵活应用,下面我取第一个元素值，并打印之。因为调用的方法返回一个结果
		 */
		// String result = element.getFirstElement().getText(); 
//		return result;
		 System.in.read();
	}

//	AxisMessage result = null;
}
