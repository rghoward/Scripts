package io.ably.lib.rest;

import io.ably.lib.http.AsyncHttpPaginatedQuery;
import io.ably.lib.http.AsyncHttpScheduler;
import io.ably.lib.http.AsyncPaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpPaginatedQuery;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.http.PaginatedQuery;
import io.ably.lib.http.SyncHttpScheduler;
import io.ably.lib.platform.Platform;
import io.ably.lib.push.Push;
import io.ably.lib.transport.Defaults;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncHttpPaginatedResponse;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.HttpPaginatedResponse;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageSerializer;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PublishResponse;
import io.ably.lib.types.ReadOnlyMap;
import io.ably.lib.types.Stats;
import io.ably.lib.types.StatsReader;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.InternalMap;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.ably.lib.util.Serialisation;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AblyBase implements AutoCloseable {
    private static final int LEGACY_API_PROTOCOL_V2 = 2;
    public final Auth auth;
    public final Channels channels;
    public final Http http;
    public final HttpCore httpCore;
    public final ClientOptions options;
    public final Platform platform;
    protected final PlatformAgentProvider platformAgentProvider;
    public final Push push;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Channels extends ReadOnlyMap<String, Channel> {
        Channel get(String str);

        Channel get(String str, ChannelOptions channelOptions);

        void release(String str);

        @Override // io.ably.lib.types.ReadOnlyMap
        int size();

        @Override // io.ably.lib.types.ReadOnlyMap
        Iterable<Channel> values();
    }

    public AblyBase(ClientOptions clientOptions, PlatformAgentProvider platformAgentProvider) throws AblyException {
        if (clientOptions == null) {
            Log.e(getClass().getName(), "no options provided");
            throw AblyException.fromErrorInfo(new ErrorInfo("no options provided", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000));
        }
        this.options = clientOptions;
        Log.setLevel(clientOptions.logLevel);
        Log.setHandler(clientOptions.logHandler);
        Log.i(getClass().getName(), MetricTracker.Action.STARTED);
        this.platformAgentProvider = platformAgentProvider;
        Auth auth = new Auth(this, clientOptions);
        this.auth = auth;
        HttpCore httpCore = new HttpCore(clientOptions, auth, platformAgentProvider);
        this.httpCore = httpCore;
        this.http = new Http(new AsyncHttpScheduler(httpCore, clientOptions), new SyncHttpScheduler(httpCore));
        this.channels = new InternalChannels();
        this.platform = new Platform();
        this.push = new Push(this);
    }

    private Http.Request<PublishResponse[]> publishBatchImpl(final Message.Batch[] batchArr, ChannelOptions channelOptions, final Param[] paramArr) throws AblyException {
        boolean z = false;
        for (Message.Batch batch : batchArr) {
            for (Message message : batch.messages) {
                z |= message.id != null;
                this.auth.checkClientId(message, true, false);
                message.encode(channelOptions);
            }
            if (!z && this.options.idempotentRestPublishing) {
                String randomId = Crypto.getRandomId();
                int i = 0;
                while (true) {
                    Message[] messageArr = batch.messages;
                    if (i < messageArr.length) {
                        messageArr[i].id = randomId + ':' + i;
                        i++;
                    }
                }
            }
        }
        return this.http.request(new Http.Execute<PublishResponse[]>() { // from class: io.ably.lib.rest.AblyBase.2
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<PublishResponse[]> callback) {
                boolean z2 = AblyBase.this.options.useBinaryProtocol;
                Message.Batch[] batchArr2 = batchArr;
                HttpCore.RequestBody requestBodyAsMsgpackRequest = z2 ? MessageSerializer.asMsgpackRequest(batchArr2) : MessageSerializer.asJSONRequest(batchArr2);
                boolean z3 = AblyBase.this.options.addRequestIds;
                Param[] paramArr2 = paramArr;
                if (z3) {
                    paramArr2 = Param.set(paramArr2, Crypto.generateRandomRequestId());
                }
                httpScheduler.post("/messages", Param.set(HttpUtils.defaultAcceptHeaders(AblyBase.this.options.useBinaryProtocol), new Param(Defaults.ABLY_PROTOCOL_VERSION_HEADER, (Object) 2)), paramArr2, requestBodyAsMsgpackRequest, new HttpCore.ResponseHandler<PublishResponse[]>() { // from class: io.ably.lib.rest.AblyBase.2.1
                    @Override // io.ably.lib.http.HttpCore.ResponseHandler
                    public PublishResponse[] handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                        if (errorInfo == null || errorInfo.code == 40020) {
                            return PublishResponse.getBulkPublishResponseHandler(response.statusCode).handleResponseBody(response.contentType, response.body);
                        }
                        throw AblyException.fromErrorInfo(errorInfo);
                    }
                }, true, callback);
            }
        });
    }

    private Http.Request<Long> timeImpl(Http http) {
        final Param[] paramArrArray = this.options.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null;
        return http.request(new Http.Execute<Long>() { // from class: io.ably.lib.rest.AblyBase.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<Long> callback) {
                httpScheduler.get("/time", HttpUtils.defaultAcceptHeaders(false), paramArrArray, new HttpCore.ResponseHandler<Long>() { // from class: io.ably.lib.rest.AblyBase.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // io.ably.lib.http.HttpCore.ResponseHandler
                    public Long handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                        if (errorInfo == null) {
                            return ((Long[]) Serialisation.gson.fromJson(new String(response.body), Long[].class))[0];
                        }
                        throw AblyException.fromErrorInfo(errorInfo);
                    }
                }, false, callback);
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.http.close();
    }

    public void connect() {
        this.http.connect();
    }

    public PublishResponse[] publishBatch(Message.Batch[] batchArr, ChannelOptions channelOptions) {
        return publishBatchImpl(batchArr, channelOptions, null).sync();
    }

    public void publishBatchAsync(Message.Batch[] batchArr, ChannelOptions channelOptions, Callback<PublishResponse[]> callback) {
        publishBatchImpl(batchArr, channelOptions, null).async(callback);
    }

    public HttpPaginatedResponse request(Http http, String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2) {
        return new HttpPaginatedQuery(http, str, str2, HttpUtils.mergeHeaders(HttpUtils.defaultAcceptHeaders(false), paramArr2), paramArr, requestBody).exec();
    }

    public void requestAsync(Http http, String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2, AsyncHttpPaginatedResponse.Callback callback) {
        new AsyncHttpPaginatedQuery(http, str, str2, HttpUtils.mergeHeaders(HttpUtils.defaultAcceptHeaders(false), paramArr2), paramArr, requestBody).exec(callback);
    }

    public PaginatedResult<Stats> stats(Http http, Param[] paramArr) {
        return new PaginatedQuery(http, "/stats", Param.set(HttpUtils.defaultAcceptHeaders(false), new Param(Defaults.ABLY_PROTOCOL_VERSION_HEADER, (Object) 2)), paramArr, StatsReader.statsResponseHandler).get();
    }

    public void statsAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<Stats>> callback) {
        new AsyncPaginatedQuery(http, "/stats", Param.set(HttpUtils.defaultAcceptHeaders(false), new Param(Defaults.ABLY_PROTOCOL_VERSION_HEADER, (Object) 2)), paramArr, StatsReader.statsResponseHandler).get(callback);
    }

    public long time(Http http) {
        return timeImpl(http).sync().longValue();
    }

    public void timeAsync(Http http, Callback<Long> callback) {
        timeImpl(http).async(callback);
    }

    public void timeAsync(Callback<Long> callback) {
        timeAsync(this.http, callback);
    }

    public void publishBatchAsync(Message.Batch[] batchArr, ChannelOptions channelOptions, Param[] paramArr, Callback<PublishResponse[]> callback) {
        publishBatchImpl(batchArr, channelOptions, paramArr).async(callback);
    }

    public PublishResponse[] publishBatch(Message.Batch[] batchArr, ChannelOptions channelOptions, Param[] paramArr) {
        return publishBatchImpl(batchArr, channelOptions, paramArr).sync();
    }

    public long time() {
        return time(this.http);
    }

    public void requestAsync(String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2, AsyncHttpPaginatedResponse.Callback callback) {
        requestAsync(this.http, str, str2, paramArr, requestBody, paramArr2, callback);
    }

    public HttpPaginatedResponse request(String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2) {
        return request(this.http, str, str2, paramArr, requestBody, paramArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class InternalChannels extends InternalMap<String, Channel> implements Channels {
        private InternalChannels() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.ably.lib.rest.AblyBase.Channels
        public Channel get(String str, ChannelOptions channelOptions) {
            Channel channel = (Channel) this.map.get(str);
            if (channel != null) {
                if (channelOptions != null) {
                    channel.options = channelOptions;
                }
                return channel;
            }
            Channel channel2 = new Channel(AblyBase.this, str, channelOptions);
            this.map.put((K) str, (V) channel2);
            return channel2;
        }

        @Override // io.ably.lib.rest.AblyBase.Channels
        public void release(String str) {
            this.map.remove(str);
        }

        @Override // io.ably.lib.rest.AblyBase.Channels
        public Channel get(String str) {
            try {
                return get(str, null);
            } catch (AblyException unused) {
                return null;
            }
        }
    }

    public void onAuthError(ErrorInfo errorInfo) {
    }

    public void onClientIdSet(String str) {
    }

    public void statsAsync(Param[] paramArr, Callback<AsyncPaginatedResult<Stats>> callback) {
        statsAsync(this.http, paramArr, callback);
    }

    public PaginatedResult<Stats> stats(Param[] paramArr) {
        return stats(this.http, paramArr);
    }

    public void onAuthUpdated(String str, boolean z) {
    }

    public void onAuthUpdatedAsync(String str, Auth.AuthUpdateResult authUpdateResult) {
    }

    public AblyBase(String str, PlatformAgentProvider platformAgentProvider) {
        this(new ClientOptions(str), platformAgentProvider);
    }
}
