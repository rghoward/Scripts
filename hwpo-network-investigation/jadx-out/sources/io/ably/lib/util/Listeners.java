package io.ably.lib.util;

import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.PublishResult;
import io.ably.lib.types.UpdateDeleteResult;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Listeners {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class CompletionListenerWrapper<T> implements Callback<T> {
        private final CompletionListener listener;

        private CompletionListenerWrapper(CompletionListener completionListener) {
            this.listener = completionListener;
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onError(errorInfo);
            }
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onSuccess();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class UpdateResultToPublishAdapter implements Callback<PublishResult> {
        private final Callback<UpdateDeleteResult> listener;

        private UpdateResultToPublishAdapter(Callback<UpdateDeleteResult> callback) {
            this.listener = callback;
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            Callback<UpdateDeleteResult> callback = this.listener;
            if (callback != null) {
                callback.onError(errorInfo);
            }
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(PublishResult publishResult) {
            String[] strArr;
            Callback<UpdateDeleteResult> callback = this.listener;
            if (callback != null) {
                callback.onSuccess(new UpdateDeleteResult((publishResult == null || (strArr = publishResult.serials) == null || strArr.length <= 0) ? null : strArr[0]));
            }
        }
    }

    public static <T> Callback<T> fromCompletionListener(CompletionListener completionListener) {
        return new CompletionListenerWrapper(completionListener);
    }

    public static Callback<PublishResult> toPublishResultListener(Callback<UpdateDeleteResult> callback) {
        return new UpdateResultToPublishAdapter(callback);
    }

    public static <T> CompletionListener unwrap(Callback<T> callback) {
        if (callback instanceof CompletionListenerWrapper) {
            return ((CompletionListenerWrapper) callback).listener;
        }
        return null;
    }
}
