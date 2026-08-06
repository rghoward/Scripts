package io.ably.lib.types;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface Callback<T> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Map<T, U> implements Callback<T> {
        private final Callback<U> callback;

        public Map(Callback<U> callback) {
            this.callback = callback;
        }

        public abstract U map(T t);

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            this.callback.onSuccess(map(t));
        }
    }

    void onError(ErrorInfo errorInfo);

    void onSuccess(T t);
}
