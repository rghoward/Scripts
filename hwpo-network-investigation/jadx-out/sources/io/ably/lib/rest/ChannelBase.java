package io.ably.lib.rest;

import defpackage.av;
import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageOperation;
import io.ably.lib.types.MessageSerializer;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.PresenceSerializer;
import io.ably.lib.types.PublishResult;
import io.ably.lib.types.UpdateDeleteResult;
import io.ably.lib.util.Crypto;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ChannelBase {
    private final AblyBase ably;
    public final RestAnnotations annotations;
    private final String basePath;
    private final MessageEditsMixin messageEditsMixin;
    public final String name;
    ChannelOptions options;
    public final Presence presence;

    /* JADX INFO: renamed from: io.ably.lib.rest.ChannelBase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AnonymousClass1 implements Http.Execute<PublishResult> {
        final /* synthetic */ Message[] val$messages;

        public AnonymousClass1(Message[] messageArr) {
            this.val$messages = messageArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ PublishResult lambda$execute$0(HttpCore.BodyHandler bodyHandler, HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
            if (errorInfo == null) {
                return new PublishResult((String[]) bodyHandler.handleResponseBody(response.contentType, response.body));
            }
            throw AblyException.fromErrorInfo(errorInfo);
        }

        @Override // io.ably.lib.http.Http.Execute
        public void execute(HttpScheduler httpScheduler, Callback<PublishResult> callback) throws AblyException {
            int i = 0;
            boolean z = false;
            for (Message message : this.val$messages) {
                z |= message.id != null;
                ChannelBase.this.ably.auth.checkClientId(message, true, false);
                message.encode(ChannelBase.this.options);
            }
            if (!z && ChannelBase.this.ably.options.idempotentRestPublishing) {
                String randomId = Crypto.getRandomId();
                while (true) {
                    Message[] messageArr = this.val$messages;
                    if (i >= messageArr.length) {
                        break;
                    }
                    messageArr[i].id = randomId + ':' + i;
                    i++;
                }
            }
            boolean z2 = ChannelBase.this.ably.options.useBinaryProtocol;
            Message[] messageArr2 = this.val$messages;
            HttpCore.RequestBody requestBodyAsMsgpackRequest = z2 ? MessageSerializer.asMsgpackRequest(messageArr2) : MessageSerializer.asJsonRequest(messageArr2);
            Param[] paramArrArray = ChannelBase.this.ably.options.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null;
            final HttpCore.BodyHandler<String> bodyHandler = PublishResult.getBodyHandler();
            httpScheduler.post(ChannelBase.this.basePath + "/messages", HttpUtils.defaultAcceptHeaders(ChannelBase.this.ably.options.useBinaryProtocol), paramArrArray, requestBodyAsMsgpackRequest, new HttpCore.ResponseHandler() { // from class: io.ably.lib.rest.a
                @Override // io.ably.lib.http.HttpCore.ResponseHandler
                public final Object handleResponse(HttpCore.Response response, ErrorInfo errorInfo) {
                    return ChannelBase.AnonymousClass1.lambda$execute$0(bodyHandler, response, errorInfo);
                }
            }, true, callback);
        }
    }

    public ChannelBase(AblyBase ablyBase, String str, ChannelOptions channelOptions) {
        this.ably = ablyBase;
        this.name = str;
        this.options = channelOptions;
        String str2 = "/channels/" + HttpUtils.encodeURIComponent(str);
        this.basePath = str2;
        this.presence = new Presence();
        this.annotations = new RestAnnotations(str, ablyBase.http, ablyBase.options, channelOptions);
        this.messageEditsMixin = new MessageEditsMixin(str2, ablyBase.options, channelOptions, ablyBase.auth);
    }

    private BasePaginatedQuery.ResultRequest<Message> historyImpl(Http http, Param[] paramArr) {
        HttpCore.BodyHandler<Message> messageResponseHandler = MessageSerializer.getMessageResponseHandler(this.options);
        if (this.ably.options.addRequestIds) {
            paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
        }
        return new BasePaginatedQuery(http, av.a(new StringBuilder(), this.basePath, "/messages"), HttpUtils.defaultAcceptHeaders(this.ably.options.useBinaryProtocol), paramArr, messageResponseHandler).get();
    }

    private Http.Request<PublishResult> publishImpl(Http http, String str, Object obj) {
        return publishImpl(http, new Message[]{new Message(str, obj)});
    }

    public UpdateDeleteResult appendMessage(Message message, MessageOperation messageOperation) {
        return this.messageEditsMixin.appendMessage(this.ably.http, message, messageOperation);
    }

    public void appendMessageAsync(Message message, MessageOperation messageOperation, Callback<UpdateDeleteResult> callback) {
        this.messageEditsMixin.appendMessageAsync(this.ably.http, message, messageOperation, callback);
    }

    public UpdateDeleteResult deleteMessage(Message message, MessageOperation messageOperation) {
        return this.messageEditsMixin.deleteMessage(this.ably.http, message, messageOperation);
    }

    public void deleteMessageAsync(Message message, MessageOperation messageOperation, Callback<UpdateDeleteResult> callback) {
        this.messageEditsMixin.deleteMessageAsync(this.ably.http, message, messageOperation, callback);
    }

    public Message getMessage(String str) {
        return this.messageEditsMixin.getMessage(this.ably.http, str);
    }

    public void getMessageAsync(String str, Callback<Message> callback) {
        this.messageEditsMixin.getMessageAsync(this.ably.http, str, callback);
    }

    public PaginatedResult<Message> getMessageVersions(String str, Param[] paramArr) {
        return this.messageEditsMixin.getMessageVersions(this.ably.http, str, paramArr);
    }

    public void getMessageVersionsAsync(String str, Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        this.messageEditsMixin.getMessageVersionsAsync(this.ably.http, str, paramArr, callback);
    }

    public PaginatedResult<Message> history(Param[] paramArr) {
        return history(this.ably.http, paramArr);
    }

    public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        historyAsync(this.ably.http, paramArr, callback);
    }

    public void publish(String str, Object obj) throws AblyException {
        publish(this.ably.http, str, obj);
    }

    public void publishAsync(Http http, String str, Object obj, CompletionListener completionListener) {
        publishImpl(http, str, obj).async(new CompletionListener.ToCallback(completionListener));
    }

    public PublishResult publishWithResult(Message[] messageArr) {
        return publishImpl(this.ably.http, messageArr).sync();
    }

    public UpdateDeleteResult updateMessage(Message message, MessageOperation messageOperation) {
        return this.messageEditsMixin.updateMessage(this.ably.http, message, messageOperation);
    }

    public void updateMessageAsync(Message message, MessageOperation messageOperation, Callback<UpdateDeleteResult> callback) {
        this.messageEditsMixin.updateMessageAsync(this.ably.http, message, messageOperation, callback);
    }

    public void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        historyImpl(http, paramArr).async(callback);
    }

    public void publish(Http http, String str, Object obj) throws AblyException {
        publishImpl(http, str, obj).sync();
    }

    public PaginatedResult<Message> history(Http http, Param[] paramArr) {
        return historyImpl(http, paramArr).sync();
    }

    public void publish(Message[] messageArr) throws AblyException {
        publish(this.ably.http, messageArr);
    }

    public void appendMessageAsync(Message message, Callback<UpdateDeleteResult> callback) {
        appendMessageAsync(message, null, callback);
    }

    public void deleteMessageAsync(Message message, Callback<UpdateDeleteResult> callback) {
        deleteMessageAsync(message, null, callback);
    }

    public void publish(Http http, Message[] messageArr) throws AblyException {
        publishImpl(http, messageArr).sync();
    }

    public void updateMessageAsync(Message message, Callback<UpdateDeleteResult> callback) {
        updateMessageAsync(message, null, callback);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Presence {
        public Presence() {
        }

        private BasePaginatedQuery.ResultRequest<PresenceMessage> getImpl(Http http, Param[] paramArr) {
            HttpCore.BodyHandler<PresenceMessage> presenceResponseHandler = PresenceSerializer.getPresenceResponseHandler(ChannelBase.this.options);
            if (ChannelBase.this.ably.options.addRequestIds) {
                paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
            }
            return new BasePaginatedQuery(http, ChannelBase.this.basePath + "/presence", HttpUtils.defaultAcceptHeaders(ChannelBase.this.ably.options.useBinaryProtocol), paramArr, presenceResponseHandler).get();
        }

        private BasePaginatedQuery.ResultRequest<PresenceMessage> historyImpl(Http http, Param[] paramArr) {
            HttpCore.BodyHandler<PresenceMessage> presenceResponseHandler = PresenceSerializer.getPresenceResponseHandler(ChannelBase.this.options);
            if (ChannelBase.this.ably.options.addRequestIds) {
                paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
            }
            return new BasePaginatedQuery(http, ChannelBase.this.basePath + "/presence/history", HttpUtils.defaultAcceptHeaders(ChannelBase.this.ably.options.useBinaryProtocol), paramArr, presenceResponseHandler).get();
        }

        public PaginatedResult<PresenceMessage> get(Param[] paramArr) {
            return get(ChannelBase.this.ably.http, paramArr);
        }

        public void getAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            getAsync(ChannelBase.this.ably.http, paramArr, callback);
        }

        public PaginatedResult<PresenceMessage> history(Param[] paramArr) {
            return history(ChannelBase.this.ably.http, paramArr);
        }

        public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            historyAsync(ChannelBase.this.ably.http, paramArr, callback);
        }

        public void getAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            getImpl(http, paramArr).async(callback);
        }

        public void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            historyImpl(http, paramArr).async(callback);
        }

        public PaginatedResult<PresenceMessage> get(Http http, Param[] paramArr) {
            return getImpl(http, paramArr).sync();
        }

        public PaginatedResult<PresenceMessage> history(Http http, Param[] paramArr) {
            return historyImpl(http, paramArr).sync();
        }
    }

    public UpdateDeleteResult appendMessage(Message message) {
        return appendMessage(message, null);
    }

    public UpdateDeleteResult deleteMessage(Message message) {
        return deleteMessage(message, null);
    }

    public UpdateDeleteResult updateMessage(Message message) {
        return updateMessage(message, null);
    }

    @Deprecated
    public void publishAsync(String str, Object obj, CompletionListener completionListener) {
        publishAsync(this.ably.http, str, obj, completionListener);
    }

    private Http.Request<PublishResult> publishImpl(Http http, Message[] messageArr) {
        return http.request(new AnonymousClass1(messageArr));
    }

    public void publishAsync(String str, Object obj, Callback<PublishResult> callback) {
        publishAsync(this.ably.http, str, obj, callback);
    }

    public void publishAsync(Http http, String str, Object obj, Callback<PublishResult> callback) {
        publishImpl(http, str, obj).async(callback);
    }

    public PublishResult publishWithResult(Http http, String str, Object obj) {
        return publishImpl(http, str, obj).sync();
    }

    @Deprecated
    public void publishAsync(Message[] messageArr, CompletionListener completionListener) {
        publishAsync(this.ably.http, messageArr, completionListener);
    }

    public PublishResult publishWithResult(String str, Object obj) {
        return publishWithResult(this.ably.http, str, obj);
    }

    @Deprecated
    public void publishAsync(Http http, Message[] messageArr, CompletionListener completionListener) {
        publishImpl(http, messageArr).async(new CompletionListener.ToCallback(completionListener));
    }

    public void publishAsync(Message[] messageArr, Callback<PublishResult> callback) {
        publishImpl(this.ably.http, messageArr).async(callback);
    }
}
