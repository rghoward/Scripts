package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ej8 implements y97 {
    public final ConnectivityManager a;
    public final x7a b;
    public final dj8 c;

    public ej8(ConnectivityManager connectivityManager, x7a x7aVar) {
        this.a = connectivityManager;
        this.b = x7aVar;
        dj8 dj8Var = new dj8(this);
        this.c = dj8Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), dj8Var);
    }

    public static final void b(ej8 ej8Var, Network network, boolean z) {
        boolean z2;
        boolean z3 = false;
        for (Network network2 : ej8Var.a.getAllNetworks()) {
            if (xj5.a(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ej8Var.a.getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        x7a x7aVar = ej8Var.b;
        synchronized (x7aVar) {
            try {
                if (x7aVar.t.get() != null) {
                    x7aVar.x = z3;
                } else {
                    x7aVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y97
    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.y97
    public final void shutdown() {
        this.a.unregisterNetworkCallback(this.c);
    }
}
