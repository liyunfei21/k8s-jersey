package com.yfl.jerseyclient;

/**
 * Created by 云飞 on 2016/12/5.
 */
public interface RestfulClient {
    String get(Params params);

    String list(Params params);

    String create(Params params);

    String delete(Params params);

    String update(Params params);

    String updateWithMediaType(Params params, String mediaType);

    String replace(Params params);

    String options(Params params);

    String head(Params params);
}
