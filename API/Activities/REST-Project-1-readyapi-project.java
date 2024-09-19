<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="7cb284f1-e08a-47bb-a52c-de3f32cabce7" created="3.53.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="Pet" projectVersion="" resourceRoot="" updated="3.53.0 2024-05-13T12:06:25Z" xmlns:con="http://eviware.com/soapui/config">
  <con:settings/>
  <con:interface xsi:type="con:RestService" id="46cc5154-a77e-4286-8123-cc4a76469ed3" wadlVersion="http://wadl.dev.java.net/2009/02" name="https://petstore.swagger.io" type="rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <con:settings id="0cb508b4-d8a3-40e2-a131-5beb469e755c"/>
    <con:definitionCache type="TEXT" rootPart=""/>
    <con:endpoints>
      <con:endpoint>https://petstore.swagger.io</con:endpoint>
    </con:endpoints>
    <con:resource name="FindByStatus" path="/v2/pet/findByStatus" id="f87abb5e-3471-4fad-a760-53b470c49d2f">
      <con:settings/>
      <con:parameters/>
      <con:method name="FindByStatus" id="3a5ff8c7-ea8b-43a6-8bcd-84990c213171" method="GET">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>status</con:name>
            <con:value>sold</con:value>
            <con:style>QUERY</con:style>
            <con:default>sold</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
        </con:parameters>
        <con:representation type="REQUEST">
          <con:mediaType>application/json</con:mediaType>
          <con:params/>
        </con:representation>
        <con:representation type="FAULT">
          <con:mediaType>application/xml</con:mediaType>
          <con:status>405</con:status>
          <con:params/>
          <con:element>apiResponse</con:element>
        </con:representation>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element>Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="a80ee819-c212-430d-b9ca-6271b2c5a558" mediaType="application/json" postQueryString="false">
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
          <con:parameters>
            <con:entry key="status" value="sold"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>status</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="Pet" path="/v2/pet" id="63530823-8189-4a05-8452-649f1bfa4c94">
      <con:settings/>
      <con:parameters/>
      <con:method name="Pet" id="cc107df9-d913-4109-808d-728c90554ca2" method="POST">
        <con:settings/>
        <con:parameters/>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:pet="https://petstore.swagger.io/v2/pet">pet:Response</con:element>
        </con:representation>
        <con:representation type="REQUEST">
          <con:mediaType>application/json</con:mediaType>
          <con:params/>
        </con:representation>
        <con:request name="Request 1" id="1acc0390-44df-4988-9567-d2beb71cf797" mediaType="application/json" postQueryString="false">
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
    <con:resource name="PetId" path="/v2/pet/{petId}" id="99bb08c0-b844-46f6-a155-09e7168aaca9">
      <con:settings/>
      <con:parameters/>
      <con:method name="PetId" id="190402ce-b789-41c6-bf03-bc29cbd5ee8c" method="DELETE">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>petId</con:name>
            <con:value>petId</con:value>
            <con:style>TEMPLATE</con:style>
            <con:default>petId</con:default>
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
          <con:element xmlns:ns="https://petstore.swagger.io/v2/pet/12345">ns:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="82a781b9-b4ab-48bc-868e-cbec3250a0cf" mediaType="application/json" postQueryString="false">
          <con:settings/>
          <con:endpoint>https://petstore.swagger.io</con:endpoint>
          <con:request/>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
          <con:parameters>
            <con:entry key="petId" value="petId"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>petId</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
    </con:resource>
  </con:interface>
  <con:testSuite id="2f4e4de1-a0a9-49f9-bb91-70f596b5876c" name="https://petstore.swagger.io Test Suite">
    <con:settings id="0a6a65d3-c612-4c35-a450-59284c15cc8c"/>
    <con:runType>SEQUENTIAL</con:runType>
    <con:testCase id="c52f096f-c1c7-4fca-b0ce-8639d72a33e0" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="TestCase" searchProperties="true" timeout="0">
      <con:settings>
        <con:setting id="IncludeOverview">true</con:setting>
        <con:setting id="IncludeResults">true</con:setting>
        <con:setting id="FlowLayout">false</con:setting>
        <con:setting id="ErrorDetails">true</con:setting>
        <con:setting id="IncludeCoverage">true</con:setting>
      </con:settings>
      <con:testStep type="restrequest" name="Post Request" id="ff6747f8-d5f3-4960-bd6a-2d437db218c9">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/pet" methodName="Pet" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Post Request" id="1acc0390-44df-4988-9567-d2beb71cf797" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request>{
	"id": 12345,
	"name": "Rocky",
	"status": "alive"
}</con:request>
            <con:originalUri>https://petstore.swagger.io/v2/pet</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="79e1fd58-00d1-4133-ae1c-71ee6f7909bb" name="Valid HTTP Status Codes">
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
      <con:testStep type="transfer" name="Property Transfer" id="082dbf83-18a5-41cb-9baa-c6de1f2c3983">
        <con:settings/>
        <con:config xsi:type="con:PropertyTransfersStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true" ignoreEmpty="false" transferToAll="false" entitize="false" transferChildNodes="false">
            <con:name>idTransfer</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Post Request</con:sourceStep>
            <con:sourcePath>$['id']</con:sourcePath>
            <con:targetType>petId</con:targetType>
            <con:targetStep>Delete Request</con:targetStep>
            <con:targetPath/>
            <con:type>JSONPATH</con:type>
            <con:targetTransferType>JSONPATH</con:targetTransferType>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true" ignoreEmpty="false" transferToAll="false" entitize="false" transferChildNodes="false">
            <con:name>statusTransfer</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Post Request</con:sourceStep>
            <con:sourcePath>$['status']</con:sourcePath>
            <con:targetType>status</con:targetType>
            <con:targetStep>Get Request</con:targetStep>
            <con:type>JSONPATH</con:type>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Get Request" id="bed7db88-f5e6-4d20-9ee0-956feefe7b66">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/pet/findByStatus" methodName="FindByStatus" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Get Request" id="a80ee819-c212-430d-b9ca-6271b2c5a558" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request>{
	"id": 12345,
	"name": "Rocky",
	"status": "alive"
}</con:request>
            <con:originalUri>https://petstore.swagger.io/v2/pet/findByStatus</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="f2dfc862-9cf6-4e3e-b53f-edebb032750a" name="Valid HTTP Status Codes">
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
              <con:entry key="status" value="alive"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>status</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Delete Request" id="3846569a-6ae5-44fb-a0ef-483cd5b98895">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/pet/{petId}" methodName="PetId" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Delete Request" id="82a781b9-b4ab-48bc-868e-cbec3250a0cf" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/pet/12345</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="939bb49b-0a93-4e62-89d0-adb715e257bf" name="Valid HTTP Status Codes">
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
              <con:entry key="petId" value="12345"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>petId</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:properties/>
      <con:reportParameters/>
    </con:testCase>
    <con:testCase id="a9a48f03-fad2-4281-a27d-bfe4d1e3e066" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="Data-DrivenTestCase" searchProperties="true" timeout="0">
      <con:settings>
        <con:setting id="IncludeOverview">true</con:setting>
        <con:setting id="IncludeResults">true</con:setting>
        <con:setting id="FlowLayout">false</con:setting>
        <con:setting id="ErrorDetails">true</con:setting>
        <con:setting id="IncludeCoverage">true</con:setting>
      </con:settings>
      <con:testStep type="datasource" name="Data Source" id="fc3c221d-5a15-40df-98e4-7564fc9ef23c">
        <con:settings>
          <con:setting id="com.eviware.soapui.impl.wsdl.teststeps.datasource.DataSourceContainer@prepared-properties">&lt;xml-fragment/></con:setting>
        </con:settings>
        <con:config xsi:type="con:DataSourceStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:dataSource type="JDBC">
            <con:configuration>
              <driver>com.mysql.jdbc.Driver</driver>
              <connstr>jdbc:mysql://db4free.net:3306/fstm1db?user=fstm1db&amp;password=PASS_VALUE</connstr>
              <pass>6Y6NowPybq</pass>
              <Connection>FSTDB( Default environment )</Connection>
              <query>Select *
From petData</query>
              <fetchSize/>
              <stored-procedure>false</stored-procedure>
            </con:configuration>
          </con:dataSource>
          <con:shared>true</con:shared>
          <con:restartShared>true</con:restartShared>
          <con:property>petId</con:property>
          <con:property>petName</con:property>
          <con:property>petStatus</con:property>
          <con:restartOnRun>true</con:restartOnRun>
          <con:stopDatasourceExhausted>false</con:stopDatasourceExhausted>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Post Request" id="e93fea28-770d-4e29-b225-47aa562e11fe">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/pet" methodName="Pet" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Post Request" id="1acc0390-44df-4988-9567-d2beb71cf797" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request>{
	"id": ${Data Source#petId},
	"name": "${Data Source#petName}",
	"status": "${Data Source#petStatus}"
}</con:request>
            <con:originalUri>https://petstore.swagger.io/v2/pet</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="79e1fd58-00d1-4133-ae1c-71ee6f7909bb" name="Valid HTTP Status Codes">
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
      <con:testStep type="transfer" name="Property Transfer" id="86468183-0ce9-404e-8d6a-c1af98d4fb8a">
        <con:settings/>
        <con:config xsi:type="con:PropertyTransfersStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true" ignoreEmpty="false" transferToAll="false" entitize="false" transferChildNodes="false">
            <con:name>idTransfer</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Post Request</con:sourceStep>
            <con:sourcePath>$['id']</con:sourcePath>
            <con:targetType>petId</con:targetType>
            <con:targetStep>Delete Request</con:targetStep>
            <con:targetPath/>
            <con:type>JSONPATH</con:type>
            <con:targetTransferType>JSONPATH</con:targetTransferType>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true" ignoreEmpty="false" transferToAll="false" entitize="false" transferChildNodes="false">
            <con:name>statusTransfer</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Post Request</con:sourceStep>
            <con:sourcePath>$['status']</con:sourcePath>
            <con:targetType>status</con:targetType>
            <con:targetStep>Get Request</con:targetStep>
            <con:type>JSONPATH</con:type>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Get Request" id="5c6ddd1f-e6e9-4499-8916-fae0535a7deb">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/pet/findByStatus" methodName="FindByStatus" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Get Request" id="a80ee819-c212-430d-b9ca-6271b2c5a558" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request>{
	"id": 12345,
	"name": "Rocky",
	"status": "alive"
}</con:request>
            <con:originalUri>https://petstore.swagger.io/v2/pet/findByStatus</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="f2dfc862-9cf6-4e3e-b53f-edebb032750a" name="Valid HTTP Status Codes">
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
              <con:entry key="status" value="alive"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>status</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Delete Request" id="3875d9a3-c42d-401c-ae93-04fce77979ea">
        <con:settings/>
        <con:config service="https://petstore.swagger.io" resourcePath="/v2/pet/{petId}" methodName="PetId" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Delete Request" id="82a781b9-b4ab-48bc-868e-cbec3250a0cf" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://petstore.swagger.io</con:endpoint>
            <con:request/>
            <con:originalUri>https://petstore.swagger.io/v2/pet/12345</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="939bb49b-0a93-4e62-89d0-adb715e257bf" name="Valid HTTP Status Codes">
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
              <con:entry key="petId" value="77235"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>petId</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="datasourceloop" name="Data Source Loop" id="a72c6c66-77f6-409d-a63a-de4665779cae">
        <con:settings/>
        <con:config>
          <dataSourceStep>Data Source</dataSourceStep>
          <targetStep>Post Request</targetStep>
          <discardResults>true</discardResults>
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
  <con:databaseConnectionContainer>
    <con:databaseConnection>
      <con:name>FSTDB</con:name>
      <con:driver>com.mysql.jdbc.Driver</con:driver>
      <con:connectionString>jdbc:mysql://db4free.net:3306/fstm1db?user=fstm1db&amp;password=PASS_VALUE</con:connectionString>
      <con:password>6Y6NowPybq</con:password>
      <con:connectionProperties/>
    </con:databaseConnection>
  </con:databaseConnectionContainer>
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