package com.lfdversluis.retrofittwitchapi.Util;

import retrofit.mime.TypedString;

public class TypedJSONString extends TypedString {
    public TypedJSONString(String body) {
        super(body);
    }

    @Override public String mimeType() {
        return "application/json";
    }
}
