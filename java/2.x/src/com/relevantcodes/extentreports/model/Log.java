/*
* Copyright (c) 2015, Anshoo Arora (Relevant Codes).  All rights reserved.
* 
* Copyrights licensed under the New BSD License.
* 
* See the accompanying LICENSE file for terms.
*/

package com.relevantcodes.extentreports.model;

import java.util.Date;

import com.relevantcodes.extentreports.LogStatus;

public class Log {
    public Date timestamp;
    public LogStatus logStatus;
    public String stepName;
    public String details;
}
