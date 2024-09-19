<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="4c0a9d2f-ca26-4f70-a67b-8790bdc7e91e" created="3.53.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="CalculatorSOAP" projectVersion="" updated="3.53.0 2024-05-13T12:06:25Z" resourceRoot="" xmlns:con="http://eviware.com/soapui/config">
  <con:settings/>
  <con:interface xsi:type="con:WsdlInterface" id="4899181f-8776-412f-aa58-fb79093ebae4" wsaVersion="NONE" name="CalculatorSoap12" type="wsdl" bindingName="{http://tempuri.org/}CalculatorSoap12" soapVersion="1_2" anonymous="optional" definition="http://www.dneonline.com/calculator.asmx?wsdl" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <con:settings id="d32e6284-88d1-4bf3-9fac-3da786b59060"/>
    <con:definitionCache type="TEXT" rootPart="http://www.dneonline.com/calculator.asmx?wsdl">
      <con:part>
        <con:url>http://www.dneonline.com/calculator.asmx?wsdl</con:url>
        <con:content><![CDATA[<wsdl:definitions targetNamespace="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="Add">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int"/>
            <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddResult" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Subtract">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int"/>
            <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubtractResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SubtractResult" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Multiply">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int"/>
            <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MultiplyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="MultiplyResult" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Divide">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int"/>
            <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DivideResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DivideResult" type="s:int"/>
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="AddSoapIn">
    <wsdl:part name="parameters" element="tns:Add"/>
  </wsdl:message>
  <wsdl:message name="AddSoapOut">
    <wsdl:part name="parameters" element="tns:AddResponse"/>
  </wsdl:message>
  <wsdl:message name="SubtractSoapIn">
    <wsdl:part name="parameters" element="tns:Subtract"/>
  </wsdl:message>
  <wsdl:message name="SubtractSoapOut">
    <wsdl:part name="parameters" element="tns:SubtractResponse"/>
  </wsdl:message>
  <wsdl:message name="MultiplySoapIn">
    <wsdl:part name="parameters" element="tns:Multiply"/>
  </wsdl:message>
  <wsdl:message name="MultiplySoapOut">
    <wsdl:part name="parameters" element="tns:MultiplyResponse"/>
  </wsdl:message>
  <wsdl:message name="DivideSoapIn">
    <wsdl:part name="parameters" element="tns:Divide"/>
  </wsdl:message>
  <wsdl:message name="DivideSoapOut">
    <wsdl:part name="parameters" element="tns:DivideResponse"/>
  </wsdl:message>
  <wsdl:portType name="CalculatorSoap">
    <wsdl:operation name="Add">
      <wsdl:documentation>Adds two integers. This is a test WebService. ©DNE Online</wsdl:documentation>
      <wsdl:input message="tns:AddSoapIn"/>
      <wsdl:output message="tns:AddSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Subtract">
      <wsdl:input message="tns:SubtractSoapIn"/>
      <wsdl:output message="tns:SubtractSoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Multiply">
      <wsdl:input message="tns:MultiplySoapIn"/>
      <wsdl:output message="tns:MultiplySoapOut"/>
    </wsdl:operation>
    <wsdl:operation name="Divide">
      <wsdl:input message="tns:DivideSoapIn"/>
      <wsdl:output message="tns:DivideSoapOut"/>
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CalculatorSoap" type="tns:CalculatorSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http"/>
    <wsdl:operation name="Add">
      <soap:operation soapAction="http://tempuri.org/Add" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Subtract">
      <soap:operation soapAction="http://tempuri.org/Subtract" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Multiply">
      <soap:operation soapAction="http://tempuri.org/Multiply" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Divide">
      <soap:operation soapAction="http://tempuri.org/Divide" style="document"/>
      <wsdl:input>
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CalculatorSoap12" type="tns:CalculatorSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http"/>
    <wsdl:operation name="Add">
      <soap12:operation soapAction="http://tempuri.org/Add" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Subtract">
      <soap12:operation soapAction="http://tempuri.org/Subtract" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Multiply">
      <soap12:operation soapAction="http://tempuri.org/Multiply" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Divide">
      <soap12:operation soapAction="http://tempuri.org/Divide" style="document"/>
      <wsdl:input>
        <soap12:body use="literal"/>
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Calculator">
    <wsdl:port name="CalculatorSoap" binding="tns:CalculatorSoap">
      <soap:address location="http://www.dneonline.com/calculator.asmx"/>
    </wsdl:port>
    <wsdl:port name="CalculatorSoap12" binding="tns:CalculatorSoap12">
      <soap12:address location="http://www.dneonline.com/calculator.asmx"/>
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>]]></con:content>
        <con:type>http://schemas.xmlsoap.org/wsdl/</con:type>
      </con:part>
    </con:definitionCache>
    <con:endpoints>
      <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
    </con:endpoints>
    <con:operation id="ee9b15ec-d658-417c-9208-dc571755c6c3" isOneWay="false" action="http://tempuri.org/Add" name="Add" bindingOperationName="Add" type="Request-Response" inputName="" receivesAttachments="false" sendsAttachments="false" anonymous="optional">
      <con:settings/>
      <con:call id="01252ed1-70db-4b36-8afb-7d0df5c60da4" name="Add Request">
        <con:settings/>
        <con:encoding>UTF-8</con:encoding>
        <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
        <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Add>\r
         <tem:intA>?</tem:intA>\r
         <tem:intB>?</tem:intB>\r
      </tem:Add>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
        <con:credentials>
          <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
          <con:authType>No Authorization</con:authType>
        </con:credentials>
        <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/AddRequest"/>
      </con:call>
    </con:operation>
    <con:operation id="882e84ac-a8c7-435a-b763-f806d89708e3" isOneWay="false" action="http://tempuri.org/Divide" name="Divide" bindingOperationName="Divide" type="Request-Response" inputName="" receivesAttachments="false" sendsAttachments="false" anonymous="optional">
      <con:settings/>
      <con:call id="3f41c422-2c2c-45e0-ba69-b05120322a6f" name="Divide Request">
        <con:settings/>
        <con:encoding>UTF-8</con:encoding>
        <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
        <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Divide>\r
         <tem:intA>?</tem:intA>\r
         <tem:intB>?</tem:intB>\r
      </tem:Divide>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
        <con:credentials>
          <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
          <con:authType>No Authorization</con:authType>
        </con:credentials>
        <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/DivideRequest"/>
      </con:call>
    </con:operation>
    <con:operation id="68ec4a0b-2658-44af-84c2-913a184f183d" isOneWay="false" action="http://tempuri.org/Multiply" name="Multiply" bindingOperationName="Multiply" type="Request-Response" inputName="" receivesAttachments="false" sendsAttachments="false" anonymous="optional">
      <con:settings/>
      <con:call id="77895da5-eb3d-4638-a68c-b38c47106c01" name="Multiply Request">
        <con:settings/>
        <con:encoding>UTF-8</con:encoding>
        <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
        <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Multiply>\r
         <tem:intA>?</tem:intA>\r
         <tem:intB>?</tem:intB>\r
      </tem:Multiply>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
        <con:credentials>
          <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
          <con:authType>No Authorization</con:authType>
        </con:credentials>
        <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/MultiplyRequest"/>
      </con:call>
    </con:operation>
    <con:operation id="12995107-a34b-49b9-a09f-9b2f1506355a" isOneWay="false" action="http://tempuri.org/Subtract" name="Subtract" bindingOperationName="Subtract" type="Request-Response" inputName="" receivesAttachments="false" sendsAttachments="false" anonymous="optional">
      <con:settings/>
      <con:call id="39a8f2bd-2bf3-4187-bbc7-536489805c49" name="Subtract Request">
        <con:settings/>
        <con:encoding>UTF-8</con:encoding>
        <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
        <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Subtract>\r
         <tem:intA>?</tem:intA>\r
         <tem:intB>?</tem:intB>\r
      </tem:Subtract>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
        <con:credentials>
          <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
          <con:authType>No Authorization</con:authType>
        </con:credentials>
        <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/SubtractRequest"/>
      </con:call>
    </con:operation>
  </con:interface>
  <con:testSuite id="ed80f12f-0792-4259-ad83-c8b0c439ad52" name="Calculator TestSuite">
    <con:settings id="77264b93-f21a-4065-9e5d-5c5ef02fce67"/>
    <con:runType>SEQUENTIAL</con:runType>
    <con:testCase id="a6967463-963f-40b0-b9e7-16c60c933794" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="Project 1 Test Case 1" searchProperties="true" timeout="0">
      <con:settings/>
      <con:testStep type="request" id="c765ced3-7f43-4b7f-af0a-5a4aa1fb9899" name="Add Request">
        <con:settings/>
        <con:config xsi:type="con:RequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:interface>CalculatorSoap12</con:interface>
          <con:operation>Add</con:operation>
          <con:request name="Add Request" outgoingWss="" incomingWss="" timeout="" sslKeystore="" useWsAddressing="false" useWsReliableMessaging="false" wssPasswordType="" id="776e04c5-3d29-4923-ae77-ee6bd04953fe">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:encoding>UTF-8</con:encoding>
            <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
            <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Add>\r
         <tem:intA>10</tem:intA>\r
         <tem:intB>40</tem:intB>\r
      </tem:Add>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
            <con:assertion type="SOAP Response" id="687a03a4-278b-42ec-b520-8384d6f98aaf" name="SOAP Response"/>
            <con:assertion type="Valid HTTP Status Codes" id="a5e1fdb3-838e-4860-8039-054efb3e3317" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:assertion type="Schema Compliance" id="1e75f7e1-5063-4478-bc76-a7f4d84dead0" name="Schema Compliance">
              <con:configuration/>
            </con:assertion>
            <con:assertion type="SOAP Fault Assertion" id="e1b67302-aa60-40bc-b778-a11fa1e8b376" name="Not SOAP Fault"/>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/AddRequest"/>
            <con:wsrmConfig version="1.2"/>
          </con:request>
        </con:config>
      </con:testStep>
      <con:testStep type="request" id="e623f6cf-8cb2-4eaf-b8de-f5931c6c98ca" name="Divide Request">
        <con:settings/>
        <con:config xsi:type="con:RequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:interface>CalculatorSoap12</con:interface>
          <con:operation>Divide</con:operation>
          <con:request name="Divide Request" outgoingWss="" incomingWss="" timeout="" sslKeystore="" useWsAddressing="false" useWsReliableMessaging="false" wssPasswordType="" id="9bcf5f88-6248-410b-af28-1b79d0be694d">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:encoding>UTF-8</con:encoding>
            <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
            <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Divide>\r
         <tem:intA>10</tem:intA>\r
         <tem:intB>2</tem:intB>\r
      </tem:Divide>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
            <con:assertion type="SOAP Response" id="35bc1be5-be9b-44de-9fbb-6498812c2776" name="SOAP Response"/>
            <con:assertion type="Valid HTTP Status Codes" id="625f2f8f-6fbc-447b-9f24-54b27faf6f4a" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:assertion type="Schema Compliance" id="dbaa85d8-3bf8-4144-9410-d3a26ef11027" name="Schema Compliance">
              <con:configuration/>
            </con:assertion>
            <con:assertion type="SOAP Fault Assertion" id="8fe9873d-ae1c-41c6-918c-5dbe9a368361" name="Not SOAP Fault"/>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/DivideRequest"/>
            <con:wsrmConfig version="1.2"/>
          </con:request>
        </con:config>
      </con:testStep>
      <con:testStep type="request" id="b9129e94-6282-4a72-b50f-5e5b36431797" name="Multiply Request">
        <con:settings/>
        <con:config xsi:type="con:RequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:interface>CalculatorSoap12</con:interface>
          <con:operation>Multiply</con:operation>
          <con:request name="Multiply Request" outgoingWss="" incomingWss="" timeout="" sslKeystore="" useWsAddressing="false" useWsReliableMessaging="false" wssPasswordType="" id="9ab0ca1e-3805-4149-87b4-161a9f8b0d1d">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:encoding>UTF-8</con:encoding>
            <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
            <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Multiply>\r
         <tem:intA>5</tem:intA>\r
         <tem:intB>5</tem:intB>\r
      </tem:Multiply>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
            <con:assertion type="SOAP Response" id="d222c175-f2da-47ad-bda4-06e2dd702d03" name="SOAP Response"/>
            <con:assertion type="Valid HTTP Status Codes" id="7c1beee7-c800-402f-8171-b47657e860ad" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:assertion type="Schema Compliance" id="cc9c483b-3560-4349-bb7a-5ad0a02d4c21" name="Schema Compliance">
              <con:configuration/>
            </con:assertion>
            <con:assertion type="SOAP Fault Assertion" id="ad7f615b-4488-4d02-9baa-97cad0219e65" name="Not SOAP Fault"/>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/MultiplyRequest"/>
            <con:wsrmConfig version="1.2"/>
          </con:request>
        </con:config>
      </con:testStep>
      <con:testStep type="request" id="56983c13-609c-4075-a88b-06f68f9d38cb" name="Subtract Request">
        <con:settings/>
        <con:config xsi:type="con:RequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:interface>CalculatorSoap12</con:interface>
          <con:operation>Subtract</con:operation>
          <con:request name="Subtract Request" outgoingWss="" incomingWss="" timeout="" sslKeystore="" useWsAddressing="false" useWsReliableMessaging="false" wssPasswordType="" id="6a8e4ca7-d9b4-4269-a8a9-49b5cc9a3578">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:encoding>UTF-8</con:encoding>
            <con:endpoint>http://www.dneonline.com/calculator.asmx</con:endpoint>
            <con:request><![CDATA[<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://tempuri.org/">\r
   <soap:Header/>\r
   <soap:Body>\r
      <tem:Subtract>\r
         <tem:intA>15</tem:intA>\r
         <tem:intB>12</tem:intB>\r
      </tem:Subtract>\r
   </soap:Body>\r
</soap:Envelope>]]></con:request>
            <con:assertion type="SOAP Response" id="57eef675-b649-4c9d-8377-2c6cd15ff2dd" name="SOAP Response"/>
            <con:assertion type="Valid HTTP Status Codes" id="db4964ce-876a-45af-8cd8-2914048208c5" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:assertion type="Schema Compliance" id="1b4d0419-aea6-48bd-b4b9-ec9df657bf74" name="Schema Compliance">
              <con:configuration/>
            </con:assertion>
            <con:assertion type="SOAP Fault Assertion" id="b3d7aa3e-c53c-4883-9b62-3bc71ad2eefd" name="Not SOAP Fault"/>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:wsaConfig mustUnderstand="NONE" version="200508" action="http://tempuri.org/CalculatorSoap/SubtractRequest"/>
            <con:wsrmConfig version="1.2"/>
          </con:request>
        </con:config>
      </con:testStep>
      <con:properties/>
      <con:reportParameters/>
    </con:testCase>
    <con:properties/>
    <con:reportParameters/>
  </con:testSuite>
  <con:requirements/>
  <con:properties/>
  <con:wssContainer/>
  <con:databaseConnectionContainer/>
  <con:jmsConnectionContainer/>
  <con:oAuth2ProfileContainer/>
  <con:oAuth1ProfileContainer/>
  <con:reporting>
    <con:xmlTemplates/>
    <con:parameters/>
  </con:reporting>
  <con:eventHandlers type="RequestFilter.filterRequest" name="RequestFilter.filterRequest">
    <con:script>// Sample event script to add custom HTTP header to all outgoing REST, SOAP and HTTP(S) calls
// This code is often used for adding custom authentication to ReadyAPI functional tests

// If hardcoding the token, uncomment and change line 5
// token = '4567'

// If your token is parameterized in Project level custom property, uncomment line 8
// token = request.parent.testCase.testSuite.project.getProperty('auth_token').getValue()

// To modify all outgoing calls, remove comments from lines 11 to 16
// headers = request.requestHeaders
// if (headers.containsKey('auth_token2') == false) {
//   headers.put('auth_token2', token)
//   request.requestHeaders = headers
// }</con:script>
  </con:eventHandlers>
  <con:eventHandlers type="TestRunListener.afterStep" name="TestRunListener.afterStep">
    <con:script>// Save all test step results into files
// Change the directory path in line 5 to a location where you want to store details
// then uncomment lines 5 to 10

// filePath = 'C:\\tempOutputDirectory\\'
// fos = new java.io.FileOutputStream(filePath + testStepResult.testStep.label + '.txt', true)
// pw = new java.io.PrintWriter(fos)
// testStepResult.writeTo(pw)
// pw.close()
// fos.close()</con:script>
  </con:eventHandlers>
  <con:authRepository/>
  <con:tags/>
</con:soapui-project>