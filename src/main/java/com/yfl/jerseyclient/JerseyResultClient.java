package com.yfl.jerseyclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;

/**
 * Created by 云飞 on 2016/12/5.
 */
public class JerseyResultClient implements RestfulClient {

    private static final Logger LOG = LoggerFactory.getLogger(JerseyResultClient.class.getName());

    private static final String METHOD__PATCH = "PATCH";

    private String _baseUrl = null;

    Client _client = null;


    public JerseyResultClient(String _baseUrl) {
        DefaultClientConfig config = new DefaultClientConfig();
        config.getProperties().put(URLConnectionClientHandler.PROPERTY_HTTP_URL_CONNECTION_SET_METHOD_WORKAROUND, true);
        _client = Client.create(config);
        this._baseUrl = _baseUrl;
    }

    public String get(Params params) {
        WebResource resource = _client.resource(_baseUrl + params.buildPath());
        String response = resource.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        LOG.info("Get one resource:{}", response);
        return response;
    }

    public String list(Params params) {
        WebResource resource = _client.resource(_baseUrl + params.buildPath());
        String response = resource.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        LOG.info("Get one resource:{}", response);
        return response;
    }

    public String create(Params params) {
        WebResource resource = _client.resource(_baseUrl + params.buildPath());
        LOG.info("URL:" + _baseUrl + params.buildPath());
        LOG.info("Create resource:" + params.getJson());
        String response = (null == params.getJson()) ? resource.accept(MediaType.APPLICATION_JSON).post(String.class) : resource.accept(MediaType.APPLICATION_JSON).post(String.class, params.getJson());
        return response;
    }


    public String delete(Params params) {
        return null;
    }

    public String update(Params params) {
        return null;
    }

    public String updateWithMediaType(Params params, String mediaType) {
        return null;
    }

    public String replace(Params params) {
        return null;
    }

    public String options(Params params) {
        return null;
    }

    public String head(Params params) {
        return null;
    }
}
