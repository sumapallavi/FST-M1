<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="52f4899c-42ca-45d6-a4dc-cfa1744981db" created="3.53.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="Activity1" projectVersion="" updated="3.53.0 2024-05-13T12:06:25Z" xmlns:con="http://eviware.com/soapui/config">
  <con:settings/>
  <con:interface xsi:type="con:RestService" id="d41fd6de-3371-4489-93c9-3801a1831c3f" wadlVersion="http://wadl.dev.java.net/2009/02" name="https://petstore.swagger.io" type="rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <con:settings id="2163b93f-eee1-4234-aeb9-46cd5b8791ae"/>
    <con:definitionCache/>
    <con:endpoints>
      <con:endpoint>https://petstore.swagger.io</con:endpoint>
    </con:endpoints>
    <con:resource name="User" path="/v2/user" id="58ad90e1-181f-436a-b3f0-1abed3255769">
      <con:settings/>
      <con:parameters/>
      <con:method name="User" id="e30ab487-64ec-427f-8602-02ae248edae3" method="POST">
        <con:settings/>
        <con:parameters/>
        <con:representation type="REQUEST">
          <con:mediaType>application/json</con:mediaType>
          <con:params/>
        </con:representation>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:user="https://petstore.swagger.io/v2/user">user:Response</con:element>
        </con:representation>
        <con:representation type="FAULT">
          <con:mediaType>application/xml</con:mediaType>
          <con:status>405</con:status>
          <con:params/>
          <con:element>apiResponse</con:element>
        </con:representation>
        <con:request name="Request 1" id="73236c65-1bfa-4639-83ca-9896ec850658" mediaType="application/json" postQueryString="false">
          <con:settings>
            <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
          </con:settings>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:request/>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
          <con:parameters/>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="Login" path="/v2/user/login" id="4dc7af8c-50fc-43e6-9693-57bece0fb89a">
      <con:settings/>
      <con:parameters/>
      <con:method name="Login" id="65c1a692-6fc0-422e-9c7b-1f06ef48cb89" method="GET">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>username</con:name>
            <con:value>{username}</con:value>
            <con:style>QUERY</con:style>
            <con:default>{username}</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
          <con:parameter required="true">
            <con:name>password</con:name>
            <con:value>{password}</con:value>
            <con:style>QUERY</con:style>
            <con:default>{password}</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
        </con:parameters>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:log="https://petstore.swagger.io/v2/user/login">log:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="dc0f7378-bb94-407b-bf38-488a79c4059c" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:request/>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
          <con:parameters>
            <con:entry key="password" value="{password}"/>
            <con:entry key="username" value="{username}"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>username</con:entry>
            <con:entry>password</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="Logout" path="/v2/user/logout" id="9988fe60-fa10-4bc0-84ee-05ea2cdd423a">
      <con:settings/>
      <con:parameters/>
      <con:method name="Logout" id="396c282c-056c-446f-b640-4cc4e8d07b27" method="GET">
        <con:settings/>
        <con:parameters/>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:log="https://petstore.swagger.io/v2/user/logout">log:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="504f36ce-7a78-4ed6-880c-68ca2af581a5" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:request/>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
          <con:parameters/>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="Username" path="/v2/user/{username}" id="51d7d8eb-f3d2-42d2-b019-b38513f7bffc">
      <con:settings/>
      <con:parameters/>
      <con:method name="Method1" id="796ed9fb-13df-45c0-8046-13e486c57ca6" method="GET">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>username</con:name>
            <con:value>username</con:value>
            <con:style>TEMPLATE</con:style>
            <con:default>username</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
        </con:parameters>
        <con:representation type="FAULT">
          <con:mediaType>application/json</con:mediaType>
          <con:status>404</con:status>
          <con:params/>
          <con:element xmlns:user="https://petstore.swagger.io/v2/user/username">user:Fault</con:element>
        </con:representation>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:user="https://petstore.swagger.io/v2/user/username">user:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="ca34e2da-4bab-4662-bb51-6bc7eb2e22a9" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:request/>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
          <con:parameters>
            <con:entry key="username" value="username"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>username</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
      <con:method name="Method2" id="cef24125-9c9a-4682-b6a8-46eb06d3175b" method="DELETE">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>username</con:name>
            <con:value>username</con:value>
            <con:style>TEMPLATE</con:style>
            <con:default>username</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
        </con:parameters>
        <con:representation type="FAULT">
          <con:mediaType xsi:nil="true"/>
          <con:status>404</con:status>
          <con:params/>
          <con:element>data</con:element>
        </con:representation>
        <con:representation type="REQUEST">
          <con:mediaType>application/json</con:mediaType>
          <con:params/>
        </con:representation>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:joh="https://petstore.swagger.io/v2/user/JohnDoe">joh:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="943fe82e-3b07-4e3b-bae3-349f40fcfd3b" mediaType="application/json" postQueryString="false">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:request/>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
          <con:parameters>
            <con:entry key="username" value="username"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>username</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
    </con:resource>
  </con:interface>
  <con:testSuite id="be84c98c-f522-4522-905e-f9134321672d" name="https://petstore.swagger.io Test Suite">
    <con:settings id="c531d05c-57e8-4c64-b055-660891395037"/>
    <con:runType>SEQUENTIAL</con:runType>
    <con:testCase id="58be09c1-5312-4861-8bd3-b39b064e7128" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="Test Case" searchProperties="true" timeout="0">
      <con:settings/>
      <con:testStep type="restrequest" name="Post Request" id="70d841d3-9707-4a41-ab44-6db3891435a9">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user" methodName="User" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Post Request" id="73236c65-1bfa-4639-83ca-9896ec850658" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request>{
   "id" : 1234,
   "username" : "maheshuser",
   "firstName" : "mahesh",
   "lastName" : "babu",
   "email" : "mahesh@example.com",
   "password" : "mahesh123",
   "phone" : "1234567890",
   "userStatus" : 0
}</con:request>
            <con:originalUri>https://petstore.swagger.io/v2/user</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="e6d30f03-8bde-41fc-8474-8db04a154ae0" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters/>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Login Request" id="88723072-8b01-4409-950f-5a5f105fab65">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/login" methodName="Login" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Login Request" id="dc0f7378-bb94-407b-bf38-488a79c4059c" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/login</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="c0c44076-392a-4c65-89bf-71e644632eb8" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters>
              <con:entry key="password" value="mahesh123"/>
              <con:entry key="username" value="testuser"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>username</con:entry>
              <con:entry>password</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Get Request" id="0e83c9c0-d5a1-47f0-b657-005aeec2df3e">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/{username}" methodName="Method1" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Get Request" id="ca34e2da-4bab-4662-bb51-6bc7eb2e22a9" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/username</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="5a3056bd-2bba-4684-a5dd-300f8aaa062a" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters>
              <con:entry key="username" value="maheshuser"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>username</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Logout Request" id="9584f46a-8dd7-445a-8049-4232cef8a311">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/logout" methodName="Logout" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Logout Request" id="504f36ce-7a78-4ed6-880c-68ca2af581a5" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/logout</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="c3a61e1f-0296-46a8-a3c4-3f46c6b29599" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters/>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Delete Request" id="9b1993c5-23e6-4e28-b472-deedf47ec59e">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/{username}" methodName="Method2" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Delete Request" id="943fe82e-3b07-4e3b-bae3-349f40fcfd3b" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/JohnDoe</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="a9b0b24c-3168-472b-8a46-215105a7ab63" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters>
              <con:entry key="username" value="maheshuser"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>username</con:entry>
            </con:parameterOrder>
          </con:restRequest>
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