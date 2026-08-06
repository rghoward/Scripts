package io.ably.lib.realtime;

import com.intercom.twig.BuildConfig;
import defpackage.sk0;
import defpackage.vb0;
import io.ably.lib.rest.RestAnnotations;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Annotation;
import io.ably.lib.types.AnnotationAction;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.util.Log;
import io.ably.lib.util.Multicaster;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class RealtimeAnnotations {
    private static final String TAG = "io.ably.lib.realtime.RealtimeAnnotations";
    private final ChannelBase channel;
    private final RestAnnotations restAnnotations;
    private final AnnotationMulticaster listeners = new AnnotationMulticaster();
    private final Map<String, AnnotationMulticaster> typeListeners = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface AnnotationListener {
        void onAnnotation(Annotation annotation);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class AnnotationMulticaster extends Multicaster<AnnotationListener> implements AnnotationListener {
        private AnnotationMulticaster() {
            super(new AnnotationListener[0]);
        }

        @Override // io.ably.lib.realtime.RealtimeAnnotations.AnnotationListener
        public void onAnnotation(Annotation annotation) {
            Iterator<AnnotationListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onAnnotation(annotation);
                } catch (Exception e) {
                    Log.e(RealtimeAnnotations.TAG, e.getMessage(), e);
                }
            }
        }
    }

    public RealtimeAnnotations(ChannelBase channelBase, RestAnnotations restAnnotations) {
        this.channel = channelBase;
        this.restAnnotations = restAnnotations;
    }

    private void broadcastAnnotation(List<Annotation> list) {
        for (Annotation annotation : list) {
            this.listeners.onAnnotation(annotation);
            String str = annotation.type;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            AnnotationMulticaster annotationMulticaster = this.typeListeners.get(str);
            if (annotationMulticaster != null) {
                annotationMulticaster.onAnnotation(annotation);
            }
        }
    }

    private void sendAnnotation(String str, Annotation annotation, CompletionListener completionListener) throws AblyException {
        if (annotation.type == null) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000, "Annotation type must be specified");
        }
        annotation.messageSerial = str;
        try {
            annotation.encode(this.channel.options);
            String str2 = TAG;
            String str3 = this.channel.name;
            String str4 = annotation.type;
            String strName = annotation.action.name();
            StringBuilder sbA = vb0.a("RealtimeAnnotations.sendAnnotation(): channelName = ", str3, ", sending annotation with messageSerial = ", str, ", type = ");
            sbA.append(str4);
            sbA.append(", action = ");
            sbA.append(strName);
            Log.v(str2, sbA.toString());
            ProtocolMessage protocolMessage = new ProtocolMessage();
            protocolMessage.action = ProtocolMessage.Action.annotation;
            ChannelBase channelBase = this.channel;
            protocolMessage.channel = channelBase.name;
            protocolMessage.annotations = new Annotation[]{annotation};
            channelBase.sendProtocolMessage(protocolMessage, completionListener);
        } catch (MessageDecodeException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    private void subscribeImpl(String str, AnnotationListener annotationListener) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        AnnotationMulticaster annotationMulticaster = this.typeListeners.get(str);
        if (annotationMulticaster == null) {
            annotationMulticaster = new AnnotationMulticaster();
            this.typeListeners.put(str, annotationMulticaster);
        }
        annotationMulticaster.add(annotationListener);
    }

    private void unsubscribeImpl(String str, AnnotationListener annotationListener) {
        AnnotationMulticaster annotationMulticaster = this.typeListeners.get(str);
        if (annotationMulticaster != null) {
            annotationMulticaster.remove(annotationListener);
            if (annotationMulticaster.isEmpty()) {
                this.typeListeners.remove(str);
            }
        }
    }

    private void validateMessageSerial(String str) throws AblyException {
        if (str == null) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40003, "Message serial can not be empty");
        }
    }

    public void delete(String str, Annotation annotation, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "delete(MsgSerial, Annotation); channel = " + this.channel.name);
        annotation.action = AnnotationAction.ANNOTATION_DELETE;
        sendAnnotation(str, annotation, completionListener);
    }

    public PaginatedResult<Annotation> get(String str) {
        return this.restAnnotations.get(str, (Param[]) null);
    }

    public void getAsync(String str, Callback<AsyncPaginatedResult<Annotation>> callback) {
        this.restAnnotations.getAsync(str, (Param[]) null, callback);
    }

    public void onAnnotation(ProtocolMessage protocolMessage) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Annotation[] annotationArr = protocolMessage.annotations;
            if (i >= annotationArr.length) {
                broadcastAnnotation(arrayList);
                return;
            }
            Annotation annotation = annotationArr[i];
            try {
                if (annotation.data != null) {
                    annotation.decode(this.channel.options);
                }
            } catch (MessageDecodeException e) {
                String str = TAG;
                Locale locale = Locale.ROOT;
                Log.e(str, e.errorInfo.message + " on channel " + this.channel.name);
            }
            if (annotation.connectionId == null) {
                annotation.connectionId = protocolMessage.connectionId;
            }
            if (annotation.timestamp == 0) {
                annotation.timestamp = protocolMessage.timestamp;
            }
            if (annotation.id == null) {
                annotation.id = protocolMessage.id + ':' + i;
            }
            arrayList.add(annotation);
            i++;
        }
    }

    public void publish(String str, Annotation annotation, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "publish(MsgSerial, Annotation); channel = " + this.channel.name);
        validateMessageSerial(str);
        annotation.action = AnnotationAction.ANNOTATION_CREATE;
        sendAnnotation(str, annotation, completionListener);
    }

    public synchronized void subscribe(String str, AnnotationListener annotationListener) {
        Log.v(TAG, "subscribe(); annotations in channel = " + this.channel.name + "; single type = " + str);
        subscribeImpl(str, annotationListener);
        if (this.channel.attachOnSubscribeEnabled()) {
            this.channel.attach();
        }
    }

    public synchronized void unsubscribe(AnnotationListener annotationListener) {
        Log.v(TAG, "unsubscribe(); annotations in channel = " + this.channel.name);
        this.listeners.remove(annotationListener);
        Iterator<AnnotationMulticaster> it = this.typeListeners.values().iterator();
        while (it.hasNext()) {
            it.next().remove(annotationListener);
        }
    }

    public void getAsync(Message message, Param[] paramArr, Callback<AsyncPaginatedResult<Annotation>> callback) {
        getAsync(message.serial, paramArr, callback);
    }

    public PaginatedResult<Annotation> get(Message message, Param[] paramArr) {
        return get(message.serial, paramArr);
    }

    public void getAsync(String str, Param[] paramArr, Callback<AsyncPaginatedResult<Annotation>> callback) {
        this.restAnnotations.getAsync(str, paramArr, callback);
    }

    public PaginatedResult<Annotation> get(String str, Param[] paramArr) {
        return this.restAnnotations.get(str, paramArr);
    }

    public void getAsync(Message message, Callback<AsyncPaginatedResult<Annotation>> callback) {
        getAsync(message.serial, callback);
    }

    public PaginatedResult<Annotation> get(Message message) {
        return get(message.serial);
    }

    public void delete(Message message, Annotation annotation, CompletionListener completionListener) throws AblyException {
        delete(message.serial, annotation, completionListener);
    }

    public void delete(String str, Annotation annotation) throws AblyException {
        delete(str, annotation, (CompletionListener) null);
    }

    public void delete(Message message, Annotation annotation) throws AblyException {
        delete(message.serial, annotation);
    }

    public void publish(Message message, Annotation annotation, CompletionListener completionListener) throws AblyException {
        publish(message.serial, annotation, completionListener);
    }

    public void publish(String str, Annotation annotation) throws AblyException {
        publish(str, annotation, (CompletionListener) null);
    }

    public void publish(Message message, Annotation annotation) throws AblyException {
        publish(message.serial, annotation);
    }

    public synchronized void subscribe(AnnotationListener annotationListener) {
        Log.v(TAG, "subscribe(); annotations in channel = " + this.channel.name);
        this.listeners.add(annotationListener);
        if (this.channel.attachOnSubscribeEnabled()) {
            this.channel.attach();
        }
    }

    public synchronized void unsubscribe(String str, AnnotationListener annotationListener) {
        Log.v(TAG, "unsubscribe(); annotations in channel = " + this.channel.name + "; single type = " + str);
        unsubscribeImpl(str, annotationListener);
    }
}
