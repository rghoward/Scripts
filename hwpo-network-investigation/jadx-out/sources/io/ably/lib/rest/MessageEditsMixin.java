package io.ably.lib.rest;

import defpackage.ei3;
import defpackage.sk0;
import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.rest.MessageEditsMixin;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageAction;
import io.ably.lib.types.MessageOperation;
import io.ably.lib.types.MessageSerializer;
import io.ably.lib.types.MessageVersion;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.UpdateDeleteResult;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageEditsMixin {
    private final Auth auth;
    private final String basePath;
    private final ChannelOptions channelOptions;
    private final ClientOptions clientOptions;

    public MessageEditsMixin(String str, ClientOptions clientOptions, ChannelOptions channelOptions, Auth auth) {
        this.basePath = str;
        this.clientOptions = clientOptions;
        this.channelOptions = channelOptions;
        this.auth = auth;
    }

    private Http.Request<Message> getMessageImpl(Http http, final String str) {
        return http.request(new Http.Execute() { // from class: st6
            @Override // io.ably.lib.http.Http.Execute
            public final void execute(HttpScheduler httpScheduler, Callback callback) throws AblyException {
                this.a.lambda$getMessageImpl$1(str, httpScheduler, callback);
            }
        });
    }

    private BasePaginatedQuery.ResultRequest<Message> getMessageVersionsImpl(Http http, String str, Param[] paramArr) throws AblyException {
        if (str == null || str.isEmpty()) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40003, "Message serial cannot be empty");
        }
        HttpCore.BodyHandler<Message> messageResponseHandler = MessageSerializer.getMessageResponseHandler(this.channelOptions);
        if (this.clientOptions.addRequestIds) {
            paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
        }
        return new BasePaginatedQuery(http, this.basePath + "/messages/" + HttpUtils.encodeURIComponent(str) + "/versions", HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), paramArr, messageResponseHandler).get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Message lambda$getMessageImpl$0(HttpCore.BodyHandler bodyHandler, HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
        if (errorInfo != null) {
            throw AblyException.fromErrorInfo(errorInfo);
        }
        Message[] messageArr = (Message[]) bodyHandler.handleResponseBody(response.contentType, response.body);
        if (messageArr == null || messageArr.length <= 0) {
            throw sk0.b(404, 40400, "Message not found");
        }
        return messageArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMessageImpl$1(String str, HttpScheduler httpScheduler, Callback callback) throws AblyException {
        if (str == null || str.isEmpty()) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40003, "Message serial cannot be empty");
        }
        HttpCore.BodyHandler<Message> singleMessageResponseHandler = MessageSerializer.getSingleMessageResponseHandler(this.channelOptions);
        httpScheduler.get(this.basePath + "/messages/" + HttpUtils.encodeURIComponent(str), HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), this.clientOptions.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null, new ei3(singleMessageResponseHandler), true, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UpdateDeleteResult lambda$updateMessageImpl$2(HttpCore.BodyHandler bodyHandler, HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
        if (errorInfo != null) {
            throw AblyException.fromErrorInfo(errorInfo);
        }
        UpdateDeleteResult[] updateDeleteResultArr = (UpdateDeleteResult[]) bodyHandler.handleResponseBody(response.contentType, response.body);
        if (updateDeleteResultArr == null || updateDeleteResultArr.length <= 0) {
            throw sk0.b(500, 50000, "No versionSerial in the response");
        }
        return updateDeleteResultArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMessageImpl$3(Message message, MessageAction messageAction, MessageOperation messageOperation, HttpScheduler httpScheduler, Callback callback) throws AblyException {
        String str = message.serial;
        if (str == null || str.isEmpty()) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40003, "Message serial cannot be empty");
        }
        this.auth.checkClientId(message, true, false);
        Message message2 = new Message(message.name, message.data, message.extras);
        message2.action = messageAction;
        MessageVersion messageVersion = new MessageVersion();
        message2.version = messageVersion;
        if (messageOperation != null) {
            messageVersion.clientId = messageOperation.clientId;
            messageVersion.description = messageOperation.description;
            messageVersion.metadata = messageOperation.metadata;
        }
        message2.encode(this.channelOptions);
        HttpCore.RequestBody requestBodyAsSingleMsgpackRequest = this.clientOptions.useBinaryProtocol ? MessageSerializer.asSingleMsgpackRequest(message2) : MessageSerializer.asSingleJsonRequest(message2);
        Param[] paramArrArray = this.clientOptions.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null;
        final HttpCore.BodyHandler<UpdateDeleteResult> bodyHandler = UpdateDeleteResult.getBodyHandler();
        httpScheduler.patch(this.basePath + "/messages/" + HttpUtils.encodeURIComponent(message.serial), HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), paramArrArray, requestBodyAsSingleMsgpackRequest, new HttpCore.ResponseHandler() { // from class: rt6
            @Override // io.ably.lib.http.HttpCore.ResponseHandler
            public final Object handleResponse(HttpCore.Response response, ErrorInfo errorInfo) {
                return MessageEditsMixin.lambda$updateMessageImpl$2(bodyHandler, response, errorInfo);
            }
        }, true, callback);
    }

    private Http.Request<UpdateDeleteResult> updateMessageImpl(Http http, final Message message, final MessageOperation messageOperation, final MessageAction messageAction) {
        return http.request(new Http.Execute() { // from class: qt6
            @Override // io.ably.lib.http.Http.Execute
            public final void execute(HttpScheduler httpScheduler, Callback callback) throws AblyException {
                this.a.lambda$updateMessageImpl$3(message, messageAction, messageOperation, httpScheduler, callback);
            }
        });
    }

    public UpdateDeleteResult appendMessage(Http http, Message message, MessageOperation messageOperation) {
        return updateMessageImpl(http, message, messageOperation, MessageAction.MESSAGE_APPEND).sync();
    }

    public void appendMessageAsync(Http http, Message message, MessageOperation messageOperation, Callback<UpdateDeleteResult> callback) {
        updateMessageImpl(http, message, messageOperation, MessageAction.MESSAGE_APPEND).async(callback);
    }

    public UpdateDeleteResult deleteMessage(Http http, Message message, MessageOperation messageOperation) {
        return updateMessageImpl(http, message, messageOperation, MessageAction.MESSAGE_DELETE).sync();
    }

    public void deleteMessageAsync(Http http, Message message, MessageOperation messageOperation, Callback<UpdateDeleteResult> callback) {
        updateMessageImpl(http, message, messageOperation, MessageAction.MESSAGE_DELETE).async(callback);
    }

    public Message getMessage(Http http, String str) {
        return getMessageImpl(http, str).sync();
    }

    public void getMessageAsync(Http http, String str, Callback<Message> callback) {
        getMessageImpl(http, str).async(callback);
    }

    public PaginatedResult<Message> getMessageVersions(Http http, String str, Param[] paramArr) {
        return getMessageVersionsImpl(http, str, paramArr).sync();
    }

    public void getMessageVersionsAsync(Http http, String str, Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        getMessageVersionsImpl(http, str, paramArr).async(callback);
    }

    public UpdateDeleteResult updateMessage(Http http, Message message, MessageOperation messageOperation) {
        return updateMessageImpl(http, message, messageOperation, MessageAction.MESSAGE_UPDATE).sync();
    }

    public void updateMessageAsync(Http http, Message message, MessageOperation messageOperation, Callback<UpdateDeleteResult> callback) {
        updateMessageImpl(http, message, messageOperation, MessageAction.MESSAGE_UPDATE).async(callback);
    }
}
