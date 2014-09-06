wm.types = {
	"types": {
		"boolean": {
			"primitiveType": "Boolean",
			"internal": true
		},
		"byte": {
			"primitiveType": "Number",
			"internal": true
		},
		"char": {
			"primitiveType": "String",
			"internal": true
		},
		"com.hrdb.Department": {
			"service": "hrdb",
			"liveService": false,
			"internal": false,
			"fields": {
				"budget": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"deptcode": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 7,
					"noChange": [],
					"include": []
				},
				"deptid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"employees": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.hrdb.Employee",
					"required": false,
					"fieldOrder": 10,
					"noChange": [],
					"include": []
				},
				"location": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 8,
					"noChange": [],
					"include": []
				},
				"name": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"q1": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"q2": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"q3": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"q4": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 6,
					"noChange": [],
					"include": []
				},
				"tenantid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 9,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.hrdb.Employee": {
			"service": "hrdb",
			"liveService": false,
			"internal": false,
			"fields": {
				"birthdate": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 9,
					"noChange": [],
					"include": []
				},
				"city": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 6,
					"noChange": [],
					"include": []
				},
				"department": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.hrdb.Department",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"eid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"employee": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.hrdb.Employee",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"employees": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.hrdb.Employee",
					"required": false,
					"fieldOrder": 13,
					"noChange": [],
					"include": []
				},
				"firstname": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"lastname": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"picurl": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 10,
					"noChange": [],
					"include": []
				},
				"state": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 7,
					"noChange": [],
					"include": []
				},
				"street": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"tenantid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 12,
					"noChange": [],
					"include": []
				},
				"twitterid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 11,
					"noChange": [],
					"include": []
				},
				"vacations": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.hrdb.Vacation",
					"required": false,
					"fieldOrder": 14,
					"noChange": [],
					"include": []
				},
				"zip": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 8,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.hrdb.User": {
			"service": "hrdb",
			"liveService": false,
			"internal": false,
			"fields": {
				"password": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"role": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"tenantid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"userid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"username": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.hrdb.Vacation": {
			"service": "hrdb",
			"liveService": false,
			"internal": false,
			"fields": {
				"employee": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.hrdb.Employee",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"enddate": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"startdate": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"tenantid": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				}
			}
		},
		"double": {
			"primitiveType": "Number",
			"internal": true
		},
		"float": {
			"primitiveType": "Number",
			"internal": true
		},
		"int": {
			"primitiveType": "Number",
			"internal": true
		},
		"java.lang.Boolean": {
			"primitiveType": "Boolean",
			"internal": false
		},
		"java.lang.Byte": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Character": {
			"primitiveType": "String",
			"internal": false
		},
		"java.lang.Double": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Float": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Integer": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Long": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Short": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.String": {
			"primitiveType": "String",
			"internal": false
		},
		"java.lang.StringBuffer": {
			"primitiveType": "String",
			"internal": false
		},
		"java.math.BigDecimal": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.math.BigInteger": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.sql.Date": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.sql.Time": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.sql.Timestamp": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.util.Date": {
			"primitiveType": "Date",
			"internal": false
		},
		"long": {
			"primitiveType": "Number",
			"internal": true
		},
		"short": {
			"primitiveType": "Number",
			"internal": true
		}
	}
};