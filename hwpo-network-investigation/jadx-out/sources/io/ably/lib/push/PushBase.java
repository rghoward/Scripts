package io.ably.lib.push;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.realtime.Presence;
import io.ably.lib.rest.AblyBase;
import io.ably.lib.rest.DeviceDetails;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.util.Log;
import io.ably.lib.util.ParamsUtils;
import io.ably.lib.util.Serialisation;
import io.ably.lib.util.StringUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class PushBase {
    public final Admin admin;
    protected final AblyBase rest;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Admin {
        private static final String TAG = "io.ably.lib.push.PushBase$Admin";
        public final ChannelSubscriptions channelSubscriptions;
        public final DeviceRegistrations deviceRegistrations;
        private final AblyBase rest;

        public Admin(AblyBase ablyBase) {
            this.rest = ablyBase;
            this.deviceRegistrations = new DeviceRegistrations(ablyBase);
            this.channelSubscriptions = new ChannelSubscriptions(ablyBase);
        }

        private Http.Request<Void> publishImpl(final Param[] paramArr, final JsonObject jsonObject) {
            Log.v(TAG, "publishImpl(): recipient=" + Arrays.toString(paramArr) + ", payload=" + jsonObject);
            return this.rest.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.PushBase.Admin.1
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) throws AblyException {
                    Param[] paramArr2 = paramArr;
                    if (paramArr2 == null || paramArr2.length == 0) {
                        throw AblyException.fromThrowable(new Exception("recipient cannot be empty"));
                    }
                    JsonObject jsonObject2 = jsonObject;
                    if (jsonObject2 == null || jsonObject2.entrySet().isEmpty()) {
                        throw AblyException.fromThrowable(new Exception("payload cannot be empty"));
                    }
                    JsonObject jsonObject3 = new JsonObject();
                    for (Param param : paramArr) {
                        jsonObject3.addProperty(param.key, param.value);
                    }
                    JsonObject jsonObject4 = new JsonObject();
                    jsonObject4.add("recipient", jsonObject3);
                    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                        jsonObject4.add(entry.getKey(), entry.getValue());
                    }
                    httpScheduler.post("/push/publish", HttpUtils.defaultAcceptHeaders(Admin.this.rest.options.useBinaryProtocol), ParamsUtils.enrichParams(null, Admin.this.rest.options), HttpUtils.requestBodyFromGson(jsonObject4, Admin.this.rest.options.useBinaryProtocol), null, true, callback);
                }
            });
        }

        public void publish(Param[] paramArr, JsonObject jsonObject) throws AblyException {
            publishImpl(paramArr, jsonObject).sync();
        }

        public void publishAsync(Param[] paramArr, JsonObject jsonObject, CompletionListener completionListener) {
            publishImpl(paramArr, jsonObject).async(new CompletionListener.ToCallback(completionListener));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ChannelSubscription {
        private static Serialisation.FromJsonElement<ChannelSubscription> fromJsonElement;
        protected static HttpCore.BodyHandler<ChannelSubscription> httpBodyHandler;
        protected static HttpCore.ResponseHandler<ChannelSubscription> httpResponseHandler;
        public final String channel;
        public final String clientId;
        public final String deviceId;

        static {
            Serialisation.FromJsonElement<ChannelSubscription> fromJsonElement2 = new Serialisation.FromJsonElement<ChannelSubscription>() { // from class: io.ably.lib.push.PushBase.ChannelSubscription.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // io.ably.lib.util.Serialisation.FromJsonElement
                public ChannelSubscription fromJsonElement(JsonElement jsonElement) {
                    return ChannelSubscription.fromJsonObject((JsonObject) jsonElement);
                }
            };
            fromJsonElement = fromJsonElement2;
            httpResponseHandler = new Serialisation.HttpResponseHandler(ChannelSubscription.class, fromJsonElement2);
            httpBodyHandler = new Serialisation.HttpBodyHandler(ChannelSubscription[].class, fromJsonElement);
        }

        private ChannelSubscription(String str, String str2, String str3) {
            this.channel = str;
            this.deviceId = str2;
            this.clientId = str3;
        }

        public static ChannelSubscription forClientId(String str, String str2) {
            return new ChannelSubscription(str, null, str2);
        }

        public static ChannelSubscription forDevice(String str, String str2) {
            return new ChannelSubscription(str, str2, null);
        }

        public static ChannelSubscription fromJsonObject(JsonObject jsonObject) {
            return (ChannelSubscription) Serialisation.gson.fromJson((JsonElement) jsonObject, ChannelSubscription.class);
        }

        public boolean equals(Object obj) {
            if (obj instanceof ChannelSubscription) {
                return toJsonObject().equals(((ChannelSubscription) obj).toJsonObject());
            }
            return false;
        }

        public JsonObject toJsonObject() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("channel", this.channel);
            String str = this.clientId;
            if (str != null) {
                jsonObject.addProperty(Presence.GET_CLIENTID, str);
            }
            String str2 = this.deviceId;
            if (str2 != null) {
                jsonObject.addProperty("deviceId", str2);
            }
            return jsonObject;
        }

        public String toString() {
            return toJsonObject().toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ChannelSubscriptions {
        private static final String TAG = "io.ably.lib.push.PushBase$ChannelSubscriptions";
        private final AblyBase rest;

        public ChannelSubscriptions(AblyBase ablyBase) {
            this.rest = ablyBase;
        }

        public PaginatedResult<ChannelSubscription> list(Param[] paramArr) {
            return listImpl(paramArr).sync();
        }

        public void listAsync(Param[] paramArr, Callback<AsyncPaginatedResult<ChannelSubscription>> callback) {
            listImpl(paramArr).async(callback);
        }

        public PaginatedResult<String> listChannels(Param[] paramArr) {
            return listChannelsImpl(paramArr).sync();
        }

        public void listChannelsAsync(Param[] paramArr, Callback<AsyncPaginatedResult<String>> callback) {
            listChannelsImpl(paramArr).async(callback);
        }

        public BasePaginatedQuery.ResultRequest<String> listChannelsImpl(Param[] paramArr) {
            Log.v(TAG, "listChannelsImpl(): params=" + Arrays.toString(paramArr));
            String param = HttpUtils.getParam(paramArr, "deviceId");
            AblyBase ablyBase = this.rest;
            return new BasePaginatedQuery(ablyBase.http, "/push/channels", ablyBase.push.pushRequestHeaders(param), paramArr, StringUtils.httpBodyHandler).get();
        }

        public BasePaginatedQuery.ResultRequest<ChannelSubscription> listImpl(Param[] paramArr) {
            Log.v(TAG, "listImpl(): params=" + Arrays.toString(paramArr));
            String param = HttpUtils.getParam(paramArr, "deviceId");
            AblyBase ablyBase = this.rest;
            return new BasePaginatedQuery(ablyBase.http, "/push/channelSubscriptions", ablyBase.push.pushRequestHeaders(param), paramArr, ChannelSubscription.httpBodyHandler).get();
        }

        public void remove(ChannelSubscription channelSubscription) throws AblyException {
            removeImpl(channelSubscription).sync();
        }

        public void removeAsync(ChannelSubscription channelSubscription, CompletionListener completionListener) {
            removeImpl(channelSubscription).async(new CompletionListener.ToCallback(completionListener));
        }

        public Http.Request<Void> removeImpl(ChannelSubscription channelSubscription) {
            Param[] paramArrPush;
            Log.v(TAG, "removeImpl(): subscription=" + channelSubscription);
            Param[] paramArr = {new Param("channel", channelSubscription.channel)};
            String str = channelSubscription.deviceId;
            if (str != null) {
                paramArrPush = Param.push(paramArr, "deviceId", str);
            } else {
                String str2 = channelSubscription.clientId;
                if (str2 == null) {
                    return this.rest.http.failedRequest(AblyException.fromThrowable(new Exception("ChannelSubscription cannot be for both a deviceId and a clientId")));
                }
                paramArrPush = Param.push(paramArr, Presence.GET_CLIENTID, str2);
            }
            return removeWhereImpl(paramArrPush);
        }

        public void removeWhere(Param[] paramArr) throws AblyException {
            removeWhereImpl(paramArr).sync();
        }

        public void removeWhereAsync(Param[] paramArr, CompletionListener completionListener) {
            removeWhereImpl(paramArr).async(new CompletionListener.ToCallback(completionListener));
        }

        public Http.Request<Void> removeWhereImpl(Param[] paramArr) {
            Log.v(TAG, "removeWhereImpl(): params=" + Arrays.toString(paramArr));
            String param = HttpUtils.getParam(paramArr, "deviceId");
            final Param[] paramArrEnrichParams = ParamsUtils.enrichParams(paramArr, this.rest.options);
            final Param[] paramArrPushRequestHeaders = this.rest.push.pushRequestHeaders(param);
            return this.rest.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.PushBase.ChannelSubscriptions.2
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) {
                    httpScheduler.del("/push/channelSubscriptions", paramArrPushRequestHeaders, paramArrEnrichParams, null, true, callback);
                }
            });
        }

        public ChannelSubscription save(ChannelSubscription channelSubscription) {
            return saveImpl(channelSubscription).sync();
        }

        public void saveAsync(ChannelSubscription channelSubscription, Callback<ChannelSubscription> callback) {
            saveImpl(channelSubscription).async(callback);
        }

        public Http.Request<ChannelSubscription> saveImpl(final ChannelSubscription channelSubscription) {
            Log.v(TAG, "saveImpl(): subscription=" + channelSubscription);
            final HttpCore.RequestBody requestBodyRequestBodyFromGson = HttpUtils.requestBodyFromGson(channelSubscription.toJsonObject(), this.rest.options.useBinaryProtocol);
            return this.rest.http.request(new Http.Execute<ChannelSubscription>() { // from class: io.ably.lib.push.PushBase.ChannelSubscriptions.1
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<ChannelSubscription> callback) {
                    httpScheduler.post("/push/channelSubscriptions", ChannelSubscriptions.this.rest.push.pushRequestHeaders(channelSubscription.deviceId), ParamsUtils.enrichParams(null, ChannelSubscriptions.this.rest.options), requestBodyRequestBodyFromGson, ChannelSubscription.httpResponseHandler, true, callback);
                }
            });
        }
    }

    public PushBase(AblyBase ablyBase) {
        this.rest = ablyBase;
        this.admin = new Admin(ablyBase);
    }

    public Param[] pushRequestHeaders(boolean z) {
        return HttpUtils.defaultAcceptHeaders(this.rest.options.useBinaryProtocol);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class DeviceRegistrations {
        private static final String TAG = "io.ably.lib.push.PushBase$DeviceRegistrations";
        private final AblyBase rest;

        public DeviceRegistrations(AblyBase ablyBase) {
            this.rest = ablyBase;
        }

        public DeviceDetails get(String str) {
            return getImpl(str).sync();
        }

        public void getAsync(String str, Callback<DeviceDetails> callback) {
            getImpl(str).async(callback);
        }

        public Http.Request<DeviceDetails> getImpl(final String str) {
            Log.v(TAG, "getImpl(): deviceId=" + str);
            return this.rest.http.request(new Http.Execute<DeviceDetails>() { // from class: io.ably.lib.push.PushBase.DeviceRegistrations.2
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<DeviceDetails> callback) {
                    httpScheduler.get("/push/deviceRegistrations/" + str, DeviceRegistrations.this.rest.push.pushRequestHeaders(str), ParamsUtils.enrichParams(null, DeviceRegistrations.this.rest.options), DeviceDetails.httpResponseHandler, true, callback);
                }
            });
        }

        public PaginatedResult<DeviceDetails> list(Param[] paramArr) {
            return listImpl(paramArr).sync();
        }

        public void listAsync(Param[] paramArr, Callback<AsyncPaginatedResult<DeviceDetails>> callback) {
            listImpl(paramArr).async(callback);
        }

        public BasePaginatedQuery.ResultRequest<DeviceDetails> listImpl(Param[] paramArr) {
            Log.v(TAG, "listImpl(): params=" + Arrays.toString(paramArr));
            AblyBase ablyBase = this.rest;
            return new BasePaginatedQuery(ablyBase.http, "/push/deviceRegistrations", HttpUtils.defaultAcceptHeaders(ablyBase.options.useBinaryProtocol), paramArr, DeviceDetails.httpBodyHandler).get();
        }

        public void remove(String str) throws AblyException {
            removeImpl(str).sync();
        }

        public void removeAsync(String str, CompletionListener completionListener) {
            removeImpl(str).async(new CompletionListener.ToCallback(completionListener));
        }

        public Http.Request<Void> removeImpl(final String str) {
            Log.v(TAG, "removeImpl(): deviceId=" + str);
            return this.rest.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.PushBase.DeviceRegistrations.3
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) {
                    httpScheduler.del("/push/deviceRegistrations/" + str, DeviceRegistrations.this.rest.push.pushRequestHeaders(str), ParamsUtils.enrichParams(null, DeviceRegistrations.this.rest.options), null, true, callback);
                }
            });
        }

        public void removeWhere(Param[] paramArr) throws AblyException {
            removeWhereImpl(paramArr).sync();
        }

        public void removeWhereAsync(Param[] paramArr, CompletionListener completionListener) {
            removeWhereImpl(paramArr).async(new CompletionListener.ToCallback(completionListener));
        }

        public Http.Request<Void> removeWhereImpl(Param[] paramArr) {
            Log.v(TAG, "removeWhereImpl(): params=" + Arrays.toString(paramArr));
            final Param[] paramArrEnrichParams = ParamsUtils.enrichParams(paramArr, this.rest.options);
            return this.rest.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.PushBase.DeviceRegistrations.4
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) {
                    httpScheduler.del("/push/deviceRegistrations", HttpUtils.defaultAcceptHeaders(DeviceRegistrations.this.rest.options.useBinaryProtocol), paramArrEnrichParams, null, true, callback);
                }
            });
        }

        public DeviceDetails save(DeviceDetails deviceDetails) {
            return saveImpl(deviceDetails).sync();
        }

        public void saveAsync(DeviceDetails deviceDetails, Callback<DeviceDetails> callback) {
            saveImpl(deviceDetails).async(callback);
        }

        public Http.Request<DeviceDetails> saveImpl(final DeviceDetails deviceDetails) {
            Log.v(TAG, "saveImpl(): device=" + deviceDetails);
            final HttpCore.RequestBody requestBodyRequestBodyFromGson = HttpUtils.requestBodyFromGson(deviceDetails.toJsonObject(), this.rest.options.useBinaryProtocol);
            return this.rest.http.request(new Http.Execute<DeviceDetails>() { // from class: io.ably.lib.push.PushBase.DeviceRegistrations.1
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<DeviceDetails> callback) {
                    httpScheduler.put("/push/deviceRegistrations/" + deviceDetails.id, DeviceRegistrations.this.rest.push.pushRequestHeaders(deviceDetails.id), ParamsUtils.enrichParams(null, DeviceRegistrations.this.rest.options), requestBodyRequestBodyFromGson, DeviceDetails.httpResponseHandler, true, callback);
                }
            });
        }

        public void remove(DeviceDetails deviceDetails) throws AblyException {
            remove(deviceDetails.id);
        }

        public void removeAsync(DeviceDetails deviceDetails, CompletionListener completionListener) {
            removeAsync(deviceDetails.id, completionListener);
        }
    }

    public Param[] pushRequestHeaders(String str) {
        return pushRequestHeaders(false);
    }
}
