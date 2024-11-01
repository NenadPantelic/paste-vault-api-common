package com.pastevault.apicommon.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiException extends RuntimeException {

    private final ErrorReport errorReport;
}

