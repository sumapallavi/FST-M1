<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="cbc06c67-6754-4cbc-bd2a-79472c0a6454" created="3.53.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="Activity1" projectVersion="" updated="3.53.0 2024-05-13T12:06:25Z" xmlns:con="http://eviware.com/soapui/config">
  <con:settings/>
  <con:interface xsi:type="con:RestService" id="d0a46a7b-fc15-4814-ad92-0d29d1107a67" wadlVersion="http://wadl.dev.java.net/2009/02" name="https://petstore.swagger.io" type="rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <con:settings id="66ab2505-c2cb-4b8b-ae64-097337782374"/>
    <con:definitionCache type="TEXT" rootPart=""/>
    <con:endpoints>
      <con:endpoint>https://petstore.swagger.io</con:endpoint>
    </con:endpoints>
    <con:resource name="User" path="/v2/user" id="58ee6725-5544-41ea-a56a-5fccf5ec519e">
      <con:settings/>
      <con:parameters/>
      <con:method name="User" id="7ffd13af-f266-4d3e-ae5d-92537d206a85" method="POST">
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
        <con:request name="Request 1" id="de755c11-baf0-48ee-9c50-d6ee9d7959fa" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:parameters/>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="Login" path="/v2/user/login" id="63c17159-0015-407c-bc08-3f0430cdd968">
      <con:settings/>
      <con:parameters/>
      <con:method name="Login" id="75b78b13-372e-421e-9918-f9e26085aa4a" method="GET">
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
        <con:request name="Request 1" id="0680615d-9646-4577-9a8d-589c7748fce1" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
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
    <con:resource name="Username" path="/v2/user/{username}" id="87698e4d-dcb2-4468-a513-b42f64db4f70">
      <con:settings/>
      <con:parameters/>
      <con:method name="Username" id="c212ee09-5453-4f09-8bd8-6f9bdbbf8497" method="GET">
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
        <con:request name="Request 1" id="2928218c-0391-4c82-9f6c-3d33a5ae9cdb" mediaType="application/json">
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
      <con:method name="Username 2" id="b5d6dcea-9196-4bbf-b2f7-ca56a84c2262" method="DELETE">
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
        <con:request name="Request 1" id="7c7c0ace-b746-4f72-8ee8-3baafe406e29" mediaType="application/json" postQueryString="false">
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
    <con:resource name="Logout" path="/v2/user/logout" id="94325d5c-c11c-40ec-aaed-4e546d484db1">
      <con:settings/>
      <con:parameters/>
      <con:method name="Logout" id="a205b11d-4f89-4064-8cc3-425f7449509f" method="GET">
        <con:settings/>
        <con:parameters/>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:log="https://petstore.swagger.io/v2/user/logout">log:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="1d4e531f-666d-4d2c-a0a5-2455c46f2bf7" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:parameters/>
        </con:request>
      </con:method>
    </con:resource>
  </con:interface>
  <con:testSuite id="7b559d6f-35e2-4ffe-b1e9-ecd579938a6a" name="https://petstore.swagger.io Test Suite">
    <con:settings id="7d0a8953-693c-40e4-9703-59b86df41b18"/>
    <con:runType>SEQUENTIAL</con:runType>
    <con:testCase id="75b18a18-66d2-4589-a804-4267e71be3f2" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="Test Case" searchProperties="true" timeout="0">
      <con:settings/>
      <con:testStep type="restrequest" name="Post Request" id="6e2ee4a9-9063-4f63-8d75-d140888420b7">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user" methodName="User" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Post Request" id="de755c11-baf0-48ee-9c50-d6ee9d7959fa" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request>{
	"id": 11,
    "username": "testusers",
    "firstName": "Johnsk",
    "lastName": "Doesk",
    "email": "johnsk@doesk.com",
    "password": "testusers",
    "phone": "1237897890",
    "userStatus": 1
}</con:request>
            <con:originalUri>https://petstore.swagger.io/v2/user</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="e2727639-f29a-4e44-a493-53ad8923ad5e" name="Valid HTTP Status Codes">
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
      <con:testStep type="restrequest" name="Login Request" id="0ccea4fb-4fa9-4005-821a-695fdd004443">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/login" methodName="Login" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Login Request" id="0680615d-9646-4577-9a8d-589c7748fce1" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/login</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="6dccf2b0-7d61-4705-9b80-9d1b1b802d59" name="Valid HTTP Status Codes">
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
              <con:entry key="password" value="JohnsskPassword"/>
              <con:entry key="username" value="JohnskDoesk"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>username</con:entry>
              <con:entry>password</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Get Request" id="d7463347-dbeb-4648-9e0c-1431c8250b14">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/{username}" methodName="Username" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Get Request" id="2928218c-0391-4c82-9f6c-3d33a5ae9cdb" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/username</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="24cddf9e-1f96-4a51-8155-c8fd03d260ef" name="Valid HTTP Status Codes">
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
              <con:entry key="username" value="JohnskDeosk"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>username</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Logout Request" id="acb17751-8821-4e9d-ba2b-ea68f634047e">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/logout" methodName="Logout" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Logout Request" id="1d4e531f-666d-4d2c-a0a5-2455c46f2bf7" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/logout</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="0cc4189d-51d7-4273-af7e-768969c53d96" name="Valid HTTP Status Codes">
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
      <con:testStep type="restrequest" name="Delete Request" id="a7248813-57f5-4083-930d-8ba76762bf74">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/user/{username}" methodName="Username 2" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Delete Request" id="7c7c0ace-b746-4f72-8ee8-3baafe406e29" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/user/username</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="42c1ccb9-5c98-4c57-b871-38996fcff0c2" name="Valid HTTP Status Codes">
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
              <con:entry key="username" value="JonhskDeosk"/>
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