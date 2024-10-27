package com.pastevault.apicommon.api;

import java.util.List;

public record ApiError(String message, int status, int internalCode, List<String> errors) {
}
