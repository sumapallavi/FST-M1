{
  "provider": {
    "name": "UserProvider"
  },
  "consumer": {
    "name": "UserConsumer"
  },
  "interactions": [
    {
      "description": "A request to create a user",
      "request": {
        "method": "POST",
        "path": "/api/users",
        "headers": {
          "Accept": "application/json",
          "Content-Type": "application/json"
        },
        "body": {
          "firstName": "string",
          "lastName": "string",
          "id": 1,
          "email": "string"
        },
        "matchingRules": {
          "body": {
            "$.id": {
              "matchers": [
                {
                  "match": "number"
                }
              ],
              "combine": "AND"
            },
            "$.firstName": {
              "matchers": [
                {
                  "match": "type"
                }
              ],
              "combine": "AND"
            },
            "$.lastName": {
              "matchers": [
                {
                  "match": "type"
                }
              ],
              "combine": "AND"
            },
            "$.email": {
              "matchers": [
                {
                  "match": "type"
                }
              ],
              "combine": "AND"
            }
          }
        }
      },
      "response": {
        "status": 201,
        "headers": {
          "Content-Type": "application/json; charset=UTF-8"
        },
        "body": {
          "firstName": "string",
          "lastName": "string",
          "id": 1,
          "email": "string"
        },
        "matchingRules": {
          "body": {
            "$.id": {
              "matchers": [
                {
                  "match": "number"
                }
              ],
              "combine": "AND"
            },
            "$.firstName": {
              "matchers": [
                {
                  "match": "type"
                }
              ],
              "combine": "AND"
            },
            "$.lastName": {
              "matchers": [
                {
                  "match": "type"
                }
              ],
              "combine": "AND"
            },
            "$.email": {
              "matchers": [
                {
                  "match": "type"
                }
              ],
              "combine": "AND"
            }
          },
          "header": {
            "Content-Type": {
              "matchers": [
                {
                  "match": "regex",
                  "regex": "application/json(;\\s?charset=[\\w\\-]+)?"
                }
              ],
              "combine": "AND"
            }
          }
        }
      },
      "providerStates": [
        {
          "name": "A request to create a user"
        }
      ]
    }
  ],
  "metadata": {
    "pactSpecification": {
      "version": "3.0.0"
    },
    "pact-jvm": {
      "version": "4.0.10"
    }
  }
}