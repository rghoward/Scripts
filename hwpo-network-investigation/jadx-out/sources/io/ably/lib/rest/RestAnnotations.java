package io.ably.lib.rest;

import defpackage.sk0;
import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Annotation;
import io.ably.lib.types.AnnotationAction;
import io.ably.lib.types.AnnotationSerializer;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class RestAnnotations {
    private static final String TAG = "io.ably.lib.rest.RestAnnotations";
    private final String channelName;
    private final ChannelOptions channelOptions;
    private final ClientOptions clientOptions;
    private final Http http;

    public RestAnnotations(String str, Http http, ClientOptions clientOptions, ChannelOptions channelOptions) {
        this.channelName = str;
        this.http = http;
        this.clientOptions = clientOptions;
        this.channelOptions = channelOptions;
    }

    private Http.Request<Void> deleteImpl(String str, Annotation annotation) {
        Log.v(TAG, "delete(): annotation=" + annotation);
        annotation.action = AnnotationAction.ANNOTATION_DELETE;
        return sendAnnotationImpl(str, annotation);
    }

    private String getBasePath(String str) {
        return "/channels/" + HttpUtils.encodeURIComponent(this.channelName) + "/messages/" + HttpUtils.encodeURIComponent(str) + "/annotations";
    }

    private BasePaginatedQuery.ResultRequest<Annotation> getImpl(String str, Param[] paramArr) {
        Log.v(TAG, "getImpl(): params=" + Arrays.toString(paramArr));
        HttpCore.BodyHandler<Annotation> annotationResponseHandler = AnnotationSerializer.getAnnotationResponseHandler(this.channelOptions);
        if (this.clientOptions.addRequestIds) {
            paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
        }
        return new BasePaginatedQuery(this.http, getBasePath(str), HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), paramArr, annotationResponseHandler).get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAnnotationImpl$0(Annotation annotation, String str, HttpScheduler httpScheduler, Callback callback) {
        Annotation[] annotationArr = {annotation};
        httpScheduler.post(getBasePath(str), HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), this.clientOptions.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null, this.clientOptions.useBinaryProtocol ? AnnotationSerializer.asMsgpackRequest(annotationArr) : AnnotationSerializer.asJsonRequest(annotationArr), null, true, callback);
    }

    private Http.Request<Void> publishImpl(String str, Annotation annotation) {
        Log.v(TAG, "publish(): annotation=" + annotation);
        annotation.action = AnnotationAction.ANNOTATION_CREATE;
        return sendAnnotationImpl(str, annotation);
    }

    private Http.Request<Void> sendAnnotationImpl(final String str, final Annotation annotation) throws AblyException {
        if (annotation.type == null) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000, "Annotation type must be specified");
        }
        annotation.messageSerial = str;
        try {
            annotation.encode(this.channelOptions);
            if (annotation.id == null && this.clientOptions.idempotentRestPublishing) {
                annotation.id = Crypto.getRandomId();
            }
            return this.http.request(new Http.Execute() { // from class: uu8
                @Override // io.ably.lib.http.Http.Execute
                public final void execute(HttpScheduler httpScheduler, Callback callback) {
                    this.a.lambda$sendAnnotationImpl$0(annotation, str, httpScheduler, callback);
                }
            });
        } catch (MessageDecodeException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    private void validateMessageSerial(String str) throws AblyException {
        if (str == null) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40003, "Message serial can not be empty");
        }
    }

    public void delete(String str, Annotation annotation) throws AblyException {
        validateMessageSerial(str);
        deleteImpl(str, annotation).sync();
    }

    public void deleteAsync(String str, Annotation annotation, Callback<Void> callback) throws AblyException {
        validateMessageSerial(str);
        deleteImpl(str, annotation).async(callback);
    }

    public PaginatedResult<Annotation> get(String str, Param[] paramArr) throws AblyException {
        validateMessageSerial(str);
        return getImpl(str, paramArr).sync();
    }

    public void getAsync(String str, Callback<AsyncPaginatedResult<Annotation>> callback) throws AblyException {
        validateMessageSerial(str);
        getImpl(str, null).async(callback);
    }

    public void publish(String str, Annotation annotation) throws AblyException {
        validateMessageSerial(str);
        publishImpl(str, annotation).sync();
    }

    public void publishAsync(String str, Annotation annotation, Callback<Void> callback) throws AblyException {
        validateMessageSerial(str);
        publishImpl(str, annotation).async(callback);
    }

    public void delete(Message message, Annotation annotation) throws AblyException {
        delete(message.serial, annotation);
    }

    public void deleteAsync(Message message, Annotation annotation, Callback<Void> callback) throws AblyException {
        deleteAsync(message.serial, annotation, callback);
    }

    public void publish(Message message, Annotation annotation) throws AblyException {
        publish(message.serial, annotation);
    }

    public void publishAsync(Message message, Annotation annotation, Callback<Void> callback) throws AblyException {
        publishAsync(message.serial, annotation, callback);
    }

    public PaginatedResult<Annotation> get(Message message, Param[] paramArr) {
        return get(message.serial, paramArr);
    }

    public void getAsync(Message message, Param[] paramArr, Callback<AsyncPaginatedResult<Annotation>> callback) {
        getAsync(message.serial, paramArr, callback);
    }

    public PaginatedResult<Annotation> get(String str) {
        return get(str, (Param[]) null);
    }

    public void getAsync(String str, Param[] paramArr, Callback<AsyncPaginatedResult<Annotation>> callback) {
        validateMessageSerial(str);
        getImpl(str, paramArr).async(callback);
    }

    public PaginatedResult<Annotation> get(Message message) {
        return get(message.serial);
    }

    public void getAsync(Message message, Callback<AsyncPaginatedResult<Annotation>> callback) throws AblyException {
        getAsync(message.serial, callback);
    }
}
