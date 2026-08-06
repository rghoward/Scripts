package io.ably.lib.transport;

import io.ably.lib.types.ErrorInfo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkConnectivity {
    protected Set<NetworkConnectivityListener> listeners = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class DefaultNetworkConnectivity extends NetworkConnectivity {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class DelegatedNetworkConnectivity extends NetworkConnectivity implements NetworkConnectivityListener {
        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkAvailable() {
            notifyNetworkAvailable();
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkUnavailable(ErrorInfo errorInfo) {
            notifyNetworkUnavailable(errorInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface NetworkConnectivityListener {
        void onNetworkAvailable();

        void onNetworkUnavailable(ErrorInfo errorInfo);
    }

    public void addListener(NetworkConnectivityListener networkConnectivityListener) {
        boolean zIsEmpty;
        synchronized (this) {
            zIsEmpty = this.listeners.isEmpty();
            this.listeners.add(networkConnectivityListener);
        }
        if (zIsEmpty) {
            onNonempty();
        }
    }

    public synchronized boolean isEmpty() {
        return this.listeners.isEmpty();
    }

    public void notifyNetworkAvailable() {
        NetworkConnectivityListener[] networkConnectivityListenerArr;
        synchronized (this) {
            Set<NetworkConnectivityListener> set = this.listeners;
            networkConnectivityListenerArr = (NetworkConnectivityListener[]) set.toArray(new NetworkConnectivityListener[set.size()]);
        }
        for (NetworkConnectivityListener networkConnectivityListener : networkConnectivityListenerArr) {
            networkConnectivityListener.onNetworkAvailable();
        }
    }

    public void notifyNetworkUnavailable(ErrorInfo errorInfo) {
        NetworkConnectivityListener[] networkConnectivityListenerArr;
        synchronized (this) {
            Set<NetworkConnectivityListener> set = this.listeners;
            networkConnectivityListenerArr = (NetworkConnectivityListener[]) set.toArray(new NetworkConnectivityListener[set.size()]);
        }
        for (NetworkConnectivityListener networkConnectivityListener : networkConnectivityListenerArr) {
            networkConnectivityListener.onNetworkUnavailable(errorInfo);
        }
    }

    public void removeListener(NetworkConnectivityListener networkConnectivityListener) {
        boolean zIsEmpty;
        synchronized (this) {
            this.listeners.remove(networkConnectivityListener);
            zIsEmpty = this.listeners.isEmpty();
        }
        if (zIsEmpty) {
            onEmpty();
        }
    }

    public void onEmpty() {
    }

    public void onNonempty() {
    }
}
