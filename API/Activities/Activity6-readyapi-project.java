<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="9b2338f9-a92a-41cb-8f6c-075abb4d52c4" created="3.53.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="Activity6" projectVersion="" updated="3.53.0 2024-05-13T12:06:25Z" xmlns:con="http://eviware.com/soapui/config">
  <con:settings/>
  <con:interface xsi:type="con:RestService" id="233c601c-8c67-4cdf-8757-14c512c81ae1" wadlVersion="http://wadl.dev.java.net/2009/02" name="http://ipwhois.app" type="rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <con:settings id="bdb9c51e-bf6d-4e42-8a99-1148a3fc5115"/>
    <con:definitionCache type="TEXT" rootPart=""/>
    <con:endpoints>
      <con:endpoint>http://ipwhois.app</con:endpoint>
    </con:endpoints>
    <con:resource name="IP" path="/json/{IP}" id="3a0620f5-5d8e-4f0f-bfc6-063a0507f851">
      <con:settings/>
      <con:parameters/>
      <con:method name="IP" id="9d8fcbf8-366f-40b8-9d1e-5736e3537b1b" method="GET">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>IP</con:name>
            <con:value>IP</con:value>
            <con:style>TEMPLATE</con:style>
            <con:default>IP</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
        </con:parameters>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json; charset=utf-8</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element xmlns:json="http://ipwhois.app/json/">json:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="02c3175f-e3c7-4da2-a93e-241d715c753e" mediaType="application/json">
          <con:settings/>
          <con:endpoint>http://ipwhois.app</con:endpoint>
          <con:parameters>
            <con:entry key="IP" value="IP"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>IP</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
    </con:resource>
  </con:interface>
  <con:testSuite id="774d4cf7-e8a2-46c9-a3a9-46e51e8ad50f" name="http://ipwhois.app Test Suite">
    <con:settings id="801e1503-bdbf-4d32-94d4-1ec6def93191"/>
    <con:runType>SEQUENTIAL</con:runType>
    <con:testCase id="03da4938-d321-4e17-bb4d-29ba93a69819" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="http://ipwhois.app Test Case 1" searchProperties="true" timeout="0">
      <con:settings/>
      <con:testStep type="datasink" name="Data Sink" id="b0b20910-ca9a-410b-862a-daf838f92f20">
        <con:settings/>
        <con:config xsi:type="con:DataSinkStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:dataSink type="JDBC">
            <con:configuration>
              <driver>com.mysql.jdbc.Driver</driver>
              <connstr>jdbc:mysql://db4free.net:3306/fstm1db?user=fstm1db&amp;password=PASS_VALUE</connstr>
              <pass>6Y6NowPybq</pass>
              <Connection>&lt;None></Connection>
              <query>insert into coordinates(city_name,latitude,longitude) values (?,?,?);</query>
              <stored-procedure>false</stored-procedure>
            </con:configuration>
          </con:dataSink>
          <con:properties>
            <con:property>
              <con:name>city_name</con:name>
              <con:value>India</con:value>
            </con:property>
            <con:property>
              <con:name>latitude</con:name>
              <con:value>13.1669517</con:value>
            </con:property>
            <con:property>
              <con:name>longitude</con:name>
              <con:value>80.1928948</con:value>
            </con:property>
          </con:properties>
        </con:config>
      </con:testStep>
      <con:testStep type="datasource" name="Data Source" id="173be9c4-25d0-4f7e-bb60-279004b5f026">
        <con:settings/>
        <con:config xsi:type="con:DataSourceStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:dataSource type="Data Generator">
            <con:configuration>
              <generatedDataCount>10</generatedDataCount>
              <generatorsTotalNumber>1</generatorsTotalNumber>
              <lastSelectedProperty>0</lastSelectedProperty>
              <GeneratorType0>COMP</GeneratorType0>
              <PropertyName0>address</PropertyName0>
              <repetitionCountaddress>0</repetitionCountaddress>
              <repeatValuesaddress>false</repeatValuesaddress>
              <ComputerAddressTypeaddress>IPv4</ComputerAddressTypeaddress>
              <escapeSpaceSequence/>
            </con:configuration>
          </con:dataSource>
          <con:shared>false</con:shared>
          <con:restartShared>false</con:restartShared>
          <con:property>address</con:property>
          <con:restartOnRun>true</con:restartOnRun>
          <con:stopDatasourceExhausted>false</con:stopDatasourceExhausted>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Request 1" id="d365157c-5b50-43bb-8918-f436554e37ed">
        <con:settings/>
        <con:config service="http://ipwhois.app" resourcePath="/json/{IP}" methodName="IP" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Request 1" id="02c3175f-e3c7-4da2-a93e-241d715c753e" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>http://ipwhois.app</con:endpoint>
            <con:request/>
            <con:originalUri>http://ipwhois.app/json/</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="1a5f523e-bba5-4e63-80f5-8dd8803a7756" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:assertion type="JsonPath Match" id="6cdb5734-d310-4971-ad3b-61ebc76f30b3" name="JSONPath Match">
              <con:configuration>
                <path>$['country']</path>
                <content>"India"</content>
                <allowWildcards>false</allowWildcards>
                <ignoreNamspaceDifferences>false</ignoreNamspaceDifferences>
                <ignoreComments>false</ignoreComments>
              </con:configuration>
            </con:assertion>
            <con:assertion type="JsonPath Match" id="f94369f2-2d0d-4d60-8930-e103b68a4331" name="JSONPath Match 2">
              <con:configuration>
                <path>$['country']</path>
                <content>"India"</content>
                <allowWildcards>false</allowWildcards>
                <ignoreNamspaceDifferences>false</ignoreNamspaceDifferences>
                <ignoreComments>false</ignoreComments>
              </con:configuration>
            </con:assertion>
            <con:assertion type="JsonPath Match" id="540efad8-f0a7-48eb-bb89-3b9b18b26961" name="JSONPath Match 3">
              <con:configuration>
                <path>$['country']</path>
                <content>"India"</content>
                <allowWildcards>false</allowWildcards>
                <ignoreNamspaceDifferences>false</ignoreNamspaceDifferences>
                <ignoreComments>false</ignoreComments>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters>
              <con:entry key="IP" value="${Data Source#IP}"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>IP</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="transfer" name="PropertyTransfer 1" id="9a96c96d-6777-4924-bfac-7c39bd327ddf">
        <con:settings/>
        <con:config xsi:type="con:PropertyTransfersStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true">
            <con:name>country</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Request 1</con:sourceStep>
            <con:sourcePath>$['country']</con:sourcePath>
            <con:targetType>city_name</con:targetType>
            <con:targetStep>Data Sink</con:targetStep>
            <con:targetPath/>
            <con:type>JSONPATH</con:type>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true">
            <con:name>latitude</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Request 1</con:sourceStep>
            <con:sourcePath>$['latitude']</con:sourcePath>
            <con:targetType>latitude</con:targetType>
            <con:targetStep>Data Sink</con:targetStep>
            <con:targetPath/>
            <con:type>JSONPATH</con:type>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true">
            <con:name>longitude</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Request 1</con:sourceStep>
            <con:sourcePath>$['longitude']</con:sourcePath>
            <con:targetType>longitude</con:targetType>
            <con:targetStep>Data Sink</con:targetStep>
            <con:targetPath/>
            <con:type>JSONPATH</con:type>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
        </con:config>
      </con:testStep>
      <con:testStep type="datasourceloop" name="Data Source Loop" id="ae3da934-603e-4aad-9ef3-e9164f59dba9">
        <con:settings/>
        <con:config>
          <dataSourceStep>Data Source</dataSourceStep>
          <targetStep>Request 1</targetStep>
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